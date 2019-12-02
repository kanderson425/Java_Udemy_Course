package com.kyleanderson.todolist.datamodel;

import java.time.format.DateTimeFormatter;
import java.util.List;

public class TodoData {
    private static TodoData instance = new TodoData();
    private static String filename = "TodoListItems.txt";

    private List<TodoItem> todoItems;
    private DateTimeFormatter formatter;

    public static TodoData getInstance() {
        return instance;
    }

    private TodoData() {
        formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    }
}
