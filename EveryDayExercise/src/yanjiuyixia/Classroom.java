package yanjiuyixia;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class Classroom {

        private String no;//班号
        private List<Student> stus;//班级有多个学生//之啊哟是对象就可以调他的方法
        private double total;//班级总分

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Classroom classroom = (Classroom) o;
        return Double.compare(classroom.total, total) == 0 &&
                Objects.equals(no, classroom.no) &&
                Objects.equals(stus, classroom.stus);
    }

    @Override
    public int hashCode() {

        return Objects.hash(no, stus, total);
    }

    @Override
    public String toString() {
        return "Classroom{" +
                "no='" + no + '\'' +
                ", stus=" + stus +
                ", total=" + total +
                '}';
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public List<Student> getStus() {
        return stus;
    }

    public void setStus(List<Student> stus) {
        this.stus = stus;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Classroom() {
        this.stus = new ArrayList<>();
    }

    public Classroom(String no, List<Student> stus, double total) {

        this.no = no;
        this.stus = stus;
        this.total = total;
    }
}
