package game;

public class Player implements Enemy {
    private int life = 100;
    private int posx;
    private int posy; 
    private AttackStrategy attackStrategy; // Implementación del Bridge

    // Constructor: Asigna un ataque por defecto al aparecer
    public Player() {
        this.attackStrategy = new MeleeAttack(); 
    }

    @Override
    public void setAttackStrategy(AttackStrategy strategy) {
        this.attackStrategy = strategy;
    }

    @Override
    public void move() {
        posx = (int)(Math.random() * 100);
        posy = (int)(Math.random() * 100);
    }

    @Override
    public int attack(Enemy enemy) {
        // Delegamos el cálculo del daño a la estrategia (Bridge)
        int golpe = attackStrategy.executeAttack();
        return golpe;
    }

    @Override
    public void takeDamage(int damage) {
        // Restamos el daño recibido a la vida actual
        this.life -= damage;
        if (this.life < 0) {
            this.life = 0;
        }
    }

    @Override
    public int getHealth() {
        return life;
    }

    public int getPosx(){
        return this.posx;
    }
    
    public void setPosx(int x){
        this.posx = x;
    }
}