package com.example.lenovo.leidianzhanji;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Window;

public class MainActivity extends Activity implements
        DialogInterface.OnClickListener {

    DaFeiJiGameView view = null;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        view = new DaFeiJiGameView(this);
        setContentView(view);






    }

    //  ┏┓　　　┏┓
    // ┏┛┻━━━┛┻┓
    // ┃　　　　　　　┃
    // ┃　　　━　　　┃
    // ┃　┳┛　┗┳　┃
    // ┃　　　　　　　┃
    // ┃　　　┻　　　┃
    // ┃　　　　　　　┃
    // ┗━┓　　　┏━┛
    //    ┃　　　┃   神兽保佑
    //   ┃　　　┃   代码无BUG！
    //   ┃　　　┗━━━┓
    //   ┃　　　　　　　┣┓
    //   ┃　　　　　　　┏┛
    //   ┗┓┓┏━┳┓┏┛
    //     ┃┫┫　┃┫┫
    //     ┗┻┛　┗┻┛





    public boolean onKeyDown(int keyCode, KeyEvent event) {


        if (keyCode == KeyEvent.KEYCODE_BACK) {
            view.stop();

            AlertDialog.Builder alert = new AlertDialog.Builder(this);
            alert.setTitle("你要退出吗？");
            alert.setNeutralButton("退出", this);
            alert.setNegativeButton("继续", this);
            alert.create().show();
            return false;
        }
        //View rootView = View.inflate(activity, R.layout.custom_dialog_layout, null);
        //DialogUIUtils.showCustomAlert(this, rootView).show();
        return super.onKeyDown(keyCode, event);
    }

    public void onClick(DialogInterface dialog, int which) {

        if (which == -2) {
            view.start();
        } else {

            android.os.Process.killProcess(android.os.Process.myPid());
        }
    }





}
    /*public void slign(View view){

        AlertDialog.Builder alert1 = new AlertDialog.Builder(this);
        alert1.setMessage("您确定要退出程序？");
        alert1.setPositiveButton("确定", click1);
        alert1.setNegativeButton("取消", click2);
        AlertDialog a1 = alert1.create();
        a1.show();
    }

    private DialogInterface.OnClickListener click1 =new DialogInterface.OnClickListener() {
        @Override
        public void onClick(DialogInterface dialogInterface, int i) {
            android.os.Process.killProcess(android.os.Process.myPid());
        }
    };
    private DialogInterface.OnClickListener click2 = new DialogInterface.OnClickListener(){

        @Override
        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.cancel();
        }
    };*/
