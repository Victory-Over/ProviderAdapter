package com.fanneng.android.adapter;

import com.fanneng.android.adapter.template.action.ActionData;
import com.fanneng.android.adapter.template.banner.BannerData;
import com.fanneng.android.adapter.template.guess.GuessData;
import com.fanneng.android.adapter.template.headline.HeadLineData;
import com.fanneng.android.adapter.template.recommend.RecommendData;

import java.util.List;

/**
 * describe：
 *
 * @author ：鲁宇峰 on 2018/9/19 14：26
 *         email：luyufengc@enn.cn
 */
public class MainPageData {
    private BannerData bannerData;

    private ActionData actionData;

    private HeadLineData headLineData;

    private RecommendData recommendData;

    private List<GuessData> guessDataList;

    public BannerData getBannerData() {
        return bannerData;
    }

    public void setBannerData(BannerData bannerData) {
        this.bannerData = bannerData;
    }

    public ActionData getActionData() {
        return actionData;
    }

    public void setActionData(ActionData actionData) {
        this.actionData = actionData;
    }

    public HeadLineData getHeadLineData() {
        return headLineData;
    }

    public void setHeadLineData(HeadLineData headLineData) {
        this.headLineData = headLineData;
    }

    public RecommendData getRecommendData() {
        return recommendData;
    }

    public void setRecommendData(RecommendData recommendData) {
        this.recommendData = recommendData;
    }

    public List<GuessData> getGuessDataList() {
        return guessDataList;
    }

    public void setGuessDataList(List<GuessData> guessDataList) {
        this.guessDataList = guessDataList;
    }
}
