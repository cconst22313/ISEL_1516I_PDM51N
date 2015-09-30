package cconst22313.helloandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //fazer log:


        //registar-me num evento para ser notificado
        //cuidado com o findViewById: precorre toda a árvore à procura do elemento
        findViewById(R.id.btnSaiIt).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View source) {
                findViewById(R.id.idTextView).setVisibility(View.VISIBLE);
            }
        });
    }
}
