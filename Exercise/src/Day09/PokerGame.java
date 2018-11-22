package Day09;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class PokerGame {
    public static void main(String[] args) {
        HashMap<Integer, String> pokers = new HashMap<>();
        ArrayList<Integer> p1 = new ArrayList<>();
        ArrayList<Integer> p2 = new ArrayList<>();
        ArrayList<Integer> p3 = new ArrayList<>();
        ArrayList<Integer> bottom = new ArrayList<>();
        List<String> colors = new ArrayList<>();
        ArrayList<String> nums = new ArrayList<>();
        //colors.add("♣,♥,♦,♠".split(","))
        Collections.addAll(colors,"♣,♥,♦,♠".split(","));
        Collections.addAll(nums,"3,4,5,6,7,8,9,10,J,Q,K,A,2".split(","));
        int flag = 0;
        for(String num: nums){
            for(String color:colors){
                pokers.put(flag,color+num);
                flag++;
            }
        }
        pokers.put(flag++,"小王");
        pokers.put(flag,"大王");

        //System.out.println(pokers);
        ArrayList<Integer> list = new ArrayList<>();
        for(Integer key :pokers.keySet()){
            list.add(key);
        }
        Collections.shuffle(list);

        for(int i = 0;i<list.size();i++){
            if(i>50){
                bottom.add(list.get(i));
            }else if(i%3 ==0){
                p1.add(list.get(i));
            }else if(i%3 == 1){
                p2.add(list.get(i));
            }else {
                p3.add(list.get(i));
            }
        }
        showPokers("张三",p1,pokers);
        showPokers("李四",p2,pokers);
        showPokers("王五",p3,pokers);
        showPokers("底牌",bottom,pokers);
    }
    public static void showPokers(String name, ArrayList<Integer> player,HashMap<Integer,String> pokers){
        Collections.sort(player);
        System.out.println(name+", ");
        for(Integer num :player){
            String str = pokers.get(num);
            System.out.print(str+"\t");
        }
        System.out.println();
    }
}
