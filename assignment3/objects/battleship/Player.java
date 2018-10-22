import java.util.Random;
import java.util.Scanner;

class Player{
    protected static Scanner scan = new Scanner(System.in);
    protected int totalPoints;
    protected int shipNum;
    protected int numTorpedos;

    public player(){
        this.totalPoints = 0;
        this.shipNum = 6;
        this.numTorpedos = 45;
    }

    public placeShip(){
        int ships = this.shipNum;
        while(ships>0){
            System.out.println("Enter x coordinate");
			int x = scan.nextInt();
			System.out.println("Enter y coordinate");
            int y = scan.nextInt();
            ships--;
        }
    }

    public placeShipCPU(){
        int ships = this.shipNum;
        while(ships>0){
            ships--;
        }
    }
    
    public boolean launchTorpedo(Torpedo torpedo,Player opponent){
        boolean canLaunch = true;
        int x = new Random().nextInt(9);
        if(numTorpedos == 0){
            System.out.println("Player has run out of torpedos");
            canLaunch = false;
            return canLaunch;
        }
        else if(x % 2 == 0){
            System.out.println("Hit!");
            adversary.shipNum--;
            numTorpedos--;
            boolean continueShooting = true;
            while(continueShooting){
                if(adversary.shipNum == 0){
                    System.out.println("This Player is out of ships");
                    canLaunch = false;
                    continueShooting = false;
                    break;
                }
                x = new Random().nextInt(9);
                if(x%2==0){
                    System.out.println("Hit!");
                    adversary.shipNum--;
                    numTorpedos--;
                }
                else{
                    System.out.println("Miss");
                    numTorpedos--;
                    continueShooting = false;
                    break;
                }
            }
            return canLaunch;
        }
    }

    public boolean cpuLaunch(Player adversary){
        int x = new Random().nextInt(9);
        if(numTorpedos == 0){
            System.out.println("Player has run out of torpedos");
            canLaunch = false;
            return canLaunch;
        }
        else if(x % 2 == 0){
            System.out.println("Hit!");
            adversary.shipNum--;
            numTorpedos--;
            boolean continueShooting = true;
            while(continueShooting){
                if(adversary.shipNum == 0){
                    System.out.println("This Player is out of ships");
                    canLaunch = false;
                    continueShooting = false;
                    break;
                }
                x = new Random().nextInt(9);
                if(x%2==0){
                    System.out.println("Hit!");
                    adversary.shipNum--;
                    numTorpedos--;
                }
                else{
                    System.out.println("Miss");
                    numTorpedos--;
                    continueShooting = false;
                    break;
                }
            }
            return canLaunch;
        }
    }
}