import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

class VisitorTest {

    Visitor alice=new Visitor("alice cooper",20,"My assistance service was amazing!","Tebogo", LocalTime.now(), LocalDate.now());
//    Visitor bob=new Visitor("bob marley",30,"My assistance customer service was bad","Lebogang", LocalTime.now(), LocalDate.now());
//    Visitor charlie=new Visitor("charley sheen",30,"I got the best service from my assistance","Gift", LocalTime.now(), LocalDate.now());
    @Test

    void save(){
          assertEquals("results in visitor_alice_cooper.txt",alice.save());
          assertEquals("file already exist",alice.save());

          assertEquals("results in visitor_bob_marley.txt",bob.save());
          assertEquals("file already exist",bob.save());

          assertEquals("results in visitor_charley_sheen.txt",charlie.save());
          assertEquals("file already exist",charlie.save());

    }

    void load(){
//        assertEquals("");

    }
}