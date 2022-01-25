package Utils.Logs;

import org.apache.log4j.Logger;

public class Logs {
    private static Logger logJava = Logger.getLogger(Logs.class);

    public static void toLog (String logText){
        System.out.println(logText + "\n");
        logJava.info(logText);
    }

}
