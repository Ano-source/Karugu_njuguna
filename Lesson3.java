public class Lesson3{
    public static void main(String[]args){
        int correctPin = 1234;
        int attempts = 0;

        //SYSTEM: Allow only 3 tries
        while(attempts<3){
            //We are simulating a wrong PIN for now 
            int enteredPin = 9999;

            if(enteredPin == correctPin){
                System.out.println("Access Granted");
                break;// Stop the loop immediately if correct
            }else{
                attempts++;//Add 1 to their tries
                System.out.println("Wrong PIN. Attempt"+ attempts+"of 3 used");
            }
        }

        if(attempts== 3){
            System.out.println("Card Blocked! Visit the branch in Town.");
        }
    }
}