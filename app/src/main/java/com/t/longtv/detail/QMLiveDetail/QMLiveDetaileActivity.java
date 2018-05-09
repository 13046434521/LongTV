package com.t.longtv.detail.QMLiveDetail;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.t.longtv.AppConstants;
import com.t.longtv.R;
import com.t.longtv.widget.MediaController;
import com.t.longtv.widget.VideoPlayer;

import butterknife.BindView;
import butterknife.ButterKnife;

@Route(path = AppConstants.ARouter_Fragment_QMLiveDetail)
public class QMLiveDetaileActivity extends AppCompatActivity {
    @BindView(R.id.vplayer_qmlive_container)
    VideoPlayer vplayer;
    private MediaController mMediaController;
    @Autowired
    String uid;
    @Autowired
    String stream;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qmlive_detaile);
        ButterKnife.bind(this);
//        ARouter.getInstance().inject(this);
        init();
    }

    private void init() {
        mMediaController=new MediaController(this);
        mMediaController.setOnClickSpeedAdjustListener(mOnClickSpeedAdjustListener);
        vplayer.setVideoPath(stream);
        vplayer.setMediaController(mMediaController);
    }

    private MediaController.OnClickSpeedAdjustListener mOnClickSpeedAdjustListener = new MediaController.OnClickSpeedAdjustListener() {
        @Override
        public void onClickNormal() {
            // 0x0001/0x0001 = 2
            vplayer.setPlaySpeed(0X00010001);
        }

        @Override
        public void onClickFaster() {
            // 0x0002/0x0001 = 2
            vplayer.setPlaySpeed(0X00020001);
        }

        @Override
        public void onClickSlower() {
            // 0x0001/0x0002 = 0.5
            vplayer.setPlaySpeed(0X00010002);
        }
    };
}
