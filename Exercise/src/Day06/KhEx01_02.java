package Day06;

/*
    1. 一个类与它的对象之间是什么关系？
    2. 如何定义一个类，由哪些部分组成，各个部分的作用是什么？
    3. 如何创建一个对象，如何使用该对象？
    4. 局部变量和成员变量的区别？
    5. 构造方法和成员方法的区别？
*/
public class KhEx01_02 {
    public static void main(String[] args) {
        Teacher zhou = new Teacher();
        Student stu = new Student();
        zhou.name = "周老师";
        zhou.age = 30;
        zhou.content = "Java面向对象";


        stu.name = "韩同学";
        stu.age = 18;
        stu.content ="Java面向对象";
        System.out.print("年龄为"+zhou.age+"的"+zhou.name);
        zhou.eat();
        System.out.print("年龄为"+zhou.age+"的"+zhou.name);
        zhou.teach();
        System.out.print("年龄为"+stu.age+"的"+stu.name);
        stu.eat();
        System.out.print("年龄为"+stu.age+"的"+stu.name);
        stu.study();
    }
}

class Teacher{
    String name;
    int age;
    String content;

    public void  eat(){
        System.out.println("正在吃饭.....");

    }
    public void teach(){
        System.out.println("正在亢奋的讲着"+this.content+"的知识......");

    }
}
class Student{
    String name;
    int age;
    String content;
    public void  eat(){
        System.out.println("正在吃饭.....");

    }
    public void study(){
        System.out.println("正在专心致志的听着"+this.content+"的知识......");
    }
}
