package Day06;
/*5、定义2个长度为5的字符串数组arrA和arrB，
arrA包含元素{"祖","彦","吴","马","黑"};
1.)	arrA中的所有元素按逆序存储在数组arrB中
2.)	在控制台打印输出arrB数组中所有元素
*/
public class ex05 {
    public static void main(String [] args){
        String[] arrA ={"祖","彦","吴","马","黑"};
        String[] arrB =  new String[5];
        for (int length = arrA.length; length > 0; length--) {
            arrB[5-length] = arrA[length-1];
        }
        for(int i = 0;i< arrA.length;i++){
            System.out.print(arrB[i]+",");
        }
    }
}
