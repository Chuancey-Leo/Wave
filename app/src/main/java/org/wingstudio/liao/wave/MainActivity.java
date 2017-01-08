package org.wingstudio.liao.wave;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private float x=200;
    private float y=200;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /*WaterWaveView waterWaveView = new WaterWaveView(this);
        setContentView(waterWaveView);*/
        /*System.out.println("测试x："+x);*/

        System.out.println("测试y："+y);
        setContentView(new AnimateView(this));
    }

    class AnimateView extends View {
        float radius=10;
        Paint paint;
        public AnimateView(Context context){
            super(context);
            paint=new Paint();
            paint.setColor(Color.RED);
            paint.setStyle(Paint.Style.STROKE);
        }
        @Override
        protected void onDraw(Canvas canvas) {

            canvas.translate(x,y);
            canvas.drawCircle(0,0,radius++,paint);
            if(radius>300){
                radius=0;
            }
            invalidate();
        }
    }
}
