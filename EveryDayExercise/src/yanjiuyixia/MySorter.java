package yanjiuyixia;

import java.util.Comparator;
import java.util.List;
/*
    集合数组排序的工具类:
    模拟Arrays和Collections工具类的sort方法
 */
public class MySorter {
    private MySorter() {
    }
    /*
        冒泡排序:升序
     */
    public static void sort(int[] array) {
        for(int i = 0;i<array.length-1;i++) {
            for(int j = 0;j<array.length-1-i;j++) {
                if(array[j]>array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }
    /*
        冒泡排序:升序
        比如传递的泛型T是Student
        public static <Student extends Comparable<? super Student>> void sort(Student[] array)
        说明:
            要么Student类实现Comparable接口
            要么Student类的父类实现Comparable接口

            泛型的定义   <T extends Comparable<? super T>>  的含义

            T 直接继承  Comparable接口
            T 间接继承  实现Comparable接口的父类

            比如Student类直接具备比较性:

            Student extends Comparable<Student>

            如果Student不具备比较性而它的父类Person具备比较性
            Person extends Comparable<Person>

            Student extends Person 这样Student也是具备比较性的

            注意:Comparable是接口,类和接口之间是实现关系,但是泛型中,只能用extends表示
            所以此处用的都是extends

     */
    public static <T extends Comparable<? super T>> void sort(T[] array) {
        sort(array,null);
    }

    public static <T> void sort(T[] array, Comparator<? super T> comp) {
        if(comp==null) {
            for(int i = 0;i<array.length-1;i++) {
                for(int j = 0;j<array.length-1-i;j++) {
                    Comparable c1 =  (Comparable)array[j];
                    Comparable c2 =  (Comparable)array[j+1];
                    if(c1.compareTo(c2)>0) {
                        T temp = array[j];
                        array[j] = array[j+1];
                        array[j+1] = temp;
                    }
                }
            }
        } else {
            for(int i = 0;i<array.length-1;i++) {
                for(int j = 0;j<array.length-1-i;j++) {
                    if(comp.compare(array[j],array[j+1])>0) {
                        T temp = array[j];
                        array[j] = array[j+1];
                        array[j+1] = temp;
                    }
                }
            }
        }

    }
    /*
        按照集合list中元素的默认规则进行排序
     */
    public static <T extends Comparable<? super T>> void sort(List<T> list) {
        sort(list,null);
    }
    /*
        按照比较器的规则,给list集合排序
        比如传递的泛型T是Student
        public static <Student> void sort(List<Student> list, Comparator<? super Student> comp)
        说明:
           说明传递的比较器
            要么是Student类的比较器
            要么是Student类的父类的比较器
     */
    public static <T> void sort(List<T> list, Comparator<? super T> comp) {
        if(comp==null) {
            for(int i = 0;i<list.size()-1;i++) {
                for(int j = 0;j<list.size()-1-i;j++) {
                    Comparable c1 =  (Comparable)list.get(j);
                    Comparable c2 =  (Comparable)list.get(j+1);
                    if(c1.compareTo(c2)>0) {
                        T temp = list.get(j);
                        list.set(j,list.get(j+1));
                        list.set(j+1,temp);
                    }
                }
            }
        } else {
            for(int i = 0;i<list.size()-1;i++) {
                for(int j = 0;j<list.size()-1-i;j++) {
                    T t1 = list.get(j);
                    T t2 = list.get(j+1);
                    if(comp.compare(t1,t2)>0) {
                        T temp = t1;
                        list.set(j,t2);
                        list.set(j+1,temp);
                    }
                }
            }
        }
    }
}
