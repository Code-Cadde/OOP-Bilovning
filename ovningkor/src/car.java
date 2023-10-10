import java.util.Scanner;

public class car {
    private String model;
    private String color;
    private int speed;
    private boolean running;

    Scanner scanner = new Scanner(System.in); 

    

    public car(String model, String color, int speed, boolean running) {
        this.model = model;
        this.color = color;
        this.speed = 0;
        this.running = false; 
    }
    public void start() {
         if (!running){
            running = true; 
            System.out.println("Den " + color + "a " + model + " har startat!");
         } else {
            System.out.println("Den " + color + "a " + model + " är redan igång!");
         }

    }
    public void stop () {
        if (running){
            running = false;
            speed = 0; 
            System.out.println("Den " + color + "a " + model + " har stannat!");

        } else {
            System.out.println("Den " + color + "a " + model + " har redan stannat");
        }

    }
    public void accelerate() {
        if (running){
            speed += 20;
            System.out.println("Nu gasar du upp till " + speed + "km/h med din " + model);
        } else {
            System.out.println(model + " har inte startat.");
        }

    }
    public void deaccelarate() {
          if (running && speed >= 20) {
            speed -= 20; 
            System.out.println("Nu sänker du farten till " + speed + " med din " + model);
        } else if (running && speed < 20) {
            speed = 0; 
            System.out.println("Nu har du stannat helt med din " + model);
        } else {
            System.out.println(model + " har inte startat.");
        }
    }
}
