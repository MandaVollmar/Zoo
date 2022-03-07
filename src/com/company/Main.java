package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        List guestServices = new ArrayList();
        guestServices.add("Visitor Center");
        guestServices.add("Restrooms");
        guestServices.add("Animal Droppings - gift shop");
        guestServices.add("Animals We Eat Buffet");

        List enclosures = new ArrayList();
        enclosures.add("Elephant");
        enclosures.add("Penguin");

        Animal elephant1 = new Elephant("Charlie", 13000, "Africa", "African Bush",
                85.2, true);
        Animal penguin1 = new Penguin("Vanessa", 54, "Antarctica", "Emperor",
                14.7, 1);
        Animal elephant2 = new Elephant("Maude", 8000, "Africa", "African Forest",
                73.7, false);
        Animal penguin2 = new Penguin("Allen", 63, "Antarctica", "Emperor",
                20.2, 0);


//        elephant1.buildAnimal();
//        elephant2.buildAnimal();
//        penguin1.buildAnimal();
//        penguin2.buildAnimal();

        List<Animal> elephants = new ArrayList();
        elephants.add(elephant1);
        elephants.add(elephant2);

        List<Animal> penguins = new ArrayList();
        penguins.add(0, penguin1);
        penguins.add(1, penguin2);

        Scanner userInput = new Scanner(System.in);
        System.out.println("How may we assist you today: 1.Animal Enclosures or 2.Guest Services? ");
        int userAnswer = userInput.nextInt();
        //String userAnswer2 = userInput.nextLine();
        if (userAnswer == 1) {
            System.out.println(enclosures);
            System.out.println("Which enclosure would you like to view?");
            Scanner userInput2 = new Scanner(System.in);
            String userAnswerEnclosure = userInput2.nextLine();
            if (userAnswerEnclosure.equals("penguin")) {
                System.out.println(penguin1.getName() + " " + penguin2.getName());
            } else if (userAnswerEnclosure.equals("elephant")) {
                System.out.println(elephant1.getName() + " " + elephant2.getName());
            } else System.out.println("Input not valid, Please try again!");
        } else if (userAnswer == 2) {
            System.out.print(guestServices);
            System.out.println("Which guest service can we help you with?");
            Scanner userInput2 = new Scanner(System.in);
            String userAnswerService = userInput2.nextLine();
            if (userAnswerService.equals("Visitor Center")) {
                System.out.println("Welcome");
            } else if (userAnswerService.equals("Restrooms")) {
                System.out.println("Go down the hall on the left and restrooms will be the first doors on the right!");
            } else if (userAnswerService.equals("Animal Droppings")) {
                System.out.println("Through the double doors on the right!");
            } else if (userAnswerService.equals("Animals We Eat Buffet")) {
                System.out.println("Go just out the front doors, head north and you should see a big sign!");
            } else System.out.println("Input not valid, Please try again!");
        }else System.out.println("Input not valid, Please try again!");
    }
}
