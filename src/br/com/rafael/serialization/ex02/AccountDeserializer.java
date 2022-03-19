package br.com.rafael.serialization.ex02;

import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class AccountDeserializer {
    public Account deserialize() {
        final String PATH = "src/br/com/rafael/serialization/ex02/accounts.ser";
        Account account = null;
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(PATH))) {
            account = (Account) inputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return account;
    }
}
