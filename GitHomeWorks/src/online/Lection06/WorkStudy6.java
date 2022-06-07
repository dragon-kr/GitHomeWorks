package online.Lection06;
import online.Lection06.actors.Orc;
import online.Lection06.actors.Player;
import online.Lection06.actors.Troll;
import online.Lection06.models.Actor;

public class WorkStudy6 {

    public static void main(String[] args) {
        Player player = new Player("Player", "Player 1", 10, 15);

//        Enemy enemy = new Enemy("Orc", "Vasia", 150, 20, 60, 100);
        Coin coin = new Coin(20, 50);
        Orc orc = new Orc("Petya", 200, 50, 14, 15);
        Troll troll = new Troll("Vasia", 400, 150, 20, 90);

//        player.moveUp();
//        player.attack();
//        player.moveRight();
//        player.decreaseHealth(15);
//        System.out.println("*************");
//////        enemy.attack();
//////        enemy.decreaseHealth(20);
//////        enemy.moveUp();
//////        enemy.speak();
////        System.out.println("*************");
//        orc.moveRight();
//        orc.moveUp();
//        orc.attack();
//        orc.speak();
//        System.out.println("*************");
////        System.out.println("Price: " + coin.getPrice());
////        orc.run(150);
////        player.run();
////        player.run(200);
////        player.giveMeInfoSelf();
//        troll.moveUp();
//        troll.moveRight();
//        troll.voice();
//        troll.doSomething();
//        troll.decreaseHealth(50);

//        System.out.println("**************************");
        Actor[] gameActors = {player, orc, troll};
        for (int i = 0; i < gameActors.length; i++) {
            gameActors[i].moveRight();
            gameActors[i].moveUp();
            gameActors[i].attack();
            if (gameActors[i] instanceof Player) {
                Player tmpPlayer = (Player) gameActors[i];
                tmpPlayer.getNewLevel(10 ,20);
            }

            if (gameActors[i] instanceof Orc) {
                Orc tmpOrc = (Orc) gameActors[i];
                tmpOrc.task();
            }

            if (gameActors[i] instanceof Troll) { //принадлежность к классу
                Troll tmpObject = (Troll) gameActors[i]; //type casting
                tmpObject.voice();
                tmpObject.doSomething();
            }

        }

        player.getNewLevel(10,20);
        orc.task();
        troll.doSomething();
    }
}
