import java.util.ArrayList;
import java.util.List;

public class MyTaskList implements TaskList {

    private List<String> tasks;

    public MyTaskList() {
        this.tasks = new ArrayList<>();
    }

    @Override
    public void addTask(String task) {
        tasks.add(task);
    }

    @Override
    public void removeTask(int taskIndex) {
        tasks.remove(taskIndex);
    }

    @Override
    public int getNumberOfTasks() {
        return tasks.size();
    }

    @Override
    public List<String> getAllTasks() {
        return this.tasks;
    }

    @Override
    public String getTask(int taskIndex) {
        return tasks.get(taskIndex);
    }

    @Override
    public boolean containsTask(String task) {
        return tasks.contains(task);
    }

    @Override
    public boolean notContainsTask(String task) {
        return !tasks.contains(task);
    }

    @Override
    public void addAllTasks(TaskList taskList) {
        tasks.addAll(taskList.getAllTasks());
    }
}
