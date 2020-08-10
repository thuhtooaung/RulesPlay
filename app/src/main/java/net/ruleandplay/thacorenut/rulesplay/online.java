package net.ruleandplay.thacorenut.rulesplay;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.widget.SwipeRefreshLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class online extends android.support.v4.app.Fragment{
    public static android.support.v4.app.Fragment newInstance() {
        Bundle args=new Bundle();
        online frament=new online();
        frament.setArguments(args);
        return frament;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.online,null);

        final SwipeRefreshLayout srl=v.findViewById(R.id.srl);
        srl.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {

                srl.setRefreshing(false);
            }
        });
        return v;
    }
}
