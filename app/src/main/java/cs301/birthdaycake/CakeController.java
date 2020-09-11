package cs301.birthdaycake;

import android.util.Log;
import android.view.View;

public class CakeController implements View.OnClickListener {

    private CakeView view1;
    private CakeModel model1;
    public CakeController(CakeView view) {
        this.view1 = view;
        this.model1 = view1.getCakeModel();

    }

    @Override
    public void onClick(View view) {
        Log.d("button", "button clicked");
        model1.lit=false;
        view1.invalidate();
    }
}
