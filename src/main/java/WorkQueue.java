public class WorkQueue<T> implements Queue<T> {

    private Object[] queue;
    private int rear = 0;
    private int front = 0;

    public WorkQueue(int capacity) {
        queue = new Object[capacity];
    }

    public boolean isEmpty() {
        return rear == front;
    }

    public T getFrontElement() {
        return null;
    }

    public T getRearElement() {
        return (T) queue[rear];
    }

    public void put(T payload) {
        rear = (rear + 1) % queue.length;
        queue[rear] = payload;

    }

    public T remove() {
        return null;
    }
}
