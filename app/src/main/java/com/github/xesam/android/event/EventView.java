package com.github.xesam.android.event;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

public class EventView extends View {

    public EventView(Context context) {
        super(context);
    }

    public EventView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public EventView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public EventView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Events.log(this, "dispatchTouchEvent-start", ev);
        boolean ret = super.dispatchTouchEvent(ev);
        Events.log(this, "dispatchTouchEvent-end-" + ret, ev);
        return ret;
    }

    @Override
    public boolean onTouchEvent(MotionEvent ev) {
        Events.log(this, "onTouchEvent-start", ev);
        boolean ret = super.onTouchEvent(ev);
        Events.log(this, "onTouchEvent-end-" + ret, ev);
        return ret;
    }
}
