package com.musemo.controller.datastructure;

import com.musemo.model.VisitorModel;
import java.util.LinkedList;

/**
 * Custom implementation of a queue data structure for managing VisitorModel
 * objects. This queue is implemented using a LinkedList and supports basic
 * operations like enqueue, dequeue,and size checks
 *
 * @author Viom Shrestha 23048612
 */
public class CustomQueue {

    private LinkedList<VisitorModel> queueList; // Internal storage for the queue.
    private int capacity; // Maximum number of elements the queue can hold.

    /**
     * Constructs a CustomQueue with the specified capacity.
     *
     * @param capacity the maximum number of elements the queue can hold.
     * @throws IllegalArgumentException if the specified capacity is negative.
     */
    public CustomQueue(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("Capacity must be greater than zero.");
        }
        queueList = new LinkedList<>();
        this.capacity = capacity;
    }

    /**
     * Removes and returns the first element from the queue.
     *
     * @return the first StudentModel in the queue, or null if the queue is
     * empty.
     * @throws IllegalStateException if the queue is empty.
     */
    public VisitorModel deQueue() {
        try {
            return queueList.removeFirst();
        } catch (Exception ex) {
            throw new IllegalStateException("Cannot remove from empty queue."); // Indicates the queue is empty
        }

    }

    /**
     * Adds a new element to the end of the queue if it is not full.
     *
     * @param visitorModel the VisitorModel to be added to the queue.
     * @return the current size of the queue after the operation , or -1 if the
     * queue is full.
     */
    public int enQueue(VisitorModel visitorModel) {
        if (isFull()) {
            throw new IllegalStateException("Queue is full. No more visiotors for today."); // Indicates the queue is full.
        }
        queueList.addLast(visitorModel);
        return queueList.size();
    }

    /**
     * Returns the current size of the queue.
     *
     * @return the number of elements in the queue.
     */
    public int poll() {
        return queueList.size();
    }

    /**
     * Checks if the queue is full.
     *
     * @return true if the queue has reached its capacity, false otherwise.
     */
    public boolean isFull() {
        return queueList.size() == capacity;
    }

    /**
     * Returns a list representation of the queue for external access.
     *
     * @return a list containing all elements in the queue.
     */
    public LinkedList<VisitorModel> getQueueList() {
        return new LinkedList<>(queueList); // Returns a copy of the internal queue
    }

}
