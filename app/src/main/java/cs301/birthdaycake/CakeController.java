package cs301.birthdaycake;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.SeekBar;

public class CakeController implements View.OnClickListener, CompoundButton.OnCheckedChangeListener, SeekBar.OnSeekBarChangeListener, View.OnTouchListener {

    private CakeView view1;
    private CakeModel model1;


    public CakeController(CakeView view) {
        this.view1 = view;
        this.model1 = view1.getCakeModel();

    }

    @Override
    public void onClick(View view2) {
        Log.d("button", "button clicked");
        model1.lit=false;
        view1.invalidate();
    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        if (model1.candlesExist == false){
            model1.candlesExist = true;
        }
        else {
            model1.candlesExist=false;
        }
        view1.invalidate();
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
        model1.candleNum=i;
        view1.invalidate();
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {
        model1.x = motionEvent.getX();
        model1.y = motionEvent.getY();
        view1.invalidate();
        return true;
    }
}
