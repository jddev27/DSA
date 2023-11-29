package DataStructures.queue;

public class Main {
    public static void main(String[] args) {
        Queue myqueue = new Queue(1);
        myqueue.printQueue();

        myqueue.enqueue(2);
        myqueue.enqueue(3);
        myqueue.enqueue(4);

        System.out.println("--------After enqueue---------");
        myqueue.printQueue();

        myqueue.dequeue();
        myqueue.dequeue();

        System.out.println("--------After dequeue---------");
        myqueue.printQueue();

    }
}
