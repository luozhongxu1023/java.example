package sdp.edu.cn;

class Rectangle {   //定义一个类为Rectangle
    double length;  //声明double类型的变量长length
    double wide;    //声明double类型的白能量宽wide
    double area;    //声明double类型的变量面积area

    void getArea(){     //成员方法
        System.out.println("长方形的面积："+length*wide);
    }
}
public class TestRectangle{   //创建一个测试类
    public static void main(String[] args) {
        Rectangle rte1=new Rectangle();      //这个是Rectangle的第一个对象
        rte1.length=5.0;                     //为Rectange的第一个对象rte1的length属性赋值为5.0
        rte1.wide=6.0;
        rte1.getArea();
        Rectangle rte2=new Rectangle();     //这个就是Rectangle的第二个对象
        rte2.length=4.0;                     //为Rectange的第二个对象rte2的length属性赋值为4.0
        rte2.wide=7.0;
        rte2.getArea();
    }
}