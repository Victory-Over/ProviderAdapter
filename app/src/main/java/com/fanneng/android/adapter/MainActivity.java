package com.fanneng.android.adapter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.fanneng.android.adapter.provider.IItemBean;
import com.fanneng.android.adapter.provider.IViewProvider;
import com.fanneng.android.adapter.provider.ProviderAdapter;
import com.fanneng.android.adapter.template.action.ActionData;
import com.fanneng.android.adapter.template.action.ActionsProvider;
import com.fanneng.android.adapter.template.banner.BannerData;
import com.fanneng.android.adapter.template.banner.BannerProvider;
import com.fanneng.android.adapter.template.guess.GuessProvider;
import com.fanneng.android.adapter.template.headline.HeadLineData;
import com.fanneng.android.adapter.template.headline.HeadLineProvider;
import com.fanneng.android.adapter.template.recommend.RecommendData;
import com.fanneng.android.adapter.template.recommend.RecommendProvider;

import java.util.ArrayList;
import java.util.List;

/**
 * describe：
 *
 * @author ：鲁宇峰 on 2018/9/13 11：23
 *         email：luyufengc@enn.cn
 */
public class MainActivity extends AppCompatActivity {

    private ProviderAdapter mAdapter;
    private List<IItemBean> mDataList;
    private MainPageData mainPageData;
    private ListView lv_main;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv_main = findViewById(R.id.lv_main);
        initData();

        List<Class<? extends IViewProvider>> providers = new ArrayList<>();
        //将所有模板添加到ProviderAdapter 会根据添加进的模板进行ViewType判断
        providers.add(BannerProvider.class);
        providers.add(ActionsProvider.class);
        providers.add(HeadLineProvider.class);
        providers.add(RecommendProvider.class);
        providers.add(GuessProvider.class);

        mAdapter = new ProviderAdapter(this, providers);
        mDataList = new ArrayList<>();
        //添加banner数据
        mDataList.add(mainPageData.getBannerData());

        //添加功能分类数据
        mDataList.add(mainPageData.getActionData());

        //添加淘宝头条数据
        mDataList.add(mainPageData.getHeadLineData());

        //添加推荐数据
        mDataList.add(mainPageData.getRecommendData());

        //添加猜你喜欢数据
        mDataList.addAll(mainPageData.getGuessDataList());

        mAdapter.setItemBeanList(mDataList);
        lv_main.setAdapter(mAdapter);
    }

    private void initData() {
        mainPageData = new MainPageData();

        //模拟轮播图数据
        BannerData bannerData = new BannerData();
        bannerData.setBanners(Data.bannerList);
        mainPageData.setBannerData(bannerData);


        //模拟功能分类数据
        ActionData actionData = new ActionData();
        List<ActionData.Action> actions = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            ActionData.Action action = new ActionData.Action();
            action.setTitle(i < Data.titles.length ? Data.titles[i] : "新增功能" + i);
            action.setUrl(i < Data.iconUrl.length ? Data.iconUrl[i] : Data.iconUrl[0]);
            actions.add(action);
        }
        actionData.setAction(actions);
        mainPageData.setActionData(actionData);

        //模拟淘宝头条数据
        HeadLineData headLineData = new HeadLineData();
        headLineData.setHeadLines(Data.headLines);
        mainPageData.setHeadLineData(headLineData);

        //模拟推荐数据
        RecommendData recommendData = new RecommendData();
        recommendData.setImgUrl(Data.bannerList.get(Data.bannerList.size() - 2));
        mainPageData.setRecommendData(recommendData);

        //模拟猜你喜欢数据
        mainPageData.setGuessDataList(Data.guessList);
    }
}
