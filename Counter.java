public class Counter {
    private   int value;

    /**
     * The default Counter initialize counter by zero.
     */
    public Counter()
    {
        value=0;
    }

    /**
     * Increase the counter value by one
     */
    public void click()
    {
        value=value+1;
    }

    /**
     * Get the current value of the Counter.
     * @return current value of the counter
     */
    public int getValue(){
        return value;
    }

    /**
     * start the counter value from zero
     */
    public void reset(){
        value=0;
    }

}
