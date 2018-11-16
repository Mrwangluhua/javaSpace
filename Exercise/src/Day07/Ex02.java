package Day07;

import java.util.Random;

/*随机验证码。

- 随机生成十组六位字符组成的验证码。
- 验证码由大小写字母、数字字符组成。
*/
public class Ex02 {
    public static void main(String[] args) {
        char[] yuanshi = getYuanshi();
        for (int i = 0; i < 10; i++) {
            System.out.print("随机生成验证码：");
            String s = getYanZheng();
            System.out.println(s);
        }
        System.out.println("======================================");
        for (int i = 0; i < 10; i++) {
            System.out.print("随机生成验证码：");
            String r = getYanZheng2(yuanshi);
            System.out.println(r);
        }
    }

    private static char[] getYuanshi() {
        char[] yuanshi = new char[62];
        int count = 0;
        for (int num = 48; num < 123; num++) {
            if (num >= 48 && num < 58 || num >= 65 && num < 91 || num >= 97 && num < 123) {
                char ch = (char) num;
                yuanshi[count++] = ch;
            }
        }
        return yuanshi;
    }

    public static String getYanZheng() {
        String s = "";
        int count = 0;
        Random re = new Random();
        while (true) {
            int num = re.nextInt(75) + 48;
            if (num >= 48 && num < 58 || num >= 65 && num < 91 || num >= 97 && num < 123) {
                char ch = (char) num;
                s = s + ch;
                count++;
                if (count == 6) {
                    break;
                } else {
                    continue;
                }
            }

        }
        return s;
    }

    public static String getYanZheng2(char[] yuanshi) {
        String sr = "";
        int count = 0;
        Random re = new Random();
        while (true) {
            int num = re.nextInt(75) + 48;
            char ch = (char) num;
            for (int i = 0; i < yuanshi.length; i++) {
                if (yuanshi[i] == ch) {
                    sr = sr + ch;
                    count++;
                }
            }
            if(count == 6){
                break;
            }else {
                continue;
            }
        }
        return sr;
    }
}