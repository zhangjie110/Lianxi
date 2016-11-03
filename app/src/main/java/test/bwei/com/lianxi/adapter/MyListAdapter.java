package test.bwei.com.lianxi.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import test.bwei.com.lianxi.R;

/**
 * Created by zhangjie on 2016/11/3.
 */
public class MyListAdapter extends BaseAdapter{

    private Context context;
    private List<String> data;

    public MyListAdapter(List<String> data, Context context) {
        this.data = data;
        this.context = context;
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int i) {
        return data.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        view=View.inflate(context, R.layout.list_item,null);
        TextView tv=(TextView) view.findViewById(R.id.tv_name);
        tv.setText("第"+i+"届甘肃黄河文学奖获奖名单");
        return view;
    }
}
