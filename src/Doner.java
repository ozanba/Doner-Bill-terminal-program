class Doner {
    private double price;
    private String foodType;
    private int amount;
    private  int extra;
    private double extraMeatPrice;
    private double deliveryPrice = 50;
    private double basicPrice;
    private boolean isExtraMeatAdded = false;
    private  boolean isdeliveryAdded = false;
    protected  Date billDate;


    public Doner(String foodType, int amount) {
        if (amount < 50) {
            throw new IllegalArgumentException("it cant be lass then 50 gr");

        }
        if (foodType == "meat") {
            price = 100 + (amount - 50) / 10 * 5;
        } else if (foodType == "chicken") {
            price = 80 + (amount - 50) / 10 * 4;

        } else {
            throw new IllegalArgumentException("Invaild food type! valid food types: meat, chicken;");
        }
        basicPrice = price;
        this.foodType = foodType;
    }
    public Doner(String foodType, int amount,  Date billDate) {
        if (amount < 50) {
            throw new IllegalArgumentException("it cant be lass then 50 gr");

        }
        if (foodType == "meat") {
            price = 100 + (amount - 50) / 10 * 5;
        } else if (foodType == "chicken") {
            price = 80 + (amount - 50) / 10 * 4;

        } else {
            throw new IllegalArgumentException("Invaild food type! valid food types: meat, chicken;");
        }
        basicPrice = price;
        this.foodType = foodType;
        this.billDate = billDate;
    }
    public Doner(String foodType, int amount,int day, int month,int year) {
        if (amount < 50) {
            throw new IllegalArgumentException("it cant be lass then 50 gr");

        }
        if (foodType == "meat") {
            price = 100 + (amount - 50) / 10 * 5;
        } else if (foodType == "chicken") {
            price = 80 + (amount - 50) / 10 * 4;

        } else {
            throw new IllegalArgumentException("Invaild food type! valid food types: meat, chicken;");
        }
        basicPrice = price;
        this.foodType = foodType;
        this.billDate = new Date(day,month,year);
    }

    public void AddExtraMeat(int extra){
        extraMeatPrice +=(foodType=="meat") ? extra*0.5 : extra * 0.3;

        price += extraMeatPrice;
        isExtraMeatAdded = true;

    }
    public void AddDelivery(){
        price += deliveryPrice;
        isdeliveryAdded = true;
    }
    protected void getBill(){
        System.out.println("Date: "+billDate.toString());
        System.out.println("Basic price:"+basicPrice);
        if(isExtraMeatAdded)
            System.out.println("Extra "+foodType+" price: "+ extraMeatPrice);
        if(isdeliveryAdded)
            System.out.println("Delivery Price: "+ deliveryPrice);
        System.out.println("Total Price: "+price);
    }
    public double getPrice(){
        return price;
    }


}