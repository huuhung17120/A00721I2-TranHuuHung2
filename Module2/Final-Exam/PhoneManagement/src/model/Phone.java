package model;

public abstract class Phone {
    protected int id;
    protected String name;
    protected int price;
    protected int quantity;
    protected String producer;

    public Phone() {
    }

    public Phone(int id, String name, int price, int quantity, String producer) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.producer = producer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String toString() {
        return "Phone{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", quantity='" + quantity + '\'' +
                ", producer='" + producer + '\'' +
                '}';
    }

    public abstract class add{};
    public abstract class delete{};
    public abstract class display{};
    public abstract class search{};
}
