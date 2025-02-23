public class wizard extends classes{

public wizard(int strength, int intelligence, int charisma, boolean canRage, String weapon, String armor, String availableSpells) {
this.strength = strength;
this.intelligence = intelligence;
this.charisma = charisma;
this.canRage = canRage;
this.weapon = weapon;
this.armor = armor;
this.availableSpells = availableSpells;
this.availableArmor = availableArmor;
}

public enum WSpells{
    FIREBALL(-1), LIGHTNING(-1), ACIDSPRAY(-1);

    int damage;
    spells(int damage){
        this.damage = damage;
    }
  }
}