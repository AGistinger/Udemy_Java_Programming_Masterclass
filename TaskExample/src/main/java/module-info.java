module com.task_example.taskexample {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.task_example.taskexample to javafx.fxml;
    exports com.task_example.taskexample;
}