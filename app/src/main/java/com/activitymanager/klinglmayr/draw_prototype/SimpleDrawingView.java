package com.activitymanager.klinglmayr.draw_prototype;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.SurfaceView;
import android.view.View;

/**
 * Created by Benedikt on 04.07.2016.
 */
public class SimpleDrawingView extends SurfaceView {

        public SimpleDrawingView(Context context, AttributeSet attrs) {
            super(context, attrs);

        }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

         Rect rectangle = new Rect();

    }
}
