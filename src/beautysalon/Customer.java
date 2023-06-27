package beautysalon;
import java.util.Scanner;

public class Customer {
    Scanner input = new Scanner(System.in);
    private String name;
    private String memberType;
    private boolean member;
    protected int pilihan;
    protected String yes_or_no;
    
    Customer(){
        
    }
    
    public String getName(){
        return name;
    }
       
    public void setMember(){
        System.out.print("Silahkan mengisi nama : ");
        name = input.nextLine();
        System.out.println("");
        
        System.out.println("Pilih akses membership :, Contoh: 1");
        System.out.println("1. PREMIUM");
        System.out.println("2. GOLD");
        System.out.println("3. SILVER");
        System.out.println("4. BIASA");
        pilihan = input.nextInt();
        System.out.println("");
        switch (pilihan){
            case 1 : 
                member = true;
                memberType = "PREMIUM";                
                break;
            case 2 :
                member = true;
                memberType = "GOLD";
                break;
            case 3 :
                member = true;
                memberType = "SILVER";
                break;
            case 4 : 
                member = false;
                memberType = "BIASA";
            default:
                System.out.println("Tolong menginputkan jenis layanan yang ingin diinputkan. Contoh: 1");
                setMember();
        }
    }
    
    public boolean isMember(){
        return member;
    }
    
    public String getMemberType(){
        return memberType;
    }          
}
