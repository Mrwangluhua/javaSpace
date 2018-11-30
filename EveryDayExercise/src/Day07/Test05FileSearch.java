package Day07;

import java.io.File;
import java.io.IOException;

/*
        递归输出所有D盘内容
* */
public class Test05FileSearch {
    private static int depth =0 ;
    public static void main(String[] args) throws IOException {
        findPath("D:",depth);
    }

    private static void findPath(String pathName,int depth) throws IOException {
        File dirFile = new File(pathName);
        //如果传入的字符串解析成文件格式是不存在的，打印不存在后直接跳出
        if(!dirFile.exists()){
            System.out.println("目录不存在");
            return;
        }
        //如果传入的字符串解析成文件格式是一个文件名而不是一个文件夹，则打印该文件名的绝对路径就跳出来。
        if(!dirFile.isDirectory()){
            System.out.println(dirFile.getAbsolutePath());
            return;
        }
        for (int i = 0; i < depth; i++) {
            System.out.print("\t");
        }
        System.out.print("|--");
        System.out.println(dirFile.getName());
        int currentDepth = depth+1;
        String[] list = dirFile.list();
        for(int i = 0;i<list.length;i++){
            String str = list[i];
            File file = new File(dirFile.getPath(), str);
            String name = file.getName();
            if(file.isDirectory()){
                findPath(file.getCanonicalPath(),currentDepth );
            }else {
                for (int j = 0; j < currentDepth; j++) {
                    System.out.print("\t");
                }
                System.out.print("|---");
                System.out.println(name);
            }
        }
    }
}
