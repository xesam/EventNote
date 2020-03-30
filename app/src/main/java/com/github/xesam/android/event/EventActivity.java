package com.github.xesam.android.event;

import android.app.Activity;
import android.os.Bundle;
import android.view.MotionEvent;

public class EventActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event);
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
