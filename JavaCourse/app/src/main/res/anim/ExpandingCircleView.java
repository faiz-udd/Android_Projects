package anim;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;

import com.example.javacourse.R;

public class ExpandingCircleView extends View {

    private Paint paint;
    private float radius = 200;
    private boolean showCircle = true;
    private Handler handler = new Handler();

    public ExpandingCircleView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    private void init() {
        paint = new Paint();
        paint.setColor(getResources().getColor(R.color.green));

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                showCircle = false;
                invalidate(); // Trigger redraw to hide the circle
            }
        }, 1000); // 1000 ms delay
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float centerX = getWidth() / 2f;
        float centerY = getHeight() / 2f;
        if (showCircle) {
            canvas.drawCircle(centerX, centerY, radius, paint);
        }
    }

    public void setRadius(float radius) {
        this.radius = radius;
        invalidate();
    }
}
