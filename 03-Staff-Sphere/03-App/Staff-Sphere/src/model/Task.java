//==========================================================
// File Name: Task.java
// Subject  : Class Task that emulates the employee's tasks.
// Date     : Jan 6, 2025
// Author   : Alsayed A. Khaleel
//==========================================================

package model;

import java.time.LocalDate;

public class Task // class declaration
{
	// instance variables.
	private long taskID;
	private long empID;
	private String taskName;
	private TaskStatus taskStatus;
	private LocalDate startDate;
	private LocalDate deadline;
	private String taskDescription;
	
	// no-arg ctor.
	public Task() {}
	
	// overloaded ctor.
	public Task(long empID, long taskID, String taskName, TaskStatus taskStatus,
			    LocalDate deadline, String taskDescription)
	{
		setEmpID(empID);
		setTaskID(taskID);
		setTaskName(taskName);
		setTaskStatus(taskStatus);
		setStartDate(LocalDate.now());
		setDeadline(deadline);
		setTaskDescription(taskDescription);
	}
	
	
	// task id.
	public long getTaskID() { return taskID; }
	public void setTaskID(long taskID) throws IllegalArgumentException
	{
		if(taskID <= 0)
			throw new IllegalArgumentException("["+ taskID +"] Invalid value.");
		
		this.taskID = taskID;
	}
	
	
	// task name.
	public String getTaskName() { return taskName; }
	public void setTaskName(String taskName) { this.taskName = taskName; }
	
	
	// task status.
	public TaskStatus getTaskStatus() { return taskStatus; }
	public void setTaskStatus(TaskStatus taskStatus) { this.taskStatus = taskStatus; }
	
	
	// start date.
	public LocalDate getStartDate() { return startDate; } 
	public void setStartDate(LocalDate startDate) { this.startDate = startDate; }
	
	
	// end date, deadline.
	public LocalDate getDeadline() { return deadline; }
	public void setDeadline(LocalDate deadline) { this.deadline = deadline; }
	
	
	// task description.
	public String getTaskDescription() { return taskDescription; }
	public void setTaskDescription(String taskDescription) { this.taskDescription = taskDescription; }
	
	
	// employee ID.
	public long getEmpID() { return empID; }
	public void setEmpID(long empID)
	{
		/*
		 * Database connection and searching
		 * for the empID must be here. 
		 */
		
		this.empID = empID;
	}
	
	// called if the object called by %s.
	@Override
	public String toString()
	{
		return String.format("Task ID    : %d%n"+
							 "Task Name  : %s%n"+
							 "Start Date : %s%n"+
							 "Deadline   : %s%n"+
							 "Employee ID: %d%n"+
							 "Description:%n%s%n",
							 getTaskID(), getTaskName(), getStartDate().toString(),
							 getDeadline().toString(), getEmpID(), getTaskDescription());
	}
}

