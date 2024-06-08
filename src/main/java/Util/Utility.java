package Util;

import java.util.Random;

public class Utility {

    // Generate a random email address
    public static String generateRandomEmail() {
        String[] domains = {"gmail.com", "yahoo.com", "hotmail.com", "outlook.com", "example.com"};
        Random random = new Random();
        String username = generateRandomString(8); // You can adjust the length of the username
        String domain = domains[random.nextInt(domains.length)];
        return username + "@" + domain;
    }

    // Generate a random string of given length
    public static String generateRandomString(int length) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder sb = new StringBuilder(length);
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characters.length());
            sb.append(characters.charAt(index));
        }
        return sb.toString();
    }

    public static int generateRandomNumberBasedOnMaxNumberList(int maxNumber) {
        int randomNumber;
        Random random = new Random();

        // generate a random number based on the last number in the category list
        randomNumber = random.nextInt(maxNumber - 1 + 1) + 1;
        if (randomNumber == maxNumber){
            randomNumber-- ;
        }
        return randomNumber;
    }

}