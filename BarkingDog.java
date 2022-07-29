public class BarkingDog {
    public static void main(String[]args){
        shouldWakeUp(true,1);

    }
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if(!barking || hourOfDay < 0 || hourOfDay > 23 || (hourOfDay > 7 && hourOfDay < 23)){
            System.out.println("enter correct hourOfDay");
            return false;
        }
        System.out.println("Dog Barking and you WakeUP");
        return true;
    }
}