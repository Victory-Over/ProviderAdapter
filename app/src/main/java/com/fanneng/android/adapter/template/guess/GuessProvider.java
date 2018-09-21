package com.fanneng.android.adapter.template.guess;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.fanneng.android.adapter.R;
import com.fanneng.android.adapter.provider.IViewProvider;

/**
 * describe：猜你喜欢模板
 *
 * @author ：鲁宇峰 on 2018/9/21 11：04
 *         email：luyufengc@enn.cn
 */
public class GuessProvider implements IViewProvider {
    private Context mContext;

    @Override
    public View getItemView(Context context, View convertView, LayoutInflater inflater, Object data, int position) {
        ViewHolder holder;
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.template_guess, null);
            holder = new ViewHolder(convertView);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        mContext = context;
        GuessData guessData = (GuessData) data;
            bindData(holder, guessData);
        return convertView;
    }

    private void bindData(ViewHolder holder, GuessData guess) {
        if (mContext == null) return;
        Glide.with(mContext).load(guess.getUrl()).into(holder.iv_home);
        holder.tv_title.setText(guess.getName());
        holder.tv_price.setText("￥"+guess.getPrice());
        holder.tv_count.setText(guess.getCount() + "人付款");

        Glide.with(mContext).load(guess.getUrl()).into(holder.iv_home2);
        holder.tv_title2.setText(guess.getName());
        holder.tv_price2.setText("￥"+guess.getPrice());
        holder.tv_count2.setText(guess.getCount() + "人付款");
    }


    private class ViewHolder {
        ImageView iv_home;
        TextView tv_title;
        TextView tv_price;
        TextView tv_count;
        ImageView iv_home2;
        TextView tv_title2;
        TextView tv_price2;
        TextView tv_count2;

        ViewHolder(View view) {
            iv_home = view.findViewById(R.id.iv_home);
            tv_title = view.findViewById(R.id.tv_title);
            tv_price = view.findViewById(R.id.tv_price);
            tv_count = view.findViewById(R.id.tv_count);
            iv_home2 = view.findViewById(R.id.iv_home2);
            tv_title2 = view.findViewById(R.id.tv_title2);
            tv_price2 = view.findViewById(R.id.tv_price2);
            tv_count2 = view.findViewById(R.id.tv_count2);
        }
    }

}
