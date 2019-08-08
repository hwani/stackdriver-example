package com.mkyong.hashing;

import org.apache.commons.codec.digest.DigestUtils;

public class App {

    public static void main(String[] args) {
        System.out.println("App is started by Snow");

        if (args.length < 1) {
            System.err.println("Please provide an input!");
            System.exit(0);
        }
        System.out.println(sha256hex(args[0]));

        System.out.println("App is destroyed by Snow");

    }

    public static String sha256hex(String input) {
        return DigestUtils.sha256Hex(input);
    }

}
