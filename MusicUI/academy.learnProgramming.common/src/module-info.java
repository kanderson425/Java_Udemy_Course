module academy.learnProgramming.common {
    requires javafx.controls;
    requires sqlite.jdbc;
    requires java.sql;
    requires javafx.fxml;
    requires javafx.base;

    exports academy.learnProgramming.common;
    exports academy.learnProgramming.ui to javafx.graphics, javafx.fxml;
    opens academy.learnProgramming.ui to javafx.fxml;
    opens academy.learnProgramming.common to javafx.base;


}