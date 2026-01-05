package com.linkedlist.circularlinkedlist.roundrobinschedulingalgorithm;

import java.util.Scanner;

public class RoundRobinScheduling {
	public static void main(String[] args) {
		//creating Scanner objects
        Scanner sc = new Scanner(System.in);
        RoundRobinScheduler rr = new RoundRobinScheduler();

        //taking user number of process
        System.out.print("Enter number of processes: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("PID: ");
            int pid = sc.nextInt();
            System.out.print("Burst Time: ");
            int bt = sc.nextInt();
            System.out.print("Priority: ");
            int p = sc.nextInt();

            rr.addProcess(pid, bt, p);
        }

        //taking time Quantum
        System.out.print("Enter Time Quantum: ");
        int tq = sc.nextInt();
        
        rr.execute(tq);
        //closing scanner object
        sc.close();
    }
}
