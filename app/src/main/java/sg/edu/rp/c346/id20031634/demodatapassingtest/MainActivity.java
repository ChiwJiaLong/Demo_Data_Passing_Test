package sg.edu.rp.c346.id20031634.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btnPassInteger, btnPassChar;
    TextView tvPassDouble;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPassInteger = findViewById(R.id.buttonPassInteger);

        btnPassInteger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("value", 1);
                startActivity(intent);
            }
        });
        btnPassChar = findViewById(R.id.buttonPassChar);
        btnPassChar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ThirdActivity.class);
                intent.putExtra("value", "a");
                startActivity(intent);

            }
        });
        tvPassDouble=findViewById(R.id.tvPassDouble);

        tvPassDouble.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ForthActivity.class);
                intent.putExtra("value", 99.99);
                startActivity(intent);

            }
        });
    }
}