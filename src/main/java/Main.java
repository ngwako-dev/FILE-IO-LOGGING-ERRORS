import java.time.LocalDate;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

    private static final Logger logger = LogManager.getLogger(Main.class.getName());

    public static void main(String[] args) {



        Visitor alice=new Visitor("alice cooper",20,"My assistance service was amazing!","Tebogo","12:30 pm", LocalDate.now());
        Visitor bob=new Visitor("bob marley",30,"My assistance customer service was bad","Lebogang","12:30 pm", LocalDate.now());
        Visitor charlie=new Visitor("charley sheen",30,"I got the best service from my assistance","Gift","12:30 pm", LocalDate.now());



          logger.info(alice.save());
          logger.info(bob.save());
          logger.info(charlie.save());


          logger.info(alice.load("alice cooper"));
          logger.info(bob.load("bob marley"));
          logger.info(charlie.load("charley sheen"));


    }
}
