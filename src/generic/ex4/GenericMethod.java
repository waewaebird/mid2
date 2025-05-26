package generic.ex4;

public class GenericMethod { // 여기다가 하면 제네릭 타입
    public static Object objMethod(Object obj) {
        System.out.println("Object print : " + obj);
        return obj;
    }

    public static<T> T genericMethod(T t) { // 여기는 제네릭 메써드
        System.out.println("generic print : " + t);
        return t;
    }

    public static<T extends Number> T numberMethod(T t) { // 여기는 제네릭 메써드
        System.out.println("bound print : " + t);
        return t;
    }
}
