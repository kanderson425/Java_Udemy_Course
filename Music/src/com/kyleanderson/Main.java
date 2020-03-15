package com.kyleanderson;

import com.kyleanderson.Model.Datasource;

import javax.sql.DataSource;

public class Main {

    public static void main(String[] args) {
        Datasource datasource = new Datasource();
        if(!datasource.open()) {
            System.out.println("Can't open datasource");
            return;
        }
        datasource.close();

    }
}
