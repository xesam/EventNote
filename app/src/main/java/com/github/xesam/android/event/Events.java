package com.github.xesam.android.event;

import android.app.Activity;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

public class Events {

    public static String getAction(int action) {
        switch (action) {
            case MotionEvent.ACTION_DOWN:
                return "DOWN";
            case MotionEvent.ACTION_MOVE:
                return "MOVE";
            case MotionEvent.ACTION_CANCEL:
                return "CANCEL";
            case MotionEvent.ACTION_UP:
                return "UP";
            default:
                return action + "";
        }
    }

    public static void log(String tag, String method, MotionEvent event) {
        String action = getAction(event.getAction());
        Log.d(tag.toString(), action + "-" + method + "-[" + event.getRawX() + "," + event.getRawY() + "]");
    }

    public static void log(Activity activity, String method, MotionEvent event) {
        log("_ev_act", method, event);
    }

    public static void log(View view, String method, MotionEvent event) {
        Object tag = view.getTag();
        log(tag.toString(), method, event);
    }
}
