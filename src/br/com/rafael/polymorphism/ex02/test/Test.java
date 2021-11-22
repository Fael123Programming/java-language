package br.com.rafael.polymorphism.ex02.test;

import br.com.rafael.polymorphism.ex02.classes.*;
import br.com.rafael.polymorphism.ex02.interfaces.IDAO;

public class Test {
    public static void main(String[] args) {
        save(File.getInstance());
        save(DataBase.getInstance());
    }

    private static void save(IDAO daoObject) {
        daoObject.save();
    }
}
