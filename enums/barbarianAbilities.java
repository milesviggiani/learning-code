public enum Abilities{
    CLEAVE(25), SMASH(40), RAGE(12);

    double damage;
    Abilities(double damage){
        this.damage = damage;
    }
}