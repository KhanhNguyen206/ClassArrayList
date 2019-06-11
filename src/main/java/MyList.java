import java.util.Arrays;

public class MyList<E> {
    private int size=0;
    static int DEFAULT_CAPACITY=10;
    private Object[] element=new Object[DEFAULT_CAPACITY];

    public MyList(){
    }

    public MyList(int capacity){
        DEFAULT_CAPACITY=capacity;
    }

    private void ensureCapa(){
        int newSize=element.length+1;
        element= Arrays.copyOf(element,newSize);
    }

    public int getSize() {
        return size;
    }

    public void add(E e){
        if (size==element.length){
            ensureCapa();
        }
        element[size]=e;
        size++;
    }

    public E clone() {
        return (E) (element = Arrays.copyOf(element, size));
    }

    public void remove(int index){
        for (int i=index; i<element.length-1; i++){
            element[i]=element[i+1];
        }
//        int newSize=element.length-1;
//        element= Arrays.copyOf(element, newSize);
    }
    public E get(int i) {
        if (i>= size || i <0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i );
        }
        return (E) element[i];
    }

    public boolean contains(E o) {
        for (int i = 0; i < size; i++) {
            if (o.equals(element[i])) return true;
        }
        return false;
    }

    public int indexOf(E o) {
        for (int i = 0; i < size; i++) {
            if (o.equals(element[i])) return i;
        }
        return -1;
    }

    public void ensureCapacity(int minCapacity) {
        element = Arrays.copyOf(element, minCapacity);
    }

    public void clear() {
        element = new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    public void printList() {
        for (Object element : element
        ) {
            System.out.println(element);
        }
    }
}
