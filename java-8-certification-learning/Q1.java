import java.util.ArrayList;
public class Q1{
    public static void main(String args[]){
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>(10);
        ArrayList<String> list3 = list2;

        list1.add("List 1 - 1st Value");
        list1.add("List 1 - 2nd Value");

        list2.add("List 2 - 1st value");
        list3.add("List 3 - 1st value");
        list3.add("List 3 - 2nd value");
        list3.add("List 3 - 3rd value");
        list3.add("List 3 - 4th value");
        list3.add("List 3 - 5th value");
        System.out.println(list3.set(5, "List3 Replace"));
        System.out.println("-- List 1 --");
        for(String a: list1){
            System.out.println(a);
        }
        System.out.println("-- List 2 --");
        for(String a: list2){
            System.out.println(a);
        }
        System.out.println("-- List 3 --");
        for(String a: list3){
            System.out.println(a);
        }
    }

}