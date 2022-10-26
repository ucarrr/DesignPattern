package observerpattern.weatherStation;

public class StatisticsDisplay implements Observer, DisplayElement {

    private Subject subject;
    private int numReadings;
    private float tempSum;
    private float sumHumidity;
    private float maxTemp;
    private float minTemp;
    private float maxHumidity;
    private float minHumidity;

    public StatisticsDisplay(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
        numReadings = 0;
        tempSum = 0;
        sumHumidity = 0;
        maxTemp = 0;
        minTemp = 0;
        maxHumidity = 0;
        minHumidity = 0;
    }

    @Override
    public void display() {
        System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings)
                + "/" + tempSum + "/" + tempSum);
        System.out.println("Avg/Max/Min humidity = " + (sumHumidity / numReadings)
                + "/" + maxHumidity + "/" + minHumidity);

    }

    @Override
    public void update(float temp, float humidity, float pressure) {


        tempSum += temp;
        sumHumidity += humidity;
        numReadings++;

        if (numReadings == 1) {
            maxTemp = temp;
            minTemp = temp;
            maxHumidity = humidity;
            minHumidity = humidity;
        } else {
            if (temp > maxTemp) {
                maxTemp = temp;
            }
            if (temp < minTemp) {
                minTemp = temp;
            }
            if (humidity > maxHumidity) {
                maxHumidity = humidity;
            }
            if (humidity < minHumidity) {
                minHumidity = humidity;
            }


            display();
        }

    }
}
