package inheritance;

public class Restaurant {

    private String name;
    private int stars;
    private int priceCat;

    public Restaurant(String name, int stars, int priceCat) {
        this.name = name;
        this.stars = stars;
        this.priceCat = priceCat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public int getPriceCat() {
        return priceCat;
    }

    public void setPriceCat(int priceCat) {
        this.priceCat = priceCat;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "Name: " + name +
                ", Star Rating: " + stars +
                ", Price Category: " + priceCat +
                '}';
    }
}