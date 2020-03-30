package com.github.xesam.android.event;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.RelativeLayout;

import androidx.annotation.RequiresApi;

public class EventViewGroup extends RelativeLayout {

    public EventViewGroup(Context context) {
        super(context);
    }

    public EventViewGroup(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public EventViewGroup(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public EventViewGroup(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
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
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        Events.log(this, "onInterceptTouchEvent-start", ev);
        boolean ret = super.onInterceptTouchEvent(ev);
        Events.log(this, "onInterceptTouchEvent-end-" + ret, ev);
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
