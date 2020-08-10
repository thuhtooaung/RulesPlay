package net.ruleandplay.thacorenut.rulesplay;

import android.content.Intent;
import android.drm.DrmStore;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class listview_item extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview_item);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        TextView tv=findViewById(R.id.caption);
        int p=getIntent().getIntExtra("position",-1);

        //Start of positon page condition
        if (p==0){
            tv.setText(R.string.cap0);
        }
        else if (p==1){
            tv.setText(R.string.cap1);
        }
        else if (p==2){
            tv.setText(R.string.cap2);
        }
        else if (p==3){
            tv.setText(R.string.cap3);
        }
        else if (p==4){
            tv.setText(R.string.cap4);
        }
        else if (p==5){
            tv.setText(R.string.cap5);
        }
        else if (p==6){
            tv.setText(R.string.cap6);
        }
        else if (p==7){
            tv.setText(R.string.cap7);
        }
        else if (p==8){
            tv.setText(R.string.cap8);
        }
        else{
            tv.setText(R.string.el);
        }
        //End of positon page condition

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.correcttext,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId()==R.id.correct){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
}
