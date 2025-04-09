package Class_Object;
// 子类
public class Dog extends Animal {
    public Dog(String name){
        super(name);
    }
    // 重写父类的方法(子类必须实现父类的方法)
    @Override
    public void eat(){
        System.out.println(this.getName() + "is eating");
    }

    @Override
    public void makeSound(){
        System.out.println(this.getName() + "is woofing");
    }
}
