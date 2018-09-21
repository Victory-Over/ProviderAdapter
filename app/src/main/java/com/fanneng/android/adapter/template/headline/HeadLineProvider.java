package com.fanneng.android.adapter.template.headline;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import com.fanneng.android.adapter.R;
import com.fanneng.android.adapter.provider.IViewProvider;
import com.oushangfeng.marqueelayout.MarqueeLayout;
import com.oushangfeng.marqueelayout.MarqueeLayoutAdapter;

/**
 * describe：淘宝头条模板
 *
 * @author ：鲁宇峰 on 2018/9/19 20：03
 *         email：luyufengc@enn.cn
 */
public class HeadLineProvider implements IViewProvider {

    private Context mContext;
    private boolean isInit = true;

    @Override
    public View getItemView(Context context, View convertView, LayoutInflater inflater, Object data, int position) {
        HeadLineProvider.ViewHolder holder;
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.template_headline, null);
            holder = new HeadLineProvider.ViewHolder(convertView);
            convertView.setTag(holder);
            isInit = true;
        } else {
            holder = (HeadLineProvider.ViewHolder) convertView.getTag();
        }
        mContext = context;
        HeadLineData headLineData = (HeadLineData) data;
        if (isInit) {
            bindData(holder, headLineData);
            isInit = false;
        }
        return convertView;
    }

    private void bindData(HeadLineProvider.ViewHolder holder, HeadLineData headLineData) {
        if (mContext == null) return;
        if (headLineData != null && headLineData.getHeadLines().size() > 0) {
            MarqueeLayoutAdapter<String> topAdapter = new MarqueeLayoutAdapter<String>(headLineData.getHeadLines()) {
                @Override
                protected int getItemLayoutId() {
                    return R.layout.template_headline_marquee_item;
                }

                @Override
                protected void initView(View view, int position, String item) {
                    ((TextView) view).setText(item);

                }
            };
            holder.marquee.setAdapter(topAdapter);
            holder.marquee.start();
        } else {
            holder.marquee.setVisibility(View.GONE);
        }
    }

    private class ViewHolder {
        MarqueeLayout marquee;

        ViewHolder(View view) {
            marquee = view.findViewById(R.id.marquee_layout);
        }
    }


}
