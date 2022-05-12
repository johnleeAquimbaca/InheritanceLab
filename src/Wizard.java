public class Wizard extends Character{
    Wizard(String name){
        super(name);
    }
    /** 
    *  Damage spell that damage enemy character
    */
    public void fireStorm(Character enemyCharacter){
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName + " with Firestorm (Damage - 50)(Manacost -100)");
        int damagePoints = 50;
        int manaCost = 100;
        damageTarget(enemyCharacter, damagePoints, manaCost);
    };
    /**
     * Recover spell that increase Mana and Hp of the character
     */
    public void regen(Character character){
        System.out.println(super.characterName + " use Regen (Hp +30)(Mana +15)");
        int recover=30;
        int mana=15;
        Recovery(character, recover, mana);   
    };
}
