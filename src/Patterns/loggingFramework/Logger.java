package loggingFramework;
public class Logger {
public static final Logger instance = new Logger();
LoggerConfig config;

public static Logger  getInstance(){
    return instance;
}
Logger(){
    config = new LoggerConfig(LogLevel.INFO, new ConsoleAppender());
}

public LoggerConfig getConfig() {
    return config;
}
public void setConfig(LoggerConfig config) {
    this.config = config;
}
public void log(LogLevel level, String message){
    if(level.ordinal() >= config.getLevel().ordinal()){
        LogMessage logMessage = new LogMessage(level, message);
        config.getLogAppender().append(logMessage);
    }
}
public void  info(String message){
    log(LogLevel.INFO, message);
}
}