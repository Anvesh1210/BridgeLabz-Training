package com.linkedlist.circularlinkedlist.roundrobinschedulingalgorithm;

public class RoundRobinScheduler {
	
	private ProcessNode head;
	private ProcessNode tail;
	private int time = 0;
	private int processCount = 0;

	// Add process at end
	void addProcess(int pid, int burst, int priority) {
	ProcessNode p = new ProcessNode(pid, burst, priority);
        if (head == null) {
            head = tail = p;
            p.next = head;
        } else {
            tail.next = p;
            p.next = head;
            tail = p;
        }
        processCount++;
    }

    // Execute Round Robin
    void execute(int quantum) {
        if (head == null) return;
        ProcessNode curr = head;
        ProcessNode prev = tail;

        while (processCount > 0) {
            if (curr.remainingTime > 0) {
                int execTime = Math.min(quantum, curr.remainingTime);
                curr.remainingTime -= execTime;
                time += execTime;
                ProcessNode temp = head;
                do {
                    if (temp != curr && temp.remainingTime > 0)
                        temp.waitingTime += execTime;
                    	temp = temp.next;
                } while (temp != head);

                if (curr.remainingTime == 0) {
                    curr.turnaroundTime = time;
                    removeProcess(curr, prev);
                    curr = prev.next;
                    continue;
                }
            }

            prev = curr;
            curr = curr.next;

            displayProcesses();
        }
        displayAverages();
    }

    // Remove completed process
    private void removeProcess(ProcessNode curr, ProcessNode prev) {
        if (curr == head && curr == tail) {
            head = tail = null;
        } else {
            prev.next = curr.next;
            if (curr == head) head = curr.next;
            if (curr == tail) tail = prev;
        }
        processCount--;
    }

    // Display processes
    void displayProcesses() {
        if (head == null) {
            System.out.println("No processes remaining");
            return;
        }
        ProcessNode t = head;
        System.out.print("Queue: ");
        do {
            System.out.print("[PID " + t.pid + " | RT " + t.remainingTime + "] ");
            t = t.next;
        } while (t != head);
        System.out.println();
    }

    // Display averages
    private void displayAverages() {
        double totalWT = 0, totalTAT = 0;
        ProcessNode t = head;
        if (t == null) {
            System.out.println("\nScheduling Completed");
            return;
        }

        do {
            totalWT += t.waitingTime;
            totalTAT += t.turnaroundTime;
            t = t.next;
        } while (t != head);
        System.out.println("\nAverage Waiting Time: " + (totalWT / processCount));
        System.out.println("Average Turnaround Time: " + (totalTAT / processCount));
    }
}
