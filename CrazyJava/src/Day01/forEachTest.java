package Day01;

public class forEachTest {
    public static void main(String[] args){
        String[] books ={"你好","hello","javaTest"};
        int[] arr = {2,1,3,4,5,6,8,5,4,3,2};
        for(String book:books){
            System.out.println(book);
        }
        /*foreach 方法
            和原来的for循环差不多，需要定义一个i，首先这个i和原来需要打印的数组数据类型相同，然后冒号指定该i所在的数组，
            即需要循环遍历的数组，然后直接输出该i即可。
            使用foreach 循环时候无需获得该数组的长度，也不需要根据索引来进行访问数组元素，
            foreach循环和普通的for循环不同的是foreach循环不需要循环条件，无需循环迭代语句，这些部分都是系统自动完成的
            这点看来和python的range很像，python中的可以更改迭代步数，和起止位置，这个好像不行
            foreach循环灰自动迭代数组的每个元素当每个元素都被迭代一次后，foreach循环自动结束。
        */
        for(int a:arr){
            System.out.print(a+"\t");
        }
    }
}
