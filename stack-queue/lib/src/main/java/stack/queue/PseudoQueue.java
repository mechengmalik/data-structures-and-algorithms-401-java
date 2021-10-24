package stack.queue;

public class PseudoQueue<T> {
    Stack stack1 = new Stack();
    Stack stack2 = new Stack();

    public void enqueue(T value)  {

            while(! stack1.isEmpty()){
                stack2.push(stack1.pop());

        }

        stack1.push(value);


            while (! stack2.isEmpty()){
                stack1.push((stack2.pop()));
            }

    }

    public   String dequeue()
    {
        if (stack1.isEmpty())
        {
            System.out.println("Queue is empty");
            System.exit(0);
        }

        String x = stack1.peek();
        stack1.pop();
        return x;
    }


    @Override
    public String toString() {
        return "PseudoQueue{" +
                "stack1=" + stack1 +
                ", stack2=" + stack2 +
                '}';
    }
}
