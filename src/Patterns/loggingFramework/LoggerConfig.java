package loggingFramework;

public class LoggerConfig {
    LogLevel level;
    LogAppender logAppender;
    public LogLevel getLevel() {
        return level;
    }
    public void setLevel(LogLevel level) {
        this.level = level;
    }
    public LogAppender getLogAppender() {
        return logAppender;
    }
    public void setLogAppender(LogAppender logAppender) {
        this.logAppender = logAppender;
    }
    LoggerConfig(LogLevel level, LogAppender logAppender){
        this.level = level;
        this.logAppender = logAppender;
    }
}
