package code04;

public class Codes4_6_3Reference {
    public static void main(String[] args) {
        Person[] student;//定义一个student数组变量，其类型是Person
        student = new Person[2];//执行动态初始化；
        Person zhang = new Person();
        zhang.age = 15;
        zhang.height = 187;
        Person li = new Person();
        li.age = 34;
        li.height = 189;
        student[0] = zhang;
        student[1]=li;
        zhang.info();
        student[1].info();
    }
    //private 私有 只能在类内部进行访问在外部不可以进行访问，如果需要则需要有个getName().
}
class Person {
    public int age;
    public double height;
    private int high;

    public int getHigh() {
        high = age*23;
        return high;
    }

    public void info() {
        System.out.println("我的年龄是：" + age + ",我的身高是:" + height+"我的体重是"+getHigh());
    }
}