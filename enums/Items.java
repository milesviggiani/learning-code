public enum Items{
    EXCALIBUR(50, AvaliableEnchantment.CERTAINDEATH, "Exalibur"), WARAXE(25, AvaliableEnchantment.NONE, "WarAxe"), BATTLEAXE(30, AvaliableEnchantment.NONE, "BattleAxe"), BROADSWORD(40, AvaliableEnchantment.DRAGONSLAYER, "BroadSword"), FLAMESWORD(35, AvaliableEnchantment.FLAMESWORD, "FlameSword"), NONE(0, AvaliableEnchantment.NONE, "None"), SHIELD(10, AvaliableEnchantment.NONE, "Shield");
    int damage;
    AvaliableEnchantment enchantmentName;
    String itemName;
    Items(int damage, AvaliableEnchantment enchantmentName, String itemName) {
        this.damage = damage;
        this.enchantmentName = enchantmentName;
        this.itemName = itemName;
    }
}