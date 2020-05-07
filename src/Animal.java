public class Animal {
    //Animal name, type , description, price and isInStock variables
    private String name;
    private String type;
    private String description;
    private double price;
    private boolean isInStock;

    public Animal() {
    }

    public Animal(String name, String type, String description) {
        this.name = name;
        this.type = type;
        this.description = description;
    }

    public Animal(String name, String type, String description, double price) {
        this.name = name;
        this.type = type;
        this.description = description;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isInStock() {
        return isInStock;
    }

    public void setInStock(boolean inStock) {
        isInStock = inStock;
    }

    public String getPet(){
        return "Name: "+ name+ " \ntype: "+type+" \ndescription: "+description;
    }
}
