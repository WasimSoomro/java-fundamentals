package inheritance;

public class Shop {
    private String name;
    private String description;
    private int dollarSigns;

    public Shop(String name, String description, int dollarSigns) {
        this.name = name;
        this.description = description;
        this.dollarSigns = dollarSigns;
    }

    public String toString() {
        return "Shop{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", dollarSigns=" + dollarSigns +
                '}';
    }
}
