import java.io.IOException;

public class Main {

  private static final String SPB_WEATHER = "https://yandex.ru/pogoda/saint-petersburg";
  private static final String MSK_WEATHER = "https://yandex.ru/pogoda/213";
  private static final String UFA_WEATHER = "https://yandex.ru/pogoda/172";


  public static void main(String[] args) throws IOException {

    Weather weatherSPB = new WeatherPrinter(SPB_WEATHER);
    weatherSPB.weatherFromSite();

    Weather weatherMSK = new WeatherPrinter(MSK_WEATHER);
    weatherMSK.weatherFromSite();

    Weather weatherUFA = new WeatherPrinter(UFA_WEATHER);
    weatherUFA.weatherFromSite();

  }
}
