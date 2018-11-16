package Day06;
/*7、统计高于平均分的分数有多少个。

- 定义数组[95, 92, 75, 56, 98, 71, 80, 58, 91, 91]。
- 定义getAvg方法，获取一个数组中的平均数
- 在main内判断该数组高于平均分的有多少个
*/
public class ex07 {
    public static void main(String [] args){
        int[] array = {95, 92, 75, 56, 98, 71, 80, 58, 91, 91};
        double average = getAvg(array);
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]>average){
                count++;
            }
        }
        System.out.println("平均分是："+average+"，高于平均分的总共有："+count+"个。");
    }
    public static double getAvg(int[] array){
        double average= 0 ;
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum +=array[i];
        }
        average = sum/array.length;
        return average;
    }
}
