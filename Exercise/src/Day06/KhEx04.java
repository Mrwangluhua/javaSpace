package Day06;
/*- 定义两个类，经理类Manager，程序员类Coder
- Coder类：
  - 属性：姓名，工号，薪资
  - 构造方法：无参构造方法，满参构造方法
  - 成员方法：
    - get/set方法
    - intro方法：打印姓名，工号信息
    - showSalary方法：打印薪资信息
    - work方法：打印工作信息
- Manager类：
  - 属性：姓名，工号，薪资
    - 经理的薪资有两部分组成：基本工资+奖金
  - 构造方法：无参构造方法，满参构造方法
  - 成员方法：
    - get/set方法
    - intro方法：打印姓名，工号信息
    - showSalary方法：打印薪资信息
    - work方法：打印工作信息
- 定义测试类，创建Manager对象，创建Coder对象，变量自行赋值,并测试。
*/
public class KhEx04 {
    public static void main(String[] args ){
        Manager mas = new Manager();
        mas.setName("张三");
        mas.setID(12345);
        mas.setSalary(15000);
        mas.intro(mas.getName(),mas.getID());
        mas.showSalary(mas.getSalary());
        mas.work();
        System.out.println("===============");
        Coder coder = new Coder();
        coder.setName("李四");
        coder.setID(123987);
        coder.setSalary(10000);
        coder.intro(coder.getName(),coder.getID());
        coder.showSalary(coder.getSalary());
        coder.work();
    }

}
class Manager{
    private String name;
    private int ID;
    private int salary;

    public Manager(String name, int ID, int salary) {
        this.name = name;
        this.ID = ID;
        this.salary = salary;
    }

    public Manager() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public void intro(String name,int ID){
        System.out.println("经理姓名："+name+"\n"+"工号："+ID);
    }
    public void showSalary(int salary){
        System.out.println("基本工资为:"+salary+",奖金为："+salary/5);
    }
    public void work(){
        System.out.println("正在努力做着管理工作，分配任务，检查员工提交上来的代码。。。。");

    }
}
class Coder{
    private String name;
    private int ID;
    private int salary;

    public Coder() {
    }

    public Coder(String name, int ID, int salary) {
        this.name = name;
        this.ID = ID;
        this.salary = salary;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public void intro(String name,int ID){
        System.out.println("员工姓名："+this.name+"\n"+"工号："+this.ID);
    }
    public void showSalary(int salary){
        System.out.println("基本工资为:"+this.salary+",奖金为："+this.salary*0);
    }
    public void work(){
        System.out.println("正在努力写着代码。。。。");

    }
}
