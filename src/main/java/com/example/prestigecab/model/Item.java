package com.example.prestigecab.model;

import javax.persistence.*;
import java.util.Objects;
@Entity
@Table(name = "ITEMS")
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private long id;
    @Basic
    @Column(name = "NAME", nullable = false, length = 1000)
    private String name;
    @Basic
    @Column(name = "DESCRIPTION", nullable = false, length = 1000)
    private String description;
    @Basic
    @Column(name = "PRICE", nullable = false)
    private int price;
    @Basic
    @Column(name = "IMAGE", nullable = false, length = 250)
    private String image;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return id == item.id && price == item.price && name.equals(item.name) && description.equals(item.description) && image.equals(item.image);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, description, price, image);
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", image='" + image + '\'' +
                '}';
    }
}
