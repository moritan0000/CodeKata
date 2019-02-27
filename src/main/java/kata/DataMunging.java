package kata;

import lombok.Data;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

@Data
public class DataMunging {

    public static String weatherUrl = "http://codekata.com/data/04/weather.dat";
    public static String footballUrl = "http://codekata.com/data/04/football.dat";

    public static List<String> fetchUrl(final String urlString) {

        HttpURLConnection con = null;
        BufferedReader reader = null;
        InputStream inStream;
        List<String> output = new ArrayList<>();

        try {
            URL url = new URL(urlString);
            con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            con.connect();

            int status = con.getResponseCode();
            output.add("HTTP status: " + status);

            if (status == HttpURLConnection.HTTP_OK) {
                inStream = con.getInputStream();
                reader = new BufferedReader(new InputStreamReader(inStream));
                String line;
                while ((line = reader.readLine()) != null) {
                    output.add(line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {

                if (reader != null) {
                    reader.close();
                }
                if (con != null) {
                    con.disconnect();
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                return output;
            }
        }
    }

    public static void main(String[] args) {

        List<String> weatherData = new ArrayList<>(DataMunging.fetchUrl(weatherUrl));
        weatherData = weatherData.subList(3, weatherData.size());
        weatherData.forEach(System.out::println);


//        int[] maxTemp = new int[]{weatherData.stream().map(v->v.substring())};


        List<String> footballData = new ArrayList<>(DataMunging.fetchUrl(footballUrl));
        footballData.forEach(System.out::println);
    }
}
