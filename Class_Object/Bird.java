package Class_Object;
//extends 是继承父类的意思，implements 是实现接口的意思。
public class Bird extends Animal implements Flyable {
    public Bird(String name){
        super(name);
    }
    @Override
    public void eat(){
        System.out.println(name + " is eating eggs");
    }
    @Override
    public void makeSound() {
        System.out.println(name + " is making a sound");
    }

    @Override
    public void fly(){
        System.out.println(name + " is flying");
    }
}
