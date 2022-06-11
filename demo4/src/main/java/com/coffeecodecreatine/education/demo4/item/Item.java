package com.coffeecodecreatine.education.demo4.item;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Item {
    private @Id
    @GeneratedValue Long id;
    private String name;
    private String details;

    public Item() {

    }

    public Item(String name, String details) {
        this.name = name;
        this.details = details;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o)
            return true;
        if (!(o instanceof Item))
            return false;
        Item item = (Item) o;
        return Objects.equals(this.id, item.id) && Objects.equals(this.name, item.name)
                && Objects.equals(this.details, item.details);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.name, this.details);
    }

    @Override
    public String toString() {
        return "Item{" + "id=" + this.id + ", name='" + this.name + '\'' + ", details='" + this.details + '\'' + '}';
    }
}
