public class Barbarian extends Classes {
    AvaliableArmour armourName;
    BarbarianAbilities abilitiesName;
    Items itemName;

    public Barbarian(int strength, int intelligence, int charisma, Items itemName, AvaliableArmour armourName, BarbarianAbilities abilitiesName) {
        this.strength = strength;
        this.intelligence = intelligence;
        this.charisma = charisma;
        this.itemName = itemName;
        this.armourName = armourName;
        this.abilitiesName = abilitiesName;
    }

    @Override
    public int calculateTotalPoints() {
        return super.calculateTotalPoints() + itemName.damage + armourName.armourLevel + (int) abilitiesName.damage;
    }
}