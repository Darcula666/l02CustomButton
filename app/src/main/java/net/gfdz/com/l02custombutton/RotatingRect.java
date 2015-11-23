package net.gfdz.com.l02custombutton;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by Administrator on 2015/11/23.
 */
public class RotatingRect extends View {
    private Paint p;
    private float degrees=0;
    public RotatingRect(Context context) {
        super(context);
        initProperties();
    }

    public RotatingRect(Context context, AttributeSet attrs) {
        super(context, attrs);
        initProperties();
    }

    public RotatingRect(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initProperties();
    }
    private void initProperties(){
     p=new Paint();
        p.setColor(Color.BLUE);
    }
    @Override
    public void draw(Canvas canvas) {
        super.draw(canvas);
        canvas.save();
        canvas.translate(200,200);
        canvas.rotate(degrees,50,50);
        canvas.drawRect(0, 0, 100,100, p);
        degrees++;
        canvas.restore();
        invalidate();
    }
}
