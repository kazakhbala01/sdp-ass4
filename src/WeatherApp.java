public class WeatherApp {
    public static void main(String[] args) {
        WeatherStation station = new WeatherStation();

        WeatherDisplay temperatureDisplay = createWeatherDisplay("Temperature");
        WeatherDisplay humidityDisplay = createWeatherDisplay("Humidity");

        station.addObserver(temperatureDisplay);
        station.addObserver(humidityDisplay);

        station.setTemperature(25);
        station.setTemperature(30);
    }

    private static WeatherDisplay createWeatherDisplay(String type) {
        if ("Temperature".equalsIgnoreCase(type)) {
            return new TemperatureDisplay();
        } else if ("Humidity".equalsIgnoreCase(type)) {
            return new HumidityDisplay();
        } else {
            throw new IllegalArgumentException("Invalid display type");
        }
    }
}
