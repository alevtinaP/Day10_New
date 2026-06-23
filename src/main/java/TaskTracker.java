import java.util.ArrayList;
import java.util.List;

public class TaskTracker {
    private List<Task> tasks;

    public TaskTracker() {
        this.tasks = new ArrayList<>();
    }

    public void addTask(String title) {
        tasks.add(new Task(title));
        System.out.println("Задача " + title + "добавлена");
    }

    public void printAllTask() {
        for (Task task : tasks) {
            task.printInfo();
        }
    }

    public void completeTask(String title) {
        for (Task task : tasks) {
            if (task.getTitle().equalsIgnoreCase(title)) {
                task.complete();
                System.out.println("Задача" + title + "готова");
            }
        }
    }

    public void checkTaskStatus(String title) {
        for (Task task : tasks) {
            if (task.getTitle().equalsIgnoreCase(title)) {
                if (task.isCompleted()) {
                    System.out.println("Задача" + title + "готова");
                } else {
                    System.out.println("Задача" + title + " не готова");
                }
            }
            return;
        }
    }

    //Статистика
    public void printStatistic() {
        int total = tasks.size();
        int completed = 0;

        for (Task task : tasks) {
            if (task.isCompleted()) {
                completed++;
            }
        }

        int open = total - completed;

        System.out.println("==============СТАТИСТИКА============");
        System.out.println("Всего задач: " + total);
        System.out.println("Всего выполненных задач: " + completed);
        System.out.println("Всего НЕ выполненных задач: " + open);

    }
}


