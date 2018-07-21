package com.ytempest.ndkdemo;

import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.ytempest.ndkdemo.util.EncryptUtils;

import java.io.File;

public class MainActivity extends AppCompatActivity {

    public final String mFilePath = Environment.getExternalStorageDirectory().getAbsolutePath()
            + File.separator + "aaa" + File.separator + "cli.jpg";

    public final String mEncryptPath = Environment.getExternalStorageDirectory().getAbsolutePath()
            + File.separator + "aaa" + File.separator + "cli_encrypt.jpg";

    public final String mDecryptPath = Environment.getExternalStorageDirectory().getAbsolutePath()
            + File.separator + "aaa" + File.separator + "cli_decrypt.jpg";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void encryptClick(View view) {
        EncryptUtils.encrypt(mFilePath, mEncryptPath);
    }

    public void decryptClick(View view) {
        EncryptUtils.decrypt(mEncryptPath, mDecryptPath);
    }
}
