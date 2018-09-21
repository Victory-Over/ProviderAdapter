package com.fanneng.android.adapter.template.recommend;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.fanneng.android.adapter.R;
import com.fanneng.android.adapter.provider.IViewProvider;
import com.fanneng.android.adapter.utils.GlideRoundTransform;

/**
 * describe：推荐模板
 *
 * @author ：鲁宇峰 on 2018/9/20 13：29
 *         email：luyufengc@enn.cn
 */
public class RecommendProvider implements IViewProvider {
    private Context mContext;
    private boolean isInit = true;

    @Override
    public View getItemView(Context context, View convertView, LayoutInflater inflater, Object data, int position) {
        ViewHolder holder;
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.template_recommend, null);
            holder = new ViewHolder(convertView);
            convertView.setTag(holder);
            isInit = true;
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        mContext = context;
        RecommendData recommendData = (RecommendData) data;
        if (isInit) {
            bindData(holder, recommendData);
            isInit = false;
        }
        return convertView;
    }

    private void bindData(ViewHolder holder, RecommendData recommendData) {
        if (mContext == null) return;
        if (recommendData != null) {
            Glide.with(mContext).load(recommendData.getImgUrl()).transform(new GlideRoundTransform(mContext, 10)).into(holder.ivRecommend);
        } else {
            holder.ivRecommend.setVisibility(View.GONE);
        }
    }


    private class ViewHolder {
        ImageView ivRecommend;

        ViewHolder(View view) {
            ivRecommend = view.findViewById(R.id.iv_recommend);
        }
    }

}
