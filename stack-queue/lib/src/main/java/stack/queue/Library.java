/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package stack.queue;


import org.checkerframework.checker.units.qual.C;

public class Library {
    public static void main(String[] args) throws Exception {
//        Stack  s1 = new Stack();
//        s1.push("5");
//        s1.push("7");
//        s1.push("9");
//        System.out.println(s1.toString());
//        System.out.println(s1.isEmpty());
//        s1.pop();
//        System.out.println(s1.peek());
//
//
//        Queue queue = new Queue();
//
//        queue.enqueue("1");
//        queue.enqueue("2");
//        queue.enqueue("3");
//        System.out.println(queue.toString());
//        System.out.println(queue.peek());
//   System.out.println(queue.dequeue());
//        System.out.println(queue.isEmpty());

        AnimalShelter animal = new AnimalShelter();

        Dog dog1 = new Dog("dog");
        Dog dog2 = new Dog("dog2");
        Cat cat1 = new Cat("cat1");
        Cat cat2 = new Cat("cat2");

        animal.enqueue(dog1);
        animal.enqueue(dog1);
        animal.enqueue(cat1);
        animal.enqueue(cat2);
        System.out.println(animal.cat.size);
        System.out.println(animal.dog.size);
        System.out.println(animal.toString());
        System.out.println(animal.dog.front);











    }
}
