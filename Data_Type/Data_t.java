package Data_Type;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Data_t {
    byte a = 1;
    short b = 2; // 短整型
    int c = 3;
    long d = 400000000L; // 长整型要在数字后面加L
    float e = 5.021f;
    double f = 6.021;
    char g = 'a'; // 字符型
    boolean h = true; // 布尔型

    String i = "good morning";
    int[] j = {1,2,3,4,5,6};

    public void show(){
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("e = " + e);
        System.out.println("f = " + f);
        System.out.println("g = " + g);
        System.out.println("h = " + h);
        System.out.println("i = " + i);
        for(int i=0;i<j.length;i++)
            System.out.println("j = " + j[i]);
    }
    public void now_time(){
        Date data = new Date();
        System.out.println("当前时间为：" + data);
//        使用 SimpleDateFormat 格式化日期
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("当前时间为：" + sdf.format(data));
    }
}
