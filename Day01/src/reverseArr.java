public class reverseArr {
    //数组的反转
    public static void main(String [] args){
    int[] arr = {1,2,3,4,5};
    reverse(arr);
    for(int i = 0;i<arr.length;i++){
        System.out.print(arr[i]+"\t");
    }
    }
    public static void reverse(int[] arr){
        int l = arr.length;
        for (int i=0,j=l-1;i<j;i++,j--){
            swap(arr,i,j);
        }
    }
    public static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
