package ObserverPattern.src.ObserverPattern;

public class ConcreteObserver implements Observer {
    private float temperature;
    private String name;
    private float humidity;

    public ConcreteObserver(String name){
        this.name=name;
    }

    public void update(float temperature,float humidity){
        this.temperature=temperature;
        this.humidity=humidity;
        System.out.println("Hello "+name+", today's weather update's: ");
        System.out.println("Current temperature: "+temperature+"oC");
        System.out.println("Current humidity: "+humidity+"%");
    }
}
