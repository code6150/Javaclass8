package kr.code6150.javaclass08.PhoneNumber;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class PhoneNumberManager {

    //public PhoneNumberManager() {} (Default)
    //-> 내부에서 접근
    private static PhoneNumberManager instance; // instance = null
    public static PhoneNumberManager getInstance() {
        if (instance == null)
            instance = new PhoneNumberManager();

        return instance;
    }

    private List<PhoneNumber> PhoneNumberList;


    private PhoneNumberManager() {
        PhoneNumberList = new ArrayList();
    }

    //오버로딩 (호출방법이 동일하나. 매개변수의 차이로 구분하여 중복 선언이 가능)
    public void addPhoneNumber(PhoneNumber phoneNumber) {
        PhoneNumberList.add(phoneNumber);
    }

    public void addPhoneNumber(String name, String phone, int age) {
        addPhoneNumber(new PhoneNumber(name,phone,age));
    }

    public void printList() {
        System.out.println("===================");
        for(PhoneNumber phoneNumber : PhoneNumberList) {
            phoneNumber.printInfo();
        }
        System.out.println("===================");
    }

    public PhoneNumber searchByName(String name) {
        // 찾는 이름이 가장 끝에 있는 경우
        Stream<PhoneNumber> s = PhoneNumberList.stream();
        s.filter((i) -> i.getName().equals(name));

        for(PhoneNumber phoneNumber : PhoneNumberList) {
            if(phoneNumber.getName().equals(name))
                return phoneNumber;
        }
        //같은 이름이 없다.
        return null;
    }

    public boolean removeByname(String name) {
        PhoneNumber phoneNumber = searchByName(name);
        if(phoneNumber == null) return false;

        PhoneNumberList.remove(phoneNumber);
        return true;
    }
}
