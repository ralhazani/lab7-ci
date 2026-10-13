package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
    private static final Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        logger.info("Starting Calculator application...");

        Calculator calc = new Calculator();

        logger.info("Adding numbers: 10 + 5 = {}", calc.add(10, 5));

        try {
            logger.info("Attempting division: 10 / 0");
            calc.divide(10, 0);
        } catch (ArithmeticException e) {
            logger.warn("Caught exception in main: {}", e.getMessage());
        }

        logger.info("Application finished.");
    }
} 
