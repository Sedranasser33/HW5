public class Ex1 {


    public class  Counter{

      private   int value;
    public Counter()
    {
        value=0;
    }
    public void click()
    {
       value=value+1;
    }
     public int getValue(){
      return value;
     }
     public void reset(){
     value=0;
     }

    }
}
