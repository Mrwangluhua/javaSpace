package Day05;
/*第一题：需求实现
* 模拟大乐透号码：
  * 一组大乐透号码由10个1-99之间的数字组成
  * 定义方法，参数列表为int数组
  * 方法内打印大乐透号码信息
* 代码实现，效果如图所示：
* 开发提示：
  * 使用数组保存号码
*/
public class ex01 {
    public static void main(String[] args ){
        int[] array = {34,23,45,66,77,87,54,23,45,67};
        int len = array.length;
        System.out.println("您的大乐透号码为：");
        for (int i = 0; i < len; i++) {
            System.out.print(array[i]+"\t");

        }
    }
}
