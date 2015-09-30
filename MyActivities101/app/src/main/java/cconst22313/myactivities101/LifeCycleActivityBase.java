package cconst22313.myactivities101;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

/**
 * Created by cconstantino on 29-09-2015.
 */
public class LifeCycleActivityBase extends LoggingActivity {

    private Intent mainItent = null;
    private Intent otherItent = null;

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
    }

    protected void otherClick(){
        Log.v(TAG, "Other - onClick");
        startActivity(otherItent);
    }
}
