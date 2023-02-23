import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {
    private int i;
    private static Logger logger = null;
    private DateFormat df;
    private Date date;

    private Logger() {
        df = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
        date = new Date();
    }

    public static Logger getInstance() {
        if (logger == null) {
            logger = new Logger();
        }
        return logger;
    }

    void log(String msg){
        System.out.println("[" + df.format(date.getTime()) + " " + ++i + "] " + msg);
    }
}
