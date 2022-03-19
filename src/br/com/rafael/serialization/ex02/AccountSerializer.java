package br.com.rafael.serialization.ex02;

import java.util.Objects;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class AccountSerializer {
    public void serialize(Account account) {
        Objects.requireNonNull(account, "account cannot be null");
        final String PATH = "src/br/com/rafael/serialization/ex02/accounts.ser";
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(PATH))) {
            outputStream.writeObject(account);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
