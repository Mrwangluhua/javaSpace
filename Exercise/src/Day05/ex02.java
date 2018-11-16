package Day05;
/*
* 统计高于平均分的分数有多少个。
  * 定义数组[95, 92, 75, 56, 98, 71, 80, 58, 91, 91]。
  * 定义getAvg方法，获取一个数组中的平均数
  * 在main内判断该数组高于平均分的有多少个
* 代码实现，效果如图所示：
* 开发提示:
  * 先定义获取平均分数的方法
  * 遍历数组,判断高于平均分的就计数.
	*/
public class ex02 {
    public static void main(String[] args ){
        int[] array = {95, 92, 75, 56, 98, 71, 80, 58, 91, 91};
        double aver = getAvg(array);
        int count = getCount(array, aver);
        System.out.println("所有人的平均分是："+aver+"高于平均分的人有"+count+"个。");
    }

    public static int getCount(int[] array, double aver) {
        int count= 0;
        for(int i = 0;i< array.length;i++){
            if(array[i]>aver){
                count ++;
            }
        }
        return count;
    }
    public static double getAvg(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        return sum/arr.length;
    }
}
