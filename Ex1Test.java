public class Ex1Test {
    public static void main(String[] args) {
        Counter c=new Counter();
        System.out.println("the value of counter after building"+c.getValue());
        c.click();
        c.click();
        c.click();
        System.out.println("the valuer after three clicks"+c.getValue());
        System.out.println("the valuer after reset"+c.getValue());
    }
}
