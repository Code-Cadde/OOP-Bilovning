import java.util.Scanner;

public class racetrack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        
        System.out.println("Hej och välkommen till bilsimulator");
        System.out.println("Ange din bilmodel: ");
        String model = scanner.nextLine();
        System.out.println("Ange din färg på bilen: ");
        String color = scanner.nextLine();

        car myCar = new car(model, color, 0, false);

        while (true) {
            System.out.println("Välj ett av alternativen: ");
            System.out.println("1. Starta bilen ");
            System.out.println("2. Stoppa bilen  ");
            System.out.println("3. Gasa upp bilen ");
            System.out.println("4. Sakta ner bilen ");
            System.out.println("5. Avsluta bilsimulatorn ");

            int choice = scanner.nextInt(); 

            switch (choice) {
                case 1:
                    myCar.start();
                    break;
                case 2:
                    myCar.stop();
                    break;
                case 3:
                    myCar.accelerate();
                    break;
                case 4:
                    myCar.deaccelarate();
                    break;
                case 5: 
                 System.out.println("Programmet avslutas.");
                    scanner.close();
                    System.exit(0);
                    break;
                default: 
                System.out.println("Ogiltigt svar, välj mellan 1-5");
            }

        }
        
    }
}
