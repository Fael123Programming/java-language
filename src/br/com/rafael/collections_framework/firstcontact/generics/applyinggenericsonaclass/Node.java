package br.com.rafael.collections_framework.firstcontact.generics.applyinggenericsonaclass;

public class Node<T> {
//    T means that any type could be used as datatype for the field data.
    private T data;
    private Node<T> next;

    public Node (T data) {
        this.data = data;
    }

    public T getData() {
        return this.data;
    }

    public void setData (T data) {
        this.data = data;
    }

    public Node<T> getNext() {
        return this.next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return data.toString();
    }
}
