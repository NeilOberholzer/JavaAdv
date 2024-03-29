package com.no.todolist.datamodel;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Iterator;

public class NoTodoData {
    private static NoTodoData instance = new NoTodoData();
    private static String filename = "TodoListItems.txt";


    private ObservableList<NoTodoItem> todoItems;
    private DateTimeFormatter formatter;

    public static NoTodoData getInstance() {
        return instance;
    }

    private NoTodoData() {
        formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    }

    public ObservableList<NoTodoItem> getTodoItems() {
        return todoItems;
    }

    public void addTodoItem(NoTodoItem item){
        todoItems.add(item);
    }

//    public void setTodoItems(List<NoTodoItem> todoItems) {
//        this.todoItems = todoItems;
//    }
//
    public void loadTodoItems() throws IOException {

        todoItems = FXCollections.observableArrayList();
        Path path = Paths.get(filename);
        BufferedReader br = Files.newBufferedReader(path);

        String input;

        try {
            while ((input = br.readLine()) != null) {
                String[] itemPieces = input.split("\t");

                String shortDescription = itemPieces[0];
                String details = itemPieces[1];
                String dateString = itemPieces[2];

                LocalDate date = LocalDate.parse(dateString, formatter);
                NoTodoItem todoItem = new NoTodoItem(shortDescription, details, date);
                todoItems.add(todoItem);
            }

        } finally {
            if(br != null) {
                br.close();
            }
        }
    }

    public void storeTodoItems() throws IOException {

        Path path = Paths.get(filename);
        BufferedWriter bw = Files.newBufferedWriter(path);
        try {
            Iterator<NoTodoItem> iter = todoItems.iterator();
            while(iter.hasNext()) {
                NoTodoItem item = iter.next();
                bw.write(String.format("%s\t%s\t%s",
                        item.getShortDescription(),
                        item.getDetails(),
                        item.getDeadline().format(formatter)));
                bw.newLine();
            }

        } finally {
            if(bw != null) {
                bw.close();
            }
        }
    }

    public void deleteTodoItem(NoTodoItem item) {
        todoItems.remove(item);
    }
}
