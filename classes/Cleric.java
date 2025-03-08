public class Cleric extends Classes {
    AvaliableArmour armourName;
    CSpells spellName;
    Items itemName;

    public Cleric(int strength, int intelligence, int charisma, Items itemName, AvaliableArmour armourName, CSpells spellName) {
        this.strength = strength;
        this.intelligence = intelligence;
        this.charisma = charisma;
        this.itemName = itemName;
        this.armourName = armourName;
        this.spellName = spellName;
    }

    @Override
    public int calculateTotalPoints() {
        return super.calculateTotalPoints() + itemName.damage + armourName.armourLevel + spellName.healing;
    }
}