package com.fanneng.android.adapter.provider;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;


import java.util.ArrayList;
import java.util.List;

/**
 * describe：
 *
 * @author ：鲁宇峰 on 2018/9/14 11：17
 *         email：luyufengc@enn.cn
 */
public class ProviderAdapter extends BaseAdapter {
    private Context mContext;
    private List<? extends IItemBean> itemBeanList;
    private List<IViewProvider> mProviders = new ArrayList<IViewProvider>();
    private LayoutInflater mInflater;

    public ProviderAdapter(Context context, List<Class<? extends IViewProvider>> providers) {
        init(context, providers, null);
    }

    public ProviderAdapter(Context context, List<Class<? extends IViewProvider>> providers, List<? extends IItemBean> itemBeanList) {
        init(context, providers, itemBeanList);
    }

    private void init(Context context, List<Class<? extends IViewProvider>> providers, List<? extends IItemBean> itemBeanList) {
        this.mContext = context;
        mInflater = LayoutInflater.from(context);
        this.itemBeanList = itemBeanList;
        if (providers == null || providers.size() < 1) {
            throw new IllegalArgumentException("providers must not null or size < 1");
        }
        for (Class<? extends IViewProvider> cl : providers) {
            IViewProvider provider = null;
            Exception illegalException = null;
            try {
                provider = cl.newInstance();
            }catch (Exception e){
                illegalException = e;
                e.printStackTrace();
            }

            if(provider == null){
                if(illegalException != null){
                    illegalException.printStackTrace();
                }
                throw new IllegalArgumentException(cl.getName() + "not add this provider");

            }
            mProviders.add(provider);
        }
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        IItemBean itemBean = itemBeanList.get(position);
        if (itemBean.getViewProviderClass() == null) {
            throw new IllegalArgumentException(itemBean + " getViewProviderClass() return not null");
        }

        IViewProvider viewProvider = getProvider(itemBean.getViewProviderClass());
        if (viewProvider == null) {
            throw new IllegalArgumentException(itemBean.getViewProviderClass().getName() + " provider not exist");
        }
        convertView = viewProvider.getItemView(mContext, convertView, mInflater, itemBean, position);
        return convertView;
    }

    public List<? extends IItemBean> getItemBeanList() {
        return itemBeanList;
    }

    public void setItemBeanList(List<? extends IItemBean> itemBeanList) {
        if (itemBeanList == null) {
            return;
        }
        this.itemBeanList = itemBeanList;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public IItemBean getItem(int position) {
        if (itemBeanList != null && position < itemBeanList.size() && position >= 0) {
            return itemBeanList.get(position);
        }
        return null;
    }

    @Override
    public int getCount() {
        return itemBeanList == null ? 0 : itemBeanList.size();
    }

    public void clear() {
        if (itemBeanList != null && itemBeanList.size() > 0) {
            itemBeanList.clear();
        }
        notifyDataSetChanged();
    }

    @Override
    public int getItemViewType(int position) {
        if (itemBeanList == null || position < 0 || position >= itemBeanList.size()) {
            return 0;
        }
        IItemBean item = itemBeanList.get(position);
        if (item.getViewProviderClass() == null) {
            throw new IllegalArgumentException("ItemBean implements method getViewProvider() return not null");
        }
        Class providerClass = item.getViewProviderClass();
        int size = mProviders.size();
        for (int i = 0; i < size; i++) {
            if (providerClass.isInstance(mProviders.get(i))) {
                return i;
            }
        }
        return 0;
    }

    @Override
    public int getViewTypeCount() {
        int typeSize = mProviders.size();
        return typeSize <= 0 ? 1 : typeSize;
    }

    public IViewProvider getProvider(Class<? extends IViewProvider> cls){
        if(mProviders == null || mProviders.isEmpty()){
            return null;
        }
        for(IViewProvider provider : mProviders){
            if(cls.isInstance(provider)){
                return provider;
            }
        }
        return null;
    }

    public void destroy(){
        if(mProviders == null || mProviders.isEmpty()){
            return;
        }
        for(IViewProvider provider : mProviders){
            if(LifeCycleListener.class.isInstance(provider)){
                ((LifeCycleListener)provider).onDestroy();
            }
        }
    }

    public void onResume(){
        if(mProviders == null || mProviders.isEmpty()){
            return;
        }
        for(IViewProvider provider : mProviders){
            if(LifeCycleListener.class.isInstance(provider)){
                ((LifeCycleListener)provider).onResume();
            }
        }
    }

    public void onPause(){
        if(mProviders == null || mProviders.isEmpty()){
            return;
        }
        for(IViewProvider provider : mProviders){
            if(LifeCycleListener.class.isInstance(provider)){
                ((LifeCycleListener)provider).onPause();
            }
        }
    }
}
