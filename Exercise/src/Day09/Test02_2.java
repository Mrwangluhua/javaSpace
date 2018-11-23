package Day09;

import java.text.DecimalFormat;
import java.util.*;

/*(2)按照以下指定思路实现:
			--不推荐使用 Map<String,List<Student>> 操作不方便(按照这种思路如何实现)
				String : 班号
				List<Student> : 该班级中的学生
			*/
public class Test02_2 {
    public static void main(String[] args) {
        Map<String, List<Student>> listMap= new HashMap<>();
        List<Student> students = new ArrayList<>();
        students.add(new Student("zs","001",88.5));
        students.add(new Student("ls","004",84.5));
        students.add(new Student("ww","001",35.5));
        students.add(new Student("sd","001",77.5));
        students.add(new Student("as","001",87.5));
        students.add(new Student("gd","002",88.5));
        students.add(new Student("zx","002",90.5));
        students.add(new Student("gd","002",67.5));
        students.add(new Student("ef","003",83.5));
        students.add(new Student("hf","003",81.5));

        fenban(listMap, students);
        showAverageScore(listMap);
    }

    public static void showAverageScore(Map<String, List<Student>> listMap) {
        Set<String> classes = listMap.keySet();
        for(String str :classes){
            double scores = 0,nums = 0;
            List<Student> students1 = listMap.get(str);
            for(Student stu:students1){
                scores+=stu.getScore();
                nums++;
            }
            DecimalFormat df = new DecimalFormat("00.00");
            System.out.println(str+"班的平均分是："+df.format(scores/nums));
        }
    }

    public static void fenban(Map<String, List<Student>> listMap, List<Student> students) {
        for(Student stu :students){
            if(!listMap.containsKey(stu.getNo())){
                List<Student> student = new ArrayList<>();
                student.add(stu);
                listMap.put(stu.getNo(),student);
            }else{
                List<Student> student = listMap.get(stu.getNo());
                student.add(stu);
                listMap.put(stu.getNo(),student);
            }
        }
    }
}
