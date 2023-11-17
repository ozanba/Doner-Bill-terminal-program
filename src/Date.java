public class Date {
    private int day;
    private int month;
    private int year;
    public Date(){
        day = 1;
        month = 1;
        year = 2200;
    }
    public Date(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }
    public String toString(){
        return day+"/"+month+"/"+year;
    }

}
