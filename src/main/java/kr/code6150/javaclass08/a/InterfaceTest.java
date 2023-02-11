package kr.code6150.javaclass08.a;

@FunctionalInterface
public interface InterfaceTest {

    public int test(int a,int b);

}

class M {
    public static void main(String[] args) {
        //익명 함수 (람다)
        InterfaceTest i = (number1, number2) -> number1 + number2;
    }
}