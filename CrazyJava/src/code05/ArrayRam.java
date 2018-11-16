package code05;
/*  数组是一个引用数据类型，数组引用变量只是一个引用，数组元素和数组变量在内存里是分开存放的
数组引用变量只是一个引用，这个引用变量可以指向任何有效的内存，只有当该引用指向有效内存后才可以通过该数组变量来访问数组元素
与所有引用变量相同的是，引用变量是访问真实对象的根本方式，也就是说如果我希望在程序中访问数组对象本身，则只能通过这数组的
引用变量来访问它。
实际的数组对象被存在堆（heap)内存中，如果引用该数组对象的数组引用变量是一个局部变量，那么它被存储在栈中。
如果堆内存中数组不再有任何引用变量指向自己，则这个数组将成为垃圾，该数组所占的内存会被系统的垃圾回收机制回收，因此为了让
垃圾回收机制回收一个数组所占的内存空间，可以将该数组的变量赋值为null，也就切断了数组引用变量和实际数组之间的引用关系，
实际的数组也就成了垃圾。
* */

public class ArrayRam {
    public static void main(String[] args ) {
        //定义并初始化数组，使用静态初始化
        int[] arr = {34, 29, 35};
        //定义并初始化数组，使用动态初始化
        int[] arr1 = new int[4];
        //输出arr1的数组的长度
        System.out.println("arr1的数组的长度为:" + arr1.length);
        //循环输出arr中的值
        for (int a : arr) {
            System.out.print(a + "\t");
        }
        //循环输出arr1的值
        for (int i = 0; i < 4; i++) {
            System.out.println(arr1[i] + "\t");
        }
        arr1 = arr;
        System.out.println("arr1的数组长度为：" + arr1.length);
    /*看待一个数组时候一定要把数组看成两个部分，一部分是数组引用（index）也就是在代码中定义的数组引用变量，还有一部分是
    实际的数组对象，这部分是在堆内存里面运行的，通常无法直接访问它，只能通过数组引用变量来访问。
    * */
        int[] arri;
        arri = new int[5];
        for (int i = 0; i < arri.length; i++) {
            arri[i]=i+10;
        }
        for (int i = 0; i < arri.length; i++) {
            System.out.println(arri[i]);

        }
    }
}
