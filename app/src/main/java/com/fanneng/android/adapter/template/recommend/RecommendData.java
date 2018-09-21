package com.fanneng.android.adapter.template.recommend;


import com.fanneng.android.adapter.provider.IItemBean;
import com.fanneng.android.adapter.provider.IViewProvider;

/**
 * describe：
 *
 * @author ：鲁宇峰 on 2018/9/20 17：23
 *         email：luyufengc@enn.cn
 */
public class RecommendData implements IItemBean {
    String imgUrl;

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    @Override
    public Class<? extends IViewProvider> getViewProviderClass() {
        return RecommendProvider.class;
    }
}
