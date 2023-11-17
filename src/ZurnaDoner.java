class ZurnaDoner extends Doner {
    private double zurnaExtraPrice = 20;
    private boolean hasPotato;
    public Date billDate;
    public ZurnaDoner(String foodType, int amount, boolean hasPotato){
        super(foodType, amount);
        this.hasPotato = hasPotato;
    }
    public ZurnaDoner(String foodType, int amount, boolean hasPotato,  Date billDate){
        super(foodType, amount, billDate);
        this.hasPotato = hasPotato;
    }
    public ZurnaDoner(String foodType, int amount, boolean hasPotato, int day, int month,int year){
        super(foodType, amount,day,month,year);
        this.hasPotato = hasPotato;
    }
    //override

    protected void getBill(){
        super.getBill();
        if(hasPotato){
            System.out.println("Potato added: Yes");
        }
        else{
            System.out.println("Potato added: NO");
        }
        System.out.println("Total price including Zurna extra veggies and lavaş(bread): "+(super.getPrice()+zurnaExtraPrice));
    }

}