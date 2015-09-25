package cconst22313.incremetdecrement;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button incBtn = (Button)findViewById(R.id.incBtn);
        Button decBtn = (Button)findViewById(R.id.decBtn);

        incBtn.setOnClickListener(
            new View.OnClickListener() {
                public void onClick(View v) {
                    EditText mEdit = (EditText) findViewById(R.id.editTV);
                    int value = Integer.parseInt(String.valueOf(mEdit.getText()));
                    value++;
                    mEdit.setText(value + "");
                }
            }
        );

        decBtn.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View v) {
                        EditText mEdit = (EditText) findViewById(R.id.editTV);
                        int value = Integer.parseInt(String.valueOf(mEdit.getText()));
                        value--;
                        mEdit.setText(value + "");
                    }
                }
        );
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
