package hw8;

import hw8.project.dto.enums.Periods;
import hw8.project.dto.entity.WeatherData;

import java.io.IOException;

public interface WeatherProvider {

    WeatherData getWeather(Periods periods) throws IOException;

    WeatherData getAllFromDb() throws IOException;
}