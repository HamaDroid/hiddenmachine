package hmdroid.hiddenmachine;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import hmdroid.wazamachine.R;

public class rocksmash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rocksmash);
    }
    public void about(View view){
        Intent intent = new Intent(this, about_rocksmash.class);
        startActivity(intent);
    }
}
