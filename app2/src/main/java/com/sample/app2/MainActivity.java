package com.sample.app2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.sample.app2.databinding.ActivityMainBinding;
import com.sample.lib2.Lib2Utils;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        StringBuffer buffer = new StringBuffer();
        buffer.append("\n\n")
                .append(Lib2Utils.getName());
        binding.text.append(buffer);
    }
}