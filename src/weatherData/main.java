package src.weatherData;

public class main {
    public static void main(String[] args) {
        WeatherData w = new WeatherData();

        CurrentConditionsDisplay c = new CurrentConditionsDisplay(w);

        w.setMeasurementsChanged(25,50, 30);
        w.setMeasurementsChanged(26,60, 30);
        w.setMeasurementsChanged(26,40, 30);

    }
}
