public class Q1 {
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

    public static void display() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.print("Queue: ");
        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i]);
            if (i < rear) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int n = 5;
        capacity = n;
        queue = new int[capacity];
        int[] elements = {10, 20, 30, 40, 50};

        for (int i = 0; i < n; i++) {
            enqueue(elements[i]);
        }
        display();
    }
}
