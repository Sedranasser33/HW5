public class SelfService {
    private  double purchase,payment;
    public  SelfService(){
          purchase=0;
    payment=0;
    }
  public   void recodppurchase(double price)
    {
   purchase=purchase+price;

    }

public    void  recievePayment(double price)
{

    payment=payment+price;

}
 public double givechange()
 {
     double change =payment-purchase;
     purchase=0;
     payment=0;
     return change;
 }



}
