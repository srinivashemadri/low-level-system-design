package ProxyDesignPattern;

public class DBResource implements SensitiveResource{

    @Override
    public void access() {
        System.out.println("Accessing DB resource");
    }
}
