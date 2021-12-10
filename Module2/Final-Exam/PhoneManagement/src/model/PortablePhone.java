package model;

public class PortablePhone extends Phone {
    private String country;
    private String status;

    public PortablePhone() {
    }

    public PortablePhone(int id, String name, int price, int quantity, String producer, String country, String status) {
        super(id, name, price, quantity, producer);
        this.country = country;
        this.status = status;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "PortablePhone{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", price=" + getPrice() +
                ", quantity='" + getQuantity() + '\'' +
                ", producer='" + getProducer() + '\'' +
                "country='" + country + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
    public String getInfoToCSV(){
        return this.id+ ","+ this.name+"," +this.price+","+this.quantity+","+this.price+","+this.country+","+this.status;
    }
}
