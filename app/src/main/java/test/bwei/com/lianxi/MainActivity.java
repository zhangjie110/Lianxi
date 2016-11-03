package test.bwei.com.lianxi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.ScrollView;

import java.util.ArrayList;
import java.util.List;

import test.bwei.com.lianxi.adapter.MyGridAdapter;
import test.bwei.com.lianxi.adapter.MyListAdapter;

public class MainActivity extends AppCompatActivity {

    private ScrollView sv;
    private ListView lv;
    private GridView gv;
    private MyGridAdapter adapter;
    private List<String> list = new ArrayList<>();
    private List<String> data = new ArrayList<>();
    private MyListAdapter adapter1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //初始化数据
        initView();

    }

    private void initView() {
        //找到控件
        sv = (ScrollView) findViewById(R.id.sv);
        lv = (ListView) findViewById(R.id.lv);
        gv = (GridView) findViewById(R.id.gv);
        //显示scrollview
        sv.smoothScrollTo(0, 0);

        //给gridview添加数据
        for (int i = 0; i < 16; i++) {
            list.add("作家协会" + i);
        }

        //给listview添加数据
        for (int j = 0; j < 10; j++) {
            data.add("第" + j + "届甘肃黄河文学奖获奖名单");
        }

        //适配器
        adapter = new MyGridAdapter(this, list);
        gv.setAdapter(adapter);
        //适配器
        adapter1 = new MyListAdapter(data, this);
        lv.setAdapter(adapter1);
    }
}
