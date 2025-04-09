//# 所有的子类都必须从这个函数作为出口输出，而且一个文件夹中只能有一个main函数。
import java.util.Scanner;
public class test {
    public static void main(String[] args){
        // 调用HelloWorld类
        HelloWorld hw = new HelloWorld();//这种调用叫"对象"
        hw.show();

        // 枚举类调用
        meiju m_j = new meiju();
        m_j.size = meiju.Color.RED;
        System.out.println(m_j.size);
    }
}
