package de.jodamob.kotlin.droidcon.g;

import android.content.Context;
import android.view.MotionEvent;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
public class SomeFancyScrollContainerTest {

    float START_SCROLL = 100f;
    float END_SCROLL = 200f;
    MotionEvent actionDown = mock(MotionEvent.class);
    MotionEvent actionMove = mock(MotionEvent.class);
    MotionEvent actionUp = mock(MotionEvent.class);
    SomeFancyScrollContainer.ScrollListener scrollListener = mock(SomeFancyScrollContainer.ScrollListener.class);
    SomeFancyScrollContainer tested = new SomeFancyScrollContainer(mock(Context.class));

    @Test
    public void should_forward_touch_up_via_listener() {
        tested.setOverScrollListener(scrollListener);

        when(actionDown.getAction()).thenReturn(MotionEvent.ACTION_DOWN);
        when(actionDown.getY()).thenReturn(START_SCROLL);
        when(actionMove.getAction()).thenReturn(MotionEvent.ACTION_MOVE);
        when(actionMove.getY()).thenReturn(END_SCROLL);
        when(actionUp.getAction()).thenReturn(MotionEvent.ACTION_UP);
        when(actionUp.getY()).thenReturn(END_SCROLL);

        tested.onTouchEventInternal(actionDown);
        tested.onTouchEventInternal(actionMove);
        tested.onTouchEventInternal(actionUp);

        verify(scrollListener).onStopped();
    }

    @Test
    public void should_ignore_if_nothing_moved() {
        tested.setOverScrollListener(scrollListener);

        when(actionDown.getAction()).thenReturn(MotionEvent.ACTION_DOWN);
        when(actionDown.getY()).thenReturn(START_SCROLL);
        when(actionMove.getAction()).thenReturn(MotionEvent.ACTION_MOVE);
        when(actionMove.getY()).thenReturn(START_SCROLL);
        when(actionUp.getAction()).thenReturn(MotionEvent.ACTION_UP);
        when(actionUp.getY()).thenReturn(START_SCROLL);

        tested.onTouchEventInternal(actionDown);
        tested.onTouchEventInternal(actionMove);
        tested.onTouchEventInternal(actionUp);

        verify(scrollListener, never()).onStopped();
    }

}