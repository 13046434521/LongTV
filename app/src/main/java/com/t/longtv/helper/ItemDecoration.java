package com.t.longtv.helper;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.t.longtv.bean.HistoryBean;
import com.t.longtv.utils.DimensionUtils;

import java.util.List;

/**
 * 作者：龙昊
 * 日期：2018/5/3 18:21
 * 描述：
 */
public class ItemDecoration extends RecyclerView.ItemDecoration {
    private Paint paint;
    private List<HistoryBean.DataBean> dataBeans;
    private Rect rect;
    private int titleHeight=0;
    private int titileSize;
    private int anInt = 1;

    public ItemDecoration(Context context,List<HistoryBean.DataBean> dataBeans) {
        this.dataBeans = dataBeans;
        paint = new Paint();
        rect = new Rect();
        titileSize=DimensionUtils.getSp(context.getApplicationContext(),20);
        titleHeight= DimensionUtils.getDp(context.getApplicationContext(),20);
    }

    @Override
    public void onDraw(Canvas c, RecyclerView parent, RecyclerView.State state) {
        final int left = parent.getPaddingLeft();
        final int right = parent.getWidth() - parent.getPaddingRight();
        final int childCount = parent.getChildCount();
        for (int i = 0; i < childCount; i++) {
            final View child = parent.getChildAt(i);
            final RecyclerView.LayoutParams params = (RecyclerView.LayoutParams) child
                    .getLayoutParams();
            int position = params.getViewLayoutPosition();
            //我记得Rv的item position在重置时可能为-1.保险点判断一下吧
            if (position > -1) {
                if (position == 0) {//等于0肯定要有title的
                    drawTitleArea(c, left, right, child, params, position);

                } else {//其他的通过判断
                    if (null != dataBeans.get(position).getTime_text()&& !dataBeans.get(position).getTime_text().equals(dataBeans.get(position-1).getTime_text())) {
                        //不为空 且跟前一个tag不一样了，说明是新的分类，也要title
                        drawTitleArea(c, left, right, child, params, position);
                    } else {
                        //none
                    }
                }
            }
        }
    }

    @Override
    public void onDrawOver(Canvas c, RecyclerView parent, RecyclerView.State state) {
      /*  super.onDrawOver(c, parent, state);

        int firstPos=((LinearLayoutManager) parent.getLayoutManager()).findFirstVisibleItemPosition();

        paint.setColor(Color.GRAY);
        c.drawRect(parent.getLeft(),parent.getTop()-titleHeight,parent.getRight(),parent.getTop(),paint);

        paint.setColor(Color.BLACK);
        paint.setTextSize(30);
        paint.getTextBounds(dataBeans.get(firstPos).getTime_text(),0,dataBeans.get(firstPos).getTime_text().length(),rect);
        c.drawText(dataBeans.get(firstPos).getTime_text(),parent.getLeft(),parent.getPaddingTop()+titleHeight-(titleHeight-rect.height())/2,paint);
   */
        int pos = ((LinearLayoutManager)(parent.getLayoutManager())).findFirstVisibleItemPosition();

        String tag = dataBeans.get(pos).getTime_text();
        //View child = parent.getChildAt(pos);
        View child = parent.findViewHolderForLayoutPosition(pos).itemView;//出现一个奇怪的bug，有时候child为空，所以将 child = parent.getChildAt(i)。-》 parent.findViewHolderForLayoutPosition(pos).itemView
        paint.setColor(Color.GRAY);
        c.drawRect(parent.getPaddingLeft(), parent.getPaddingTop(), parent.getRight() - parent.getPaddingRight(), parent.getPaddingTop() + titleHeight, paint);
        paint.setColor(Color.BLACK);
        paint.getTextBounds(tag, 0, tag.length(), rect);
        c.drawText(tag, child.getPaddingLeft(),
                parent.getPaddingTop() + titleHeight - (titleHeight / 2 - rect.height() / 2),
                paint);
    
    
    
    }

    @Override
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        int position = ((RecyclerView.LayoutParams) view.getLayoutParams()).getViewLayoutPosition();
        //我记得Rv的item position在重置时可能为-1.保险点判断一下吧
        outRect.setEmpty();
        if (position > -1) {
            if (position == 0) {//等于0肯定要有title的
                outRect.set(0, titleHeight, 0, 0);
            } else {//其他的通过判断
                if (null != dataBeans.get(position).getTime_text() && !dataBeans.get(position).getTime_text().equals(dataBeans.get(position-1).getTime_text())) {
                    outRect.set(0, titleHeight, 0, 0);//不为空 且跟前一个tag不一样了，说明是新的分类，也要title
                } else {
                    outRect.set(0, 0, 0, 0);
                }
            }
        }
    }

    private void drawTitleArea(Canvas c, int left, int right, View child, RecyclerView.LayoutParams params, int position) {//最先调用，绘制在最下层
        paint.setColor(Color.GRAY);
        c.drawRect(left, child.getTop() - params.topMargin - titleHeight, right, child.getTop() - params.topMargin, paint);
        paint.setColor(Color.BLACK);
        paint.setTextSize(titileSize);
/*
        Paint.FontMetricsInt fontMetrics = paint.getFontMetricsInt();
        int baseline = (getMeasuredHeight() - fontMetrics.bottom + fontMetrics.top) / 2 - fontMetrics.top;*/

        paint.getTextBounds(dataBeans.get(position).getTime_text(), 0, dataBeans.get(position).getTime_text().length(), rect);
        c.drawText(dataBeans.get(position).getTime_text(), child.getPaddingLeft(), child.getTop() - params.topMargin - (titleHeight / 2 - rect.height() / 2), paint);
    }
}
