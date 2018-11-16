package Day06;

import java.text.DecimalFormat;

/*- 定义一个圆形Circle类。
  - 属性：
    - r：半径
  - 构造方法：
    - 无参构造方法public Circle(){}
    - 满参构造方法
  - 成员方法：
    - get/set方法
    - showArea方法：打印圆形面积
    - showPerimeter方法：打印圆形周长
- 定义测试类，创建Circle对象，并测试。
*/
public class KhEx05 {
    public static void main(String[] args){
        Circle c = new Circle();
        c.setR(8);
        c.showArea(c.getR());
        c.showPerimeter(c.getR());
    }

}
class Circle{
    private int r;
    DecimalFormat df = new DecimalFormat("#.00");

    public Circle() {
    }

    public Circle(int r) {
        this.r = r;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }
    public void showArea(int r){
        System.out.println("半径为："+r+",面积为："+df.format(Math.PI*r*r));
    }
    public void showPerimeter(int r){
        System.out.println("半径为："+r+",周长为："+df.format(2*Math.PI*r));
    }
}
