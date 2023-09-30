package src.weatherData;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject{
    private List<Observer> observers;
    private CurrentConditionsDisplay currentConditionsDisplay;
    private Observer o;
    private float temp;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList<Observer>();
    }

    /**
     * Change when measurements got changed
     */
    public void setMeasurementsChanged(float t,float h,float p) {
        temp = t;
        humidity = h;
        pressure = p;

        measurementsChanged();
    }

    private void measurementsChanged() {
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o:observers) {
            o.update(temp, humidity, pressure);
        }
    }

}
