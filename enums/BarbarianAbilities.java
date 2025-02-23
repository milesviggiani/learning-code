public enum BarbarianAbilities{
    CLEAVE(25, "Cleave"), SMASH(40,  "Smash"), RAGE(12, "Rage"), INTIMIDATE(0, "Rage"), LOCKSMASH(0, "LaskSmash"), SHRUGOFF(0, "ShrugOff"); 
    String abilitiesName;
    double damage;
    BarbarianAbilities(double damage, String abilitiesName){
        this.damage = damage;
        this.abilitiesName = abilitiesName;
    }
}