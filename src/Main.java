public class Main{
    public static void main(String args[]){

        Date dt = new Date(22,34,56);

        ZurnaDoner zurna = new ZurnaDoner("meat",88,true,16,11,2023);
        zurna.AddDelivery();
        zurna.getBill();

        ZurnaDoner zurn = new ZurnaDoner("meat",88,true,dt);
        zurn.AddDelivery();
        zurn.getBill();




        }
        }