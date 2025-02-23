public enum AvaliableArmour{
    PADDED(1, "Padded"), STUDDEDLEATHER(1, "StuddedLeather"), CHAINSHIRT(2, "ChainShirt"), PLATE(3, "Plate");
    int armourLevel;
    String armourName;
AvaliableArmour(int armourLevel, String armourName) {
    this.armourLevel = armourLevel;
    this.armourName = armourName;
}
}