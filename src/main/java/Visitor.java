import java.io.FileNotFoundException;
import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.io.FileWriter;
import java.util.Scanner;


public class Visitor {


    private String name;
    private int age;
    private String comment;
    private String assistance_name;
    LocalDate date;
    LocalTime time;
    String filename;
    public Visitor(String name, int age, String comment, String assistance_name,LocalTime time,LocalDate date){
        this.name=name;
        this.age=age;
        this.comment=comment;
        this.date=date;
        this.time=time;
        this.assistance_name=assistance_name;
        filename="visitor_"+name.split(" ")[0]+"_"+name.split(" ")[1]+".txt";

    }



    public  String save() {

        String results="";

        File myfile=new File(filename);

            try {
                if(myfile.createNewFile()){
                FileWriter myWriter = new FileWriter(myfile);

                myWriter.write(name+"\n"+age+"\n"+comment+"\n"+assistance_name+"\n"+date+"\n"+time);
                myWriter.close();
                results="results in "+filename;
                }else {
                    results= "file already exist";
                }
            } catch (IOException e) {
                results="an error occurred";
                e.printStackTrace();
            }

          return results;
        }

        public String load(){

         String information="";

            try {
                File myObj = new File(filename);
                Scanner myReader = new Scanner(myObj);
                while (myReader.hasNextLine()) {
                    information += myReader.nextLine()+"\n";
                }
                myReader.close();
            } catch (FileNotFoundException e) {
                information="An error occurred.";
                e.printStackTrace();
            }
            return information;
        }

}





