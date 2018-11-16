package Day06;
/*- 定义一个日期MyDate类。
  - 属性：
    - year：年
    - month：月
    - day：日
  - 构造方法：
    - 满参构造方法
  - 成员方法：
    - get/set方法
    - showDate方法：打印日期。
    - isBi方法：判断当前日期是否是闰年
- 定义测试类，创建MyDate对象，并测试。
*/
public class KhEx06 {
    public static void main(String[] args){
        MyDate md = new MyDate(1900,1,1);
        md.showDate(md.getYear(),md.getMouth(),md.getDay());
        if(md.isBi()){
            System.out.println(md.getYear()+"是闰年");
        }else{
            System.out.println(md.getYear()+"不是闰年");
        }
    }
}
class MyDate{
    private int year;
    private int mouth;
    private int day;


    public MyDate(int year, int mouth, int day) {
        this.year = year;
        this.mouth = mouth;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMouth() {
        return mouth;
    }

    public void setMouth(int mouth) {
        this.mouth = mouth;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }
    public boolean isBi(){
        if(this.year%100 !=0 && this.year%4 == 0){
            return true;
        }else if(this.year%100==0 && this.year%400 ==0){
            return  true;
        }else{
            return  false;
        }
    }
    public void showDate(int year,int mouth,int day){
        System.out.println("日期是："+this.year+"年"+this.mouth+"月"+this.day+"日");

    }
}
