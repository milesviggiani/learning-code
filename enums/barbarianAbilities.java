public enum Abilities{
    CLEAVE(25), SMASH(40), RAGE(12), INTIMIDATE(-1), LOCKSMASH(-1), SHRUGOFF(-1); 

    double damage;
    Abilities(double damage){
        this.damage = damage;
    }
}