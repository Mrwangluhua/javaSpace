package Test11_1;

public class ex01test {
    public static void main(String[] args) {
        //测试是否可以用冒泡排序进行左右分开？类似冒泡排序
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int len = arr.length;
        int[] arr1 = new int[len];

        for (int i = 0,j=len-1,k=0; i < len; i++) {
            if(arr[i]%2 ==0){
                arr1[k]=arr[i];
                k++;
            }else {
                arr1[j]=arr[i];
                j--;
            }
        }
        for (int i = 0; i < len; i++) {
            System.out.println(arr1[i]);
        }
    }
}
