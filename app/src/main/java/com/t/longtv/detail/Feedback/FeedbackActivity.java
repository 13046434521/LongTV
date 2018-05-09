package com.t.longtv.detail.Feedback;

import android.os.Bundle;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.t.longtv.AppConstants;
import com.t.longtv.R;
import com.t.longtv.base.BaseActivity;
/**
 * 作者：龙昊
 * 日期：2018/4/26 22:56
 * 描述：反馈Activity
 */
@Route(path = AppConstants.ARouter_Feedback)
public class FeedbackActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);
    }
}
