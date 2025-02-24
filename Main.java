public class Main {
    public static void main(String[] args) {
        barbarian idiot = new barbarian(20, 13, 15, Items.WARAXE, AvaliableArmour.PLATE, BarbarianAbilities.CLEAVE);
        cleric gaylord = new cleric(16, 18, 19, Items.FLAMESWORD, AvaliableArmour.CHAINSHIRT, CSpells.LAYONHANDS);
        wizard merlin = new wizard(11, 20, 15, Items.NONE, AvaliableArmour.PADDED, WSpells.FIREBALL);

        int barbarianPoints = idiot.calculateTotalPoints();
        int clericPoints = gaylord.calculateTotalPoints();
        int wizardPoints = merlin.calculateTotalPoints();

        System.out.println("Barbarian Points: " + barbarianPoints);
        System.out.println("Cleric Points: " + clericPoints);
        System.out.println("Wizard Points: " + wizardPoints);

        if (barbarianPoints > clericPoints && barbarianPoints > wizardPoints) {
            System.out.println("Barbarian wins!");
        } else if (clericPoints > barbarianPoints && clericPoints > wizardPoints) {
            System.out.println("Cleric wins!");
        } else if (wizardPoints > barbarianPoints && wizardPoints > clericPoints) {
            System.out.println("Wizard wins!");
        } else {
            System.out.println("It's a tie!");
        }
    }
}
