import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Data {
    String name;
    int number;
    String address;
    String city;
    String state;
    int zip_code;
    List<Service> services;

    public Data(){
        name="Default name";
        number=123456789;
        address="Default address";
        city="Default city";
        state="Default state";
        zip_code=123456;
        services = new ArrayList<>();
    }

    public Data(Scanner fileInput){
        name = fileInput.nextLine();
        number = fileInput.nextInt();
        fileInput.nextLine();
        address = fileInput.nextLine();
        city = fileInput.nextLine();
        state = fileInput.nextLine();
        zip_code = fileInput.nextInt();
        fileInput.nextLine();
        services = new ArrayList<>();
    }

    public void printAll(){
        System.out.println(name);
        System.out.println(number);
        System.out.println(address);
        System.out.println(city);
        System.out.println(state);
        System.out.println(zip_code);
        System.out.println();
    }
}
