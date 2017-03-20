package edu.hackeru;

import com.google.gson.Gson;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
	// write your code here
        try {
            String data = HTTPUtils.getUrl("http://api.androidhive.info/json/movies.json");

            Gson gson = new Gson();
            Movie[] movies = gson.fromJson(data, Movie[].class);
            for (Movie m : movies) {
                System.out.println(m);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
