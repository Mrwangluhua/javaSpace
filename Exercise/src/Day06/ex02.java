package Day06;

/*2、在main方法内按以下要求编写代码:
	1)定义一个数组,存储1-9(包含1和9)的整数;
	2)计算这个数组中索引为奇数的元素”总和”,并在控制台打印这个和;
*/
public class ex02 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0) {
                sum += array[i];
            }
        }
        System.out.println("总和是：" + sum);
    }
}
