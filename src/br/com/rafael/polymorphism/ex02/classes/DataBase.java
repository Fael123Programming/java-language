package br.com.rafael.polymorphism.ex02.classes;

import br.com.rafael.polymorphism.ex02.interfaces.IDAO;

public class DataBase implements IDAO {
    private static DataBase instance;

    private DataBase(){}

    public synchronized static DataBase getInstance() {
        if (instance == null)
            instance = new DataBase();
        return instance;
    }

    @Override
    public void save() {
        System.out.println("Data was saved into a database");
    }
}
