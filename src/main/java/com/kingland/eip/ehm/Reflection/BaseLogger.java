/*

 * Copyright 2020 Kingland Systems Corporation. All Rights Reserved.

 */
package com.kingland.eip.ehm.Reflection;

/**
 *A class that can create different classes
 */
public class BaseLogger {
    private static final String EXCEPTION_PREFIX = "EXCEPTION:";
    /**
     * Begin message
     */
    private String loggertitle;
    /**
     * The minimum length of message
     */
    private int minLength;
    /**
     * The maximum length of message
     */
    private int maxLength;

    public BaseLogger(String loggertitle, int minLength, int maxLength) {
        this.maxLength = maxLength;
        this.minLength = minLength;
        this.loggertitle = loggertitle;

    }

    public BaseLogger(int minLength, int maxLength) {

    }

    public void log(String testException, String consoleMessage) {
    }

    public void log(String exception) {
        if(exception != null && !exception.isEmpty()){
            if(exception.startsWith("Exception")){
                System.out.println(exception);
            }else{
                System.out.println("Exception does not meet the length requirements.");
            }
        }else{
            System.out.println("Exception is empty or null.");
        }
    }

    public static class Builder {
        private int minLength;
        private int maxLength;
        private String loggertitle;

        public Builder loggertitle(String loggertitle) {
            this.loggertitle = loggertitle;
            return this;
        }

        public Builder minLength(int minLength) {
            this.minLength = minLength;
            return this;
        }

        public Builder maxLength(int maxLength) {
            this.maxLength = maxLength;
            return this;
        }

        /**
         * Print the exception log
         * @param exception
         */
        public void log(String exception) {

            System.out.println(loggertitle + "--" + EXCEPTION_PREFIX + exception);
        }

        /**
         * Check the message log format
         * Print the exception log and message log
         */


        public void log(String exception, String message) {
            if(message != null && !message.isEmpty()){
                if(message.length() >= minLength && message.length() <= maxLength){
                    System.out.printf("ClassName: %s, Message: %s\n", this.getClass().getSimpleName(), message);
                }else{
                    System.out.println("This message does not meet the length requirements.");
                }
            }else{
                System.out.println("Message cannot be null or empty string.");
            }
            this.log(exception);
        }
        public BaseLogger create(){
            if(this.minLength > this.maxLength){
                throw new IllegalArgumentException();
            }
            return new BaseLogger(this.minLength, this.maxLength);

        }
        }


    }

