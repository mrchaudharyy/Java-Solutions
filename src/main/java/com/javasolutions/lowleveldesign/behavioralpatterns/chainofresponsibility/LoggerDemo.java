package com.javasolutions.lowleveldesign.behavioralpatterns.chainofresponsibility;

// Client code
public class LoggerDemo {
    public static void main(String[] args) {
        System.out.println("###### Chain of Responsibility Design Pattern ######");

        // Get the chain of loggers
        LogProcessor logProcessor = getChainOfLoggers();

        System.out.println("Logging messages:");
        System.out.println("===== Logging DEBUG message =====");
        logProcessor.logMessage(LogProcessor.DEBUG, "This is a debug message");
        System.out.println("===== Logging INFO message =====");
        logProcessor.logMessage(LogProcessor.INFO, "This is an info message");
        System.out.println("===== Logging ERROR message =====");
        logProcessor.logMessage(LogProcessor.ERROR, "This is an error message");
        System.out.println("===== Logging FATAL message =====");
        logProcessor.logMessage(LogProcessor.FATAL, "This is a fatal message");
    }

    private static LogProcessor getChainOfLoggers() {
        LogProcessor fatalLogger = new FatalLogProcessor(LogProcessor.FATAL); // 4
        LogProcessor errorLogger = new ErrorLogProcessor(LogProcessor.ERROR); // 3
        LogProcessor infoLogger = new InfoLogProcessor(LogProcessor.INFO); // 2
        LogProcessor debugLogger = new DebugLogProcessor(LogProcessor.DEBUG); // 1

        //  Dynamic Chaining: DEBUG -> INFO -> ERROR -> FATAL
        debugLogger.setNextLogger(infoLogger);
        infoLogger.setNextLogger(errorLogger);
        errorLogger.setNextLogger(fatalLogger);
        // fatalLogger.nextLoggerProcessor is null; // Last logger in chain

        return debugLogger;  // Return the first LogProcessor in chain
    }
}
