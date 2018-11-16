package Day05;
/*## 第三题：需求实现
* 定义sym方法，判断数组中的元素值是否对称.
  ​*/
public class ex03 {
    public static void main(String[] args){
        int[] array = {1,2,3,4,5,6,7,8,9,8,7,6,5,4,3,2,1,6};
        boolean result = sym(array);
        showArr(array);
        System.out.print("是否为对称数组："+result);
    }
    public static void showArr(int[] array){
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if(i!=array.length-1) {
                System.out.print( ", ");
            }
        }
        System.out.println("]");
    }

   public static boolean sym(int[] array) {
        boolean res = false;
        int len = array.length;
        for (int i = 0; i <len; i++) {
            if(array[i] != array[len-1-i]){
                return false;
            }else{
                res = true;
            }
        }
        return res;
    }
}
