package Day06;
/*
* 成员变量是指在类中定义的变量，局部变量是指在方法中定义的变量，不管是成员变量还是局部变量
* 都应该遵守相同的命名规则，
* 从语法角度来看，只要是一个合法的标识符即可；但是从程序的可读性来看，应该是多个有意义的单词连缀而成
* 其中第一个首字母应该小写，而后每个单词的首字母都应该大写，
*       Java中分为：
*           成员变量：
*                   实例变量：不用static修饰符修饰，
*                   类变量:    用static修饰符修饰
*           局部变量：
*                   形参：方法签名中定义的参数
*                   方法局部变量：在方法内部定义
*                   代码块局部变量：在代码块中定义
*
*       成员变量被分为类变量和实例变量，定义成员变量时候没有static修饰就是实例变量，
*       有static修饰的就是类变量
*       其中类变量从该类的准备阶段其开始存在，直到系统开始完全销毁这个类，类变量的作用域与这个类的生存范围相同
*       ，而实例变量则从该类的实例被创建起开始存在，直到系统完全销毁这个实例，
*       实例变量的作用域与该实例的生存范围相同*/
class Person{
    //定义一个实例变量
    public String name;
    //定义一个类变量
    public static int eyeNum;
}
public class code05_5_3PersonTest {
    public static void main(String[] args){
        //第一次主动使用Person类，该类自动初始化，则eyeNum变量开始起作用，输出0；
        System.out.println("person的eyeNum类变量的值是"+Person.eyeNum);
        //创建Person对象
        Person p = new Person();
        //通过Person对象的引用p来访问Person对象的name实例变量
        //并通过实例访问eyeNum类变量
        System.out.println("p的name变量值是："+p.name+",p对象的eyeNum变量值是："+p.eyeNum);
        //直接为name赋值
    }
}
