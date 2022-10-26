package observerpattern.weatherStation;

public class WeatherStation {
    public static void main(String[] args) {

        WeatherData weatherData = new WeatherData();//Publisher = Subject


        CurrentConditionsDisplay currentConditionsDisplay=new CurrentConditionsDisplay(weatherData);//Subscriber = observer
        StatisticsDisplay statisticsDisplay=new StatisticsDisplay(weatherData);//Subscriber = observer
        ForecastDisplay forecastDisplay=new ForecastDisplay(weatherData);//Subscriber = observer
        HeatIndexDisplay heatIndexDisplay=new HeatIndexDisplay(weatherData);//Subscriber = observer

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);








    }
}
