package beautysalon;
public class DiscountRate {
    private double serviceDiscountPremium = 0.2;
    private double serviceDiscountGold = 0.15;
    private double serviceDiscountSilver = 0.1;
    private double productDiscountPremium = 0.1;
    private double productDiscountGold = 0.1;
    private double productDiscountSilver = 0.1;
    private double totalService;
    private double totalProduct;
    
    DiscountRate(){
        
    }
    
    public double getServiceDiscountRate(double hargaTotal, String type){
        if(type.equalsIgnoreCase("PREMIUM")){
            totalService = hargaTotal * (1-serviceDiscountPremium);
        }
        else if(type.equalsIgnoreCase("GOLD")){
            totalService = hargaTotal * (1-serviceDiscountGold);
        }
        else if(type.equalsIgnoreCase("SILVER")){
            totalService = hargaTotal * (1-serviceDiscountSilver);
        }
        else {
            totalService = hargaTotal;
        }
        return totalService;
    }
    
    public double getProductDiscountRate(double hargaTotal, String type){
        if(type.equalsIgnoreCase("PREMIUM")){
            totalProduct = hargaTotal * (1-productDiscountPremium);
        }
        else if(type.equalsIgnoreCase("GOLD")){
            totalProduct = hargaTotal * (1-productDiscountGold);
        }
        else if (type.equalsIgnoreCase("SILVER")) {
            totalProduct = hargaTotal * (1 - productDiscountSilver);
        }
        else {
            totalProduct = hargaTotal * 0.9;
        }
        return totalProduct;
    }
    
    public double totalService(){
        return totalService;
    }
    
    public double totalProduct(){
        return totalProduct;
    }
}
