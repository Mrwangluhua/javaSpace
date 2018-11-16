package Day06;
/*- 定义一个扑克Card类。
  - 属性：
    - 花色
    - 点数
  - 构造方法：
    - 满参构造方法
  - 成员方法：
    - showCard方法：打印牌面信息
- 定义测试类，创建Card对象，调用showCard方法。
*/
public class KhEx03 {
    public static void main(String[] args){
        Card cd = new Card("黑桃","A");
        cd.showCard();

    }

}
class Card{
    String huase;
    String dianshu;

    public Card(String huase, String dianshu) {
        this.huase = huase;
        this.dianshu = dianshu;
    }
    public void showCard(){
        System.out.println(this.huase+this.dianshu);
    }
}
