package Day06;
/*9、按下面的要求完成代码
1. 定义方法，求出指定元素在数组中出现的次数.
2. 定义方法，统计数组中出现次数为1的元素一共有多少个。(推荐-遍历数组，然后调用第一个方法，
求出数组中每个元素在数组中出现的次数，如果只出现了一次，就统计)
3. 在main方法中定义数组，如int arr[]={1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5};。
然后调用方法，统计只出现一次的元素有多少个。
*/
public class ex09 {
    public static void main(String[] args ){
        int arr[]={1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5};

        int target = 6;
        int count = getCount(arr,target);
        System.out.println("元素"+target+"在数组中出现的次数为"+count+"次。");
        System.out.println("只出现一次的元素有："+"个。");
    }
    public static int getCount(int[] arr,int target){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(target ==arr[i]){
                count++;
            }
        }
        return count;
    }
    public static int getOnceCount(int[] arr){
        int count = 0;
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            
        }
        return count;
    }
}
