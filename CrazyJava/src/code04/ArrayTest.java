package code04;

public class ArrayTest {
    public static void main(String[] args) {
        //定义一个int数组类型的变量，变量名字为intArr
        int[] intArr;
        //使用静态初始化，初始化数组时只定义数组元素的初始值，不指定数组的长度
        intArr = new int[]{1, 2, 3, 4, 5};
        //定义一个Object数组类型的变量，变量名为objArr
        Object[] objArr;
        objArr = new String[]{"张三", "李四"};
        showArr(intArr);
        System.out.println();
        showArr(objArr);

    }

    public static void showArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }

    //方法重载是方法名称相同，但是方法的参数不同
    //这就是方法重载 overload
    //方法重载与返回值类型无关。
    //方法重载与修饰符无关

    public static void showArr(Object[] obj) {
        for (int i = 0; i < obj.length; i++) {
            System.out.print(obj[i] + "\t");
        }
    }
}