package testing.weather.mock;

import org.junit.Assert;
import org.junit.Test;
import testing.stub.Temperatures;
import testing.stub.WeatherForecast;
import java.util.HashMap;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class WeatherForecastTestSuite {
    @Test
    public void testCalculateForecastWithMock() {
        Temperatures temperaturesMock = mock(Temperatures.class);
        HashMap<Integer, Double> temperaturesMap = new HashMap<>();
        temperaturesMap.put(0, 26.5);
        temperaturesMap.put(1, 26.2);
        temperaturesMap.put(2, 24.8);
        temperaturesMap.put(3, 25.2);
        temperaturesMap.put(4, 26.1);
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);

        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        int quantityOfSensors = weatherForecast.calculateForecast().size();

        Assert.assertEquals(5, quantityOfSensors);
    }
}