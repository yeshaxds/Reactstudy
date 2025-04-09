# Java 对象和类
#### **[详情见网页](https://www.runoob.com/java/java-object-classes.html)**

## 1. 🔧 类（Class）

- 类是创建对象的**蓝图**，定义了对象的**属性**（数据）和**方法**（行为）。
- 一个类可以继承其他类，扩展或重写父类的功能。

```java
class Animal {
    String name;
    void makeSound() {
        System.out.println("Some sound");
    }
}
```

---

## 2. 🧱 对象（Object）

- 对象是类的**实例**，是类的具体实现。
- 每个对象都拥有类中定义的属性和方法。
- 可以通过关键字如 `new` 来创建对象。

```java
Animal cat = new Animal();
cat.name = "Kitty";
cat.makeSound();
```

---

## 3. 🧬 继承（Inheritance）

- 允许一个类**继承另一个类**的属性和方法，提升代码复用性。
- 子类可以重写（override）父类的方法，也可以添加新的成员。

```java
class Dog extends Animal {
    void makeSound() {
        System.out.println("Bark");
    }
}
```

---

## 4. 🌀 多态（Polymorphism）

- 多态允许同一个方法根据对象的不同而有不同的表现形式。
- 分为**编译时多态**（方法重载）和**运行时多态**（方法重写）。
- 提高程序的**灵活性和可扩展性**。

```java
Animal myDog = new Dog();  // 运行时绑定
myDog.makeSound();         // 输出：Bark
```

---

## 5. 🔒 封装（Encapsulation）

- 将数据（属性）和操作数据的方法组合在一起，形成一个独立单元。
- 通过 `private` 修饰符隐藏内部实现，仅暴露必要接口（如 getter/setter）。

```java
class Person {
    private String name;

    public String getName() { return name; }
    public void setName(String n) { name = n; }
}
```

---

## 6. 🎛️ 接口（Interface）

- 接口是一组**抽象方法**的集合，定义了类的行为规范。
- 接口不能包含具体实现，**一个类可以实现多个接口**。

```java
interface Flyable {
    void fly();
}

class Bird implements Flyable {
    public void fly() {
        System.out.println("Flying in the sky");
    }
}
```

---

## 7. 🧩 抽象类（Abstract Class）

- 抽象类是不能被实例化的类，用于作为其他类的基类。
- 可包含**具体方法和抽象方法**（未实现的方法）。
- 子类继承后必须实现抽象方法。

```java
abstract class Shape {
    abstract double area();
}
```

---

## 8. 🔁 方法（Method）

- 方法是对象的**行为逻辑**，包含可执行的代码块。
- 方法可包含参数、返回值，并可声明异常。

```java
int add(int a, int b) {
    return a + b;
}
```

---

> ✨ **总结**  
类是设计，**对象是实例**；通过继承重用代码，用封装保护数据，借助多态增强灵活性，接口与抽象类则提供了通用性与拓展性。
