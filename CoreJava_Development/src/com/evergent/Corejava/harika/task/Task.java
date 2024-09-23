package com.evergent.Corejava.harika.task;

public class Task {
	private int taskId;
	private String taskName;
	private String taskStatus;
	
	public void settaskId(int taskId) {
		this.taskId = taskId;
	}
	public int gettaskId() {
		return taskId;
	}
	public void settaskName(String taskName) {
		this.taskName = taskName;
	}
	public String gettaskName() {
		return taskName;
	}
	public void settaskStatus(String taskStatus) {
		this.taskStatus = taskStatus;
	}
	public String gettaskStatus() {
		return taskStatus;
	}
}
