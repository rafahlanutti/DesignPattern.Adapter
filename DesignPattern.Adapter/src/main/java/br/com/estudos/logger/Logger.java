package br.com.estudos.logger;

public class Logger implements ILogger {

    // Target class
    public void log(String message) {
        System.out.println("Log padrão - " + message);
    }

    public void logError(Exception exception) {
        System.out.println("Log padrão - " + exception.getMessage());
    }

}
