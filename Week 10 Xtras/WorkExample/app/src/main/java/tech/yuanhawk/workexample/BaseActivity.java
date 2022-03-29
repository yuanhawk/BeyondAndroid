package tech.yuanhawk.workexample;

import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.work.Data;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkManager;
import androidx.work.WorkRequest;

import tech.yuanhawk.workexample.data.worker.ProgressWorker;

public class BaseActivity extends AppCompatActivity {

    private static final String TAG = "BaseActivity";
    private final WorkManager workManager = WorkManager.getInstance(this);
    WorkRequest progress = new OneTimeWorkRequest.Builder(ProgressWorker.class)
            .addTag(ProgressWorker.PROGRESS)
            .build();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        pull();
        workManager.enqueue(progress);
        workManager
                // requestId is the WorkRequest id
                .getWorkInfoByIdLiveData(progress.getId())
                .observe(this, workInfo -> {
                    switch (workInfo.getState()) {
                        case RUNNING:
                        case SUCCEEDED: {
                            Data progress = workInfo.getOutputData();
                            int value = progress.getInt(ProgressWorker.PROGRESS, 0);
                            Log.d(TAG, "enqueueTask: " + value);
                            break;
                        }
                    }
                });
    }

    @Override
    protected void onStop() {
        super.onStop();
        workManager.cancelAllWorkByTag(ProgressWorker.PROGRESS);
    }

    // Enqueue multitasks
//    public void pull() {
//        buildOneTimeWorkRequest(ProgressWorker.class);
//    }

//    private void enqueueTask(List<OneTimeWorkRequest> requests) {
//        WorkManager.getInstance(getApplicationContext())
//                .enqueue(requests);
//    }

//    private void buildOneTimeWorkRequest(Class<? extends Worker>... classNameList) {
//
//        List<OneTimeWorkRequest> requests = new ArrayList<>();
//        for (Class<? extends Worker> className: classNameList) {
//            requests.add(new OneTimeWorkRequest.Builder(className)
//                    .build());
//        }
//        enqueueTask(requests);
//    }

}
