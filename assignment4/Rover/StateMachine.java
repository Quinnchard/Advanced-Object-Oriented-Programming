import java.util.Scanner;
class StateMachine {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int state;
        int input;
        boolean stateTransition = true;
        System.out.println("Welcome to The Rover Program! \nThe rover is currently not moving. \nType 1 to press the right pedal once to go forward.");
        System.out.println("Type 4 to press the left pedal for 5 seconds in order to go backwards \nType 0 if you want to close the program.");
        input = scnr.nextInt();
        System.out.println();
        if(input == 0)
            System.exit(0);
        
        //This while loop will continue the transition until the user reaches the final state.
        while(stateTransition){
            //This will be state 0 where the rover is not moving
            if(input == 0){
                state = 0;
                System.out.println("We are in state " + state + ".");
                System.out.println("The rover is currently not moving. \nIf you wish to exit press 5. \nTo continue press 6.");
                input = scnr.nextInt();
                System.out.println();
                //This is the final state which exits the loop
                if(input == 5){
                    System.out.println("Thank you for using The Rover Program!");
                    scnr.close();
                    stateTransition = false;
                    System.out.println();
                }
                else{
                    System.out.println("Type 1 to press the right pedal once to go forward. \nType 4 to press the left pedal for 5 seconds in order to go backwards");
                    input = scnr.nextInt();
                    System.out.println();
                }
            }
            
            //This is the first state which is the rover accelerating forward
            if(input == 1){
                state = 1;
                System.out.println("We are in state " + state + ".");
                System.out.println("The rover is currently accelerating forward. \nType 2 to press the right pedal twice to deccelerate.");
                System.out.println("Type 3 to press the right pedal for more than 5 seconds to maintain constant speed.");
                input = scnr.nextInt();
                System.out.println();
            }

            //This is the second state which is the rover deccelerating
            if(input == 2){
                state = 2;
                System.out.println("We are in state " + state + ".");
                System.out.println("The rover is currently deccelerating. \nType 0 to stop the rover. \nType 1 to press the right pedal once to go forward. \nType 3 to press the right pedal for more than 5 seconds to maintain constant speed. ");
                input = scnr.nextInt();
                System.out.println();
            }

            //This is the third state which is the rover going at constant speed
            if(input == 3){
                state = 3;
                System.out.println("We are in state " + state + ".");
                System.out.println("The rover is currently going at constant speed. \nType 2 to press the right pedal twice to deccelerate. \nType 1 to press the right pedal once to go forward");
                input = scnr.nextInt();
                System.out.println();
            }

            //This is the fourth state which is the rover going in reverse
            if(input == 4){
                state = 4;
                System.out.println("We are in state " + state + ".");
                System.out.println("The rover is currently going in reverse. \nType 0 to stop the rover.");
                input = scnr.nextInt();
                System.out.println();
            }
        }
    }
}