package com.t.longtv.helper;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;

import com.t.longtv.bean.HistoryBean;
import com.t.longtv.utils.DimensionUtils;

import java.util.List;

/**
 * 作者：龙昊
 * 日期：2018/5/1 15:38
 * 描述：
 */
public class ItemDecorationHelper  extends RecyclerView.ItemDecoration {
    private Context context;
    private List<HistoryBean.DataBean>  mDatas;
    private int position;
    private Paint paint;
    private Rect rect;
    private int titleHeight;
    private int titleSize;
    private static int COLOR_TITLE_BG = Color.parseColor("#FFDFDFDF");
    private static int COLOR_TITLE_FONT = Color.parseColor("#FF000000");
    public ItemDecorationHelper(Context context,List<HistoryBean.DataBean> mDatas) {
        super();
        this.context=context;
        this.mDatas=mDatas;
        rect=new Rect();
        paint=new Paint();
        titleHeight= DimensionUtils.getDp(context,30);
        titleSize=DimensionUtils.getSp(context,15);
        paint.setTextSize(titleSize);
        paint.setAntiAlias(true);
    }


    @Override
    public void onDraw(Canvas c, RecyclerView parent, RecyclerView.State state) {
        super.onDraw(c, parent, state);
        int left=parent.getPaddingLeft();
        int right=parent.getWidth()-parent.getPaddingRight();
        int childcount=parent.getChildCount();
        for (int i=0;i<childcount;i++){
            View child=parent.getChildAt(i);
            RecyclerView.LayoutParams params= (RecyclerView.LayoutParams) child.getLayoutParams();
            int postision=params.getViewLayoutPosition();

            if(postision>-1){
                if (postision==0){
                    drawTitle(c,left,right,child,params,position);
                }
                else{
                    if (TextUtils.isEmpty(mDatas.get(i).getTime_text())&& !mDatas.get(i).getTime_text().equals(mDatas.get(i-1).getTime_text())){
                        drawTitle(c,left,right,child,params,position);
                    }
                }
            }
        }
    }

    @Override
    public void onDrawOver(Canvas c, RecyclerView parent, RecyclerView.State state) {
        super.onDrawOver(c, parent, state);
        int pos = ((LinearLayoutManager)(parent.getLayoutManager())).findFirstVisibleItemPosition();

        String tag = mDatas.get(pos).getTime_text();
        //View child = parent.getChildAt(pos);
        View child = parent.findViewHolderForLayoutPosition(pos).itemView;//出现一个奇怪的bug，有时候child为空，所以将 child = parent.getChildAt(i)。-》 parent.findViewHolderForLayoutPosition(pos).itemView
        paint.setColor(COLOR_TITLE_BG);
        c.drawRect(parent.getPaddingLeft(), parent.getPaddingTop(), parent.getRight() - parent.getPaddingRight(), parent.getPaddingTop() +titleHeight, paint);
        paint.setColor(COLOR_TITLE_FONT);
        paint.getTextBounds(tag, 0, tag.length(), rect);
        c.drawText(tag, child.getPaddingLeft(),
                parent.getPaddingTop() + titleHeight - (titleHeight / 2 - rect.height() / 2),
                paint);
    }

    @Override
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        super.getItemOffsets(outRect, view, parent, state);
        int position=((RecyclerView.LayoutParams)view.getLayoutParams()).getViewLayoutPosition();
        if (position>-1){
            if (position==0){
                rect.set(0,titleHeight,0,0);
            }  else{
                if (TextUtils.isEmpty(mDatas.get(position).getTime_text())&& !mDatas.get(position).getTime_text().equals(mDatas.get(position-1).getTime_text())){
                   rect.set(0,titleHeight,0,0);
                }
                else{
                    rect.set(0,0,0,0);
                }
            }
        }
    }

    private void drawTitle(Canvas canvas, int left, int right,View child, RecyclerView.LayoutParams params,int position){
        paint.setColor(COLOR_TITLE_BG);
        canvas.drawRect(left,0,right,0,paint);

        paint.setColor(COLOR_TITLE_FONT);
        paint.getTextBounds(mDatas.get(position).getTime_text(), 0, mDatas.get(position).getTime_text().length(), rect);
        canvas.drawText(mDatas.get(position).getTime_text(),child.getPaddingLeft(), child.getTop() - params.topMargin - (titleHeight / 2 - rect.height() / 2), paint);
    }
}
