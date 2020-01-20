import org.junit.jupiter.api.Test;

import java.time.LocalDate;


import static org.junit.jupiter.api.Assertions.*;

class VisitorTest {

    Visitor alice=new Visitor("alice cooper",20,"My assistance service was amazing!","Tebogo", "12:30 pm", LocalDate.now());
    Visitor bob=new Visitor("bob marley",30,"My assistance customer service was bad","Lebogang", "11:30 pm", LocalDate.now());
    Visitor charlie=new Visitor("charley sheen",30,"I got the best service from my assistance","Gift", "10:30 pm", LocalDate.now());

      @Test

     void save() {

            assertEquals("results in visitor_alice_cooper.txt", alice.save());
            assertEquals("file already exist", alice.save());

            assertEquals("results in visitor_bob_marley.txt", bob.save());
            assertEquals("file already exist", bob.save());

            assertEquals("results in visitor_charley_sheen.txt", charlie.save());
            assertEquals("file already exist",charlie.save());

     }
@Test
    void load(){

            assertEquals("alice cooper\n" +
                                  "20\n" +
                                  "My assistance service was amazing!\n" +
                                  "Tebogo\n" +
                                   LocalDate.now() +"\n"+
                                  "12:30 pm"+"\n",alice.load("alice cooper"));
            assertEquals("An error occurred",alice.load("alice cooper"));


            assertEquals("bob marley\n"+
                                  "30\n"+
                                  "My assistance customer service was bad\n"+
                                  "Lebogang\n"+
                                   LocalDate.now()+"\n"+
                                   "11:30 pm"+"\n",bob.load("bob marley"));
            assertEquals("An error occurred",bob.load("bob marley"));


            assertEquals("charley sheen\n"+
                                  "30\n"+
                                  "I got the best service from my assistance\n"+
                                  "Gift\n"+
                                   LocalDate.now()+"\n"+
                                  "10:30 pm"+"\n",charlie.load("charley sheen"));
            assertEquals("An error occurred",charlie.load("charley sheen"));
    }
}