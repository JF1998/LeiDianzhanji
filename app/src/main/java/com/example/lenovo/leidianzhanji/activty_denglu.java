package com.example.lenovo.leidianzhanji;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class activty_denglu extends Activity implements View.OnClickListener {
    EditText shuru_k;
    EditText shuruk_2;
    Button button1;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        shuru_k = (EditText)findViewById(R.id.ru);
        shuruk_2 = (EditText)findViewById(R.id.ru2);
        button1 = (Button)findViewById(R.id.btn1);
        button1.setOnClickListener(this);





        Button button2 = (Button)findViewById(R.id.btn2);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(activty_denglu.this,zhuce.class);
                startActivity(intent);
                finish();
            }
        });

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn1:
                String shuruk = shuru_k.getText().toString();
                String shuruk2 = shuruk_2.getText().toString();


                if (shuruk.isEmpty()){
                    shuru_k.setError("账号不能为空");

                }else if (shuruk2.isEmpty()){
                    shuruk_2.setError("密码不能为空");

                }else if (!shuruk.isEmpty()||shuruk2.isEmpty()){
                    Toast.makeText(activty_denglu.this, "登录成功", Toast.LENGTH_SHORT).show();
                Button button1 = (Button) findViewById(R.id.btn1);

              button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(activty_denglu.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
                }
        }
    }
}
