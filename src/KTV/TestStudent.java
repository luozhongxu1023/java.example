package KTV;

class Student {
    private String name;            //声明name属性
    private int grade;              //声明grade属性
    public String getName() {
        return name;
    }           //  用getXxx()方法获取name属性值
    public int getGrade() {
        return grade;
    }            //  用getXxx()方法获取grade属性值
    public void setName(String name) {
        this.name = name;                       //要是看见一个方法用于设置值，另一个方法用于获取值，就照着这样写就行
    }
    public void setGrade(int grade) {
        this.grade = grade;
    }
    /*私有属性只能在它所在的类中被访问。如果想要访问私有属性，需要提供一些使用public修饰的公有方法，其中包括
    用来 获取 属性值 的 getXxx()方法 和 设置 属性值 的 setXxx()方法
     */
    //定义构造方法
    public Student(){

    }   //定义一个无参的构造方法
    public Student(String name,int grade){    //定义一个有两个参数的构造方法
        this();
        this.name=name;
        this.grade=grade;
    }
    public String read(){     //定义一个read()方法
      return "姓名："+name+"成绩："+grade;
    }
}
public class TestStudent{
    public static void main(String[] args) {
        //使用无参构造方法，调用setXxx()方法给姓名和成绩赋值
        Student stu1=new Student();
        stu1.setName("乔安冉");        //给name属性赋值
        stu1.setGrade(100);          //给grade属性赋值
        System.out.println(stu1.read());
        //使用有参的构造方法，在构造方法中给姓名和成绩赋值
        Student stu2=new Student("乔安冉",100);    //实例化Student对象
        System.out.println(stu2.read());
        System.out.println();
    }
}
