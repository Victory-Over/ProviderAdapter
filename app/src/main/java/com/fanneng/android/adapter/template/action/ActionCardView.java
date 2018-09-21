package com.fanneng.android.adapter.template.action;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.fanneng.android.adapter.R;
import com.fanneng.android.adapter.utils.GlideRoundTransform;
import com.fanneng.android.adapter.utils.UIUtils;

/**
 * describe：
 *
 * @author ：鲁宇峰 on 2018/9/18 16：29
 *         email：luyufengc@enn.cn
 */
public class ActionCardView extends RelativeLayout implements View.OnClickListener {
    private TextView mTitleView;
    private ImageView mImageView;
    private ActionData.Action mAction;
    private Context context;

    public ActionCardView(Context context) {
        this(context, null);
    }

    public ActionCardView(Context context, AttributeSet attrs) {
        this(context, attrs, -1);
    }

    public ActionCardView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.context = context;
        init(context);
    }

    private void init(Context context) {
        LinearLayout linearLayout = new LinearLayout(context);
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT);
        params.gravity = Gravity.CENTER;
        linearLayout.setLayoutParams(params);
        linearLayout.setOrientation(LinearLayout.VERTICAL);

        mImageView = new ImageView(context);
        LinearLayout.LayoutParams imageParams = new LinearLayout.LayoutParams(UIUtils.dp2px(context, 45), UIUtils.dp2px(context, 45));
        imageParams.gravity = Gravity.CENTER;
        linearLayout.addView(mImageView, imageParams);

        mTitleView = new TextView(context);
        LinearLayout.LayoutParams textParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        textParams.topMargin = UIUtils.dp2px(context, 3);
        mTitleView.setGravity(Gravity.CENTER);
        mTitleView.setLayoutParams(textParams);
        mTitleView.setTextColor(ContextCompat.getColor(context, R.color.color_black));
        mTitleView.setTextSize(10);
        linearLayout.addView(mTitleView);

        addView(linearLayout);
    }

    public void setData(ActionData.Action action) {
        mAction = action;
        if (action != null) {
            mTitleView.setText(action.getTitle());
            //圆角图片
            Glide.with(context).load(action.getUrl()).transform(new GlideRoundTransform(context, 30)).into(mImageView);
            setOnClickListener(this);
        }
    }

    @Override
    public void onClick(View v) {
        if (mAction != null) {
            Toast.makeText(context, mAction.getTitle() + "被点击了", Toast.LENGTH_SHORT).show();
        }
    }
}
