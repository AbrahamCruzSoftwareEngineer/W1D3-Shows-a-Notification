package com.evolutiondso.www.twoicons;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Toast;

import java.util.Date;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MyHomewordTAG_";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void prueba1(View v) {
        Toast toast = Toast.makeText(this, "Mensaje 1", Toast.LENGTH_SHORT);
        toast.show();
    }


    //SEND THE NOTIFICATION WHEN THE APP GOES TO BACKGROUND THIS IS ANOTHER HOMEWORK
    @Override
    protected void onDestroy() {
        super.onDestroy();
        String date = (new Date()).toString();
        Log.d(TAG, "AppDestroyed at: " + date);
        Toast toast = Toast.makeText(this, "Mensaje 1", Toast.LENGTH_SHORT);
        toast.show();

    }

    public void prueba2(View v) {
        Toast toast = Toast.makeText(this, "Mensaje 2", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
        toast.show();
    }

    public void prueba3(View v) {
        LayoutInflater inflater = getLayoutInflater();
        View layout = inflater.inflate(R.layout.toast1,    null);
        Toast toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(layout);
        toast.show();
    }
}
