public class Homework {
    public static void main(String[] args) {

        int time = 8;
        int day = 10;
        int month = 12;
        int year = 1995;

        if (time>=0 && time<12) {
            System.out.println("Good morning sunshine!");
        }
        else if (time>=13 && time <=19) {
            System.out.println("Good afternoon! Work hard!");
        }
        else if (time>=20 && time<=24) {
            System.out.println("Good Evening. Get some rest!");
        }
        else {
                System.out.println("You have a time out of range!");
            }

        if (day>=1 && day<=31 && month>=1 && month<=12 && year>=1 && year<2021) {
            System.out.println ("The date is: " + year + "/" + month + "/" + day + ".");
        }
            else {
                System.out.println("Please input the variables correctly!");
            }

    }
}
