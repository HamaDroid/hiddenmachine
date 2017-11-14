package hmdroid.wazamachine;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class choose_08 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_08);
    }
    public void rse(View view){
        Intent intent = new Intent(this, dive.class);
        startActivity(intent);
    }
    public void dphg(View view){
        Intent intent = new Intent(this,hmdroid.hiddenmachine.rockclimb.class);
        startActivity(intent);
    }
 }

