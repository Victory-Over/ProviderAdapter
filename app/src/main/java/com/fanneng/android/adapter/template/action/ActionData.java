package com.fanneng.android.adapter.template.action;


import com.fanneng.android.adapter.provider.IItemBean;
import com.fanneng.android.adapter.provider.IViewProvider;

import java.util.List;

/**
 * describe：
 *
 * @author ：鲁宇峰 on 2018/9/18 15：33
 *         email：luyufengc@enn.cn
 */
public class ActionData implements IItemBean {
    private List<Action> actions;

    public List<Action> getAction() {
        return actions;
    }

    public void setAction(List<Action> actions) {
        this.actions = actions;
    }

    public static class Action {
        private String title;
        private String url;


        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }


        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }
    }


    @Override
    public Class<? extends IViewProvider> getViewProviderClass() {
        return ActionsProvider.class;
    }
}
