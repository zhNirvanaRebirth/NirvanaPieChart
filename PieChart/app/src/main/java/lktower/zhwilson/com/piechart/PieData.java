package lktower.zhwilson.com.piechart;

/**
 * Created by zhwilson on 2016/9/26.
 * 数据的所占比例等信息
 */
public class PieData {
    private float proportion;//所占比例
    private int color;//扇形颜色

    public float getProportion() {
        return proportion;
    }

    public void setProportion(float proportion) {
        this.proportion = proportion;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }
}
