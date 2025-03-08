public enum WSpells{
    FIREBALL(40, "FireBall"), LIGHTNING(35, "Lighting"), ACIDSPRAY(15, "AcidSpray"), ICEBLAST(25, "IceBlast"), EARTHQUAKE(50, "Earthquake"), WINDGUST(30, "WindGust"), THUNDERCLAP(20, "Thunderclap"), ARCANEEXPLOSION(45, "ArcaneExplosion"), METEORSHOWER(60, "MeteorShower"), BLACKHOLE(70, "BlackHole"), TELEPORT(0, "Teleport"), TIMEWARP(0, "TimeWarp"), SUMMON(0, "Summon"), ILLUSION(0, "Illusion"), MINDCONTROL(0, "MindControl"), DIVINATION(0, "Divination"), ENCHANTMENT(0, "Enchantment");
    int damage;
    String spellName;
    WSpells(int damage, String spellName){
        this.damage = damage;
        this.spellName = spellName;
    }
}