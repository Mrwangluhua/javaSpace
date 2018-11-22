package Day09;

import java.util.Objects;

/*1.要求:定义一个Student类
		属性:
			String name  姓名
			String no 	 班号
			double score 成绩*/
public class Student {
    private String name;
    private String no;
    private double score;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Double.compare(student.score, score) == 0 &&
                Objects.equals(name, student.name) &&
                Objects.equals(no, student.no);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, no, score);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", no='" + no + '\'' +
                ", score=" + score +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public Student(String name, String no, double score) {

        this.name = name;
        this.no = no;
        this.score = score;
    }

    public Student() {

    }
}
