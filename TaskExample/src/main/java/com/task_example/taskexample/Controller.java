package com.task_example.taskexample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.concurrent.Service;
import javafx.concurrent.Task;
import javafx.concurrent.Worker;
import javafx.concurrent.WorkerStateEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.ProgressBar;

public class Controller {
//    private Task<ObservableList<String>> task;
    @FXML
    private ListView<String> listView;
    @FXML
    private ProgressBar progressBar;
    @FXML
    private Label progressLabel;
    private Service<ObservableList<String>> service;

    public void initialize() {
//        task = new Task<ObservableList<String>>() {
//            @Override
//            protected ObservableList<String> call() throws Exception {

//                String[] names = {
//                        "Tim Bulchalka",
//                        "Bill Rodgers",
//                        "Jack Jill",
//                        "Joan Andrews",
//                        "Mary Johnson",
//                        "Bob McDonald"
//                };
//
//                ObservableList<String> employees = FXCollections.observableArrayList();
//
//                for(int i=0; i < names.length; i++) {
//                    employees.add(names[i]);
//                    updateMessage("Added " + names[i] + " to the list");
//                    updateProgress(i + 1, names.length);
//                    Thread.sleep(200);
//                }
//
//                return employees;
//            }
//        };
        service = new EmployeeService();
        listView.itemsProperty().bind(service.valueProperty()); // data binding
        progressBar.progressProperty().bind(service.progressProperty()); // data binding
        progressLabel.textProperty().bind(service.messageProperty()); // data binding

//        service.setOnRunning(new EventHandler<WorkerStateEvent>() {
//            @Override
//            public void handle(WorkerStateEvent workerStateEvent) {
//                progressBar.setVisible(true);
//                progressLabel.setVisible(true);
//            }
//        });
//
//        service.setOnSucceeded(new EventHandler<WorkerStateEvent>() {
//            @Override
//            public void handle(WorkerStateEvent workerStateEvent) {
//                progressBar.setVisible(false);
//                progressLabel.setVisible(false);
//            }
//        });
//
//        progressBar.setVisible(false);
//        progressLabel.setVisible(false);

        progressBar.visibleProperty().bind(service.runningProperty());
        progressLabel.visibleProperty().bind(service.runningProperty());
    }

    @FXML
    public void buttonPressed() {
        if (service.getState() == Service.State.SUCCEEDED) {
            service.reset();
            service.start();
        } else if (service.getState() == Service.State.READY) {
            service.start();
        }
    }
}