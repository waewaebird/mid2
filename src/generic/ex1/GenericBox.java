package generic.ex1;

public class GenericBox<T> { //다이아몬드라고 부르더라 => 다이아몬드를 사용한 클래스를 제네릭 클래스!
    private T value;

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }
}
