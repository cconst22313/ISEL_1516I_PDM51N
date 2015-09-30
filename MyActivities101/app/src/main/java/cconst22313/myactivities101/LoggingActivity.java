package cconst22313.myactivities101;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

/**
 * Created by cconstantino on 29-09-2015.
 */
public abstract class LoggingActivity extends AppCompatActivity {

    protected final String TAG = this.getClass().getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.v(TAG, "onCreate");
    }

    @Override
    public void onStart(){
        super.onStart();
        Log.v(TAG, "onStart");
    }

    //@Override
    //public void onResume(){
    //    Log.v(TAG, "onStart");
    //}

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.v(TAG, "onRestart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.v(TAG, "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v(TAG, "onDestroy");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.v(TAG, "onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.v(TAG, "onResume");
    }

}
