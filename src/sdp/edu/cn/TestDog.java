package sdp.edu.cn;

class Dog {
    private String name;
    private String color;
    private int age;
    public Dog(){      //定义一个无参构造方法
        System.out.println("无参的构造方法");   //这句输出语句可以不用写，课本94页上example07中的第四行写的public Student(){}这就是定义了一个无参构造方法
    }
    public Dog(String n,String c,int a){  //定义一个有参的构造方法 ，作业中提到三个参数的构造方法，就是要定义一个有参构造方法， 你要在()里面添加参数类型和参数名
                                          // Dog()只要这个方法里面有参数类型，就是一个有参构造方法，()里String就是参数类型，n是参数名
       name=n;                            //当你定义一个有参构造方法时，他只会调用你的有参构造方法，不会去调用你的无参构造方法，
                                          // （可以通过this去调用无参，这样就可以输出上面的语句了，到时候你们应该就讲了，在课本99页this关键字
       color=c;
       age=a;       //三个参数
       System.out.println("三个参数的构造方法");
    }
    public void print(){        //这个就是第一个作业中定义一个成员方法print()输出狗的信息
        System.out.println("狗的名字："+name+"\n狗的颜色："+color+"\n狗的年龄："+age+"岁");
    }
    public void shout(){        //这个同样也是，定义成员方法shout()输出狗的叫声
        System.out.println("汪汪汪...");
    }
}
        //作业中说了要将测试代码写在Dog类以外的其他类，所以你得创建一个测试类
    public class TestDog{     //一个测试类，用来测试Dog类
        public static void main(String[] args) {
            Dog dog=new Dog("Tom","橘黄色",7);  //实例化Dog对象，
            dog.print();            //调用对象的方法
            dog.shout();
        }
}