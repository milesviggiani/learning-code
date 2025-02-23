import enums.AvaliableArmour;
import enums.BarbarianAbilities;
import enums.CSpells;
import enums.WSpells;

public class Main{
  public static void main(String[] args){
barbarian idiot = new barbarian(20, 1, 5, "GreatAxe", AvaliableArmour.PLATE, BarbarianAbilities.RAGE);
cleric gaylord = new cleric(16, 18, 19, "ShortSword", AvaliableArmour.CHAINSHIRT, CSpells.BLESSING);
wizard merlin = new wizard(11, 20, 15, "Quarter_Staff", AvaliableArmour.PADDED, WSpells.SUMMON);
item excalibur = new item(100, AvaliableEnchantment.CERTAINDEATH);
  }
}
