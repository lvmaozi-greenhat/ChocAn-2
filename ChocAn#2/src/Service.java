import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;
import java.util.Scanner;

public class Service {
    Date occurred_date; //Date and time service occurred
    Date received_in_system; //Date and time service received into system
    String member_name;
    String provider_name;
    String service_name;
    String comments; //OPTIONAL
    int member_id;
    int service_id;
    double fee;

//Default constructor
   public Service(){
       String default_data="2020-02-02";
   //    String default_data="Sun Feb 02 00:00:00 PST 2020";
       try {
            occurred_date=new SimpleDateFormat("yyyy-MM-dd").parse(default_data);
           received_in_system =new SimpleDateFormat("yyyy-MM-dd").parse(default_data);
       //    occurred_date=new SimpleDateFormat("Sun Feb 02 00:00:00 PST 2020").parse(default_data);
        //   received_in_system =new SimpleDateFormat("Sun Feb 02 00:00:00 PST 2020").parse(default_data);
       } catch (ParseException e) {
           e.printStackTrace();
       }
       member_name="Default member name";
       provider_name="Default provider name";
       service_name="Default service name";
       comments="Default comments";
       member_id=123456789;
       service_id=123456;
       fee=99.99;
   }

    //constructor load file
    public Service(Scanner fileInput){
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        try {
            occurred_date = formatter.parse(fileInput.nextLine());
            received_in_system = formatter.parse(fileInput.nextLine());
        } catch (ParseException e) {
            e.printStackTrace();
        }

        member_name = fileInput.nextLine();
        provider_name = fileInput.nextLine();
        service_name = fileInput.nextLine();
        comments = fileInput.nextLine();
        member_id = fileInput.nextInt();
        service_id = fileInput.nextInt();
        fee = fileInput.nextDouble();
        fileInput.nextLine();
    }

    //printAll information
    public void printAll(){
        System.out.println(occurred_date);
        System.out.println(received_in_system);
        System.out.println(member_name);
        System.out.println(provider_name);
        System.out.println(service_name);
        System.out.println(comments);
        System.out.println(member_id);
        System.out.println(service_id);
        System.out.println(fee);
        System.out.println();
    }

   //Parts of service information for members
    public void printPart(){
        System.out.println(occurred_date);
        System.out.println(provider_name);
        System.out.println(service_name);
    }
}
