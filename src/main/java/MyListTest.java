public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> myList=new MyList<Integer>();

        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);

        for (int i=0; i< myList.getSize(); i++){
            System.out.println("Element "+i+ ": "+ myList.get(i));
        }

        myList.remove(1);

        for (int i=0; i< myList.getSize(); i++){
            System.out.println("Element "+i+ ": "+ myList.get(i));
        }
    }
}
