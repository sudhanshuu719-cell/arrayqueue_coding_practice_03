public class Q4 {
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

    public static Integer getRear() {
        if (front == -1 || front > rear) {
            System.out.println("Queue Underflow");
            return null;
        }
        return queue[rear];
    }

    public static void main(String[] args) {
        capacity = 5;
        queue = new int[capacity];
        int[] elements = {5, 10, 15, 20, 25};

        for (int i = 0; i < elements.length; i++) {
            enqueue(elements[i]);
        }

        Integer rearElement = getRear();
        if (rearElement != null) {
            System.out.println("Rear Element: " + rearElement);
        }
    }
}
