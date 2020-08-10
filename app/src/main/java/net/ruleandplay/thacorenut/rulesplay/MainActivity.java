package net.ruleandplay.thacorenut.rulesplay;

import android.graphics.Color;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.DisplayMetrics;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener,NavigationView.OnNavigationItemSelectedListener {

    int screen_width;//to fit tab layout
    RelativeLayout rl[] = new RelativeLayout[2];
    ImageView iv[] = new ImageView[2];
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navdrawer);

        //navigation drawer
        Toolbar toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer,toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        //main activity
        rl[0] = findViewById(R.id.rl1);
        rl[1] = findViewById(R.id.rl2);

        iv[0] = findViewById(R.id.iv1);
        iv[1] = findViewById(R.id.iv2);

        DisplayMetrics metrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(metrics);
        screen_width = metrics.widthPixels;
        for (int i = 0; i < rl.length; i++) {
            ViewGroup.LayoutParams vl = rl[i].getLayoutParams();
            vl.width = screen_width / 2;
            rl[i].setLayoutParams(vl);
        }

        //Tab select
        selected(0);

        //clicking the tab
        for (int i = 0; i < rl.length; i++) {
            rl[i].setOnClickListener(this);
        }

        viewPager = findViewById(R.id.viewpager);
        Myfrgstateadatper adapter;
        adapter = new Myfrgstateadatper(getSupportFragmentManager());
        viewPager.setAdapter(adapter);

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                selected(position);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

    }

    private void selected(int position) {
        /*for (int i=0;i<rl.length;i++){
            if (i==position){
                iv[i].setImageResource(R.drawable.offline2);

            }
            else {
                iv[i].setImageResource(R.drawable.offline2);

            }
        }*/
        if (position == 0) {
            iv[0].setImageResource(R.drawable.offline2);
            iv[1].setImageResource(R.drawable.online3);
        }
        if (position == 1) {
            iv[1].setImageResource(R.drawable.online2);
            iv[0].setImageResource(R.drawable.offline1);
        }
    }


    @Override
    public void onClick(View view) {
        for (int i = 0; i < rl.length; i++) {
            if (view == rl[i]) {
                viewPager.setCurrentItem(i);
                selected(i);
            }
        }
    }

   @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.navdrawer, menu);
        return true;
    }
    //menu
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.about_us) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    //navigation drawer work code
    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.feedback) {
            // Handle the camera action
        } else if (id == R.id.dlvdo) {

        } else if (id == R.id.command) {

        } else if (id == R.id.nav_manage) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        //end of navdrawer

        return true;
    }
}