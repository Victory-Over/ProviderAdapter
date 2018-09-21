package com.fanneng.android.adapter.template.banner;


import com.fanneng.android.adapter.provider.IItemBean;
import com.fanneng.android.adapter.provider.IViewProvider;

import java.util.List;

/**
 * describe：
 *
 * @author ：鲁宇峰 on 2018/9/19 10：22
 *         email：luyufengc@enn.cn
 */
public class BannerData implements IItemBean {

    private List<String> banners;

    public List<String> getBanners() {
        return banners;
    }

    public void setBanners(List<String> banners) {
        this.banners = banners;
    }

    @Override
    public Class<? extends IViewProvider> getViewProviderClass() {
        return BannerProvider.class;
    }
}
