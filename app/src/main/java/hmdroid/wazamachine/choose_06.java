package hmdroid.wazamachine;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class choose_06 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_06);
    }
    public void gsk(View view){
        Intent intent = new Intent(this,whirlpool.class);
        startActivity(intent);
    }
    public void bwO2(View view){
        Intent intent = new Intent(this,dive.class);
        startActivity(intent);
        }
    public  void rhg(View view){
        Intent intent = new Intent(this,hmdroid.hiddenmachine.rocksmash.class);
        startActivity(intent);
    }
}
