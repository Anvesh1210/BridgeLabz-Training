package com.multithreading.threadstatemonitoring;

public class StateMonitor extends Thread {
	private TaskRunner[] tasks;

	StateMonitor(TaskRunner[] tasks) {
		this.tasks = tasks;
	}

	@Override
	public void run() {
		boolean running = true;

		while (running) {
			running = false;
			for (TaskRunner t : tasks) {
				System.out.println("[Monitor] " + t.getName() + " is in " + t.getState() + " state");
				if (t.getState() != Thread.State.TERMINATED) {
					running = true;
				}
			}
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
	}
}
