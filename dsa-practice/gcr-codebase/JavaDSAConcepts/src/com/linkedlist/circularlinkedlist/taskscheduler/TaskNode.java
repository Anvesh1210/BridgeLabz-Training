package com.linkedlist.circularlinkedlist.taskscheduler;

//class to represent a Task
public class TaskNode {
	int taskId;
    String taskName;
    int priority;
    TaskNode next;

    //constructor to initialize a task
    TaskNode(int taskId, String taskName, int priority) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.priority = priority;
        this.next = null;
    }
}
