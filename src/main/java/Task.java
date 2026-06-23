public class Task {
    private String title;
    private boolean isCompleted;

    //Создаем конструктор класса
    public Task(String title) {
        this.title = title;
        this.isCompleted = false;
    }

    //метод помечает задачу как выполнена
    public void complete() {
        this.isCompleted = true;
    }

    //метод получает статус задачи
    public boolean isCompleted() {
        return isCompleted;
    }

    //метод получает название задачи
    public String getTitle() {
        return title;
    }

    //Выводим информацию о задаче
    public void printInfo() {
        String status = isCompleted ? "[x]" : "[ ]";
        System.out.println(status + " " + title);
    }
}