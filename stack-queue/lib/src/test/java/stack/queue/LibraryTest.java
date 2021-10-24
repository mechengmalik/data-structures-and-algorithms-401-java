/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package stack.queue;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {

    @Test void testCanPush(){
        Stack<String> stack = new Stack<>();
        stack.push("1");
        stack.push("2");
        String str = "{2}->{1}->NUll";
        assertEquals(str,stack.toString());
    }
    @Test void testPop() throws Exception {
        Stack<String> stack =new Stack<>();
        stack.push("1");
        stack.push("2");
        stack.pop();
        stack.pop();

        assertEquals("the stack is empty",stack.toString());

    }
    @Test void testPeek() throws Exception {
        Stack<String> stack =new Stack<>();
        stack.push("1");
        stack.push("2");
        System.out.println(stack.peek().toString());
        assertEquals("2",stack.peek());



    }
    @Test void testExceptionForEmptyStack() throws Exception {
        Stack stack =new Stack();
        //Can successfully instantiate an empty stack
        assertNotNull(stack);


        //Calling pop or peek on empty stack raises exception
        try {
            stack.pop();
        }catch (Exception e){
            assertEquals(e.getMessage(),"can`t be deleted from empty stack");
        }
        try {
            stack.peek();
        }catch (Exception e){
            assertEquals(e.getMessage(),"can`t be located the data is empty");
        }



    }
    //---------------------for Queue--------------------
    @Test void testQueue() throws Exception {
        Queue queue = new Queue();
        //1
        //Can successfully instantiate an empty queue
        assertNotNull(queue);
        //2
        //Calling dequeue or peek on empty queue raises exception
        try {
            queue.dequeue();
        }catch (Exception e){
            assertEquals(e.getMessage(),"can`t delete cause the queue is empty");
        }
        try{
            queue.peek();

        }catch (Exception e){
            assertEquals(e.getMessage(),"Queue is Empty");
        }


    }
    @Test void testEnqueueToQueue() throws Exception {
        Queue<String> queue = new Queue<String>();
        queue.enqueue("1");
        queue.enqueue("2");

        assertEquals("{1}->{2}->NUll",queue.toString());





    }
    @Test void testDequeueFromQueue() throws Exception {

            Queue<String> queue =new Queue<>();
            queue.enqueue("1");
            queue.enqueue("2");
            queue.dequeue();
            queue.dequeue();
        System.out.println(queue.size);
            assertEquals("the queue is empty",queue.toString());
    }

    @Test void testPeekQueue() throws Exception {
        Queue<String> queue =new Queue<String>();
        queue.enqueue("1");
        queue.enqueue("2");
        System.out.println(queue.peek().toString());
        assertEquals("2",queue.peek());



    }

    @Test void stackQueuePsudo() {


        // testing that its enqueue properly
        PseudoQueue test = new PseudoQueue<>();
        test.enqueue("5");
        Object str= test.dequeue();
        assertEquals("5",str);
    }

    @Test void errorTestForStackedQueue() {

        PseudoQueue test = new PseudoQueue<>();

        String errorMsg = test.dequeue();
        assertEquals("the Queue is empty", errorMsg);

    }




}
