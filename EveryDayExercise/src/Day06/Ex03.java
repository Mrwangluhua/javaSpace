package Day06;

/*3.每次抽的过程中，不打印，抽完时一次性打印
		在此次抽奖过程中，抽奖箱1总共产生了6个奖项，分别为：10,5,20,50,100,200最高奖项为200元，总计额为385元
		在此次抽奖过程中，抽奖箱2总共产生了6个奖项，分别为：500,800,2,80,300,3000最高奖项为3000元，总计额为4682元
		在此次抽奖过程中，抽奖项2中产生了最高奖项，该最高奖项为3000元
		*/
public class Ex03 {
    public static void main(String[] args) {
        JiaoTiChouJiang jt = new JiaoTiChouJiang();
        Thread cjxA = new Thread(jt, "抽奖箱A");
        Thread cjxB = new Thread(jt, "抽奖箱B");
        cjxA.start();
        cjxB.start();
    }
}
