package de.jodamob.kotlin.droidcon;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;

public class SomeFancyScrollContainer extends FrameLayout {

    private boolean duringScroll = false;
    private MotionEvent startEvent;

    interface ScrollListener {
        void onStarted();
        void onScrolled(float distance);
        void onStopped();
    }

    private ScrollListener overScrollListener;

    public SomeFancyScrollContainer(final Context context) {
        super(context);
    }

    public SomeFancyScrollContainer(final Context context, final AttributeSet attrs) {
        super(context, attrs);
    }

    public void setOverScrollListener(final ScrollListener overScrollListener) {
        this.overScrollListener = overScrollListener;
    }

    public boolean onTouchEventInternal(final MotionEvent ev) {
        if (ev == null) {
            return false;
        }
        switch (ev.getAction()) {
            case MotionEvent.ACTION_DOWN:
                onActionDown(ev);
                break;
            case MotionEvent.ACTION_CANCEL:
            case MotionEvent.ACTION_UP:
                onActionUp();
                break;
            case MotionEvent.ACTION_MOVE:
                if (startEvent == null) {
                    return false;
                }
                return onActionMove(ev);
        }
        return false;
    }

    private void onActionDown(final MotionEvent event) {
        duringScroll = false;
        startEvent = event;
    }

    private void onActionUp() {
        if (duringScroll) {
            duringScroll = false;
            overScrollListener.onStopped();
        }
    }


    private boolean onActionMove(final MotionEvent event) {
        float diff = event.getY() - startEvent.getY();
        if (diff < 0) {
            diff = 0;
        }
        duringScroll = diff > 0;
        overScrollListener.onStarted();
        overScrollListener.onScrolled((int) diff);
        return true;
    }

}
