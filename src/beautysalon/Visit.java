package beautysalon;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

class Visit extends Customer{
    private DateFormat formatTanggal;
    private Date tanggal;
    private double serviceExpense;
    private double productExpense;
    private String namaService;
    private String namaProduct;
    private double hargaService;
    private double hargaProduct;
    
    DiscountRate totalService = new DiscountRate();
    DiscountRate totalProduct = new DiscountRate();
    
    Visit(){
       
    }
    
    public String getTanggal() {  
        formatTanggal = new SimpleDateFormat("yyyy/MM/dd");  
        tanggal = new Date();  
        return formatTanggal.format(tanggal);  
    }
    
    public void toDo(){
        System.out.println("Apa yang ingin dilakukan hari ini? Contoh: 1");
        System.out.println("1. SERVICE");
        System.out.println("2. MEMBELI PRODUK KECANTIKAN");
        System.out.println("3. KEDUANYA");
        pilihan = input.nextInt();
        System.out.println("");
        switch (pilihan) {
            case 1 : 
                setServiceExpense();
                break;
            case 2 :
                setProductExpense();
                break;
            case 3 :
                setServiceExpense();
                setProductExpense();
                break;
            default:
                System.out.println("Tolong menginputkan jenis layanan yang ingin diinputkan. Contoh: 1");
                toDo();
        }
    }
    
    public void setServiceExpense(){
        do {
            System.out.print("Nama Service : ");
            namaService = input.next();
            input.nextLine();
            System.out.print("Harga Service : ");
            hargaService = input.nextDouble();
            serviceExpense = serviceExpense + hargaService;
            System.out.println("Ada lagi? YA / TIDAK");
            yes_or_no = input.next();  
            input.nextLine();
            toDo();
            System.out.println("");
            if(yes_or_no.equalsIgnoreCase("TIDAK")){
                break;
            }
        } while (true); 
    }
    
    public double getServiceExpense(){
        return serviceExpense;
    }
    
    public void setProductExpense(){
        do {
            System.out.print("Nama Product : ");
            namaProduct = input.next();
            input.nextLine();
            System.out.print("Harga Product : ");
            hargaProduct = input.nextDouble();
            productExpense = productExpense + hargaProduct;
            System.out.println("Ada lagi? YA / TIDAK");
            yes_or_no = input.next();  
            input.nextLine();
            toDo();
            System.out.println(""); 
            if(yes_or_no.equalsIgnoreCase("TIDAK")){
                break;
            }
        } while (true);
    }
    
    public double getProductExpense(){
        return productExpense;
    }
    
    public void displayMessage(){
        System.out.println("Nama Anda : " + getName());
        System.out.println("Akses Membership : " + isMember());
        System.out.println("Tipe Membership : " + getMemberType());
        System.out.println("Tanggal : " + getTanggal());
        System.out.println("Total yang dibayarkan pada service : " + totalService.getServiceDiscountRate(getServiceExpense(), getMemberType()));
        System.out.println("Total yang dibayarkan pada product : " + totalProduct.getProductDiscountRate(getProductExpense(), getMemberType()));
    }
}

