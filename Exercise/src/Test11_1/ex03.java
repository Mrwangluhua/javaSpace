package Test11_1;

public class ex03 {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8};
        int[] arr1= {1,2,3,4,5,4,3,2,1};
        int[] arr2 = {1,2,3,4,5,6,7,8};
        boolean f = getT(arr);
        System.out.println(f);
        boolean m = getT(arr1);
        System.out.println(m);//输出的是选中数组的地址。
        //内存分为栈内存和堆内存，一般栈内存运行比较快，
        boolean q = getTrue(arr2,arr);
        System.out.println(q);
        showArr(arr);
    }
    //判断数组是否是对称数组的方法
    public static boolean getT(int[] arr){
        for(int start = 0,end = arr.length-1;start<end;start++,end--){
            if(arr[start]!=arr[end]){
                return false;
            }
        }return true;
    }
    // 判断两个数组是否完全一样的方法
    public static boolean getTrue(int[] c,int[] d){
        boolean result =true;
        if(c.length!=d.length) {
            result = false;
        }else{
            for(int i =0 ;i<c.length;i++){
                if(c[i]!= d[i]){
                    result = false;
                    return result;
                }
                else{
                    result = true;
                }
            }
        }
        return result;

    }
    //循环输出一个数组中的数组的值
    public  static void showArr(int[] arr){
        System.out.println(arr);
        for (int i=0;i< arr.length;i++) {
            System.out.print(arr[i]+"\t");
        }
    }
}
