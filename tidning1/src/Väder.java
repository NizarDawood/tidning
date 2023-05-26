import org.json.JSONArray;
import org.json.JSONObject;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
//import org.json.JSONObject;


public class Väder {


    public static void main(String[] args) throws IOException {
        String[] urls = {
                "http://api.temperatur.nu/tnu_1.17.php?p=umea&cli=api_demo&token=XXXXXXXX",
                "http://api.temperatur.nu/tnu_1.17.php?p=gamla_stan&cli=api_demo&token=XXXXXXXX",
                "http://api.temperatur.nu/tnu_1.17.php?p=nedre_soppero&cli=api_demo&token=XXXXXXXX",
                "http://api.temperatur.nu/tnu_1.17.php?p=nobeltorget_malmo&cli=api_demo&token=XXXXXXXX",

                "http://api.temperatur.nu/tnu_1.17.php?p=stampen&cli=api_demo&token=XXXXXXXX",
                "http://api.temperatur.nu/tnu_1.17.php?p=hornsberg&cli=api_demo&token=XXXXXXXX",
                "http://api.temperatur.nu/tnu_1.17.php?p=lexe&cli=api_demo&token=XXXXXXXX",
                "http://api.temperatur.nu/tnu_1.17.php?p=vasastan&cli=api_demo&token=XXXXXXXX",
                "http://api.temperatur.nu/tnu_1.17.php?p=vange&cli=api_demo&token=XXXXXXXX",
                "http://api.temperatur.nu/tnu_1.17.php?p=tarnaby&cli=api_demo&token=XXXXXXXX"


        };

        String[] titel = new String[urls.length];
        double[] temp = new double[urls.length];

        for (int i = 0; i < urls.length; i++) {
            try {
                URL url = new URL(urls[i]);
                URLConnection conn = url.openConnection();
                BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                StringBuilder response = new StringBuilder();
                String inputLine;
                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }
                in.close();

                JSONObject jsonObject = new JSONObject(response.toString());
                JSONArray stations = jsonObject.getJSONArray("stations");
                JSONObject station = stations.getJSONObject(0);
                titel[i] = station.getString("title");
                temp[i] = Double.parseDouble(station.getString("temp"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        // Sort the temperatures in descending order
        for (int i = 0; i < temp.length - 1; i++) {
            for (int j = i + 1; j < temp.length; j++) {
                if (temp[i] < temp[j]) {
                   // sortera tempratur
                    double tempTemp = temp[i];
                    temp[i] = temp[j];
                    temp[j] = tempTemp;

                    // sortera titel
                    String tempTitle = titel[i];
                    titel[i] = titel[j];
                    titel[j] = tempTitle;
                }
            }
        }



        for (int i = 0; i < titel.length; i++) {

            vaderview vader = new vaderview();
            JTextArea weatherTextArea = vader.TextArea1();
            weatherTextArea.setText("Titel: " + titel[i] + "Temperatur: " + temp[i] );

            JTextArea weatherTextArea1 = vader.TextArea1();
            JTextArea weatherTextArea2 = vader.TextArea2();
            JTextArea weatherTextArea3 = vader.TextArea3();
            JTextArea weatherTextArea4 = vader.TextArea4();
            JTextArea weatherTextArea5 = vader.TextArea5();
            JTextArea weatherTextArea6 = vader.TextArea6();
            JTextArea weatherTextArea7 = vader.TextArea7();
            JTextArea weatherTextArea8 = vader.TextArea8();
            JTextArea weatherTextArea9 = vader.TextArea9();
            JTextArea weatherTextArea10 = vader.TextArea10();
            switch (i) {
                case 0:
                    weatherTextArea1.setText("Titel: " + titel[i] + " Temperatur: " + temp[i]);
                    break;
                case 1:
                    weatherTextArea2.setText("Titel: " + titel[i] + " Temperatur: " + temp[i]);
                    break;
                case 2:
                    weatherTextArea3.setText("Titel: " + titel[i] + " Temperatur: " + temp[i]);
                    break;
                case 3:
                    weatherTextArea4.setText("Titel: " + titel[i] + " Temperatur: " + temp[i]);
                    break;
                case 4:
                    weatherTextArea5.setText("Titel: " + titel[i] + " Temperatur: " + temp[i]);
                    break;
                case 5:
                    weatherTextArea6.setText("Titel: " + titel[i] + " Temperatur: " + temp[i]);
                    break;
                case 6:
                    weatherTextArea7.setText("Titel: " + titel[i] + " Temperatur: " + temp[i]);
                    break;
                case 7:
                    weatherTextArea8.setText("Titel: " + titel[i] + " Temperatur: " + temp[i]);
                    break;
                case 8:
                    weatherTextArea9.setText("Titel: " + titel[i] + " Temperatur: " + temp[i]);
                    break;
                case 9:
                    weatherTextArea10.setText("Titel: " + titel[i] + " Temperatur: " + temp[i]);
                    break;
                default:
                    break;
            }
        }
    }
}
// URL u = new URL("http://api.temperatur.nu/tnu_1.17.php?p=ekholmen&cli=api_demo&token=XXXXXXXX");
//        URLConnection conn = u.openConnection();
//        BufferedReader in = new BufferedReader(
//                new InputStreamReader(
//                        conn.getInputStream()));
//        StringBuffer buffer = new StringBuffer();
//        String inputLine;
//        while ((inputLine = in.readLine()) != null)
//            buffer.append(inputLine);
//        in.close();
//
//
//        System.out.println(buffer.toString());