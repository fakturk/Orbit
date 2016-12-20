package com.unist.netlab.fakturk.orbit;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by fakturk on 16. 12. 18.
 */

public class BigCircleView extends View {
    Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);

    public BigCircleView(Context context) {
        super(context);
    }

    public BigCircleView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public BigCircleView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public BigCircleView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        paint.setStyle(Paint.Style.STROKE);
        //// TODO: 16. 12. 18  change radius formula for generic use
        int radius = 0;
        if (this.getHeight()>this.getWidth())
        {
            radius = this.getWidth()/2-50;
        }
        else
        {
            radius = this.getHeight()/2-50;
        }
        canvas.drawCircle(this.getWidth()/2,this.getHeight()/2,radius,paint);
    }
}
