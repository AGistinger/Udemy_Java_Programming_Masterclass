module com.todo_list.todolist {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.todo_list.todolist to javafx.fxml;
    exports com.todo_list.todolist;
}