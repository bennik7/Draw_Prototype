package com.activitymanager.klinglmayr.draw_prototype;

import android.app.Notification;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.SurfaceView;
import android.view.View;

/**
 * Created by Benedikt on 04.07.2016.
 */
public class DrawLine extends View {


    public DrawLine(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        super.onDraw(canvas);

        Paint paint = new Paint();
        paint.setColor(Color.RED);
        paint.setStrokeWidth(8f);
        int startX = 20;
        int startY = 100;
        int stopX = 140;
        int stopY = 30;

        canvas.drawLine(startX, startY, stopX, stopY, paint);


    }
}
