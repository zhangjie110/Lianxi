package test.bwei.com.lianxi.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import test.bwei.com.lianxi.R;

/**
 * Created by zhangjie on 2016/11/3.
 */
public class MyGridAdapter extends BaseAdapter {
    private Context context;
    private int[] img = {R.mipmap.gv1, R.mipmap.gv2, R.mipmap.gv3, R.mipmap.gv4, R.mipmap.gv1, R.mipmap.gv5, R.mipmap.gv6, R.mipmap.gv7, R.mipmap.gv8, R.mipmap.gv9, R.mipmap.gv10, R.mipmap.gv11, R.mipmap.gv12, R.mipmap.gv13, R.mipmap.gv14, R.mipmap.gv1, R.mipmap.gv5};
    private List<String> list;

    public MyGridAdapter(Context context, List<String> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder;
        if (view == null) {
            view = View.inflate(context, R.layout.grid_item, null);
            holder = new ViewHolder();
            holder.iv = (ImageView) view.findViewById(R.id.iv_grid);
            holder.tv = (TextView) view.findViewById(R.id.tv_title);
            view.setTag(holder);
        } else {
            holder = (ViewHolder) view.getTag();
        }
        holder.iv.setImageResource(img[i]);
        holder.tv.setText(list.get(i));
        return view;
    }

    class ViewHolder {
        ImageView iv;
        TextView tv;
    }
}
