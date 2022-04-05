public class Main {
    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("American", "Bacon", 15, "White");
        hamburger.addHamburgerAddition1("Cheese", 2);
        hamburger.addHamburgerAddition2("Pepper", 1);
        hamburger.itemize();
        System.out.println("\n**********************\n");
        DeluxeBurger deluxeBurger = new DeluxeBurger();
        deluxeBurger.addHamburgerAddition1("Cucumber", 1);
        deluxeBurger.itemize();
        System.out.println("\n**********************\n");
        HealthyBurger healthyBurger = new HealthyBurger("Beef", 17);
        healthyBurger.itemize();
        healthyBurger.addHealthyAddition1("Lentils", 5);
        healthyBurger.addHamburgerAddition1("Cheese", 2);
        healthyBurger.itemize();
    }
}
