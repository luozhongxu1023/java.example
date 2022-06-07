package lzx.io.cn;

    class Dog {
    private String name;
    private String color;
    private int age;
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void print(){
        System.out.println("狗的名字："+name+"\n狗的颜色："+color+"\n狗的年龄："+age+"岁");
    }
    public void shout(){
        System.out.println("汪汪汪...");
    }
}
public class TestDog{
    public static void main(String[] args) {
        Dog dog=new Dog();
        dog.setName("Tom");
        dog.setColor("橘黄色");
        dog.setAge(7);
        dog.print();
        dog.shout();
    }

}