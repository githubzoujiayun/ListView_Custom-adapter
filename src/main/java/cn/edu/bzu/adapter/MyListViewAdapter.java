package cn.edu.bzu.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;


import org.w3c.dom.Text;

import java.util.List;

import cn.edu.bzu.entity.Bean;
import cn.edu.bzu.listview_demo.R;

/**
 * Created by monster on 2015/4/19.
 */
public class MyListViewAdapter extends BaseAdapter {
    private LayoutInflater mInflater; //LayoutInflater是用来找layout下xml布局文件，并且实例化
    private List<Bean> mlist;
    public MyListViewAdapter(Context context,List<Bean> list) {
        mInflater=LayoutInflater.from(context); //得到初始化上下文
        mlist=list;
    }
    @Override
    public int getCount() {
        return mlist.size();
    }

    @Override
    public Object getItem(int position) {
        return mlist.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder=null;
        if(convertView==null){
            convertView=mInflater.inflate(R.layout.listview_item,null);  //将布局转换成视图
            holder=new ViewHolder();
            holder.mTitle=(TextView)convertView.findViewById(R.id.id_title);
            holder.mDesc=(TextView)convertView.findViewById(R.id.id_desc);
            holder.mDate=(TextView)convertView.findViewById(R.id.id_time);
            holder.mPhone=(TextView)convertView.findViewById(R.id.id_phone);
            convertView.setTag(holder);
        }else {
            //ViewHolder被复用
            holder=(ViewHolder)convertView.getTag();
        }
        holder.mTitle.setText(mlist.get(position).getTitle());
        holder.mDesc.setText(mlist.get(position).getDesc());
        holder.mPhone.setText(mlist.get(position).getPhone());
        holder.mDate.setText(mlist.get(position).getDate());
        return convertView;
    }
    private class ViewHolder{
        TextView mTitle;
        TextView mDesc;
        TextView mDate;
        TextView mPhone;
    }
}
