package com.example.orel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageButton btn;
    ImageView vi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btn);
        vi = findViewById(R.id.vi);
    }

    public void dorel(View view) {
        int x = (int)(101*Math.random())%3+1;
        if (x==1) {
            btn.setImageResource(R.drawable.n1);
            vi.setImageResource(R.drawable.dan);
        }
        else if (x==2){
            btn.setImageResource(R.drawable.n2);
            vi.setImageResource(R.drawable.inbar);
        }
        else{
            btn.setImageResource(R.drawable.n3);
            vi.setImageResource(R.drawable.erel);
        }

    }

}