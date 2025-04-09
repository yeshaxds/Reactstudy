
-----
# ✅ 为什么子类构造函数中要使用 super(...)？

🎯 简短回答：

在 Java 中，super(...) 是用来调用父类构造函数的。因为子类在创建时，必须先初始化父类中的部分（比如属性），这是 Java 的强制规定。否则，父类部分就处于“未初始化”的状态。

🔍 详细解释：

1. 构造函数不是继承的

虽然子类继承了父类的属性和方法，但构造函数不会被继承，所以必须显式调用父类的构造函数来初始化它的内容。

2. Java 的默认行为

如果你不写 super(...)，Java 会自动调用父类的无参构造函数（super()）。


```java
class Animal {
    public Animal() {
        System.out.println("Animal created");
    }
}
class Dog extends Animal {
    public Dog() {
        // 默认等价于 super(); 自动调用无参构造
        System.out.println("Dog created");
    }
}
```

3. 当父类没有无参构造函数时，必须手动调用 super(...)

```java
class Animal {
    public Animal(String name) {
        System.out.println("Animal created: " + name);
    }
}
class Dog extends Animal {
    public Dog(String name) {
        super(name); // ❗ 必须手动调用，否则编译报错
        System.out.println("Dog created: " + name);
    }
}
```

📌 举个生活例子：

想象一下你搬进一个出租房（子类），你不能直接住进去，房东（父类）需要先给你钥匙和家具（父类构造函数初始化），你才能继续布置你自己的空间（子类的内容）。super(...) 就是这个开门的动作。

🧠 小总结：

|**情况**|**是否需要 super(...)**|
|------|-------------------|
|父类有**无参构造函数**|不需要显式写（Java 会自动调用）|
|父类**只有有参构造函数**|**必须**写 super(...)，否则报错|
|想调用父类的构造函数（有参数）|必须用 super(...) 调用|

