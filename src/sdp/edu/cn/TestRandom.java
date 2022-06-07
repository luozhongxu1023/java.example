package sdp.edu.cn;
import java.util.Random;
import java.util.Scanner;
public class TestRandom {
    public static void main(String[] args) {
        Random rd=new Random();
        int x =rd.nextInt(10);
        Scanner sc=new Scanner(System.in);
        while (true){
            System.out.println("请输入你猜测的数字");
            int random=sc.nextInt();
            if(random>x){
                System.out.println("您猜大了，重新输入");
            }
            else if(random<x){
                System.out.println("您猜小了，重新输入");
            }
            else{
                System.out.println("恭喜你，猜对了！");
                break;
            }
        }
    }
}
