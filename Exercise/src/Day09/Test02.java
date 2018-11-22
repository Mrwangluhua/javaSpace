package Day09;

import java.util.ArrayList;

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
public class Test02 {
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
        students.add(new Student("ef","002",83.5));
        students.add(new Student("hf","002",81.5));
        int claNum1 =0,claNum2 = 0;
        int scores1 = 0,scores2 = 0;
        for(int i = 0;i<students.size();i++){
            if(students.get(i).getNo().equals("001")){
                claNum1++;
                scores1+=students.get(i).getScore();
            }else if(students.get(i).getNo().equals("002")){
                claNum2++;
                scores2+=students.get(i).getScore();
            }
        }
        System.out.println("001班级的总分是:"+scores1+",平均分是："+scores1/claNum1);
        System.out.println("002班级的总分是:"+scores2+",平均分是："+scores2/claNum1);

    }
}
