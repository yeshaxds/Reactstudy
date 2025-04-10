package Data_Type;

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
}
