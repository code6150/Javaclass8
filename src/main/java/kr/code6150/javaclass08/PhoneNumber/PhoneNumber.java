package kr.code6150.javaclass08.PhoneNumber;

public class PhoneNumber {

    private String name;
    private String phone;
    private int age;

    // (매개변수) {지역변수} -> stack 메모리에 저장이 되었다가 해당 영역이 끝나면 해제
    public PhoneNumber(String name, String phone, int age) {

        this.name = name;
        this.phone = phone;
        this.age = age;

    } // -> name, phone, age 해제

    public String getName() {
        return name;
    }
    public void printInfo() {
        System.out.println("이름 : " + name + " / 번호 : " + phone + " / 나이 : " + age);
    }

}
