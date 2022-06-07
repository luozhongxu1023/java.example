package sdp.edu.cn;
class Resume {
    private String name;
    private String sex;
    private int age;
    public Resume(){
    }
    public Resume(String name,String sex,int age){
        this.name = name;
        this.sex = sex;
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public String getSex(){
        return sex;
    }
    public int getAge(){
        return age;
    }
    public void introduce(){
        System.out.println("姓名："+this.getName()+"\n性别："+this.getSex()+"\n年龄："+this.getAge());
    }
}
public class TestResume{
    public static void main(String[] args){
        Resume re = new Resume("李四","男",20);
        re.introduce();
    }
}