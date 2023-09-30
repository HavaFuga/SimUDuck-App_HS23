package src.weatherData;

public class CurrentConditionsDisplay implements Observer, DisplayElement{
    private WeatherData weatherData;
    private float temp;
    private float humidity;

    CurrentConditionsDisplay(WeatherData weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temp + "C° und " + humidity + "% humidity");

    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;

        display();
    }
}
