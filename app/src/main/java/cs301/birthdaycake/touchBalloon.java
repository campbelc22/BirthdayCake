package cs301.birthdaycake;

import android.view.MotionEvent;
import android.view.View;

public class touchBalloon implements View.OnTouchListener {
    public boolean hasClicked = false;
    private CakeView view1;
    float xPos;
    float yPos;

    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {
        this.view1 = (CakeView) view;
        hasClicked = true;

        switch (motionEvent.getAction()) {
            case MotionEvent.ACTION_DOWN:
                xPos = motionEvent.getX();
                yPos = motionEvent.getY();
                view1.invalidate();
        }
        return true;
    }

}