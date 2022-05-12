public class Character {
    public String characterName = "Gandalf";
    public int level = 0;
    public int healthPoints = 100;
    public int manaPoints = 200;

    /**
     * Constructors 
     */
    Character(String name){
        characterName = name;
    }
    Character(int newHp, int newLevel, int newMana){
    healthPoints = newHp;
    level = newLevel;
    manaPoints = newMana;
    }

    /**
     * Method that displays the Name of the Character
     */
    public void displayName(){
       System.out.println("Character Initialized: "+this.characterName);
    }
    
    /**
     * Method to Damage Target Character
     */
    public void damageTarget(Character enemyCharacter,int damagePoints, int manaCost){
        /**
         * Deduct health points from enemy character
         * Deduct corresponding mana cost
         */
        enemyCharacter.healthPoints -= damagePoints;
        enemyCharacter.manaPoints-=manaCost;
        System.out.println("Enemy character HP Left = " + enemyCharacter.healthPoints);
        System.out.println("\n");

        /**
         * Prompt Character is defeated if HP falls below 0
         * Display the winner
         */
       if(enemyCharacter.healthPoints <=0){
           System.out.println(enemyCharacter.characterName +" is now defeated\n");
           System.out.println(characterName + " wins the battle");
       }
    }
    /**
     * Method to make recovery of the Character
     */
    public void Recovery(Character Character,int heal, int IncreaseMana){
        /**
         * Increase HP of the character
         * Increase mana points of the character
         */
        Character.healthPoints += heal;
        Character.manaPoints += heal;
        System.out.println(characterName+" Mana Total = " +Character.manaPoints);  
        System.out.println(characterName+" HP total = " + Character.healthPoints);
        System.out.println("\n");     
    }
    /**
     * Method to increase the level of the winner to level 10
     */
    public void Level(Character increaseLevel, int level){
        increaseLevel.level = level;
        System.out.println(characterName+" has reach level "+increaseLevel.level);
        System.out.println("\n");
    }
} 
