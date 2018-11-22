package Day09;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/*练习一:
	ArrayList<Integer> list 里面存放的是学生成绩{80，90，100，60，50，30，55，98，36}，
	对ArrayList集合中的成绩进行统计，将统计后的结果放入
	map中，"及格的学员数量" = 5   "不及格的学员数量"=4
	最后打印map集合*/
public class Test01 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list,80,90,100,60,50,30,55,98,36);
        HashMap<String, Integer> map = new HashMap<>();
        int nums1  = 1,nums2 = 1;
        for (Integer score:list){
            if(score>=60){
                map.put("及格的学员数量",nums1++);
            }else{
                map.put("不及格的学员数量",nums2++);
            }
        }
        System.out.println(map);
    }
}
