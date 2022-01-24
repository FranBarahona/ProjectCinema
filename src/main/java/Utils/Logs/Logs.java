package Utils.Logs;


import org.apache.log4j.Logger;

public class Logs {
    private static Logger logJava = Logger.getLogger(Logs.class);

    public static void main (String [] args){
        logJava.info("Hola");
    }

}
