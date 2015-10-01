package cconst22313.myactivities101;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.SearchView;
import android.widget.TextView;

public class OtherActivity extends LifeCycleActivityBase {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.other_activity);
        TextView hashCode = (TextView) findViewById(R.id.tvHashValue);
        hashCode.setText(this.hashCode() + "");
//        final Intent intent = getIntent();
//        TextView hashCode = (TextView) findViewById(R.id.tvHashValue);
//        hashCode.setText(this.hashCode() + "");
        final OtherActivity otherAct = this;
//        //register events on buttons
//        findViewById(R.id.btnMain).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View source) {
//                Log.v(TAG, "OtherActivity - Main - onClick");
//                Intent intt = new Intent(otherAct, MainActivity.class);
//                startActivity(intt);
//            }
//        });
//
//        findViewById(R.id.btnOther).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View source) {
//                Log.v(TAG, "OtherActivity - Main - onClick");
//                Intent intt = new Intent(otherAct, OtherActivity.class);
//                startActivity(intt);
//            }
//        });

        findViewById(R.id.btnMain).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View source) {
                mainClick();
            }
        });

        findViewById(R.id.btnOther).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View source) {
                otherClick();
            }
        });

        findViewById(R.id.btnBack).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                otherAct.finish();
            }
        });

    }

}
