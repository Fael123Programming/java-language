package br.com.rafael.serialization.ex02;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

//In order to serialize a whole object, all its attributes must be serializable.
//If there is one that's not, and you cannot set it serializable, you will have to set it as transient.

public class Account implements Serializable {
    private long number;
    private final BigDecimal balance;
    private Agency agency;
    private Customer owner;

    {
        balance = BigDecimal.ZERO;
    }

    public Account(long number, Agency agency, Customer owner) {
        this.number = number;
        this.agency = agency;
        this.owner = owner;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public Agency getAgency() {
        return agency;
    }

    public void setAgency(Agency agency) {
        this.agency = agency;
    }

    public Customer getOwner() {
        return owner;
    }

    public void setOwner(Customer owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "{number=" + number + ", balance=" + balance + ", agency=" + agency + ", owner=" + owner + "}";
    }

    public static class Agency implements Serializable {
        private String address;
        private int code;

        public Agency(String address, int code) {
            this.address = address;
            this.code = code;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public int getCode() {
            return code;
        }

        public void setCode(int code) {
            this.code = code;
        }

        @Override
        public String toString() {
            return "{code=" + code + ", address=" + address + "}";
        }
    }

    public static class Customer implements Serializable {
        private String firstName, lastName, address;
        private LocalDate dateOfBirth;

        public Customer(String firstName, String lastName, String address, LocalDate dateOfBirth) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.address = address;
            this.dateOfBirth = dateOfBirth;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String fistName) {
            this.firstName = firstName;
        }

        public String getlastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public LocalDate getDateOfBirth() {
            return dateOfBirth;
        }

        public void setDateOfBirth(LocalDate dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
        }

        public int getAge() {
            if (this.dateOfBirth == null)
                return -1;
            int age = LocalDate.now().getYear() - this.dateOfBirth.getYear();
            if (LocalDate.now().isBefore(LocalDate.of(LocalDate.now().getYear(),
                    this.dateOfBirth.getMonth(), this.dateOfBirth.getDayOfMonth())))
                return --age;
            return age;
        }

        @Override
        public String toString() {
            return "{firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", dateOfBirth=" +
                    dateOfBirth.toString() + "}";
        }
    }
}
