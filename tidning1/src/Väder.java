import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class Väder {
    public static void main(String[] args) throws IOException {
        URL u = new URL("http://api.temperatur.nu/tnu_1.17.php?p=ekholmen&cli=api_demo&token=XXXXXXXX");
        URLConnection conn = u.openConnection();
        BufferedReader in = new BufferedReader(
                new InputStreamReader(
                        conn.getInputStream()));
        StringBuffer buffer = new StringBuffer();
        String inputLine;
        while ((inputLine = in.readLine()) != null)
            buffer.append(inputLine);
        in.close();
        System.out.println(buffer.toString());



    }
}

