package observerpattern.weatherStation;

//Subscriber = Observers
public interface Observer {
    public void update(float temp, float humidity, float pressure);
}
