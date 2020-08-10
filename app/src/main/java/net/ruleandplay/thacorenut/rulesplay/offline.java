package net.ruleandplay.thacorenut.rulesplay;

import android.app.ActionBar;
import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class offline extends android.support.v4.app.Fragment{

    public static android.support.v4.app.Fragment newInstance() {
        Bundle args=new Bundle();
        offline fragment=new offline();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.offline,null);

        //list view
        String str[]=new String[]{"Chess Playing Guide(international)",
        "Chess Playing Guide(Traditinal Myanmar)",
        "Simple Chess",
        "Rubik Cube Playing Guide",
        "21 Cards called Blackjack Play Guide",
        "ShanKoeMee or Doo Play Guide",
        "5 Cards show or poker(texas)",
        "13 Cards Poker Myanmar",
        "Football Rules"};
        final ListView lv=v.findViewById(R.id.lv1);
        My_listview_adapter lv_adapter;
        lv_adapter=new My_listview_adapter(getActivity(),str);
        lv.setAdapter(lv_adapter);

        //click listview item
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                /*Intent it=new Intent(getActivity(),listview_item.class);
                it.putExtra("position",i);
                startActivity(it);*/
                if (i==0){
                    Intent it=new Intent(getActivity(),x1.class);
                    startActivity(it);
                }
                else if (i==2){
                    Intent it=new Intent(getActivity(),x3.class);
                    startActivity(it);
                }
                else if (i==5){
                    Intent it=new Intent(getActivity(),x6.class);
                    startActivity(it);
                }
                else {
                    Intent it=new Intent(getActivity(),listview_item.class);
                    it.putExtra("position",i);
                    startActivity(it);
                }
            }
        });

        return v;
    }
}
