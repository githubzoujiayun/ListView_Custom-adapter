package cn.edu.bzu.listview_demo;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import cn.edu.bzu.adapter.MyListViewAdapter;
import cn.edu.bzu.entity.Bean;


public class MainActivity extends ActionBarActivity {
    private ListView listView;
    private List<Bean> list;
    private MyListViewAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getData();
        initView();
    }

    private void initView() {
        listView=(ListView)findViewById(R.id.ListView);
        listView.setAdapter(adapter);
    }

    private void getData() {
        list=new ArrayList<Bean>();
        list.add(new Bean("Android新技能1","Android打造万能的ListView和GridView适配器1","2015-04-19","10086"));
        list.add(new Bean("Android新技能2","Android打造万能的ListView和GridView适配器2","2015-04-19","10086"));
        list.add(new Bean("Android新技能3","Android打造万能的ListView和GridView适配器3","2015-04-19","10086"));
        list.add(new Bean("Android新技能4","Android打造万能的ListView和GridView适配器4","2015-04-19","10086"));
        adapter=new MyListViewAdapter(MainActivity.this,list);
    }
}
