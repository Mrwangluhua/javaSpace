package Day07;
/*键盘录入学生信息，保存到集合中。

- 循环录入的方式，1：表示继续录入，0：表示结束录入。
- 定义学生类，属性为姓名，年龄，使用学生对象保存录入数据。
- 使用ArrayList集合，保存学生对象，录入结束后，遍历集合。
*/

import java.util.ArrayList;
import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Students> str = new ArrayList<>();
        while(true){
            System.out.println("1.录入信息  0.退出");
            int res = sc.nextInt();
            if(res ==0){
                System.out.println("录入完毕");
                break;
            }else if(res == 1){
                Students students = new Students();
                System.out.println("请输入姓名：");
                students.setName(sc.next());
                System.out.println("请输入年龄：");
                students.setAge(sc.nextInt());
                str.add(students);
            }
            else{
                System.out.println("输入错误，请重新输入");
            }
        }
        for(int i =0;i<str.size();i++){
            Students s = new Students();
            s = str.get(i);
            System.out.println("学生姓名："+s.getName()+",学生年龄"+s.getAge());
        }
    }
}
class Students{
    private String name;
    private int age;

    public Students() {
    }

    public Students(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
