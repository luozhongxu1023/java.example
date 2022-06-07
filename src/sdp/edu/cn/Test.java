package sdp.edu.cn;

public class Test {
    public Test(){
        System.out.println("1");
    }
    public Test(int x){
        this();
        System.out.println("2");
    }
    public Test(boolean b){
        this(1);
        System.out.println("3");
    }

    public static void main(String[] args) {
        Test test=new Test(true);
    }

}

