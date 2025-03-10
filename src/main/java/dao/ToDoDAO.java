package dao;

import java.util.List;

import beans.Register;
import beans.Task;

public interface ToDoDAO {
	public int register(Register register);
	public int login(String email, String pass);
	public List<Task> findTasksByRegid(int regid);
	public int addTask(Task task, int regid);
	public boolean markTaskCompleted(int taskid, int regid);
	public String getFLNameByRegID(int regid);

}
