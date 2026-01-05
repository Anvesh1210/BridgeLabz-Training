package com.linkedlist.circularlinkedlist.roundrobinschedulingalgorithm;

//class represent Process Node
public class ProcessNode {
	
	//process id
	int pid;
	int burstTime;
	int remainingTime;
	int priority;
	int waitingTime;
	int turnaroundTime;
	ProcessNode next;

	//constructor to initialize process attributes
	ProcessNode(int pid, int burstTime, int priority) {
	    this.pid = pid;
	    this.burstTime = burstTime;
	    this.remainingTime = burstTime;
	    this.priority = priority;
	    this.next = null;
	}
}
