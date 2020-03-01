package com.abedafnan.Singleton;

import java.util.logging.Level;

public class Main {

    public static void main(String[] args) {

        SingletonLogger logger = SingletonLogger.getInstance();
        logger.getLogger().log(Level.INFO, "This is a test log");

    }
}
