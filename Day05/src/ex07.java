/* 第七题 : 需求实现
- 统计字符
  - 字符数组：{'a','l','f','m','f','o','b','b','s','n'}
  - 定义printCount方法，统计每个字符出现的次数并打印到控制台。
- 代码实现，部分效果如图所示：
- 开发提示：
  - 可以定义长度26的数组，每个元素，对应去保存每种字符的出现次数，比如0索引保存a的次数，1索引保存b的次数，以此类推。
  - 每次字符出现,对应的角标位置的数值+1
  - 遍历保存次数的数组,0表示未出现这个字符
* 知识点：
	技巧:
		int[] count= new int[26];
  	  // 对应保存字母出现的次数
  	  for (int i = 0; i < charArray.length; i++) {
  	      int c  = charArray[i];
  	      count[c- 97]++;
  	  }
*/
public class ex07 {
    public static void main(String[] args) {
        char[] a = {'a', 'l', 'f', 'm', 'f', 'o', 'b', 'b', 's', 'n'};
        int[] b = new int[26];
        for (int i = 0; i < 26; i++) {
            b[i]=97+i;
        }
        int[] arr = printCount(a);
        for (int i = 0; i < arr.length; i++) {
            System.out.println((char)b[i]+"---"+arr[i]);
        }
    }

    public static int[] printCount(char[] charArr) {
        int[] count = new int[26];
        for (int i = 0; i < charArr.length; i++) {
            int c = charArr[i];
            count[c - 97]++;
        }
        return count;
    }
}