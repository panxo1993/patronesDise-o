package game;

public class MeleeAttack implements AttackStrategy {
    @Override
    public int executeAttack() {
        System.out.println("-> ¡Ejecutando un feroz ataque Cuerpo a Cuerpo!");
        return (int)(Math.random() * 15) + 5; // Daño aleatorio entre 5 y 20
    }
}