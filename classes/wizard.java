public class wizard extends classes{
AvaliableArmour armourName;
public wizard(int strength, int intelligence, int charisma, boolean canRage, String weapon, AvaliableArmour armourName, String availableSpells) {
this.strength = strength;
this.intelligence = intelligence;
this.charisma = charisma;
this.canRage = canRage;
this.weapon = weapon;
this.armourName = armourName;
this.availableSpells = availableSpells;
}

public enum WSpells{
    FIREBALL(-1), LIGHTNING(-1), ACIDSPRAY(-1);

    int damage;
    spells(int damage){
        this.damage = damage;
    }
  }
}