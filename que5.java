public class Q5 {
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

    public static Integer dequeue() {
        if (front == -1 || front > rear) {
            System.out.println("Queue Underflow");
            return null;
        }
        int deleted = queue[front++];
        if (front > rear) {
            front = -1;
            rear = -1;
        }
        return deleted;
    }

    public static Integer getFront() {
        if (front == -1 || front > rear) {
            return null;
        }
        return queue[front];
    }

    public static Integer getRear() {
        if (front == -1 || front > rear) {
            return null;
        }
        return queue[rear];
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
        capacity = 5;
        queue = new int[capacity];

        enqueue(10);
        enqueue(20);
        enqueue(30);
        Integer deleted = dequeue();
        enqueue(40);
        enqueue(50);

        if (deleted != null) {
            System.out.println("Deleted Element: " + deleted);
        }
        display();

        Integer frontVal = getFront();
        Integer rearVal = getRear();
        if (frontVal != null && rearVal != null) {
            System.out.println("Front: " + frontVal);
            System.out.println("Rear: " + rearVal);
        }
    }
}
