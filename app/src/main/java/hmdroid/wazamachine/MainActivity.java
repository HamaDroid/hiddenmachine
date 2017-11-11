package hmdroid.wazamachine;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void cut(View view) {
        Intent intent = new Intent(this, cut.class);
        startActivity(intent);
    }

    public void fly(View view) {
        Intent intent = new Intent(this, fly.class);
        startActivity(intent);
    }

    public void surf(View view) {
        Intent intent = new Intent(this, surf.class);
        startActivity(intent);
    }

    public void strength(View view) {
        Intent intent = new Intent(this, strength.class);
        startActivity(intent);
    }

    public void choose_05(View view) {
        Intent intent = new Intent(this, choose_05.class);
        startActivity(intent);
    }

    public void choose_06(View view) {
        Intent intent = new Intent(this, choose_06.class);
        startActivity(intent);
    }

    public void choose_07(View view) {
        Intent intent = new Intent(this, choose_07.class);
        startActivity(intent);
    }

    public void choose_08(View view) {
        Intent intent = new Intent(this, choose_08.class);
        startActivity(intent);
    }
}