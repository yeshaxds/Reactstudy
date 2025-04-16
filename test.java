
//# 所有的子类都必须从这个函数作为出口输出，而且一个文件夹中只能有一个main函数。
// 不在一个文件夹下的子类需要在文件开头加上package 包名;HelloWord类和meiju枚举类都在同一个包下所以不需要调用包名。
import Class_Object.Animal;
import Class_Object.Bird;
import Class_Object.Dog;
import Class_Object.Flyable;
import Data_Type.*;
import Xun_Huan.*;
import Math_and_StringBuilder.*;
import Data_Type.*;
import java.util.Scanner;

//一个源文件只能又一个public类，如果有多个public类，编译器会报错。
// 包名和类名要一致，否则编译不通过。
public class test {
    public static void main(String[] args) {
//        // 调用HelloWorld类
//        HelloWorld hw = new HelloWorld();// 这种调用叫"对象"
//        hw.show();
//
//        // 枚举类调用
//        meiju m_j = new meiju();
//        m_j.size = meiju.Color.RED;
//        System.out.println(m_j.size);
//
//        // 类和对象的练习
//        // 父类调用子类方法
//        Animal dog = new Dog("旺财");
//        Animal bird = new Bird("小鸟");
//        dog.eat();
//        bird.makeSound();
//
//        // 向下转型调用接口方法
//        ((Flyable) bird).fly();
//
//        // 数据类型类
//        Data_t data = new Data_t();
//        data.show();
//        data.now_time();
//
//        // 循环类
//        xun_H xun_h = new xun_H();
//        xun_h.for_XH();
//        xun_h.While_XH();
//        xun_h.DoWhile_XH();
//        xun_h.Switch_XH();
//
//        // Math方法调用
//        math_cz math = new math_cz();
//        System.out.println(math.xxxV());
//        System.out.println(math.Equals("abc", "abc"));
//        System.out.println(math.toString("小明", 18));
//
//        // StringBuilder and StringBuffer方法调用
//        RunoobTest runoob = new RunoobTest();
//        runoob.test();
//        runoob.StringBufferTest();

        // 动态数组的创建和使用
        arr_cz arr = new arr_cz();
        arr.arr_cs();

        //IO流的使用
    }
}
