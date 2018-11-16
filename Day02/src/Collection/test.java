package Collection;

import java.util.ArrayList;

/*集合和数组都是容器，可以存储多个数据
* 数组的长度是固定的，集合的长度是可变的，
* 数组村塾基本类型数据并遍历
* 数组存储引用类型数据并且遍历
* 数组中存储的都是同一类型的元素可以存储任意类型的数据
*
* 在Java中整型，实型，字符型被视为同一数据类型，但是级别有所不同，
* 转换时要注意低级变量能够直接转换为高级变量，
* 例如：下面的语句能够在Java中直接通过：byte b; int i =b;而将高级变量转换为低级变量时，
* 情况会复杂一点，您能够使用枪支类型转换。即必须采用强制转换才能够成功，
* 并且通过这种方法有可能丢失精度，造成数据丢失，因此不推荐这种类型转换。
    在讨论其他变量类型之间的相互转换时候，需要了解一下Java的包装类，所谓的包装类，
    就是能够直接将简单类型的变量表示为一个类，在执行变量类型的相互转换时，
    会大量使用这些包装类。Java共有六个包装类，
    分别是Boolean，Character,Integer,Long,Float和Double，从字面上可以看出分别对应boolean，
    char,int,long,float,double,而String和Date本身就是类，
    所以也就不存在包装类的概念了。
    集合存储的都是引用数据类型，如果想要存储基本数据类型，
    需要存储对应的包装类型。
* */
public class test {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        System.out.println(list);//默认调用toString
        System.out.println(list.toString());
        for(int i =0;i<list.size();i++){
            String s = list.get(i);
            System.out.println(s);
        }
    }
}
