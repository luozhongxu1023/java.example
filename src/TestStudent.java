
    class Student {
        private int id;//定义5个变量，私有化
        private String name;
        private String sex;
        private int age;
        private double grade;
        public  Student(){//无参方法
        }
        public  Student(int id,String name,String sex,int age, double grade){//有参方法
            this.id=id;
            this.name=name;
            this.sex=sex;
            this.age=age;
            this.grade=grade;
        }

        public int getAge() {
            return age;
        }

        public int getId() {
            return id;
        }
        public String getName(){
            return name;
        }
        public String getSex(){
            return sex;
        }

        public double getGrade() {
            return grade;
        }

        public void setGrade(double grade) {
            this.grade = grade;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void setSex(String sex) {
            this.sex = sex;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setId(int id) {
            this.id = id;
        }
        public void read(){
            System.out.println("学号："+this.getId()+"\n姓名："+this.getName()+"\n性别："+this.getSex()+"\n年龄："+this.getAge()+"\njava成绩："+this.getGrade());
        }
    }
    public class TestStudent {
        public static void main(String[] args) {
            Student stu1 = new Student(1, "Tom", "男", 12, 60);//定义5个对象，实例化，传参
            Student stu2 = new Student(2, "tom", "男", 13, 61);//以此类推
            Student stu3 = new Student(3, "lihua", "男", 12, 67);
            Student stu4 = new Student(4, "liye", "男", 14, 65);
            Student stu5 = new Student(5, "lzx", "男", 16, 69);
            Student[] stu = new Student[5];//定义了stu[]数组，可以放5个元素
            stu[0] = stu1;//把stu1的数据赋值给stu[0],就是stu数组的第一个元素
            stu[1] = stu2;//以此类推
            stu[2] = stu3;
            stu[3] = stu4;
            stu[4] = stu5;
            Double[] score = {stu1.getGrade(),stu2.getGrade(),stu3.getGrade(),stu4.getGrade(),stu5.getGrade()};//定义score数组，stu1.getGrade()为第一个元素
            //上面这句就相当于Double[] score={60,61,67,65,69}，只不过需要调用get方法来获取五个学生成绩的值
            for(int j=0;j< score.length-1;j++) {//进行冒泡排序，外层循环定义需要比较的轮数（两数对比，要比较n-1轮）
                for (int i = 0; i < score.length-1-j; i++) {// //内层循环，定义第i轮需要比较的两个数， 遍历score[]数组，score.length,是score数组的长度，至于后面-1和-j看下B站的视频
                    if (score[i] > score[i + 1]) {       //比较相邻的两个元素
                        //下面三行代码用于交换相邻两个元素
                        double temp = score[i];         //定义temp，将前者元素赋值给temp
                        score[i] = score[i + 1];         //将两个元素互换位置
                        score[i + 1] = temp;            //将小的元素放在后面
                    }//直到循环结束
                }
            }
            //完成冒泡排序后，再次循环，主要用循环来判断下面的if语句，调用read()方法按照升序来输出学生信息
            for(int i =0;i< score.length;i++) {
                for(int j =0;j < score.length;j++){
                    if(score[i] == stu[j].getGrade()) {//就是判断升序完后的成绩要是等于对象里的这个成绩，他就会调用read()这个方法按照升序来输出学生的信息
                        stu[j].read();
                    }
                }
            }
        }
    }


