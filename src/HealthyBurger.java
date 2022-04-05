public class HealthyBurger extends Hamburger {
    private String healthyExtra1Name;
    private double healthyExtra1Price;

    private String healthyExtra2Name;
    private double healthyExtra2Price;

    private boolean hasAnyHealthyAdditions;

    public HealthyBurger(String meat, double price) {
        super("Healthy Burger", meat, price, "Brown rye");
        hasAnyHealthyAdditions = false;
    }

    public void addHealthyAddition1(String healthyExtra1Name, double healthyExtra1Price) {
        this.healthyExtra1Name = healthyExtra1Name;
        this.healthyExtra1Price = healthyExtra1Price;
        hasAnyHealthyAdditions = true;
    }

    public void addHealthyAddition2(String healthyExtra2Name, double healthyExtra2Price) {
        this.healthyExtra2Name = healthyExtra2Name;
        this.healthyExtra2Price = healthyExtra2Price;
        hasAnyHealthyAdditions = true;
    }

    @Override
    public double itemize() {
        double price = super.itemize();

        if(healthyExtra1Name != null) {
            System.out.println("Added healthy addition " + healthyExtra1Name + " at the price of " + healthyExtra1Price);
            price += healthyExtra1Price;
        }

        if(healthyExtra2Name != null) {
            System.out.println("Added healthy addition " + healthyExtra2Name + " at the price of " + healthyExtra2Price);
            price += healthyExtra2Price;
        }

        if(hasAnyHealthyAdditions) {
            System.out.println("Total price with healthy additions: " + price + " $");
        }

        return price;
    }
}
