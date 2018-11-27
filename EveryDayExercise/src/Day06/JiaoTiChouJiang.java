package Day06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class JiaoTiChouJiang implements Runnable {
    public static int[] arr = {10,5,20,50,100,200,500,800,2,80,300,3000,6000,2000};
    int num = arr.length;
    static ArrayList<Integer> list =  new ArrayList<Integer>();
    static ArrayList<Integer> list1 =  new ArrayList<Integer>();
    static int lmax;

    static{
        for(int money:arr){
            list1.add(money);
        }
        lmax= Collections.max(list1);
    }

    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        ArrayList<Integer> box =  new ArrayList<Integer>();
        while(true) {
            synchronized(this){
                if(num<=0){
                    this.notifyAll();
                    break;
                }
                //创建随机数对象
                Random r = new Random();
                int index ;
                //为了获取不重复的索引值
                while(true) {
                    index = r.nextInt(arr.length);
                    if(list.contains(index))
                        continue;
                    else {
                        list.add(index);
                        break;
                    }
                }
                int money = arr[index];
                box.add(money);
                //在此次抽奖过程中，抽奖箱1总共产生了6个奖项，分别为：10,20,100,500,2,300
                num--;
                this.notify();
                try {
                    this.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }
        System.out.println("在此次抽奖过程中，"+threadName + "总共产生了 "+box.size()+"个奖项，分别为："+method1(box)+"最高奖项为"+method2(box)+"元，总计额为"+method3(box)+"元");
        if(method2(box)==lmax){
            System.out.println("在此次抽奖过程中,最大奖项在"+threadName+"中产生了,该奖项金额为"+lmax+"元");
        }
    }
    //输出所有元素的方法
    public String method1(ArrayList<Integer> box){
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<box.size();i++){
            //不断往里面添加元素
            sb.append(box.get(i));
            if(i!=box.size()-1){
                sb.append(",");
            }
        }
        return sb.toString();
    }
    //求集合最大值的方法
    public int method2(ArrayList<Integer> box){
        int max=Collections.max(box);
        return max;
    }
    //求集合总数的方法
    public int method3(ArrayList<Integer> box){
        int sum=0;
        for (Integer integer : box) {
            sum+=integer;
        }
        return sum;
    }
}
