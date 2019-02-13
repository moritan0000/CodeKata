package kata;

import java.io.*;

class WeatherData {

    int weather() {
        try {

            File f = new File("C:\\Users\\HirotakaMorishita\\IdeaProjects\\" +
                    "CodeKata\\src\\main\\resources\\weather.dat");
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);

            String str = br.readLine();
            while (str != null) {
                System.out.println(str);
                str = br.readLine();
            }
            br.close();
            return 0;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return 0;
    }
}
