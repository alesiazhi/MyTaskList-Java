public class Main {

    public static void main(String[] args) {

        MyTaskList myTaskList = new MyTaskList();
        myTaskList.addTask("Clean your room");
        myTaskList.addTask("Cook dinner");
        myTaskList.addTask("Wash clothes");
        System.out.println(myTaskList.getAllTasks());
        System.out.println("Number of tasks: " + myTaskList.getNumberOfTasks());

        myTaskList.removeTask(1);
        System.out.println(myTaskList.getAllTasks());
        System.out.println(myTaskList.getNumberOfTasks());
        myTaskList.addTask("Go to the shop");
        System.out.println(myTaskList.getAllTasks());
        System.out.println(myTaskList.getNumberOfTasks());

        System.out.println(myTaskList.getTask(0));
        System.out.println(myTaskList.containsTask("Clean your room"));
        System.out.println(myTaskList.containsTask("lll"));
        System.out.println(myTaskList.notContainsTask("Go to the shop"));
        System.out.println(myTaskList.notContainsTask("vvv"));

        MyTaskList newMyTaskList = new MyTaskList();
        newMyTaskList.addTask("Jump on your bed");
        newMyTaskList.addTask("Eat candies");

        myTaskList.addAllTasks(newMyTaskList);
        for (String task: myTaskList.getAllTasks()){
            System.out.println("Formated: " + task);
        }
    }
}
