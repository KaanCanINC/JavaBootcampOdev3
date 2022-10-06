package Core.Logging;

public class DBLogger implements Logger{

    @Override
    public void log(String data) {
        System.out.println("DataBase'e Loglandi: " + data);        
    }
    
}
