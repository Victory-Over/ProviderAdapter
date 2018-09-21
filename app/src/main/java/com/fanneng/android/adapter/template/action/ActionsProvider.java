package com.fanneng.android.adapter.template.action;

import android.content.Context;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;

import com.fanneng.android.adapter.provider.IViewProvider;
import com.fanneng.android.adapter.utils.UIUtils;

import java.util.ArrayList;

/**
 * describe：
 *
 * @author ：鲁宇峰 on 2018/9/19 19：29
 *         email：luyufengc@enn.cn
 */
public class ActionsProvider implements IViewProvider {

    @Override
    public View getItemView(Context context, View convertView, LayoutInflater inflater, Object data, int position) {
        HomeActionsHolder holder = null;
        if (convertView == null) {
            holder = new HomeActionsHolder();
            convertView = createActionsView(context, (ActionData) data, holder);
            convertView.setTag(holder);
        } else {
            holder = (HomeActionsHolder) convertView.getTag();
        }
        return convertView;
    }

    private View createActionsView(Context context, ActionData data, HomeActionsHolder holder) {
        //纵向的线性父布局，用于动态添加横向线性布局
        LinearLayout verticalLayout = new LinearLayout(context);
        LinearLayout.LayoutParams verticalParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.MATCH_PARENT);
        verticalLayout.setOrientation(LinearLayout.VERTICAL);
        verticalLayout.setLayoutParams(verticalParams);


        int size = data.getAction().size();

        //横向线性布局的属性
        LinearLayout.LayoutParams horizontalParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        horizontalParams.topMargin = UIUtils.dp2px(context, 15);

        //设置每个cardView的params
        LinearLayout.LayoutParams cardViewParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT);
        cardViewParams.gravity = Gravity.CENTER;
        cardViewParams.weight = 1;


        //size>5 则需要换行
        for (int j = 0; j < size / 5 + 1; j++) {
            //横向的线性布局，用于包装所有功能分类
            LinearLayout horizontalLayout = new LinearLayout(context);
            horizontalLayout.setLayoutParams(horizontalParams);
            horizontalLayout.setOrientation(LinearLayout.HORIZONTAL);
            //每行5个功能分类
            horizontalLayout.setWeightSum(5);

            for (int i = j * 5; i < j * 5 + 5; i++) {
                //防止越界
                if (i >= size) {
                    break;
                }
                ActionCardView cardView = null;
                //先取缓存中的view
                if (holder.views.size() > i) {
                    cardView = holder.views.get(i);
                }

                //缓存策略
                if (cardView == null) {
                    cardView = new ActionCardView(context);
                    cardView.setData(data.getAction().get(i));
                    horizontalLayout.addView(cardView, cardViewParams);
                    holder.views.add(cardView);
                } else {
                    cardView.setData(data.getAction().get(i));
                }

            }

            verticalLayout.addView(horizontalLayout);
        }


//        //创建父布局将功能列表和分割线添加进去
//        FrameLayout container = new FrameLayout(context);
//        addDivider(container, context);
//        container.addView(verticalLayout);

        return verticalLayout;
    }

//    private void addDivider(FrameLayout container, Context context) {
//        View divider = new View(context);
//        divider.setBackgroundColor(context.getResources().getColor(R.color.color_eeeeee));
//        FrameLayout.LayoutParams params = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.MATCH_PARENT, 1);
//        params.leftMargin = UIUtils.dp2px(context, 15);
//        params.rightMargin = params.leftMargin;
//        params.bottomMargin = UIUtils.dp2px(context, 8);
//        params.gravity = Gravity.BOTTOM;
//        container.addView(divider, params);
//    }

    private static class HomeActionsHolder {
        public ArrayList<ActionCardView> views = new ArrayList<ActionCardView>();
    }
}
