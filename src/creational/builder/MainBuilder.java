package creational.builder;

public class MainBuilder {

    public static void main(String[] args) {
        Hero templar = new Hero.Builder("Assasin", "Templar")
                            .withHairType("Short")
                            .withHairColor("Blue")
                            .withWeapon("Divine Rapier")
                            .build();
        System.out.println(templar);

        Hero ursa = new Hero.Builder("Hunter", "Ursa")
                .withArmor("Chainmail")
                .withWeapon("Abyssal Blade")
                .build();
        System.out.println(ursa);
    }

}
