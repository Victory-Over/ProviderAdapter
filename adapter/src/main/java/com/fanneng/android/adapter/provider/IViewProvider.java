package com.fanneng.android.adapter.provider;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;

/**
 * describe：
 *
 * @author ：鲁宇峰 on 2018/9/15 12：12
 *         email：luyufengc@enn.cn
 */
public interface IViewProvider {
    public abstract View getItemView(Context context, View convertView, LayoutInflater inflater, Object data, int position);
}
