package Day06;
/*
8、已知数组int[] nums = {5,10,15},,要求创建一个新数组
1.新数组的长度和已知数组相同
2.新数组每个元素的值 是已知数组对应位置元素的2倍
3.在控制台中打印新数组的所有元素
*/
public class ex08 {
    public static void main(String[] args){
        int[] nums = {5,10,15};
        int len = nums.length;
        int[] numsTest = new int[len];
        for(int i =0;i<len;i++){
            numsTest[i]= nums[i]*2;
        }
        for (int i = 0; i < len; i++) {
            System.out.print(numsTest[i]+"\t");
        }
    }
}
