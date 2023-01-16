package ss11_dsa_cstack_queueu.bai_tap.implement_queue_using_circular_linked_list;

public class UsingCircleLinkedList {
    public static class Node {
        private int data;
        private Node link;
    }

    static class Queue {
        Node front;
        Node rear;
    }

    static void enQueue(Queue q, int value) {
        Node temp = new Node();
        temp.data = value;
        if (q.front == null) {
            q.front = temp;
        } else {
            q.rear.link = q.front;
        }
    }

    static int deQueue(Queue q) {
        int value;
        if (q.front == null) {
            System.out.println("isEmpty");
            return Integer.MIN_VALUE;
        } else if (q.front == q.rear) {
            value = q.front.data;
            q.front = null;
            q.rear = null;
        } else {
            Node temp = q.front;
            value = temp.data;
            q.front = q.front.link;
            q.rear.link = q.front;
        }
        return value;
    }

    static void displayQueue(Queue q) {
        Node temp = q.front;
        System.out.print("Element in Circular Queue: ");
        while (temp.link != q.front) {
            System.out.printf("%d", temp.data);
            temp = temp.link;
        }
        System.out.printf("%d", temp.data);
    }

    public static void main(String[] args) {
        Queue q = null;
        assert false;
        q.front = q.rear = null;
        enQueue(q, 4);
        enQueue(q, 6);
        enQueue(q, 3);
        displayQueue(q);
        System.out.printf("Deleted value = %d", deQueue(q));
        System.out.printf("Deleted value = %d", deQueue(q));
        displayQueue(q);
        enQueue(q, 2);
        enQueue(q, 1);
        displayQueue(q);
    }
}

