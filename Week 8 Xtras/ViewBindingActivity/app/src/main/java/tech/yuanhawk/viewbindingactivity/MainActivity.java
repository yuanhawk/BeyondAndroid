package tech.yuanhawk.viewbindingactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import tech.yuanhawk.viewbindingactivity.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }

    @Override
    protected void onStart() {
        super.onStart();
        binding.enter.setOnClickListener(v -> {
            String name = binding.name.getText().toString();
            Log.d(TAG, "onStart: " + name);
            binding.text.setText(String.format("Hello %s", name));
        });
    }
}