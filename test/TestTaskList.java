import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

public class TestTaskList {

    @Test
    public void testAdd() {
        TaskList taskList = new MyTaskList();
        taskList.addTask("Clean dishes");

        assertEquals(1, taskList.getNumberOfTasks());
    }

    @Test
    public void testRemove() {
        TaskList taskList = new MyTaskList();
        taskList.addTask("Wash clothes");

        taskList.removeTask(0);
        assertEquals(0, taskList.getNumberOfTasks());
    }

    @Test
    public void testGetAllTask() {
        TaskList taskList = new MyTaskList();
        taskList.addTask("Take toys from the floor");
        taskList.addTask("Make your bed");

        assertEquals(2, taskList.getAllTasks().size());
    }

    @Test
    public void testContainsTask() {
        TaskList taskList = new MyTaskList();
        taskList.addTask("Remove dust");

        assertTrue(taskList.containsTask("Remove dust"));
        assertFalse(taskList.notContainsTask("XXX"));
    }

    @Test
    public void testAddAllTasks() {
        TaskList taskList = new MyTaskList();
        taskList.addTask("Paint walls");

        TaskList taskList2 = new MyTaskList();
        taskList2.addTask("Use vacuum cleaner");

        taskList.addAllTasks(taskList2);
        assertEquals(2, taskList.getNumberOfTasks());
    }
}

