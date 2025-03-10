package beans;

import java.util.Objects;

public class Task {
	private int taskid;
	private String taskname;
	private String taskdate;
	private int taskStatus;
	private int regid;
	
	public Task() {
		
	}

	@Override
	public int hashCode() {
		return Objects.hash(regid, taskdate, taskid, taskname, taskStatus);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Task other = (Task) obj;
		return regid == other.regid && Objects.equals(taskdate, other.taskdate) && taskid == other.taskid
				&& Objects.equals(taskname, other.taskname) && taskStatus == other.taskStatus;
	}

	@Override
	public String toString() {
		return "Task [taskid=" + taskid + ", taskname=" + taskname + ", taskdate=" + taskdate + ", taskStatus="
				+ taskStatus + ", regid=" + regid + "]";
	}

	public int getTaskid() {
		return taskid;
	}

	public void setTaskid(int taskid) {
		this.taskid = taskid;
	}

	public String getTaskname() {
		return taskname;
	}

	public void setTaskname(String taskname) {
		this.taskname = taskname;
	}

	public String getTaskdate() {
		return taskdate;
	}

	public void setTaskdate(String taskdate) {
		this.taskdate = taskdate;
	}

	public int getTaskStatus() {
		return taskStatus;
	}

	public void setTaskStatus(int taskStatus) {
		this.taskStatus = taskStatus;
	}

	public int getRegid() {
		return regid;
	}

	public void setRegid(int regid) {
		this.regid = regid;
	}

	public Task(int taskid, String taskname, String taskdate, int taskStatus, int regid) {
		super();
		this.taskid = taskid;
		this.taskname = taskname;
		this.taskdate = taskdate;
		this.taskStatus = taskStatus;
		this.regid = regid;
	}

}
