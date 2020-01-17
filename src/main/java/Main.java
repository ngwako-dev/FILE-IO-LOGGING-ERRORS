import java.time.LocalDate;
import java.time.LocalTime;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

    private static final Logger logger = LogManager.getLogger(Main.class.getName());

    public static void main(String[] args) {



        Visitor alice=new Visitor("alice cooper",20,"My assistance service was amazing!","Tebogo", LocalTime.now(), LocalDate.now());
        Visitor bob=new Visitor("bob marley",30,"My assistance customer service was bad","Lebogang", LocalTime.now(), LocalDate.now());
        Visitor charlie=new Visitor("charley sheen",30,"I got the best service from my assistance","Gift", LocalTime.now(), LocalDate.now());


//        logger.info(alice.save());
          logger.info(alice.load());

          //logger.info(bob.save());
//          logger.info(bob.load());

//        logger.info(charlie.save());
//        logger.info(charlie.load());
    }
}
