package tech.yuanhawk.workexample.data.worker;

import android.content.Context;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.work.Data;
import androidx.work.Worker;
import androidx.work.WorkerParameters;

public class ProgressWorker extends Worker {

    public static final String PROGRESS = "PROGRESS";
    private static final String TAG = "ProgressWorker";
    private static final long DELAY = 1000L;

    public ProgressWorker(
            @NonNull Context context,
            @NonNull WorkerParameters parameters) {
        super(context, parameters);
        // Set initial progress to 0
        setProgressAsync(new Data.Builder().putInt(PROGRESS, 0).build());
    }

    @NonNull
    @Override
    public Result doWork() {
        try {
            // Doing work.
            Log.d(TAG, "doWork: doing work");
            Thread.sleep(DELAY);
        } catch (InterruptedException exception) {
            Log.e(TAG, "doWork: ", exception);
        }
        // Set progress to 100 after you are done doing your work, you can pass other types of data as well...
        return Result.success(new Data.Builder().putInt(PROGRESS, 100).build());
    }

}
