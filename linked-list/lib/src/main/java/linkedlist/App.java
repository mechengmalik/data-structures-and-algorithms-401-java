// * This Java source file was generated by the Gradle 'init' task.
package linkedlist;


public class App {


    public static void main(String[] args) {
        LinkedList ls = new LinkedList();
        System.out.println(ls.toString());
        ls.insert(5);
        System.out.println(ls.toString());
        ls.insert(7);
        ls.insert(11);
        ls.insert(9);
        ls.insert(4);
        ls.append(5);
        ls.insertBefore(11,3);
        ls.insertAfter(9,50);

        System.out.println(ls.toString());

        System.out.println(ls.kth(5));
        System.out.println(ls.kth(1));
        System.out.println(ls.kth(15));




        System.out.println(ls.includes(14));
        System.out.println(ls.includes(7));
        System.out.println(ls.includes(11));






    }
}
