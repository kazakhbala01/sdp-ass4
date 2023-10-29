class HumidityDisplay implements WeatherDisplay {
    @Override
    public void update(int temperature) {
        System.out.println("Humidity Display: Current Humidity is " + (temperature * 2) + "%");
    }
}