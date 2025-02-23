public enum AvaliableArmour{
    LIGHTARMOUR(1, "LightArmour"), MEDIUMARMOUR(2, "MediumArmour"), HEAVYAMROUR(3, "HeavyArmour");
    int armourLevel;
    String armourName;
AvaliableArmour(int armourLevel, String armourName) {
    this.armourLevel = armourLevel;
    this.armourName = armourName;
}
}