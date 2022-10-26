package observerpattern.weatherStation;

public class ThirdPartyDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    private float pressure;
    private Subject subject;

    public ThirdPartyDisplay(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Third party display: " +
                temperature + "F degrees and " + humidity +
                "% humidity" + " and " + pressure + " pressure");

    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();

    }
}
