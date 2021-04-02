package creational.singleton;

public class Logger {
    private static Logger logger;
    private static String file = "Log File... \n";

    public static synchronized Logger getLogger() {
        if (logger == null) {
            logger = new Logger();
        }
        return logger;
    }

    private Logger() {}

    public void addLog(String info) {
        file += info + "\n";
    }

    public void showFile() {
        System.out.println(file);
    }
}
