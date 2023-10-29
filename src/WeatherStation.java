import java.util.ArrayList;
import java.util.List;

class WeatherStation {
    private List<WeatherDisplay> observers = new ArrayList<>();
    private int temperature;

    public void addObserver(WeatherDisplay observer) {
        observers.add(observer);
    }

    public void removeObserver(WeatherDisplay observer) {
        observers.remove(observer);
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        notifyObservers();
    }

    private void notifyObservers() {
        for (WeatherDisplay observer : observers) {
            observer.update(temperature);
        }
    }
}
