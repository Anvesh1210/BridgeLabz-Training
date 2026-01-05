package com.linkedlist.circularlinkedlist.taskscheduler;

public class TaskScheduler {

    private TaskNode head;
    private TaskNode tail;

    //method to add task at beginning
    void addAtBeginning(int id, String name, int priority) {
        TaskNode newNode = new TaskNode(id, name, priority);

        if (head == null) {
            head = tail = newNode;
            newNode.next = head;
            return;
        }

        newNode.next = head;
        tail.next = newNode;
        head = newNode;
    }

    //method to add task at end
    void addAtEnd(int id, String name, int priority) {
        TaskNode newNode = new TaskNode(id, name, priority);

        if (head == null) {
            head = tail = newNode;
            newNode.next = head;
            return;
        }

        tail.next = newNode;
        newNode.next = head;
        tail = newNode;
    }

    //method to remove task by ID
    void removeById(int id) {

        if (head == null) return;

        TaskNode curr = head;
        TaskNode prev = tail;

        do {
            if (curr.taskId == id) {

                if (curr == head) {
                    head = head.next;
                    tail.next = head;
                } else if (curr == tail) {
                    tail = prev;
                    tail.next = head;
                } else {
                    prev.next = curr.next;
                }
                return;
            }
            prev = curr;
            curr = curr.next;

        } while (curr != head);
    }

    //method to search task by ID
    void searchById(int id) {

        if (head == null) return;

        TaskNode temp = head;
        do {
            if (temp.taskId == id) {
                displayTask(temp);
                return;
            }
            temp = temp.next;
        } while (temp != head);

        System.out.println("Task not found");
    }

    //method to display all tasks
    void displayAll() {

        if (head == null) {
            System.out.println("No tasks available");
            return;
        }

        TaskNode temp = head;
        do {
            displayTask(temp);
            temp = temp.next;
        } while (temp != head);
    }

    //method to execute tasks in circular order
    void executeTasks(int cycles) {

        if (head == null) return;

        TaskNode temp = head;
        for (int i = 0; i < cycles; i++) {
            System.out.println("Executing Task -> " + temp.taskName);
            temp = temp.next;
        }
    }

    //method to display single task
    private void displayTask(TaskNode t) {
        System.out.println(
            "ID: " + t.taskId +
            ", Name: " + t.taskName +
            ", Priority: " + t.priority
        );
    }
}
