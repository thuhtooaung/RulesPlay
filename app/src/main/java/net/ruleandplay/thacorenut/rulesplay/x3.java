package net.ruleandplay.thacorenut.rulesplay;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class x3 extends AppCompatActivity {

    TextView t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.x3);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        t1=findViewById(R.id.bt1);
        t2=findViewById(R.id.bt2);
        t3=findViewById(R.id.bt3);
        t4=findViewById(R.id.bt4);
        t5=findViewById(R.id.bt5);
    }
}

