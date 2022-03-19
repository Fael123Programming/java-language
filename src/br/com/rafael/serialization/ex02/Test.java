package br.com.rafael.serialization.ex02;

import br.com.rafael.serialization.ex02.Account.*;

import java.time.LocalDate;

public class Test {
    public static void main(String[] args) {
        Customer customer = new Customer("Rafael", "Pereira", "45 St. Petersburg New York-NY",
                LocalDate.of(1980, 8, 7));
        Agency agency = new Agency("671 Cleveland Oklahoma", 4781);
        Account account = new Account(1000, agency, customer);
        System.out.println(account);
        AccountSerializer serializer = new AccountSerializer();
        serializer.serialize(account);
        AccountDeserializer deserializer = new AccountDeserializer();
        Account freshAccount = deserializer.deserialize();
        System.out.println(freshAccount);
//        System.out.println(freshAccount.getOwner().getAge());
    }
}
