import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
public class Daily {
    Temp TempObject;
    FeelsLike FeelsLikeObject;
    @JsonProperty("weather")
    ArrayList<Weather> weather;
    private long dt;
    private long sunrise;
    private long sunset;
    private long moonrise;
    private long moonset;
    private long moon_phase;
    private long pressure;
    private long humidity;
    private long dew_point;
    private long wind_speed;
    private long wind_deg;
    private long wind_gust;
    private long clouds;
    private long pop;
    private long snow;
    private long uvi;
    private long rain;


    // Getter Methods

    public long getDt() {
        return dt;
    }

    public void setDt(long dt) {
        this.dt = dt;
    }

    public long getSunrise() {
        return sunrise;
    }

    public void setSunrise(long sunrise) {
        this.sunrise = sunrise;
    }

    public long getSunset() {
        return sunset;
    }

    public void setSunset(long sunset) {
        this.sunset = sunset;
    }

    public long getMoonrise() {
        return moonrise;
    }

    public void setMoonrise(long moonrise) {
        this.moonrise = moonrise;
    }

    public long getMoonset() {
        return moonset;
    }

    public void setMoonset(long moonset) {
        this.moonset = moonset;
    }

    public long getMoon_phase() {
        return moon_phase;
    }

    public void setMoon_phase(long moon_phase) {
        this.moon_phase = moon_phase;
    }

    public Temp getTemp() {
        return TempObject;
    }

    public void setTemp(Temp tempObject) {
        this.TempObject = tempObject;
    }

    public FeelsLike getFeels_like() {
        return FeelsLikeObject;
    }

    public void setFeels_like(FeelsLike feelsLikeObject) {
        this.FeelsLikeObject = feelsLikeObject;
    }

    public long getPressure() {
        return pressure;
    }

    public void setPressure(long pressure) {
        this.pressure = pressure;
    }

    // Setter Methods

    public long getHumidity() {
        return humidity;
    }

    public void setHumidity(long humidity) {
        this.humidity = humidity;
    }

    public long getDew_point() {
        return dew_point;
    }

    public void setDew_point(long dew_point) {
        this.dew_point = dew_point;
    }

    public long getWind_speed() {
        return wind_speed;
    }

    public void setWind_speed(long wind_speed) {
        this.wind_speed = wind_speed;
    }

    public long getWind_deg() {
        return wind_deg;
    }

    public void setWind_deg(long wind_deg) {
        this.wind_deg = wind_deg;
    }

    public long getWind_gust() {
        return wind_gust;
    }

    public void setWind_gust(long wind_gust) {
        this.wind_gust = wind_gust;
    }

    public long getClouds() {
        return clouds;
    }

    public void setClouds(long clouds) {
        this.clouds = clouds;
    }

    public long getPop() {
        return pop;
    }

    public void setPop(long pop) {
        this.pop = pop;
    }

    public long getSnow() {
        return snow;
    }

    public void setSnow(long snow) {
        this.snow = snow;
    }

    public long getRain() {
        return rain;
    }

    public void setRain(long rain) {
        this.rain = rain;
    }
    public long getUvi() {
        return uvi;
    }

    public void setUvi(long uvi) {
        this.uvi = uvi;
    }
}

class FeelsLike {
    private long day;
    private long night;
    private long eve;
    private long morn;


    // Getter Methods

    public long getDay() {
        return day;
    }

    public void setDay(long day) {
        this.day = day;
    }

    public long getNight() {
        return night;
    }

    public void setNight(long night) {
        this.night = night;
    }

    // Setter Methods

    public long getEve() {
        return eve;
    }

    public void setEve(long eve) {
        this.eve = eve;
    }

    public long getMorn() {
        return morn;
    }

    public void setMorn(long morn) {
        this.morn = morn;
    }
}

class Temp {
    private long day;
    private long min;
    private long max;
    private long night;
    private long eve;
    private long morn;


    // Getter Methods

    public long getDay() {
        return day;
    }

    public void setDay(long day) {
        this.day = day;
    }

    public long getMin() {
        return min;
    }

    public void setMin(long min) {
        this.min = min;
    }

    public long getMax() {
        return max;
    }

    public void setMax(long max) {
        this.max = max;
    }

    // Setter Methods

    public long getNight() {
        return night;
    }

    public void setNight(long night) {
        this.night = night;
    }

    public long getEve() {
        return eve;
    }

    public void setEve(long eve) {
        this.eve = eve;
    }

    public long getMorn() {
        return morn;
    }

    public void setMorn(long morn) {
        this.morn = morn;
    }
}
