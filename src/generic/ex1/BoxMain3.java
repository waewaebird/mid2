package generic.ex1;

public class BoxMain3 {

    public static void main(String[] args) {
        GenericBox<Integer> integerBox = new GenericBox<Integer>(); //생성시점에 T의 타입이 결정됨.
        integerBox.set(10); // Integer 타입만 허용
        Integer integer = integerBox.get();
        System.out.println("integer = " + integer);

        GenericBox<String> stringBox = new GenericBox<String>(); //생성시점에 T의 타입이 결정됨.
        stringBox.set("hello");
        String str = stringBox.get();
        System.out.println("str = " + str);

        GenericBox<Double> doubleBox = new GenericBox<>();
        doubleBox.set(10.5);
        Double aDouble = doubleBox.get();
        System.out.println("double = " + aDouble);

        //타입 추론 : 생성하는 제네릭 타입 생략 가능 // 자바 컴파일러에서...
        GenericBox<Integer> integerBox2 = new GenericBox<>();
    }
}
