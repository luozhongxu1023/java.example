import java.util.Scanner;

public class Test24 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[] score = new double[5];
        for (int i = 0; i < score.length; i++) {
            System.out.println("请输入第" + (i + 1) + "个成绩");
            score[i] = scan.nextDouble();
        }
        System.out.println("排序前的元素值");
        for (double val : score) {
            System.out.println(val + "\t");
        }
        System.out.println("冒泡排序方法对数组进行排序");
        for (int i = 0; i < score.length - 1; i++) {
            for (int j = 0; j < score.length; j++) {
                if (score[j] > score[j + 1]) {
                }
            }
        }
    }
}
