package game;

public interface Enemy {
    void move();
    int attack(Enemy enemy);
    void takeDamage(int damage);
    int getHealth();
    
    // Método necesario para el patrón Bridge (cambiar estrategia en ruta)
    void setAttackStrategy(AttackStrategy strategy); 
}