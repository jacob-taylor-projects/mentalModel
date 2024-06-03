package actors;

public class Player extends Actor{
    public Player(int health,int damage){
        super(health, damage);
    }

    @Override
    public String toString() {
        return "Player";
    }
}
