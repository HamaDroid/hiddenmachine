package hmdroid.hiddenmachine;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import hmdroid.wazamachine.R;

public class rockclimb extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rockclimb);
    }
    public void about (View view) {
       Intent intent = new Intent(this, about_rockclimb.class);
       startActivity(intent);
    }
}
