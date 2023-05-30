public class Stack <V> {
    private int maxSize;
    private int top;
    private V arr[];

    public Stack( int maxSize){
        this.maxSize = maxSize;
        this.top = -1; //initially when stack is empty
        arr = (V[]) new Object[maxSize];//type casting Object[] to V[]
    }

    public int getCapacity() {
        return maxSize;
    }

}
