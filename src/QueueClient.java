public class QueueClient {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue(9);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(12);
        queue.enqueue(23);
        queue.dequeue();
    }
}
