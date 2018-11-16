package Day05;
/*## 第四题：需求实现
* 定义equals方法，比较数组内容是否完全一致。
* 开发提示：
  * 长度一致，内容一致，定义为完全一致。*/
public class ex04 {
    public static void main(String[] args){
        int[] array01 = {12,34,5,56,7,8,9,7,6,5,4,3,3};
        int[] array02 = {1,2,34,5,6,6,7,8,8,6,5,5,4,3,3,3};
        int[] array03 = {12,34,5,56,7,8,9,7,6,5,4,3,3};
        boolean result01 = equals(array01,array02);
        boolean result02 = equals(array01,array03);
        boolean result03 = equals(array02,array03);
        System.out.println(result01);
        System.out.println(result02);
        System.out.println(result03);

    }

    private static boolean equals(int[] array, int[] array1) {
        boolean res = false;
        if(array.length!=array1.length){
            return false;
        }
        for(int i = 0;i<array.length;i++){
            if(array[i] == array1[i]){
                res = true;
            }else{
                return false;
            }
        }
        return res;
    }
}
