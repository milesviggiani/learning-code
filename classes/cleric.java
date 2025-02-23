public class cleric extends classes{

public cleric(int strength, int intelligence, int charisma, boolean canRage, String weapon, String armor, String availableSpells, String availableArmor) {
this.strength = strength;
this.intelligence = intelligence;
this.charisma = charisma;
this.canRage = canRage;
this.weapon = weapon;
this.armor = armor;
this.availableSpells = availableSpells;
this.availableArmor = availableArmor;
}
public enum CSpells{
    LAYONHANDS(), TURNUNDEAD(-1), CHANNEL DIVINITY(-1);

    int damage;
    CSpells(int damage){
        this.damage = damage;
    }
  }
}