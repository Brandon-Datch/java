import java.util.Scanner;

public class okoa {

    public static void main(String[] args) {
        okoaMenu();
    }

    private static void okoaMenu() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("1. Sh.20 (30mins, 3hrs)");
            System.out.println("2. Sh.10 (15mins, 1hr)");
            System.out.println("3. Okoa 50");
            System.out.println("4. Okoa 20");
            System.out.println("5. Okoa 10");
            System.out.println("6. Okoa 5");
            System.out.println("7. Okoa 20(900MB, 1hr)");
            System.out.println("8. Okoa Internet");
            System.out.println("98:More");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    kubaliOffer();
                    break;
                case 2:
                    kubaliOffer();
                    break;
                case 3:
                    kubaliOffer();
                    break;
                case 4:
                    kubaliOffer();
                    break;
                case 5:
                    kubaliOffer();
                    break;
                case 6:
                    kubaliOffer();
                    break;
                case 7:
                    kubaliOffer();
                    break;
                case 8:
                    okoaInternet();
                    break;
                case 98:
                    more();
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 0);

        scanner.close();
    }

    private static void okoaInternet() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do{
            System.out.println("1.Sh20(900MB, 1hr)");
            System.out.println("2.Sh20(90MB, 24hrs)");
            System.out.println("3.Sh10(30MB, 24hrs)");
            System.out.println("4.Sh5(10MB, 2hrs)");
            System.out.println("0.BACK");

            System.out.println("Enter your choice");
            choice= Integer.parseInt(scanner.next());

            switch (choice){
                case 1:
                case 2:
                case 3:
                case 4:
                    kubaliOffer();
                    break;
                case 5:
                    System.out.println("Going back to main menu");
                    okoaMenu();
                    break;
                default:
                    System.out.println("Invalid choice");
                    okoaInternet();
            }
        }while (choice!=0);
    }

    private static void more() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do{
            System.out.println("9.Okoa Minutes");
            System.out.println("10.Okoa SMS");
            System.out.println("11.Lipa Okoa");
            System.out.println("0:BACK");

            System.out.println("Enter your choice");
            choice= Integer.parseInt(scanner.next());

            switch (choice){
                case 9:
                case 10:
                case 11:
                    kubaliOffer();
                    break;
                case 0:
                    okoaMenu();
                    break;
                default:
                    System.out.println("Invalid choice");
                    more();
            }
        }while (choice!=0);
    }



    private static void kubaliOffer() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nDO YOU WANT THE OKOA?");
            System.out.println("1. Accept");
            System.out.println("2. Decline");
            System.out.println("0. Go Back");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("You've received the okoa");
                    System.exit(0);
                    break;
                case 2:
                    System.out.println("You've cancelled the okoa");
                    System.exit(0);
                    break;
                case 0:
                    System.out.println("Going back to main menu");
                    okoaMenu();
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 0);

        scanner.close();

    }
}
