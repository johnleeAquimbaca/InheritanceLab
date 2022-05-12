public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Wizards and Warlocks\n");

    /**
     * Sequence exchanging damage between two characters
     * One charter will display as defeted after the battle
     */
        Wizard Alucard = new Wizard("Alucard");
        Warlock Balmond = new Warlock("Balmond");
        Balmond.critical(Alucard);
        Alucard.fireStorm(Balmond);
        Balmond.revive(Balmond);
        Alucard.fireStorm(Balmond);
        Balmond.critical(Alucard);
        Alucard.regen(Alucard);
        Balmond.revive(Balmond);
        Alucard.fireStorm(Balmond);
        Alucard.Level(Alucard, 10);
    }
}