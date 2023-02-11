package kr.code6150.javaclass08.enums;

public enum Menu {

    ADD(1),
    SEARCH(2),
    LIST(3),
    REMOVE(4);

    // enum 의 생성자는 절대 public 일 수 없다.

    // 맴버 변수는 final 로 선언해야한다. ( 상수 )
    private final int number;

    Menu(int number) {

        this.number = number;

    }

    public int getNumber() { return number; }

    //맴버 함수 -> 객체 생성 후에 생성된 객체를 통해 호출
    public static Menu findMenu(int number) {
        switch (number) {
            case 1: return ADD;
            case 2: return LIST;
            case 3: return SEARCH;
            case 4: return REMOVE;
            default: return null;
        }
    }
}
