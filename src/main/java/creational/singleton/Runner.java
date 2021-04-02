package creational.singleton;

public class Runner {
    public static void main(String[] args) {
        Logger.getLogger().addLog("First..");
        Logger.getLogger().addLog("Second..");
        Logger.getLogger().addLog("Third..");

        Logger.getLogger().showFile();
    }
}
