package com.example.myasnikov_pr1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Context;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Toast
        Context context = getApplicationContext();
        int durationTime = Toast.LENGTH_SHORT;
        CharSequence text = "Activity create";

        Toast toast = Toast.makeText(context, text, durationTime);
        toast.show();
    }
    @Override
    protected void onStart() {
        super.onStart();

        //Toast
        Context context = getApplicationContext();
        int durationTime = Toast.LENGTH_SHORT;
        CharSequence text = "Activity start";

        Toast toast = Toast.makeText(context, text, durationTime);
        toast.show();

    }
    @Override
    protected void onStop() {
        super.onStop();

        //Toast
        Context context = getApplicationContext();
        int durationTime = Toast.LENGTH_SHORT;
        CharSequence text = "Activity stop";

        Toast toast = Toast.makeText(context, text, durationTime);
        toast.show();
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();

        //Toast
        Context context = getApplicationContext();
        int durationTime = Toast.LENGTH_SHORT;
        CharSequence text = "Activity destroy";

        Toast toast = Toast.makeText(context, text, durationTime);
        toast.show();
    }
    @Override
    protected void onPause() {
        super.onPause();

        //Toast
        Context context = getApplicationContext();
        int durationTime = Toast.LENGTH_SHORT;
        CharSequence text = "Activity pause";

        Toast toast = Toast.makeText(context, text, durationTime);
        toast.show();
    }
    @Override
    protected void onResume() {
        super.onResume();

        //Toast
        Context context = getApplicationContext();
        int durationTime = Toast.LENGTH_SHORT;
        CharSequence text = "Activity resume";

        Toast toast = Toast.makeText(context, text, durationTime);
        toast.show();
    }
}
