
# Java 基础语法
**_[详情见网址](:https://www.runoob.com/java/java-basic-syntax.html)_**

## 一、程序基本结构
- Java程序由**多个对象**组成
- 对象之间通过**方法调用**进行交互

## 二、核心概念

### 1. 类（Class）
- 对象的模板/蓝图
- 定义格式：
  ```java
  [修饰符] class 类名 {
      // 成员变量
      // 成员方法
  }
#### 示例：
    public class Dog {
    // 成员变量
    String breed;
    int age;
    
        // 成员方法
        void bark() {
            System.out.println("汪汪叫");
        }
    }
### 2. 对象（Object）
  - 类的具体实例

```java创建方式：
    类名 对象名 = new 类名();
    示例：

    Dog myDog = new Dog();
    myDog.breed = "金毛";
    myDog.bark();
```
### 3. 方法（Method）
   - 定义对象的行为

` 基本结构：
```
    [修饰符] 返回类型 方法名(参数列表) {
    // 方法体
    [return 返回值;]
    }
```
#### 示例：

    public int add(int a, int b) {
    return a + b;
    }
### 4. 实例变量
  - 类的属性/状态

特点：

每个对象独立拥有

有默认初始值

生命周期与对象相同

## 三、基础语法示例
    public class Main {
    // 实例变量
    String message = "Hello Java";
    
        // 方法
        void printMessage() {
            System.out.println(message);
        }
        
        public static void main(String[] args) {
            // 创建对象
            Main obj = new Main();
            
            // 调用方法
            obj.printMessage();  // 输出：Hello Java
        }
    }
## 四、核心概念对比

| 概念         | 作用描述                  | 示例代码                          | 重要特性                      |
|--------------|--------------------------|----------------------------------|-----------------------------|
| **类**       | 定义对象的模板/蓝图        | `class Person {...}`            | - 包含属性和方法定义<br>- 用`class`关键字声明 |
| **对象**     | 类的具体实例              | `Person p = new Person();`      | - 使用`new`创建<br>- 每个对象独立存在 |
| **方法**     | 定义对象的行为/功能       | `void walk() {...}`             | - 可带参数和返回值<br>- 实现业务逻辑 |
| **实例变量** | 存储对象的状态/属性       | `String name;`                  | - 每个对象独立副本<br>- 有默认初始值 |

### 补充说明：
1. **类与对象关系**：
    - 类 = 设计图纸
    - 对象 = 根据图纸建造的房子

2. **方法分类**：
    - 实例方法：`void eat() {...}`
    - 静态方法：`static void sleep() {...}`

3. **变量类型**：
   ```java
   class Example {
       int instanceVar;    // 实例变量
       static int classVar; // 类变量
   }


### java 关键字
- 访问控制符：`public、private、protected`
- 类\方法修饰符：`abstract、final、static、synchronized、native、strictfp`
- 基本数据类型：`byte、short、int、long、float、double、boolean、char`
- 引用数据类型：`类、接口、数组、枚举`
- 控制语句：`if、else、switch、for、while、do、break、continue、return`
- 异常处理：`try、catch、throw、throws、finally`
- 包：`package`
- 注释：`/**...*/、//`
- 运算符：`+、-、*、/、%、++、--、=、==、!=、>、<、>=、<=、&&、||、&、|、^、~、<<、>>、>>>、?、:、,、.、;、[]、()、{}、...`
- 保留字：`abstract、assert、boolean、break、byte、case、catch、char、class、const、continue、default、do、double、else、enum、extends、final、finally、float、for、goto、if、implements、import、instanceof、int、interface、long、native、new、package、private、protected、public、return、short、static、strictfp、super、switch、synchronized、this、throw、throws、transient、try、void、volatile、while`

## 继承

在 Java 中，一个类可以继承另一个类。如果你要创建的类已经存在所需的方法或属性，可以直接继承该类以重用代码。被继承的类称为超类（super class），继承该类的类称为子类（sub class）。
