package Day09;

import java.util.List;
import java.util.Objects;

public class ClassRoom {
    private String no;
    private List<Student> stus;
    private double total;

    @Override
    public String toString() {
        return "ClassRoom{" +
                "no='" + no + '\'' +
                ", stus=" + stus +
                ", total=" + total +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClassRoom classRoom = (ClassRoom) o;
        return Double.compare(classRoom.total, total) == 0 &&
                Objects.equals(no, classRoom.no) &&
                Objects.equals(stus, classRoom.stus);
    }

    @Override
    public int hashCode() {

        return Objects.hash(no, stus, total);
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

    public ClassRoom() {

    }

    public ClassRoom(String no, List<Student> stus, double total) {

        this.no = no;
        this.stus = stus;
        this.total = total;
    }
}
