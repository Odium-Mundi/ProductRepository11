package domain;

public class Smartphone extends Product {
    private String producer;

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public Smartphone(int id, String name, int price, String producer) {
        super(id, name, price);
        this.producer = producer;
    }

    public boolean matches(String search) {
        if (super.matches(search)) {
            return true;
        }
        return producer.equalsIgnoreCase(search);
    }
}