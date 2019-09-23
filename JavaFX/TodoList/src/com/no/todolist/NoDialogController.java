package com.no.todolist;

import com.no.todolist.datamodel.NoTodoData;
import com.no.todolist.datamodel.NoTodoItem;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.time.LocalDate;

public class NoDialogController {
    @FXML
    private TextField shortDescriptionField;
    @FXML
    private TextArea detailsArea;
    @FXML
    private DatePicker deadlinePicker;

    public NoTodoItem processResults() {
        String shortDescription = shortDescriptionField.getText().trim();
        String details = detailsArea.getText().trim();
        LocalDate deadlinValue = deadlinePicker.getValue();

        NoTodoItem newItem = new NoTodoItem(shortDescription, details, deadlinValue);
        NoTodoData.getInstance().addTodoItem(newItem);
        return newItem;
    }
}
