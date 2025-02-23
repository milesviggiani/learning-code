public enum AvaliableEnchantment{
    CERTAINDEATH(10,"CertainDeath"), DRAGONSLAYER(8, "DragonSlayer"), FLAMESWORD(3, "FlameSword");
    int enchantmentLevel;
    String enchantmentName;
AvaliableEnchantment(int enchantmentLevel, String enchantmentName) {
    this.enchantmentLevel = enchantmentLevel;
    this.enchantmentName = enchantmentName;
}
}