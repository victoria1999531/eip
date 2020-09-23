package com.kingland.eip.ehm.LogTest;

public class LoggerBulider {
        public static void main(String[] args) throws Exception {
            final int fileLoggerMinLength = 10;
            final int fileLoggerMaxLength = 20;
            final int consoleLoggerMinLength = 5;
            final int consoleLoggerMaxLength = 10;
            final String exception = "java.lang.ArrayIndexOutOfBoundsException";
            String consoleMessage = "Java Log";
            String fileMessage = "This is JavaLog";

            BaseLogger consoleLogger = new BaseLogger.Builder()
                    .loggertitle("ConsoleLogger")
                    .minLength(consoleLoggerMinLength)
                    .maxLength(consoleLoggerMaxLength)
                    .create();

            consoleLogger.log(exception,consoleMessage);
            consoleLogger.log(exception);
            FileLogger fileLogger = new FileLogger.Builder()
                    .loggertitle("FileLogger")
                    .minLength(fileLoggerMinLength)
                    .maxLength(fileLoggerMaxLength)
                    .create();

            fileLogger.log(exception,fileMessage);
            fileLogger.log(exception);
        }
    }

