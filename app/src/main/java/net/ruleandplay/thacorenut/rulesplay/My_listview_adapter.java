package net.ruleandplay.thacorenut.rulesplay;

import android.content.Context;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

class My_listview_adapter extends BaseAdapter {
    Context context;
    //we cant use layout BaseAdapter extends,so need to inflate layout
    String[] string_array;
    LayoutInflater layoutInflater;
    public My_listview_adapter(FragmentActivity activity, String[] str) {
        string_array=str;
        layoutInflater= (LayoutInflater) activity.getSystemService(FragmentActivity.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return string_array.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View v=layoutInflater.inflate(R.layout.listview_row,null);
        TextView tv=v.findViewById(R.id.lv_tv);
        tv.setText(string_array[i]);
        return v;
    }

    @Override
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
    }
}
