public class wizard extends classes {
    AvaliableArmour armourName;
    WSpells availableSpells;
    Items itemName;

    public wizard(int strength, int intelligence, int charisma, Items itemName, AvaliableArmour armourName, WSpells availableSpells) {
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