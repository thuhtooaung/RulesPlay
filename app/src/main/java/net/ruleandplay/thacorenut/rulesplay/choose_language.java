package net.ruleandplay.thacorenut.rulesplay;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class choose_language extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.choose_language);

        //sharedpreferences
        SharedPreferences shp=getSharedPreferences("language",MODE_PRIVATE);
        final SharedPreferences.Editor shp_editor=shp.edit();

        ImageView iv1=findViewById(R.id.mm);
        ImageView iv2=findViewById(R.id.eng);

        final ImageView m1=findViewById(R.id.mark1);
        final ImageView m2=findViewById(R.id.mark2);

        final ImageView next=findViewById(R.id.next);

        iv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                shp_editor.putString("lang","mm");
                shp_editor.apply();
                m1.setVisibility(View.VISIBLE);
                m2.setVisibility(View.INVISIBLE);
                next.setVisibility(View.VISIBLE);
            }
        });
        iv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                shp_editor.putString("lang","eng");
                shp_editor.apply();
                m1.setVisibility(View.INVISIBLE);
                m2.setVisibility(View.VISIBLE);
                next.setVisibility(View.VISIBLE);
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it=new Intent(choose_language.this,MainActivity.class);
                startActivity(it);
                finish();
            }
        });
    }
}
