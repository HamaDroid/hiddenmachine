package hmdroid.wazamachine;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class choose_05 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_05);
    }

    public void defog(View view){
        Intent intent = new Intent(this, defog.class);
        startActivity(intent);
    }
    public void flash(View view){
        Intent intent = new Intent(this, flash.class);
        startActivity(intent);
    }
}

