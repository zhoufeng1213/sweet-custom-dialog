package com.fly.sweetdialog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.fly.sweet.dialog.SweetAlertDialog;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new SweetAlertDialog(this).setTitleText("提示")
                .setCancelText("关闭")
                .show();
    }
}
