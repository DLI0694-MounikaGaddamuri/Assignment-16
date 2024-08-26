package ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<Observer> observers = new ArrayList<>();
    private float temperature;
    private float humidity;

    public void addObserver(Observer observer){
        observers.add(observer);
    }

    public void removeObserver(Observer observer){
        observers.remove(observer);
    }

    public void setData(float temperature,float humidity){
        this.temperature=temperature;
        this.humidity=humidity;
        notifyObservers();
    }

    public void notifyObservers(){
        for(Observer observer:observers)
            observer.update(temperature,humidity);
    }
}
