package hmdroid.wazamachine;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class choose_07 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_07);
    }
    public void kghgss(View view){
        Intent intent = new Intent(this,waterfall.class);
        startActivity(intent);
    }
    public void oras(View view){
        Intent intent = new Intent(this,dive.class);
        startActivity(intent);
    }
}
