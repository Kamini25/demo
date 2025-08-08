package loggingFramework;
public class LogMessage{
LogLevel level;
String message;
public LogMessage(LogLevel level, String message) {
    this.level = level;
    this.message = message;
    this.timestamp = System.currentTimeMillis();
}
Long timestamp;
public LogLevel getLevel() {
    return level;
}
public void setLevel(LogLevel level) {
    this.level = level;
}
public String getMessage() {
    return message;
}
public void setMessage(String message) {
    this.message = message;
}
public Long getTimestamp() {
    return timestamp;
}
public void setTimestamp(Long timestamp) {
    this.timestamp = timestamp;
}
@Override
public String toString() {
    return  level + ",   message=" + message + ", timestamp=" + timestamp + "]";
}

}