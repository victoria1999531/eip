package com.kingland.eip.ehm.LogTest;

public class FileLogger implements CustomLogger {
    
    private int minLength;
    private int maxLength;
    /**
     * Begin message
     */
    private String loggertitle;

    public FileLogger(int minLength, int maxLength){
        
    }
    
    public FileLogger(int minLength, int maxLength,String loggertitle) {
        this.minLength = minLength;
        this.maxLength = maxLength;
        this.loggertitle = loggertitle;

    }

    /**
     * log message in console
     * @param exception exception message
     */

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
    
    /**
     * log message in console
     * @param exception exception message
     * @param message another message need to output
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
    
    public static FileLogger.Builder builder(){
        return new FileLogger.Builder();
    }
    
    static class Builder {
        private int maxLength;
        private int minLength;
        private String loggertitle;

        public int getMaxLength() {
            return maxLength;
        }

        public FileLogger.Builder setMaxLength(int maxLength) {
            this.maxLength = maxLength;
            return this;
        }
        public int getMinLength() {
            return minLength;
        }
        
        public FileLogger.Builder setMinLength(int minLength) {
            this.minLength = minLength;
            return this;
        }
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

        public FileLogger create(){
            if(this.minLength > this.maxLength){
                throw new IllegalArgumentException();
            }
            return new FileLogger(this.minLength, this.maxLength);
        }
    }
}
