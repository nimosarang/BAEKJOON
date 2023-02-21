package DesignPatterns.chapter02;

public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}

interface Observer{
    public void update(float temp, float humidity, float pressure);
}
interface DisplayElement{
    public void display();
}
