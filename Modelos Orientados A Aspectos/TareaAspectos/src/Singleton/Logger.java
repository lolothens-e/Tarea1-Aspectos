package Singleton;

import java.util.ArrayList;

public class Logger {
    private static Logger GenLog = null;   
    
    private ArrayList<String> log;
    
    private Logger() {
        this.log = new ArrayList<>();  
    }
    
    public static Logger getLog() {
        if (GenLog == null) {
            GenLog = new Logger();  
        }
        return GenLog;
    }
    
    public void log(String s) {
        log.add(s);
    }
    
    public void checkLog() {
        for (String s : log) {
            System.out.println(s);
        }
    }
}
