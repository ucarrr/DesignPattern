package observerpattern.cricketapp;

/**
 * Link :  https://www.geeksforgeeks.org/observer-pattern-set-2-implementation/
 */
// observer pattern
//Publisher
public interface Subject {
    public void registerObserver(Observer o);
    public void unRegisterObserver(Observer o);
    public void notifyObservers();
}
