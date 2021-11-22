package br.com.rafael.polymorphism.ex02.classes;

import br.com.rafael.polymorphism.ex02.interfaces.IDAO;

public class File implements IDAO {
    private static File instance;

    private File(){}

    public synchronized static File getInstance() {
        if (instance == null)
            instance = new File();
        return instance;
    }

    @Override
    public void save() {
        System.out.println("Data was saved into a file");
    }
}
