public enum AvaliableArmour{
    PADDED(15, "Padded"), STUDDEDLEATHER(15, "StuddedLeather"), CHAINSHIRT(25, "ChainShirt"), PLATE(40, "Plate");
    int armourLevel;// 15 is light 25 is medium 40 is heavy
    String armourName;
AvaliableArmour(int armourLevel, String armourName) {
    this.armourLevel = armourLevel;
    this.armourName = armourName;
}
}