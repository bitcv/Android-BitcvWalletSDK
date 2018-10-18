package com.bitcv.bitsdkasdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.bitcv.sdk.BvAche.BvConst;
import com.bitcv.sdk.BvAche.BvSdkApplication;


public class MainActivity extends AppCompatActivity {


    private Button tvJump;
    private EditText etPhone, etCountryCode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvJump = (Button) findViewById(R.id.tv_jump);
        etPhone = (EditText) findViewById(R.id.et_phone);
        etCountryCode = (EditText) findViewById(R.id.et_countryCode);
        tvJump.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phone = etPhone.getText().toString().trim();
                String cCode = etCountryCode.getText().toString().trim();
                if (TextUtils.isEmpty(phone)) {

                    Toast.makeText(MainActivity.this,"请输入手机号码",Toast.LENGTH_SHORT).show();
                } else if (TextUtils.isEmpty(cCode)) {

                    Toast.makeText(MainActivity.this,"请输入国家码",Toast.LENGTH_SHORT).show();
                }else{

                    BvSdkApplication.getApplication().BvLoginJump(MainActivity.this, cCode, phone);
                }
            }
        });


    }
}
