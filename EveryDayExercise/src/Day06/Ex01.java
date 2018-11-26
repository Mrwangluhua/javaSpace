package Day06;

import java.util.ArrayList;
import java.util.Collections;

/*多线程题目:分析以下需求,并用代码实现
	有一个抽奖池,该抽奖池中存放了奖励的金额,该抽奖池中的奖项为 {10,5,20,50,100,200,500,800,2,80,300,3000};
	创建两个抽奖箱(线程)设置线程名称分别为“抽奖箱1”，“抽奖箱2”，随机从抽奖池中完成抽奖
	请根据以上描述完成以下需求(需求由简单到复杂):
	1.两个线程随机抽奖,每抽出一个奖项就打印出来,格式如下:
		//因为是随机抽奖,结果是随机的,下面只是举了个例子
		抽奖箱1...抽出了10元...
		抽奖箱1...抽出了20元...
		抽奖箱1...抽出了50元...
		抽奖箱1...抽出了800元...
		抽奖箱2...抽出了3000元...
		抽奖箱2...抽出了500元...*/
public class Ex01 {
    public static void main(String[] args) {
        ArrayList<Integer> it = new ArrayList<>();
        Collections.addAll(it,10,5,20,50,100,200,500,800,2,80,300,3000);
        System.out.println(it);
        ChouJiang cj = new ChouJiang(it);
        Thread th1 = new Thread(cj);
        Thread th2 = new Thread(cj);
        th1.start();
        th2.start();
    }
}
