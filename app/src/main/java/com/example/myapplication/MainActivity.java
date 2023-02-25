package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MyApp";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "onCreate", Toast.LENGTH_SHORT).show();
        Log.i(TAG,"информация в onCreate"); // информация
        Log.e(TAG,"ошибки в onCreate"); // ошибки
        Log.w(TAG,"предупреждения в onCreate"); // предупреждения
        Log.d(TAG,"отладка в onCreate"); // отладка
        Log.v(TAG,"подробности в onCreate"); // подробности
    }
    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "onStart", Toast.LENGTH_SHORT).show();
        Log.i(TAG,"информация в onStart"); // информация
        Log.e(TAG,"ошибки в onStart"); // ошибки
        Log.w(TAG,"предупреждения в onStart"); // предупреждения
        Log.d(TAG,"отладка в onStart"); // отладка
        Log.v(TAG,"подробности в onStart"); // подробности
    }
    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "onStop", Toast.LENGTH_SHORT).show();
        Log.i(TAG,"информация в onStop");
        Log.e(TAG,"ошибки в onStop"); // ошибки
        Log.w(TAG,"предупреждения в onStop"); // предупреждения
        Log.d(TAG,"отладка в onStop"); // отладка
        Log.v(TAG,"подробности в onStop"); // подробности
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "onDestroy", Toast.LENGTH_SHORT).show();
        Log.i(TAG,"информация в onDestroy");
        Log.e(TAG,"ошибки в onDestroy"); // ошибки
        Log.w(TAG,"предупреждения в onDestroy"); // предупреждения
        Log.d(TAG,"отладка в onDestroy"); // отладка
        Log.v(TAG,"подробности в onDestroy"); // подробности
    }
    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "onPause", Toast.LENGTH_SHORT).show();
        Log.i(TAG,"информация в onPause");
        Log.e(TAG,"ошибки в onPause"); // ошибки
        Log.w(TAG,"предупреждения в onPause"); // предупреждения
        Log.d(TAG,"отладка в onPause"); // отладка
        Log.v(TAG,"подробности в onPause"); // подробности
    }
    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "onResume", Toast.LENGTH_SHORT).show();
        Log.i(TAG,"информация в onResume");
        Log.e(TAG,"ошибки в onResume"); // ошибки
        Log.w(TAG,"предупреждения в onResume"); // предупреждения
        Log.d(TAG,"отладка в onResume"); // отладка
        Log.v(TAG,"подробности в onResume"); // подробности
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "onRestart", Toast.LENGTH_SHORT).show();
        Log.i(TAG,"информация в onRestart");
        Log.e(TAG,"ошибки в onRestart"); // ошибки
        Log.w(TAG,"предупреждения в onRestart"); // предупреждения
        Log.d(TAG,"отладка в onRestart"); // отладка
        Log.v(TAG,"подробности в onRestart"); // подробности
    }
}