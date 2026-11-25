public class Q3 {
    private static int[] queue;
    private static int front = -1;
    private static int rear = -1;
    private static int capacity;

    public static void enqueue(int data) {
        if (rear == capacity - 1) {
            System.out.println("Queue Overflow");
            return;
        }
        if (front == -1) {
            front = 0;
        }
        queue[++rear] = data;
    }

    public static Integer getFront() {
        if (front == -1 || front > rear) {
            System.out.println("Queue Underflow");
            return null;
        }
        return queue[front];
    }

    public static void main(String[] args) {
        capacity = 5;
        queue = new int[capacity];
        int[] elements = {15, 25, 35, 45, 55};

        for (int i = 0; i < elements.length; i++) {
            enqueue(elements[i]);
        }

        Integer frontElement = getFront();
        if (frontElement != null) {
            System.out.println("Front Element: " + frontElement);
        }
    }
}
