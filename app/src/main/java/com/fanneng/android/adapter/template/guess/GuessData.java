package com.fanneng.android.adapter.template.guess;


import com.fanneng.android.adapter.provider.IItemBean;
import com.fanneng.android.adapter.provider.IViewProvider;

/**
 * describe：
 *
 * @author ：鲁宇峰 on 2018/9/21 10：29
 *         email：luyufengc@enn.cn
 */
public class GuessData implements IItemBean {
    private String name;
    private String url;
    private double price;
    private int count;

    public GuessData(String name, String url, double price, int count) {
        this.name = name;
        this.url = url;
        this.price = price;
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public Class<? extends IViewProvider> getViewProviderClass() {
        return GuessProvider.class;
    }
}
