package observerpattern.topic;

/**
 * link: https://www.digitalocean.com/community/tutorials/observer-design-pattern-in-java
 */

//Publisher
public interface Subject {
    public void register(Observer o);
    public void unregister(Observer o);
    public void notifyObservers();

    //method to get updates from subject
    public Object getUpdate(Observer o);

}
