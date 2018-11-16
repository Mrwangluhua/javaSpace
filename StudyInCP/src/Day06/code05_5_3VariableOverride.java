package Day06;

public class code05_5_3VariableOverride {
    //先定义一个name变量
    private String name = "李刚";
    //定义一个price变量
    private static  double price = 78.0; // ???如果不适用static 则会报错： 无法从静态上下文中引用非静态变量price
    public static void main(String[] args){
        //方法里面的局部变量，局部变量覆盖成员变量；
        int price = 45;
        //直接访问price 变量，将输出price局部变量的值，
        System.out.println(price);
        //使用类名作为price变量的限定；
        //将输出price类变量的值
        System.out.println(code05_5_3VariableOverride.price);
        new code05_5_3VariableOverride().info();
    }

    private void info() {
        //方法里面的局部变量，局部变量覆盖成员变量
        String name  = "孙悟空";
        //直接访问name变量，将会输出name局部变量的值："孙悟空";
        System.out.println(name);
        //使用this作为name变量的限定。
        //将输出name实例变量的值
        System.out.println(this.name);

    }
}
/*
* 从上面的代码可以看出局部变量覆盖成员变量时，依然可以在方法中显示指定雷鸣和this作为调用者来访问被覆盖的成员变量
* 这使得变成更加自由，不过大部分时间还是应该尽量避免这种局部变量和成员变量重名的情形。
* */
