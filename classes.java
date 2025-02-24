class classes {
    int strength;
    int intelligence;
    int charisma;
    String weapon;

    public int calculateTotalPoints() {
        return strength + intelligence + charisma;
    }
}