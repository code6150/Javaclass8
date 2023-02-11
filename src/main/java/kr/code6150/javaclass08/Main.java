package kr.code6150.javaclass08;

import kr.code6150.javaclass08.PhoneNumber.PhoneNumber;
import kr.code6150.javaclass08.PhoneNumber.PhoneNumberManager;
import kr.code6150.javaclass08.enums.Menu;

import java.util.Scanner;

public class Main {



    //주소록
    //이름, 전번, 나이
    //프로그램이 꺼져도 저장이 되어야한다. *(다시 켜졌을때 원본 데이터 불러옴)
    //
    //printMenu()
    // 1.연락처 입력
    // 2.연락처 목록
    // 3.연락처 검색 (이름)
    // 4.연락처 삭제 (이름)
    // ->


    public static void main( String[] args ) {

        PhoneNumberManager manager = PhoneNumberManager.getInstance();
        Scanner sc = new Scanner(System.in);

        while(true) {
            printMenu();
            System.out.print("입력 : ");
            Menu menu = Menu.findMenu(sc.nextInt());
            sc.nextLine();

            switch (menu) {
                case ADD:
                    System.out.println("\n==========================");
                    System.out.print("이름 : ");
                    String name = sc.nextLine();
                    System.out.print("번호 : ");
                    String phone = sc.nextLine();
                    System.out.print("나이 : ");
                    int age = sc.nextInt();
                    manager.addPhoneNumber(name,phone,age);
                    System.out.println("==========================\n");
                    break;
                case REMOVE:
                    System.out.println("삭제 할 이름을 입력하세요 : ");
                    if(manager.removeByname(sc.nextLine())) {
                        System.out.println("삭제 되었습니다.");
                    } else {
                        System.out.println("찾을 수 없는 이름 입니다.");
                    }
                    break;
                case LIST:
                    manager.printList();
                    break;
                case SEARCH:
                    System.out.println("찾을 이름 입력 : ");
                    PhoneNumber phoneNumber = manager.searchByName(sc.next());

                    if(phoneNumber == null)
                        System.out.println("찾을 수 없습니다.");
                    else
                        phoneNumber.printInfo();
                    break;
            }

        }

    }

    public int number; //맴버 변수 ( 객체가 생성되어야만 )
    private String name; //
    public static void printMenu() {

        System.out.println("1. 연락처 입력");
        System.out.println("2. 연락처 목록");
        System.out.println("3. 연락처 검색");
        System.out.println("4. 연락처 삭제");

    }

}