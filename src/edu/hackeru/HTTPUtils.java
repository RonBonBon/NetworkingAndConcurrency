package edu.hackeru;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class HTTPUtils {
    public static String getUrl(String address) throws IOException {
        try {
            URL url = new URL(address);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            InputStream in = con.getInputStream();
            int code = con.getResponseCode();
            return IO.read(in);
        } catch (MalformedURLException e) {
            System.out.println("Invalid address");
            e.printStackTrace();
            throw new RuntimeException(e.getMessage());
        }
    }
}

