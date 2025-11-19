package chapter__11_EXCEPTIONS_AND_LOCALIZATION.try_with_resources;

public class MyFileClass implements AutoCloseable {
    private final int num;

    public MyFileClass(int num) {
        this.num = num;
    }

    @Override
    public void close() {
        System.out.println("Closing: " + num);
    }
}