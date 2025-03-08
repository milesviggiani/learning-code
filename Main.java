public class Main {
    public static void main(String[] args) {
        Barbarian idiot = new Barbarian(20, 13, 15, Items.WARAXE, AvaliableArmour.PLATE, BarbarianAbilities.CLEAVE);
        Cleric gaylord = new Cleric(16, 18, 19, Items.FLAMESWORD, AvaliableArmour.CHAINSHIRT, CSpells.LAYONHANDS);
        Wizard merlin = new Wizard(11, 20, 15, Items.STAFF, AvaliableArmour.PADDED, WSpells.FIREBALL);
        Necromancer schmebulok = new Necromancer(10, 20, 15, Items.STAFF, AvaliableArmour.PADDED, NSpells.NECROMANCY);

        int barbarianPoints = idiot.calculateTotalPoints();
        int clericPoints = gaylord.calculateTotalPoints();
        int wizardPoints = merlin.calculateTotalPoints();
        int necromancerPoints = schmebulok.calculateTotalPoints();

        System.out.println("Barbarian Points: " + barbarianPoints);
        System.out.println("Cleric Points: " + clericPoints);
        System.out.println("Wizard Points: " + wizardPoints);
        System.out.println("Necromancer Points:" + necromancerPoints);

        if (barbarianPoints > clericPoints && barbarianPoints > wizardPoints && barbarianPoints > necromancerPoints) {
            System.out.println("Barbarian wins!");
        } else if (clericPoints > barbarianPoints && clericPoints > wizardPoints && clericPoints > necromancerPoints) {
            System.out.println("Cleric wins!");
        } else if (wizardPoints > barbarianPoints && wizardPoints > clericPoints && wizardPoints > necromancerPoints) {
            System.out.println("Wizard wins!");
        } else if (necromancerPoints > wizardPoints && necromancerPoints > clericPoints && necromancerPoints > barbarianPoints) {
            System.out.println("Necromancer wins!");
        } else {
            System.out.println("It's a tie!");
        }
    }
}
