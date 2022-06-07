package ArrayList;
import java.util.*;
public class Example01 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();      //创建集合
        list.add("张三");                       //向集合中添加元素
        list.add("李四");
        list.add("王五");
        list.add("赵六");
        //获取集合中元素的个数
        System.out.println("集合的长度：" + list.size());
        //取出并打印指定位置的元素
        System.out.println("第二个元素是：" + list.get(1));
        //删除索引为3的元素
        list.remove(3);
        System.out.println("删除索引为3的元素：" + list);
        //替换索引为1的元素为李四2
        list.set(1, "李四2");
        System.out.println("替换索引为1的元素为李四2：" + list);
    }
}
