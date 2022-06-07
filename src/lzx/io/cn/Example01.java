package lzx.io.cn;
import java.io.File;
import java.lang.reflect.Field;

public class Example01 {
    public static void main(String[] args) {
        File f = new File("D:\\file\\a.txt");   //使用绝对路径创建File对象
        File f1= new File("src\\Hello.java");   //使用相对路径创建File对象
        System.out.println(f);
        System.out.println(f1);
    }
}
