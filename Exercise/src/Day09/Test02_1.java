package Day09;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/*练习二: 分拣的思想
	1.要求:定义一个Student类
		属性:
			String name  姓名
			String no 	 班号
			double score 成绩
	2.现在将若干Student对象放入List中,请统计出每个班级的总分和平均分
	3.功能实现要求
		(1)随便自己想怎么写,就怎么写(只要实现功能就可以)
		*/
public class Test02_1 {
    public static void main(String[] args) {
        //2.现在将若干Student对象放入List中,请统计出每个班级的总分和平均分
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("zs","001",88.5));
        students.add(new Student("ls","001",84.5));
        students.add(new Student("ww","001",35.5));
        students.add(new Student("sd","001",77.5));
        students.add(new Student("as","001",87.5));
        students.add(new Student("gd","002",88.5));
        students.add(new Student("zx","002",90.5));
        students.add(new Student("gd","002",67.5));
        students.add(new Student("ef","003",83.5));
        students.add(new Student("hf","003",81.5));
        //创建一个存放班级号和班级学员的哈希表
        HashMap<String, Integer> map = new HashMap<>();
        HashMap<String, Double> zf = new HashMap<>();
        for(Student student:students){
            if(!map.containsKey(student.getNo())){
                map.put(student.getNo(),1);
                zf.put(student.getNo(),student.getScore());
            }else{
                int num = map.get(student.getNo());
                num ++;
                map.put(student.getNo(),num);
                double zongf  = zf.get(student.getNo());
                zongf+=student.getScore();
                zf.put(student.getNo(),zongf);
            }
        }
        showClassAverScore(map, zf);
    }

    public static void showClassAverScore(HashMap<String, Integer> map, HashMap<String, Double> zf) {
        Set<String> set = map.keySet();
        DecimalFormat df = new DecimalFormat("00.00");
        for(String str  : set){
            int num = map.get(str);
            double scores  = zf.get(str);
            System.out.println(str+"班的总分是："+scores+",平均分是："+df.format(scores/num));
        }
    }
}
