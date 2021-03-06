package com.fields.weather.fieldsweather.Service.Interface;

import java.util.Date;
import java.util.List;

import com.fields.weather.fieldsweather.Model.Field;
import com.fields.weather.fieldsweather.Model.WeatherHistory;
import com.fields.weather.fieldsweather.Model.WeatherPolygon;

public interface IAgroMoniteringService {
    WeatherPolygon createPolygon(String ApiKey,String url,Field field);

    List<WeatherHistory> weatherHistory(String ApiKey,String url,String polygonId, Date startDay, Date endDay);
}
