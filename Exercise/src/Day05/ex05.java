package Day05;
/*将扑克牌信息拼接后保存到新的数组中,遍历数组打印该信息,不包含大小王情况.*/
public class ex05 {
    public  static void main(String[] args) {
        String[] huase = {"红桃","黑桃","梅花","方块"};
        String [] arr = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
        String[] puke = new String [huase.length*arr.length];
        int count = 0;
        for(int i = 0;i<huase.length;i++){
            for(int j = 0;j<arr.length;j++){
                puke[count++] = huase[i]+arr[j];
            }
        }
        for (int i = 1; i <= huase.length * arr.length; i++) {
                System.out.print(puke[i-1]+"\t");
            if(i%arr.length == 0){
                System.out.println();
            }
        }
    }
}
