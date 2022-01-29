package Observer;

public class Test {
    public static void main(String[] args) {
        WeatherData weatherData=new WeatherData();
        CurrentConditionsDisplay current=new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(80,45);
        weatherData.setMeasurements(30,65);
        weatherData.setMeasurements(50,85);
    }
}
