public enum AvaliableEnchantment{
    CERTAINDEATH(10,"CertainDeath"), DRAGONSLAYER(8, "DragonSlayer"), FLAMESWORD(3, "FlameSword"), FROSTBITE(5, "FrostBite"), LIFEDRAIN(7, "LifeDrain"), LIGHTNINGSTRIKE(6, "LightningStrike"), POISONED(4, "Poisoned"), SHARPNESS(2, "Sharpness"), VAMPIRIC(9, "Vampiric"), WITHER(1, "Wither");
    int enchantmentLevel;
    String enchantmentName;
AvaliableEnchantment(int enchantmentLevel, String enchantmentName) {
    this.enchantmentLevel = enchantmentLevel;
    this.enchantmentName = enchantmentName;
}
}