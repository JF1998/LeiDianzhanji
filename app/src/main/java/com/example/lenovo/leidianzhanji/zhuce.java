package com.example.lenovo.leidianzhanji;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.Toast;

public class zhuce extends AppCompatActivity implements View.OnClickListener{
    EditText shuru_username;
    EditText shuru_password;
    EditText shuru_querenpassword;
    EditText shuru_email;
    EditText seck;
    Button button3;
    CheckBox shuru_cbk;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.zhuce);

        shuru_username = (EditText)findViewById(R.id.shuru);
        shuru_password = (EditText)findViewById(R.id.shuru1);
        shuru_querenpassword = (EditText)findViewById(R.id.shuru2);
        shuru_email = (EditText)findViewById(R.id.shuru3);
        shuru_cbk = (CheckBox)findViewById(R.id.cbk);
        button3 = (Button)findViewById(R.id.btn3);
        button3.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn3:
                String username = shuru_username.getText().toString();
                String password = shuru_password.getText().toString();
                String erpassword = shuru_querenpassword.getText().toString();
                String erEmail = shuru_email.getText().toString();
                String cbk = shuru_cbk.getText().toString();

                //非空验证
                if (username.isEmpty()/*||password.isEmpty()||erpassword.isEmpty()||erEmail.isEmpty()*/){
                    //设定自定义文字
                    shuru_username.setError("用户名不能为空");
                    /*shuru_password.setError("输入框不能为空");
                    shuru_querenpassword.setError("输入框不能为空");
                    shuru_email.setError("输入框不能为空");*/
                    //设置自定义文字和图片

                }else if (password.toString().equals("")){
                    shuru_password.setError("密码不能为空");
                }else if (password.isEmpty()){
                    shuru_querenpassword.setError("再次输入密码不能为空");
                }else if (!erpassword.equals(password)){
                    shuru_querenpassword.setError("密码不一致");
                }else if (erEmail.isEmpty()){
                    shuru_email.setError("邮箱不能为空");
                }else if (cbk.isEmpty()){
                    shuru_cbk.setError("本框必须填");
                }else if (!username.isEmpty()||!password.isEmpty()||
                        !erpassword.isEmpty()||!erEmail.isEmpty()){
                    Toast.makeText(zhuce.this, "注册成功", Toast.LENGTH_SHORT).show();

                    //按钮跳转
                    Button button3 = (Button)findViewById(R.id.btn3);
                    button3.setOnClickListener(new View.OnClickListener() {

                        @Override
                        public void onClick(View view) {
                            Intent intent = new Intent(zhuce.this,activty_denglu.class);
                            startActivity(intent);

                            finish();
                        }
                    });

                }

        }
    }
}
