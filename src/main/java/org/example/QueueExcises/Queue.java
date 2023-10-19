package org.example.QueueExcises;

public class Queue {
    public static void main(String[] args) {

        CustomQueue queue = new CustomQueue();

        queue .enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);
        queue.enQueue(4);
        queue.display();

        queue.deQueue();
        queue.display();

        queue.enQueue(1);
        queue.display();

        queue.enQueue(5);
        queue.peak();

    }

}

