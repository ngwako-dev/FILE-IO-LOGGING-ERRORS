import java.io.FileNotFoundException;
import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.io.FileWriter;
import java.util.Scanner;


public class Visitor {


    private String name;
    private int age;
    private String comment;
    private String assistance_name;
    LocalDate date;
    String timeOfVisit;
    String filename;


    public Visitor(String name, int age, String comment, String assistance_name,String time,LocalDate date){
        this.name=name;
        this.age=age;
        this.comment=comment;
        this.date=date;
        this.timeOfVisit=time;
        this.assistance_name=assistance_name;
        filename="visitor_"+name.split(" ")[0]+"_"+name.split(" ")[1]+".txt";
    }



    public  String save() {

        String results;

        File myfile=new File(filename);

            try {
                if(myfile.createNewFile()){
                FileWriter myWriter = new FileWriter(myfile);

                myWriter.write(name+"\n"+age+"\n"+comment+"\n"+assistance_name+"\n"+date+"\n"+timeOfVisit);
                myWriter.close();
                results="results in "+filename;
                }else {
                    results= "file already exist";
                }
            } catch (IOException e) {
                results="an error occurred";
//                e.printStackTrace();
            }

          return results;
        }

        public String load(String name){

            filename="visitor_"+name.split(" ")[0]+"_"+name.split(" ")[1]+".txt";
            StringBuilder information= new StringBuilder();

            try {
                File myObj = new File(filename);
                Scanner myReader = new Scanner(myObj);

                while (myReader.hasNextLine()) {

                    information.append(myReader.nextLine()).append("\n");

                }
                myReader.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
                return  "An error occurred";
            }
            return information.toString();
        }

}





