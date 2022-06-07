package KTV;

import java.util.ArrayList;
import java.util.Scanner;

public class KTVByArrayList {
    public static void main(String[] args) {
        int choice ;
        ArrayList<String> MusicList=new ArrayList<String>();
        Scanner scanner=new Scanner(System.in);
        show();
        Init(MusicList);
        System.out.println("请输入你要执行的操作序号");
        if(scanner.hasNextInt()) {
            choice=scanner.nextInt();
        }else {
            choice=4;
        }
        while (choice!=3)
        {
            switch (choice) {
                case (0):
                    addMusic(MusicList);
                    break;
                case (1):
                    moveMusicFirst(MusicList);
                    break;
                case (2):
                    moveMusicBefore(MusicList);
                    break;
                default:
                    System.out.println("请输入0-2数字");
                    break;
            }
            show();
            System.out.println("请输入你要执行的操作序号");
            if(scanner.hasNextInt()) {
                choice=scanner.nextInt();
            }else {
                choice=4;
            }
            System.out.println("当前歌曲列表："+MusicList);

        }
        System.out.println("--------------------退出-----------------------");
        System.out.println("你已退出系统");
    }
    static void show(){
        System.out.println("------------------------欢迎来到点歌系统-----------------------------");
        System.out.println("0.添加歌曲至列表");
        System.out.println("1.将歌曲置顶");
        System.out.println("2.将歌曲移至前一位");
        System.out.println("3.退出");
    }
    static void Init(ArrayList<String> MusicList)
    {
        MusicList.add("梦不落雨林");
        MusicList.add("交换余生");
        MusicList.add("溯");
        MusicList.add("早该知道");
        MusicList.add("反方向的钟");
        System.out.println("初始歌曲列表："+MusicList);
    }
    static void addMusic(ArrayList<String> MusicList)
    {
        System.out.println("请输入你要添加的歌曲名称：");
        Scanner scanner=new Scanner(System.in);
        String MusicName=scanner.nextLine();
        MusicList.add(MusicName);
        System.out.println("已加入歌曲："+MusicList.get(MusicList.size()-1));
        System.out.println("当前歌曲列表"+MusicList);
    }
    static void moveMusicFirst(ArrayList<String> MusicList)
    {
        System.out.println("请输入你要置顶歌曲的名称：");
        Scanner scanner=new Scanner(System.in);
        String MusicName=scanner.nextLine();
        //判断有没有这首歌
        for(Object i:MusicList)
        {
            if(i.equals(MusicName))
            {
                MusicList.remove(MusicName);
                MusicList.add(0,MusicName);
                System.out.println("已将歌曲"+MusicName+"置顶");
                return;
            }
        }
        System.out.println("没有这首歌");
    }
    static void moveMusicBefore(ArrayList<String> MusicList)
    {
        System.out.println("请输入你要置前歌曲的名称：");
        Scanner scanner=new Scanner(System.in);
        String MusicName=scanner.nextLine();
        //判断有没有这首歌
        for(int i=0;i<MusicList.size();i++)
        {
            if((MusicList.get(i)).equals(MusicName))
            {
                MusicList.add(i-1,MusicName);
                MusicList.remove(i+1);
                System.out.println("已将歌曲"+MusicList.get(0)+"置前");
                return;
            }
        }
        System.out.println("没有这首歌");
    }
}