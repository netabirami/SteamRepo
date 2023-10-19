package org.example.QueueExcises;

import java.util.ArrayList;
import java.util.List;



public class CustomQueue {
    private List<Integer> items = new ArrayList<>(1);
    private int front = -1;
    private int back = -1;

    public boolean isEmpty() {
        return front == -1;
    }

    public void enQueue(int itemValue) {
        items.add(itemValue);
        if (front == -1) {
            front = 0;
        }
        back = items.size() - 1;
    }

    public void deQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Nothing to dequeue");
        } else {
            items.remove(0);
            if (items.isEmpty()) {
                front = back = -1;
            }
        }
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            for (int i = front; i <= back; i++) {
                System.out.print(items.get(i) + " ");
            }
            System.out.println();
        }
    }

    public void peak() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("Front item: " + items.get(front));
        }
    }
}

