package Day06;

/*4、定义一个整数数组，包含元素{10,33,44,7,8}，
获取数组中数组索引和对应的元素都为偶数的元素与个数，并在控制台打印输出*/
public class ex04 {
    public static void main(String[] args) {
        int[] array = {10, 33, 44, 7, 8};
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0 && array[i]%2 ==0){
                System.out.println("第"+i+"个数为"+array[i]);
            }
        }
    }
}
