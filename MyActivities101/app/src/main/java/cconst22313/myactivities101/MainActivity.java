package cconst22313.myactivities101;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends LifeCycleActivityBase {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView hashCode = (TextView) findViewById(R.id.tvHashValue);
        hashCode.setText(this.hashCode() + "");
//        Intent intent = getIntent();
//        TextView hashCode = (TextView) findViewById(R.id.tvHashValue);
//        hashCode.setText(this.hashCode() + "");
//        final MainActivity mainAct = this;
//        //register events on buttons
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

    }

}
