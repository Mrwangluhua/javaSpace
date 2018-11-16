package Day07;

import java.util.ArrayList;
import java.util.Random;

/*
模拟统计班级考试分数分布情况，分别统计100-80，79-60，59-40，39-0各个阶段的人数。

- 定义getScoreList方法，随机生成50个数字，数字范围从0到100。
- 定义countScore方法，统计各个阶段的分数个数。
- 定义printCount方法，打印各个阶段的统计结果。
*/
public class Ex04 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list = countScore(getScoreList());
        printCount(list);
    }

    public static ArrayList<Integer> getScoreList() {
        ArrayList<Integer> list = new ArrayList<>();
        Random ra = new Random();
        for (int i = 0; i < 50; i++) {
            int score = ra.nextInt(101);
            list.add(score);
        }
        return list;
    }

    public static ArrayList<Integer> countScore(ArrayList<Integer> list) {
        ArrayList<Integer> countScore = new ArrayList<>();
        int count1 = 0, count2 = 0, count3 = 0, count4 = 0;
        for (int i = 0; i < list.size(); i++) {
            int score = list.get(i);
            if (score >= 80 && score <= 100) {
                count1++;
            } else if (score >= 60 && score <= 79) {
                count2++;
            } else if (score >= 40 && score <= 59) {
                count3++;
            } else {
                count4++;
            }
        }
        countScore.add(count1);
        countScore.add(count2);
        countScore.add(count3);
        countScore.add(count4);
        return countScore;
    }

    public static void printCount(ArrayList<Integer> list) {
        String[] st = new String[list.size()];
        st[0] = "100\t分---80\t分:";
        st[1]="79\t分---60\t分:";
        st[2]="59\t分---40\t分:";
        st[3]="39\t分---0\t分:";
        for(int i = 0;i<list.size();i++) {
            int s = list.get(i);
            System.out.println(st[i]+s + "人");
        }
    }
}
