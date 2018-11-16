package Day06;

/*- 判断两只猫的属性是否相同。
- 定义一个扑克Cat类。
  - 属性：年龄int类型，颜色char类型
  - 构造方法：
    - 无参构造方法，满参构造方法
  - 成员方法：
    - get/set方法
    - showMsg方法：打印猫的属性信息
- 定义测试类
  - main方法中，使用满参构造方法，创建Cat对象。
  - 测试类中，定义比较方法，判断两只猫属性是否完全一样。属性完全相同返回true，一旦不同则返回false。
*/
public class KhEx07 {
    public static void main(String[] args) {
        Cat cat1 = new Cat(23, '黑');
        Cat cat2 = new Cat(22, '红');
        Cat cat3 = new Cat(22, '红');
        Cat cat4 = new Cat(22, '红');
        cat1.showMas();
        cat2.showMas();
        boolean s  = isTrue(cat1.getAge(),cat2.getAge(),cat1.getColor(),cat2.getColor());
        if(s){
            System.out.println("属性相同？"+s);
        }else{
            System.out.println("属性相同？"+s);
        }
    }
    public static boolean isTrue(int age1, int age2, char color1, char color2) {
        if (age1 == age2 && color1 == color2) {
            return true;
        } else {
            return false;
        }
    }
}

class Cat {
    private int age;
    private char color;


    public Cat(int age, char color) {
        this.age = age;
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getColor() {
        return color;
    }

    public void setColor(char color) {
        this.color = color;
    }

    public void showMas() {
        System.out.println("猫的年龄为:" + this.age + "猫的颜色为：" + this.color);
    }
}