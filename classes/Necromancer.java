public class Necromancer extends Classes {
    AvaliableArmour armourName;
    NSpells availableSpells;
    Items itemName;

    public Necromancer(int strength, int intelligence, int charisma, Items itemName, AvaliableArmour armourName, NSpells availableSpells) {
        this.strength = strength;
        this.intelligence = intelligence;
        this.charisma = charisma;
        this.itemName = itemName;
        this.armourName = armourName;
        this.availableSpells = availableSpells;
    }

    @Override
    public int calculateTotalPoints() {
        return super.calculateTotalPoints() + itemName.damage + armourName.armourLevel + availableSpells.damage;
    }
}