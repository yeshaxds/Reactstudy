项目：Vue







热更新：开发工具与浏览器建立websocket连接

sequenceDiagram

participant 开发者

participant Vite服务器

participant 浏览器



开发者\->>Vite服务器: 修改并保存文件（如App.vue）

Vite服务器\->>浏览器: 通过WebSocket发送更新信号

浏览器\->>Vite服务器: 请求变更的模块

Vite服务器\->>浏览器: 返回新编译的模块代码

浏览器\->>浏览器: 替换旧模块，保留应用状态



Vite vs Webpack



- **ESM** 是前端模块化的未来标准，支持高效静态分析和按需加载。
- **WebSocket** 为实时应用提供底层通信能力，与 ESM 结合可实现无缝热更新。





SPA和SFC


-----
主方法要点：

1. 必须public static void
2. 参数必须是String数组（可简写为String... args）
3. 每个应用有且只有一个主类


-----
# ✅ 什么是 @Override？

@Override 是 Java 提供的一个注解（Annotation），用来表示“我要重写父类或接口中的一个方法”。

💡 写 @Override 和不写的区别

|**对比项**|**使用 @Override**|**不使用 @Override**|
|-------|----------------|-----------------|
|编译检查|编译器会检查是否真的重写了父类的方法 ✅|编译器**不会检查**，可能因拼写错误导致 bug ❌|
|可读性|更明确、直观，方便维护和理解 ✅|不容易看出方法是否是重写|
|安全性|更安全，避免“以为重写了，其实没重写” ⚠️|容易隐藏 bug（比如拼写错误）|



**🚨 举个错误示范**



\`\`\`java

class Animal {
public void makeSound() {
System.out.println("Animal sound");
}
}

class Dog extends Animal {
// 注意拼写错了：makeSond 而不是 makeSound
// 没写 @Override，编译器不会报错
public void makeSond() {
System.out.println("Bark!");
}
}
\`\`\`

**❗ 问题：你以为你“重写了 makeSound”，其实没有！**

结果调用 dog.makeSound() 还是调用父类的方法，调试很痛苦！



**✅ 使用 @Override 的正确示例**



\`\`\`java

class Dog extends Animal {
@Override
public void makeSound() {
System.out.println("Bark!");
}
}
\`\`\`

🧠 这样编译器会 **检查方法签名是否正确匹配 **父类方法，如果你写错了（比如拼写或参数不一致），会立刻报错，帮你提前发现问题。



✅ 帮你捕捉拼写或签名错误

- **永远推荐写 @Override！**
- ✅ 帮你捕捉拼写或签名错误
  - ✅ 帮你捕捉拼写或签名错误
  - ✅ 提升代码清晰度和维护性
  - ✅ 表达你的意图：“我就是要重写这个方法！”


