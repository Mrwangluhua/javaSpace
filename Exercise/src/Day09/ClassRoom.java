package Day09;

import java.util.ArrayList;
import java.util.List;

public class ClassRoom {
    private String no;
    private List<Student> stus;
    private double total;

    public ClassRoom() {
        stus = new ArrayList<>();
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

    public ClassRoom(String no) {
        this();//调用本类构造方法
        this.no = no;
    }
}
