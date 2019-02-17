package testing.weather.stub;

import org.junit.Assert;
import org.junit.Test;
import testing.stub.Temperatures;
import testing.stub.TemperaturesStub;
import testing.stub.WeatherForecast;

public class WeatherForecastTestSuite {
    @Test
    public void testCalculateForecastWithStub(){

        Temperatures temperatures = new TemperaturesStub();
        WeatherForecast weatherForecast = new WeatherForecast(temperatures);

        int quantityOfSensors = weatherForecast.calculateForecast().size();

        Assert.assertEquals(5, quantityOfSensors);
    }
}