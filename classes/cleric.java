public class cleric extends classes{
AvaliableArmour armourName;
public cleric(int strength, int intelligence, int charisma, boolean canRage, String weapon, AvaliableArmour armourName, String availableSpells) {
this.strength = strength;
this.intelligence = intelligence;
this.charisma = charisma;
this.canRage = canRage;
this.weapon = weapon;
this.armourName =  armourName;
this.availableSpells = availableSpells;
}
  
public enum CSpells{
    LAYONHANDS(), TURNUNDEAD(-1), CHANNEL DIVINITY(-1);

    int damage;
    CSpells(int damage){
        this.damage = damage;
    }
  }
}