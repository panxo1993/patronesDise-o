package game;

import external.robo.EnemyRobot;

public class Main {
    public static void main(String[] args) {
        // Creamos un jugador normal
        Enemy enemy1 = new Player();
        
        // 1. Instanciar el robot de la librería externa [cite: 15]
        EnemyRobot robotExterno = new EnemyRobot();
        
        // 2. Usar el Adapter para convertirlo en un Enemy [cite: 22]
        Enemy robotAdaptado = new RobotAdapter(robotExterno);
        
        // Ejemplo de ataque usando polimorfismo
        int danio = robotAdaptado.attack(enemy1);
        enemy1.takeDamage(danio);
        
        System.out.println("Vida del jugador tras ataque del robot: " + enemy1.getHealth());
    }
}