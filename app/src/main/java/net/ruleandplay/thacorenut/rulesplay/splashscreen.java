package net.ruleandplay.thacorenut.rulesplay;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;

public class splashscreen extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        int SPLASH_DISPLAY_LENGTH = 1000;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splashscreen);

        SharedPreferences shp = getSharedPreferences("language", MODE_PRIVATE);

        if (shp.getString("lang", "unk").equals("unk")) {
            //go to language choose
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    Intent it = new Intent(splashscreen.this,choose_language.class);
                    startActivity(it);
                    finish();
                }
            }, SPLASH_DISPLAY_LENGTH);
        }
        else {
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    Intent it = new Intent(splashscreen.this, MainActivity.class);
                    startActivity(it);
                    finish();
                }
            }, SPLASH_DISPLAY_LENGTH);
        }
    }
}
