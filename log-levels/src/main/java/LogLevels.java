public class LogLevels {
    
    public static String message(String logLine) {
        logLine =logLine.replaceAll("\\[(INFO|WARNING|ERROR)\\]:\\s*","");
        logLine =logLine.replaceAll("(\\t|\\n|\\r)*","");
        logLine =logLine.replaceAll("\\s*$","");
        return logLine;
    }

    public static String logLevel(String logLine) {
        if (logLine.contains("ERROR")) {
            return "error";
        } else if (logLine.contains("WARNING")){
            return "warning";
        } else if (logLine.contains("INFO")){
            return "info";
        }else{
            return logLine;
        } 
    }

    public static String reformat(String logLine) {
        return message(logLine)+" (" + logLevel(logLine) + ")";
    }
}
