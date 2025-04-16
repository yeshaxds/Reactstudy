package Math_and_StringBuilder;

// StringBuilder类用于构建字符串，可以提高字符串的效率。
// StringBuffers类是线程安全的，可以用于多线程环境下构建字符串。
//详情见https://www.runoob.com/java/java-stringbuffer.html
public class RunoobTest {
    public void test() {
        // 创建StringBuilder对象
        StringBuilder sb = new StringBuilder(10);
        sb.append("Hello");
        System.out.println(sb);
        sb.append("!");
        System.out.println(sb);
        sb.insert(4," World");
        System.out.println(sb);
        sb.delete(0,3);
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        sb.setLength(0);
        System.out.println(sb);
    }

    public void StringBufferTest() {
        // 创建StringBuffer对象
        StringBuffer sb = new StringBuffer("Hello World!");
        System.out.println(sb);
        sb.append(" How are you?");
        System.out.println(sb);
    }
}
