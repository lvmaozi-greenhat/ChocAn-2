import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class memberData extends Data{
    public memberData(){
        super();
    }
    public memberData(Scanner fileInput){
       super(fileInput);
    }
    public void printAll(){
        super.printAll();

        if(services.isEmpty()==false) {
            System.out.println("     |Services information|");
            for (Service service : services) {
                service.printPart();
            }
        }
        else{
            System.out.println("No services information");
        }
        System.out.println("********** I am the line *****************");
        System.out.println();
    }
}
