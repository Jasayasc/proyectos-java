public class Main {
    public static void main(String[] args) {
        InterfaceA objA = new ConcreteClass();
        InterfaceB objB = new ConcreteClass();
        InterfaceC objC = new ConcreteClass();

        objA.execute();
        objB.execute();
        objC.execute();
    }
}