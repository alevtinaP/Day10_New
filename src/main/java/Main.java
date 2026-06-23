public class Main {
    static void main(String[] args) {
        TaskTracker tracker = new TaskTracker();

//добавление задач
        tracker.addTask(" Проснуться ");
        tracker.addTask(" Сделать кофе ");
        tracker.addTask(" Выпить кофе ");
        tracker.addTask(" Включить комп ");
        tracker.addTask(" Проверить почту ");
        tracker.addTask(" Проверить почту 222222");

        //вывод всех задач
        tracker.printAllTask();

        //проверка статуса
        tracker.checkTaskStatus(" Проснуться ");

        //изменение статуса
        tracker.completeTask(" Выпить кофе ");

        tracker.printAllTask();
        tracker.printStatistic();

    }
}