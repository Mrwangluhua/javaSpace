package Day06;


/*- 最贵的书。
- 定义一个扑克Book类。
  - 属性：图书编号，书名，ISBN编码，价格，出版日期
  - 构造方法：
    - 无参构造方法，满参构造方法
  - 成员方法：
    - get/set方法
    - showBook方法，输出图书信息
- 定义测试类，使用满参构造方法，创建三个Book对象，判断价格最贵的图书，并输出图书信息。
*/
public class KhEx08 {
    public static void main(String[] args){
        Book book1 = new Book(001, "三国演义", "ISCII9234",678,"2012-03-24");
        Book book2 = new Book(002, "红楼梦", "ISCII9235",11023,"2012-05-24");
        Book book3 = new Book(003, "西游记", "ISCII92376",11023,"2012-07-24");
        if(book1.getPrice()>book2.getPrice()&&book1.getPrice()>book3.getPrice()){
            book1.showBook();
        }else if(book2.getPrice()>book1.getPrice()&&book2.getPrice()>book3.getPrice()){
            book2.showBook();
        }else{
            book3.showBook();
        }
    }

}
class Book{
    private int ID;
    private String name;
    private String ISBNID;
    private int price;
    private String date;

    public Book() {
    }

    public Book(int ID, String name, String ISBNID, int price, String date) {
        this.ID = ID;
        this.name = name;
        this.ISBNID = ISBNID;
        this.price = price;
        this.date = date;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getISBNID() {
        return ISBNID;
    }

    public void setISBNID(String ISBNID) {
        this.ISBNID = ISBNID;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    public void showBook(){
        System.out.println("ID=" + ID + ", name='" + name + '\'' +
                ", ISBNID='" + ISBNID + '\'' + ", price=" + price + ", date=" + date);

    }
}
