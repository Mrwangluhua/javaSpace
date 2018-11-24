package Day09;

import java.util.*;

/*第一个String代表的是学科名称比如"java学科",第二个String代表:开班的班级名称"JavaEE0320" ,
		ArrayList代表该班级里的学生
		HashMap<String,ArrayList<HashMap<String,ArrayList<Student>>>> hs =
					new HashMap<String,ArrayList<HashMap<String,ArrayList<Student>>>>();

	部分代码已经给出:
		//遍历HashMap*/
public class Test03 {
    public static void main(String[] args) {
        HashMap<String, ArrayList<HashMap<String, ArrayList<Students>>>> hs =
                new HashMap<>();
        ArrayList<Students> ls1 = new ArrayList<>();
        ls1.add(new Students("张三", 30));
        ls1.add(new Students("张三2", 29));
        ls1.add(new Students("张三3", 33));
        ArrayList<Students> ls2 = new ArrayList<>();
        ls2.add(new Students("张四", 31));
        ls2.add(new Students("张四2", 22));
        ls2.add(new Students("张四3", 35));
        ArrayList<Students> ls3 = new ArrayList<>();
        ls3.add(new Students("张五", 40));
        ls3.add(new Students("张五2", 49));
        ls3.add(new Students("张五3", 43));
        HashMap<String, ArrayList<Students>> java0320 = new HashMap<>();
        java0320.put("javaEE0320", ls1);
        HashMap<String, ArrayList<Students>> java0410 = new HashMap<>();
        java0410.put("javaEE0410", ls2);
        HashMap<String, ArrayList<Students>> java0318 = new HashMap<>();
        java0318.put("Android0318", ls3);
        ArrayList<HashMap<String, ArrayList<Students>>> javaList = new ArrayList<>();
        javaList.add(java0320);
        javaList.add(java0410);
        javaList.add(java0318);
        hs.put("java学科", javaList);
        System.out.println(hs);
        showHashMap(hs);
        showHashMaps(hs);
    }

    private static void showHashMaps(HashMap<String, ArrayList<HashMap<String, ArrayList<Students>>>> hs) {
        Set<Map.Entry<String, ArrayList<HashMap<String, ArrayList<Students>>>>> entry1 = hs.entrySet();
        Iterator<Map.Entry<String, ArrayList<HashMap<String, ArrayList<Students>>>>> it1 = entry1.iterator();
        while (it1.hasNext()) {
            Map.Entry<String, ArrayList<HashMap<String, ArrayList<Students>>>> next1 = it1.next();
            String key1 = next1.getKey();
            ArrayList<HashMap<String, ArrayList<Students>>> value = next1.getValue();
            for (HashMap<String, ArrayList<Students>> stuMap : value) {
                Set<Map.Entry<String, ArrayList<Students>>> entries = stuMap.entrySet();
                Iterator<Map.Entry<String, ArrayList<Students>>> it2 = entries.iterator();
                while (it2.hasNext()) {
                    Map.Entry<String, ArrayList<Students>> next2 = it2.next();
                    String key2 = next2.getKey();
                    ArrayList<Students> value2 = next2.getValue();
                    for (Students students : value2) {
                        System.out.println(key1+"\t" + key2+"\t"+ students);
                    }
                }
            }
        }
    }

    private static void showHashMap(HashMap<String, ArrayList<HashMap<String, ArrayList<Students>>>> hs) {
        Set<String> set = hs.keySet();
        for (String s : set) {
            ArrayList<HashMap<String, ArrayList<Students>>> list = hs.get(s);
            for (HashMap<String, ArrayList<Students>> hashMap : list) {
                Set<String> strs = hashMap.keySet();
                for (String str : strs) {
                    ArrayList<Students> students = hashMap.get(str);
                    for (Students stu : students) {
                        System.out.println(s + " " + str + "班:\t" + stu);
                    }
                }
            }
        }
    }
}
