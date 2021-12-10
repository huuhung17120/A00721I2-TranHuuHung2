package model;

public class GenuinePhone extends Phone {
    private String warrantyPeriod;
    private String warrantyCoverage;

    public GenuinePhone() {
    }

    public GenuinePhone(int id, String name, int price, int quantity, String producer, String warrantyPeriod, String warrantyCoverage) {
        super(id, name, price, quantity, producer);
        this.warrantyPeriod = warrantyPeriod;
        this.warrantyCoverage = warrantyCoverage;
    }

    public String getWarrantyPeriod() {
        return warrantyPeriod;
    }

    public void setWarrantyPeriod(String warrantyPeriod) {
        this.warrantyPeriod = warrantyPeriod;
    }

    public String getWarrantyCoverage() {
        return warrantyCoverage;
    }

    public void setWarrantyCoverage(String warrantyCoverage) {
        this.warrantyCoverage = warrantyCoverage;
    }

    @Override
    public String toString() {
        return "PortablePhone{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", price=" + getPrice() +
                ", quantity='" + getQuantity() + '\'' +
                ", producer='" + getProducer() + '\'' +
                "warrantyPeriod='" + warrantyPeriod + '\'' +
                ", warrantyCoverage='" + warrantyCoverage + '\'' +
                '}';
    }

    public String getInfoToCSV(){
        return this.id+ ","+ this.name+"," +this.price+","+this.quantity+","+this.price+","+this.warrantyPeriod+","+this.warrantyCoverage;
    }
}
