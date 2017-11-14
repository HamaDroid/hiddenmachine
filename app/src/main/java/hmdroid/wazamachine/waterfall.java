package hmdroid.wazamachine;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class waterfall extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_waterfall);
    }
    public void about(View view){
        Intent intent = new Intent(this,about_waterfall.class);
        startActivity(intent);
    }
}
