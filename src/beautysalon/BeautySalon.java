package beautysalon;
import java.util.Scanner;
public class BeautySalon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Selamat Datang di Beauty Salon!");
        
        Visit dataCustomer = new Visit();
        dataCustomer.setMember();
        dataCustomer.toDo();
        dataCustomer.displayMessage();
    }
}
