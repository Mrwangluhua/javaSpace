package Day06;
/*6、(1)定义一个int类型的一维数组，内容为{6,2,9,15,1,5,20,7,18}
(2)将数组最大元素与最后一位元素进行交换,最小元素与第一位元素进行交换，并打印数组*/
public class ex06 {
    public static void main(String[] args){
        int[] arr = {6,2,9,15,1,5,20,7,18};
        int len = arr.length;
        int flag1 = 0,flag2=0;
        int max=arr[0],min=arr[len-1];
        for (int i = 0; i < len; i++) {
            if(max<arr[i]){
                max = arr[i];
                flag1 = i;
            }
            if (min>arr[i]){
                min = arr[i];
                flag2 = i;
            }
        }
        swap(arr,len-1,flag1);
        swap(arr,0,flag2);
        for(int i = 0;i<len;i++){
            System.out.print(arr[i]+",");
        }
    }
    public static void swap(int[]arr ,int i, int i1) {
        int temp = arr[i];
        arr[i] = arr[i1];
        arr[i1] = temp;
    }

}
