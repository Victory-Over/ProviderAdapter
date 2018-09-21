package com.fanneng.android.adapter.template.headline;


import com.fanneng.android.adapter.provider.IItemBean;
import com.fanneng.android.adapter.provider.IViewProvider;

import java.util.List;

/**
 * describe：
 *
 * @author ：鲁宇峰 on 2018/9/20 18：19
 *         email：luyufengc@enn.cn
 */
public class HeadLineData implements IItemBean {

    private List<String> headLines;

    public List<String> getHeadLines() {
        return headLines;
    }

    public void setHeadLines(List<String> headLines) {
        this.headLines = headLines;
    }

    @Override
    public Class<? extends IViewProvider> getViewProviderClass() {
        return HeadLineProvider.class;
    }
}
