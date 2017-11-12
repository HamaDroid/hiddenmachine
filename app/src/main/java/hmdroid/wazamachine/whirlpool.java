package hmdroid.wazamachine;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class whirlpool extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_whirlpool);
    }
    public void about(View view){
        Intent intent = new Intent(this,about_whirlpool.class);
        startActivity(intent);
    }
}
