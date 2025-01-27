public class Conditional {
    public static void main(String[] args){
        //finfing out if a person is eligible to vote;
        int votingAge=18;
        int myAge=23;
        if(myAge>=votingAge){
            System.out.println("Eligible to vote");
        }else{
            System.out.println("Not eligible to vote");
        }
        // a simple program to open the door
        int doorCode=2560;
        if(doorCode==2560){
            System.out.println("Correct Code\nDoor Opened");
        }else{
            System.out.println("Wrong code, please re-enter the code");
        }
    }
}