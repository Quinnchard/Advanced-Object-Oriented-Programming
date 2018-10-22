import java.util.Scanner;

class Game{
    private long startTime;
    private long endTime;
    private int round;
    private String typeGame;
    private Player p1;
    private Player p2;

    public game(){
        System.out.println("Enter 1 for Human vs. Human or 2 for Human vs. Computer");
        int pick = scan.nextInt();
        if(pick == 1){
            this.typeGame = "Multiplayer";
            this.p1 = new Human();
            this.p2 = new Human();
            this.startTime = 0;
            this.endTime = 0;
        }
        else{
            this.typeGame = "Vs Computer";
            this.p1 = new Human();
            this.p2 = new Cpu();
            this.startTime = 0;
            this.endTime = 0;
        }
    }
    public void startGame(){
        int p1Score = 0;
        int p2Score = 0;
        boolean gameOn = true;
        boolean playing = true;
        while(gameOn){
            startTime = System.currentTimeMillis();
            int round = 1;
            System.out.peintln("P1: Place your ships");
            p1.placeShip();
            if(p2 instanceof Cpu){
                System.out.printnln("The CPU is placing its ships");
                p2.placeShipCPU();
            }
            else{
                System.out.println("P2: place your ships");
                p2.placeShip();
            }
        }
        while(playing){
            System.out.println("Round " + round);
            if(!p1.launchTorpedo(torpedo, p2));
                if(win()){
                    playing = false;
                    break;
                }
        }
        if(p2 instanceof Cpu){
            System.out.print("CPU is launching torpedo");
            if(!p2.cpuLaunch(p1)){
                if(win()){
                    playing = false;
                    break;
                }
            }
        }

        else{
            if(!p2.launchTorpedo(torpedo, p1)){
                if(win()){
                    playing = false;
                    break;
                }
            }
            if(!p1.launchTorpedo(torpedo, p2)){
                if(win()){
                    playing = false;
                    break;
                }
            }
            round++;
        }
    }

    public boolean win(){
        boolean win = false;
        if(p1.shipNum == 0 || p2.shipNum == 0){
            win = true;
        }
        if(p1.shipNum == 0 && win == true){
            System.out.println("Player 2 is the winner");
        }
        if(p2.shipNum == 0 && win == true){
            System.out.println("Player 1 is the winner");
        }
        if(p1.numTorpedos == 0 && p2.numTorpedos == 0 && p1.shipNum > 0 && p2.shipNum > 0){
            System.out.println("It is a draw");
        }
        return win;
    }
}