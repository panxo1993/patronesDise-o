package game;

import external.robo.EnemyRobot; // Esto se pondrá en blanco una vez agregues el JAR

public class RobotAdapter implements Enemy {
    private EnemyRobot robot;
    private AttackStrategy attackStrategy;

    public RobotAdapter(EnemyRobot robot) {
        this.robot = robot;
        // Por defecto le damos un ataque a distancia
        this.attackStrategy = new RangedAttack(); 
    }

    @Override
    public void setAttackStrategy(AttackStrategy strategy) {
        this.attackStrategy = strategy;
    }

    @Override
    public void move() {
        // Adaptamos el movimiento [cite: 15, 23]
        robot.moveForward(getHealth());
    }

    @Override
    public int attack(Enemy enemy) {
        // Usamos el Bridge para que el ataque sea flexible [cite: 25]
        return attackStrategy.executeAttack();
    }

    @Override
    public void takeDamage(int damage) {
        robot.receiveShock(damage);
    }

    @Override
    public int getHealth() {
        return robot.energyLevel();
    }
}