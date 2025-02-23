public class barbarian extends classes{
AvaliableArmour armourName;
public barbarian(int strength, int intelligence, int charisma, boolean canRage, String weapon, AvaliableArmour armourName, String availableSpells) {
this.strength = strength;
this.intelligence = intelligence;
this.charisma = charisma;
this.canRage = canRage;
this.weapon = weapon;
this.armourName = armourName;
this.availableSpells = availableSpells;
}
public enum Abilities{
    CLEAVE(25), SMASH(40), RAGE(12);

    double damage;
    Abilities(double damage){
        this.damage = damage;
    }
}
}