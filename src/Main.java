import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, String> telefonLista = new HashMap<>();

        //Create operations.
        telefonLista.put("Greta", "543 3431 1533");
        telefonLista.put("Karin", "634 2341 2344");
        telefonLista.put("Kevin", "3245430 1222");

       choose();

        while (true) {
            String vald = sc.nextLine();
            if (vald.equals("1")) {
                for (String key : telefonLista.keySet()) {
                    System.out.println("Name: " + key);
                }
                System.out.println("Here we check phone numbers");
                searchNumber(sc, telefonLista);
            } else if (vald.equals("2")) {
                System.out.println("Here we enter names and phone numbers");
                newTelefonList(sc, telefonLista);
            }else if (vald.equals("3")){
            System.out.println("\nAll in the phone list");
            for (String key : telefonLista.keySet()) {
                System.out.println("Name: " + key);
                System.out.println("Phone number: " + telefonLista.get(key));
            }
            }else if (vald.equals("n")) {
                System.out.println("God bye!");
                break;
            }else {
                System.out.println("Not a valid choice. Try again!");
            }
            System.out.println("\nChoose between 1-3 alternatives");
        }

    }

    static void choose (){
        System.out.println("Choose 1 = Check phone numbers");
        System.out.println("Choose 2 = Enter names and phone numbers");
        System.out.println("Choose 3 = Check all in the phone list");
        System.out.println("Choose n = End");
        System.out.println("Choose between 1-3 alternatives");
    }

    //Function for take input from user and search phone number.
    public static void searchNumber (Scanner sc ,Map telefonLista){
        System.out.println("\nPlease enter the name to Search a persons number");
        String userinput =  sc.nextLine();
        System.out.println("This is what we found:" + telefonLista.get(userinput));
    }

    //Function for put in new name and phone number in maps.
    public static void newTelefonList (Scanner sc ,Map telefonLista){
        System.out.println("\nPlease put new name and number there for take that on the phone number list.");
        System.out.println("Please put new name");
        String putNewName = sc.nextLine();
        System.out.println("\nPlease put new number ");
        String putNewNumber = sc.nextLine();

        //method to put new name and number from user in telefonLista maps
        telefonLista.put(putNewName, putNewNumber);

    }
}