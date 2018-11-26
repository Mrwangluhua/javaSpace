package Day04;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

/*从命令行读入一个字符串，表示一个年份，输出该年的世界杯冠军是哪支球队。
    如果该 年没有举办世界杯，则输出：没有举办世界杯。
//tips:参阅Map接口containsKey(Object key)方法

十、在原有世界杯Map 的基础上，增加如下功能： 读入一支球队的名字，输出该球队夺冠的年份列表。
例如，读入“巴西”，应当输出 1958 1962 1970 1994 2002 读入“荷兰”，应当输出 没有获得过世界杯
//tips:参阅Map接口containsValue(Object value)方法
*/
public class Test01 {
    public static void main(String[] args) {
        HashSet<Integer> integers = new HashSet<Integer>();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个年份（示例：1900）");
        String str = sc.next();
        HashMap<String, String> map = getHashMap();
        if(map.containsKey(str)){
            System.out.println(str+"年的世界杯冠军是："+map.get(str));
        }else{
            System.out.println(str+"年没有举办世界杯");
        }
    }
    private static HashMap<String, String> getHashMap() {
        HashMap<String, String> map = new HashMap<>();

        return map;
    }
}
