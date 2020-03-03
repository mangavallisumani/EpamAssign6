package collections;

public class List {
	public static void main(String[] args) 
    {
        CustomList<String> list = new  CustomList<>();
        list.add("Hari");
        list.add("Kiran");
        list.add("Madhu");
        list.add("4");
        System.out.println("Size of list: "+list.size());
        System.out.println("Elements in list: "+list);
        list.remove(3);
        System.out.println("Elements after removing index 2 elements: "+list);
        list.add("Bavya");
        list.add("Geetu");
        System.out.println("Elements after adding one element: "+list);
        System.out.println("Element at index 1: "+list.get(1));
        System.out.println("Element at index 0: "+list.get(0));
        System.out.println("Size of list: "+list.size());
    }

}
