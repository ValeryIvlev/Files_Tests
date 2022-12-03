package org.zayac;

import java.util.List;

public class Book {
    private String client_name;
    private List<String> items;
    private int creditLimit;

    public Book() {
    }

    public String getClient_name() {
        return client_name;
    }

    public void setClient_name(String client_name) {
        this.client_name = client_name;
    }

    public List<String> getItems() {
        return items;
    }

    public void setItems(List<String> items) {
        this.items = items;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(int creditLimit) {
        this.creditLimit = creditLimit;
    }

    @Override
    public String toString() {
        return "Book{" +
                "client_name='" + client_name + '\'' +
                ", items=" + items +
                ", creditLimit=" + creditLimit +
                '}';
    }
}
