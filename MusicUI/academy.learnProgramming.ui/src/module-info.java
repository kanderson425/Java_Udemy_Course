module academy.learnProgramming.ui {
    requires academy.learnProgramming.common;
    requires javafx.fxml;
    requires javafx.base;
    requires academy.learnProgramming.db;
    requires javafx.graphics;
    requires javafx.controls;

    exports ui to javafx.graphics, javafx.fxml;
    opens ui to javafx.fxml;


}