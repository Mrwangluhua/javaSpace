package yanjiuyixia;

import java.util.*;

/*
* 练习二: 分拣的思想
	1.要求:定义一个Student类
		属性:
			String name  姓名
			String no 	 班号
			double score 成绩
	2.现在将若干Student对象放入List中,请统计出每个班级的总分和平均分

	3.功能实现要求
		(1)随便自己想怎么写,就怎么写(只要实现功能就可以)
		(2)按照以下指定思路实现:
			--不推荐使用 Map<String,List<Student>> 操作不方便(按照这种思路如何实现)
				String : 班号
				List<Student> : 该班级中的学生


			--推荐使用 Map<String,ClassRoom>
				ClassRoom类参照以下代码:
					public class ClassRoom {
						private String no;//班号
						private List<Student> stus;//班级有多个学生
						private double total;//班级总分
						//...
					}
* */
public class Xiti2 {
    public static void main(String[] args) {
        Set<Student> stu1 = new HashSet<>();
        stu1.add(new Student("zhang", "910", 60.0));
        stu1.add(new Student("wang", "910`", 69.0));
        stu1.add(new Student("zhang", "910", 80.0));
       // Double zongfen = zongfen(stu1);
       // Classroom class1 = new Classroom("01",stu1,zongfen);
        Map<String, Classroom> map = new LinkedHashMap<>();
        for (Student ss : stu1) {
            String no = ss.getNo();
            Classroom cl = new Classroom();
            if (!map.containsKey(no)) {
                map.put(no, cl);
                List<Student> stus = cl.getStus();
                //System.out.println(stus);
                stus.add(ss);
            } else {
                Classroom cl2 = map.get(no);
                cl2.getStus().add(ss);
                double total = cl.getTotal();
                cl.setTotal(total + ss.getScore());
                System.out.println(cl.getTotal());
            }
        }
    }
}
