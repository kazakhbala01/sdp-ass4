class TemperatureDisplay implements WeatherDisplay {
    @Override
    public void update(int temperature) {
        System.out.println("Temperature Display: Current Temperature is " + temperature + "°C");
    }
}