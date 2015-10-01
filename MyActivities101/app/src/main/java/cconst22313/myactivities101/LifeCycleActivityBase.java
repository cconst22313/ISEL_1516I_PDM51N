package cconst22313.myactivities101;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

/**
 * Created by cconstantino on 29-09-2015.
 */
public class LifeCycleActivityBase extends LoggingActivity {

    private Intent mainItent = null;
    private Intent otherItent = null;
    protected ComponentName previousActivity = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final Intent thisIntent = getIntent();
        final LifeCycleActivityBase mainActivity = this;
        mainItent = new Intent(mainActivity, MainActivity.class);
        otherItent =  new Intent(mainActivity, OtherActivity.class);
    }

    protected void mainClick(){
        Log.v(TAG, "Main - onClick");
        startActivity(mainItent);
        previousActivity = getCallingActivity();
    }

    protected void otherClick(){
        Log.v(TAG, "Other - onClick");
        startActivity(otherItent);
        previousActivity = getCallingActivity();
    }
}
