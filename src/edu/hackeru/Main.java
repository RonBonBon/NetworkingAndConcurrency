package edu.hackeru;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
	// write your code here
        try {
            String data = HTTPUtils.getUrl("http://www.google.co.il");
            System.out.println(data);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
