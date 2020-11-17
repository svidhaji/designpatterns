package visitorpattern;

public class Context implements Character {
    private Character character;
    private Visitor visitor;
    int bonusXp = 0;
    
    public Context(Visitor visitor) {
        this.visitor = visitor;
        visitor.visit(this);
    }
    public int getXp() {
        return bonusXp;
    }
    
    public Character getState() {
        return this.character;
    }
    
    public void setState(Character character) {
        this.character = character;
    }
    
    public void attack() {
        this.character.attack();
        bonusXp += 100;
        visitor.visit(this);
    }
    
    public void defend() {
        this.character.defend();
        bonusXp += 50;
        visitor.visit(this);
    }
    
    public void sleep() {
        this.character.sleep();
        bonusXp += 20;
        visitor.visit(this);
    }
    
}
