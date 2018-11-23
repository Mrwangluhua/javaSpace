package Day09;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/*第一个String代表的是学科名称比如"java学科",第二个String代表:开班的班级名称"JavaEE0320" ,
		ArrayList代表该班级里的学生
		HashMap<String,ArrayList<HashMap<String,ArrayList<Student>>>> hs =
					new HashMap<String,ArrayList<HashMap<String,ArrayList<Student>>>>();

	部分代码已经给出:
public class TestComplexMap {
	public static void main(String[] args) {
		HashMap<String,ArrayList<HashMap<String,ArrayList<Student>>>> hs =
				new HashMap<String,ArrayList<HashMap<String,ArrayList<Student>>>>();
		ArrayList<Student> ls1 = new ArrayList<Student>();
		ls1.add(new Student("张三",30));
		ls1.add(new Student("张三2",29));
		ls1.add(new Student("张三3",33));
		ArrayList<Student> ls2 = new ArrayList<Student>();
		ls2.add(new Student("张四",31));
		ls2.add(new Student("张四2",22));
		ls2.add(new Student("张四3",35));
		ArrayList<Student> ls3 = new ArrayList<Student>();
		ls3.add(new Student("张五",40));
		ls3.add(new Student("张五2",49));
		ls3.add(new Student("张五3",43));
		HashMap<String,ArrayList<Student>> java0320 = new HashMap<>();
		java0320.put("javaEE0320", ls1);
		HashMap<String,ArrayList<Student>> java0410 = new HashMap<>();
		java0410.put("javaEE0410", ls2);
		HashMap<String,ArrayList<Student>> java0318 = new HashMap<>();
		java0318.put("Android0318", ls3);
		ArrayList<HashMap<String,ArrayList<Student>>> javaList = new ArrayList<HashMap<String,ArrayList<Student>>>();
		javaList.add(java0320);
		javaList.add(java0410);
		javaList.add(java0318);
		hs.put("java学科", javaList);

		//遍历HashMap*/
public class Test03 {
    public static void main(String[] args) {
        HashMap<String, List<Integer>> s = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(null);
        list.add(34);
        System.out.println(list);
    }
}
