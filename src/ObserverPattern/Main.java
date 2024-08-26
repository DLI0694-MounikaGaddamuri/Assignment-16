package ObserverPattern;

public class Main {

    public static void main(String[] args) {
        Subject subject = new Subject();
        Observer observer1 = new ConcreteObserver("Mounika");
        Observer observer2 = new ConcreteObserver("Prasanna");
        Observer observer3 = new ConcreteObserver("Abc");

        subject.addObserver(observer1);
        subject.addObserver(observer2);
        subject.addObserver(observer3);

        subject.setData(25.5f,65.0f);
    }
}