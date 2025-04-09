package Class_Object;
// 抽象类: 不能实例化, 用于继承
public abstract class Animal {
    protected String name; // 封装: 外部无法直接访问

    public Animal(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public abstract void eat();
    public abstract void makeSound();
}
