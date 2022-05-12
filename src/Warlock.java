public class Warlock extends Character{
    Warlock(String name){
        super(name);
    }
    /** 
    *  Damage spell
    */
    public void critical(Character enemyCharacter){
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName + " with Critical (Damage - 40)(ManaCost -80)");
        int damagePoints = 40;
        int manaCost=80;
        damageTarget(enemyCharacter, damagePoints, manaCost);
    };
    /**
     * Recover spell
     */
    public void revive(Character character){
        System.out.println(super.characterName + " use Revive (Hp +20)(Mana +10)");
        int recover=20;
        int mana = 10;
        Recovery(character, recover, mana);
    };
}
