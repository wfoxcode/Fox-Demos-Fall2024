public class App {
    public static void main(String[] args) throws Exception {
        
        //counting loop
        int num = 3; 
        while (num > 0) {
            System.out.println(num);
            num--;
            //num = num - 1; equivilant
        }

        //game loop or program loop
        boolean game = true; //trigger variable
        while (game) {
            //program code or game code or calculations
            System.out.println("Hello Universe");

            //kill switch, play again method
            System.out.println("Do you want to play again?");
            String userinput = "no"; //"getting user response";

            if ( userinput.equals("no") ) {
                game = false; //Trigger game to end
            }
        }
        

    //Standard For Loop in Java --------------------------------
            //Three Conditions
            //for (where we start; where we end; step size)
        for(int i = 10; i > 0; i--) {
            System.out.println("The number is " + i);
        }

        //Equivilant While
        int x = 10;
        while (x > 0) {
            System.out.println("The number is " + x);
            x--;
        }

    }
}
