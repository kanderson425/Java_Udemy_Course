module academy.learnProgramming.common {
    requires javafx.controls;
    requires sqlite.jdbc;
    requires java.sql;


    exports academy.learnProgramming.common;
    opens academy.learnProgramming.common to javafx.base;


}