package Collection;
/*Collection 单列集合类的根接口，接口之间的关系是继承关系，
* */
public class Test02 {
    public static void main(String[] args) {
        Person p =getInstence();
        p.show();
    }
    public static Person getInstence(){
        return new Person();
    }
}
class Person{
    String name;
    int age;
    public void show(){
        System.out.println(name+"..."+age);
    }
}