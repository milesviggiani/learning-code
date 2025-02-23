public enum BarbarianAbilities{
    CLEAVE(25, "Cleave"), SMASH(40, "Smash"), RAGE(12, "Rage"), INTIMIDATE(0, "Intimidate"), LOCKSMASH(0, "LockSmash"), SHRUGOFF(0, "ShrugOff"), BERSERK(0, "Berserk"), BATTLECRY(0, "BattleCry"), BLOODLUST(0, "BloodLust"), BLOODRAGE(0, "BloodRage");
    String abilitiesName;
    double damage;
    BarbarianAbilities(double damage, String abilitiesName){
        this.damage = damage;
        this.abilitiesName = abilitiesName;
    }
}