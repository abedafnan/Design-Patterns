package com.abedafnan.Singleton;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;

public class SingletonLogger {

    // The shared class instance
    private static SingletonLogger instance = null;

    private Logger logger = Logger.getLogger("my_logger");

    /**
     * Private constructor so that other classes won't be able to
     * create an object directly
     */
    private SingletonLogger() {
        try {
            logger.addHandler(new FileHandler("./src/com/abedafnan/Singleton/log.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * This method is used to access (reuse) the shared instance
     * of the class
     *
     * We add 'synchronized' so that only one thread at a time will
     * access the instance in multi-threaded programs
     */
    public static synchronized SingletonLogger getInstance() {
        if (instance == null) {
            instance = new SingletonLogger();
        }
        return instance;
    }

    public Logger getLogger() {
        return logger;
    }
}
