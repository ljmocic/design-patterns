package creational.builder;

public class Hero {

    private final String profession;
    private final String name;
    private final String hairType;
    private final String hairColor;
    private final String armor;
    private final String weapon;

    private Hero(Builder builder) {
        this.profession = builder.profession;
        this.name = builder.name;
        this.hairColor = builder.hairColor;
        this.hairType = builder.hairType;
        this.weapon = builder.weapon;
        this.armor = builder.armor;
    }

    public String getProfession() {
        return profession;
    }

    public String getName() {
        return name;
    }

    public String getHairType() {
        return hairType;
    }

    public String getHairColor() {
        return hairColor;
    }

    public String getArmor() {
        return armor;
    }

    public String getWeapon() {
        return weapon;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Hero{ ");

        sb.append("profession=");
        sb.append(profession);

        sb.append(", name=");
        sb.append(name);

        if(hairType != null) {
            sb.append(", hairType=");
            sb.append(hairType);
        }
        if(hairColor != null) {
            sb.append(", hairColor=");
            sb.append(hairColor);
        }
        if(armor != null) {
            sb.append(", armor=");
            sb.append(armor);
        }
        if(weapon != null) {
            sb.append(", weapon=");
            sb.append(weapon);
        }
        sb.append(" }");
        return sb.toString();
    }

    public static class Builder {

        private String profession;
        private String name;
        private String hairType;
        private String hairColor;
        private String armor;
        private String weapon;

        public Builder(String profession, String name) {
            this.profession = profession;
            this.name = name;
        }

        public Builder withHairType(String hairType) {
            this.hairType = hairType;
            return this;
        }

        public Builder withHairColor(String hairColor) {
            this.hairColor = hairColor;
            return this;
        }

        public Builder withArmor(String armor) {
            this.armor = armor;
            return this;
        }

        public Builder withWeapon(String weapon) {
            this.weapon = weapon;
            return this;
        }

        public Hero build() {
            return new Hero(this);
        }
    }
}
