public class Foo {
    public static void main(String[] args) {
        boolean flag = true;
        if (flag) System.out.println("Hello, Java!");
        if (flag == true) System.out.println("Hello, JVM!");
        float naN = Float.NaN;
        System.out.println(naN+1);
        float v = Float.intBitsToFloat(0x08000000);
        float zero = Float.intBitsToFloat(0x0);
        System.out.println(v);
        System.out.println(zero);
        "a".intern();
    }
}