package lktower.zhwilson.com.piechart;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhwilson on 2016/9/26.
 * 自定义饼状图
 */
public class NirvanaPieChart extends View {
    private int width;//控件的宽度
    private int height;//控件的高度
    private Paint piePaint;
    private List<PieData> pieDatas;
    private int startAngle;//开始度数
    private int widthMeasureSpecMode;
    private int heightMeasureSpecMode;

    public NirvanaPieChart(Context context) {
        this(context, null);
    }

    public NirvanaPieChart(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public NirvanaPieChart(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        widthMeasureSpecMode = MeasureSpec.getMode(widthMeasureSpec);
        heightMeasureSpecMode = MeasureSpec.getMode(heightMeasureSpec);
        if (widthMeasureSpecMode == MeasureSpec.UNSPECIFIED || heightMeasureSpecMode == MeasureSpec.UNSPECIFIED) {
            setMeasuredDimension(200, 200);
            return;
        }
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        width = w;
        height = h;
    }

    private void init() {
        piePaint = new Paint();
        piePaint.setAntiAlias(true);
        piePaint.setStyle(Paint.Style.FILL);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawColor(Color.YELLOW);
        if (pieDatas == null)
            return;
        canvas.translate(width/2, height/2);
        for (int i = 0; i < pieDatas.size(); i++){

        }

    }

    public void setPieDatas(List<PieData> datas) {
        if (pieDatas == null)
            pieDatas = new ArrayList<>();
        pieDatas.clear();
        pieDatas.addAll(datas);
        invalidate();//刷新界面
    }

    /**
     * 设置扇形开始绘制度数
     * @param startAngle 开始度数
     */
    public void setStartAngle(int startAngle) {
        this.startAngle = startAngle%360;
        invalidate();
    }
}
