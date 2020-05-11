
package com.example.demo.Model;

        import javax.persistence.Entity;
        import javax.persistence.GeneratedValue;
        import javax.persistence.GenerationType;
        import javax.persistence.Id;

@Entity
public class Fruit {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)

    private long id;
    private String name;
    private String color;
    private String state;
    public Fruit() {
    }

    public long getId() {
        return id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Fruit(String name, String color, String state) {
        this.name = name;
        this.color = color;
        this.state = state;
    }
}
