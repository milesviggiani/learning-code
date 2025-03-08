public enum NSpells{
    NECROMANCY(50, "Necromancy"), DARKRITUAL(20, "DarkRitual"), BLOODMAGIC(45, "BloodMagic"), SOULSUCK(35, "SoulSuck"), BONECRUSH(35, "BoneCrush"), DEATHWAVE(25, "DeathWave"), CURSE(20, "Curse"), PLAGUE(30, "Plague"), ;
    int damage;
    String spellName;
    NSpells(int damage, String spellName){
        this.damage = damage;
        this.spellName = spellName;
    }
}