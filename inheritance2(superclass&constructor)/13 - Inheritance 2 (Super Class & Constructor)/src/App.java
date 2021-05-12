public class App {
    public static void main(String[] args) throws Exception {
        Hero hero1 = new Hero("contoh", 23);
        hero1.displayAll();

        Fighter hero2 = new Fighter("kaka");
        hero2.display();
        hero2.displaySuper();
        hero1.displayName();
    }
}
