package game;

public class RangedAttack implements AttackStrategy {
    @Override
    public int executeAttack() {
        System.out.println("-> ¡Ejecutando un disparo de Ataque a Distancia!");
        return (int)(Math.random() * 10) + 2; // Daño aleatorio entre 2 y 12
    }
}