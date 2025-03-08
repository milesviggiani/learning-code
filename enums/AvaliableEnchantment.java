public enum AvaliableEnchantment{
    CERTAINDEATH(10,"CertainDeath"), DRAGONSLAYER(8, "DragonSlayer"), FLAMESWORD(3, "FlameSword"), NONE(0, "None"), SHARPNESS(5, "Sharpness"), VAMPIRIC(7, "Vampiric"), WITHER(6, "Wither"), POISON(4, "Poison"), EXEMPLIFYMAGIC(10, "ExemplifyMagic");
    int enchantmentLevel;
    String enchantmentName;
AvaliableEnchantment(int enchantmentLevel, String enchantmentName) {
    this.enchantmentLevel = enchantmentLevel;
    this.enchantmentName = enchantmentName;
}
}