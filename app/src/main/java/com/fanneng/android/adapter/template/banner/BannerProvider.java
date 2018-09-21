package com.fanneng.android.adapter.template.banner;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;

import com.fanneng.android.adapter.R;
import com.fanneng.android.adapter.provider.IViewProvider;
import com.fanneng.android.adapter.utils.GlideImageLoader;
import com.youth.banner.Banner;

/**
 * describe：Banner图模板
 *
 * @author ：鲁宇峰 on 2018/9/19 10：59
 *         email：luyufengc@enn.cn
 */
public class BannerProvider implements IViewProvider {
    private Context mContext;
    private boolean isInit = true;

    @Override
    public View getItemView(Context context, View convertView, LayoutInflater inflater, Object data, int position) {
        ViewHolder holder;
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.template_slideshow, null);
            holder = new ViewHolder(convertView);
            convertView.setTag(holder);
            isInit = true;
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        mContext = context;
        BannerData bannerData = (BannerData) data;
        //由于此缓存控件只需要赋值一次值，所以只需要初始化的时候bind一次就行了
        if (isInit) {
            bindData(holder, bannerData);
            isInit = false;
        }
        return convertView;
    }

    private void bindData(ViewHolder holder, BannerData bannerData) {
        if (mContext == null) return;
        if (bannerData != null && bannerData.getBanners().size() > 0) {
            holder.banner.setImageLoader(new GlideImageLoader());
            holder.banner.setImages(bannerData.getBanners());
            holder.banner.start();
        } else {
            holder.banner.setVisibility(View.GONE);
        }
    }


    private class ViewHolder {
        Banner banner;

        ViewHolder(View view) {
            banner = view.findViewById(R.id.banner);
        }
    }

}
