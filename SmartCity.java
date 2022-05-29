import java.io.*;
import java.util.Scanner;

public class SmartCity extends Service {

    public static String choice, bedSize, bedType = "", jacuzziChoice, firstLetter, jacuzziRoom = "", planeSeatType = "",
            planeFoodChoice, planeChoice, planeFood = "", planeSeatChoice, userStart, firstStartLetter,
            trainChoice, trainSeatChoice, trainSeatType = "", boatChoice, boatSeatChoice, boatSeatType = "",
            boatMealChoice, boatMeal = "", storeType, clothingChoice, clothingStore = "", footChoice,
            footStore = "", techChoice, techStore = "", toyChoice, toyStore = "", cuisineChoice, cuisine = "",
            menuChoice, foodItem = "";

    public static double sum = 0.00;

    public static boolean badInput;

    public static Scanner sc;

    // Method containing all info about class Hotel
    public static void hotel() {

        badInput = false;

        System.out.println("\nVery well! Let's go visit the hotel!");

        System.out.println("\nWhich bed size would you like (King, Queen, Twin)? ");

        do {
            sc = new Scanner(System.in);
            bedSize = sc.nextLine();
            bedSize = bedSize.toLowerCase();

            if (bedSize.equals("king")) {
                badInput = false;
                bedType = "King";
            } else if (bedSize.equals("queen")) {
                badInput = false;
                bedType = "Queen";
            } else if (bedSize.equals("twin")) {
                badInput = false;
                bedType = "Twin";
            } else {
                badInput = true;
                System.out.println("Please reenter which bed size you would like (King, Queen, Twin): ");
            }
        } while (badInput);

        System.out.println("Would you like a jacuzzi in your room? ");

        do {
            sc = new Scanner(System.in);
            jacuzziChoice = sc.nextLine();
            jacuzziChoice = jacuzziChoice.toLowerCase();
            firstLetter = jacuzziChoice.substring(0, 1);

            if (firstLetter.equals("y")) {
                badInput = false;
                jacuzziRoom = "Yes";
            } else if (firstLetter.equals("n")) {
                badInput = false;
                jacuzziRoom = "No";
            } else {
                badInput = true;
                System.out.println("Please reenter your answer (yes/no): ");
            }
        } while (badInput);

        Hotel room1 = new Hotel(bedType, jacuzziRoom);

        sum += room1.getPrice();

        System.out.println("\n" + room1);

        System.out.println("\nWhere would you like to go next? ");

    }

    // Method containing all info about class Airport
    public static void plane() {
        badInput = false;

        sc = new Scanner(System.in);

        System.out.println("\nYou arrive at the new and modern airport of Smartopolis on a bright and sunny day.");

        System.out.println("\nWould you like to buy a plane ticket and leave the city (yes/no)? ");

        do {
            planeChoice = sc.nextLine();
            planeChoice = planeChoice.toLowerCase();
            firstLetter = planeChoice.substring(0, 1);

            if (firstLetter.equals("y")) {

                System.out.println("Which class would you like to fly in (first, business, economy)? ");

                do {
                    sc = new Scanner(System.in);
                    planeSeatChoice = sc.nextLine();
                    planeSeatChoice = planeSeatChoice.toLowerCase();

                    if (planeSeatChoice.equals("first")) {
                        badInput = false;
                        planeSeatType = "First";
                    } else if (planeSeatChoice.equals("business")) {
                        badInput = false;
                        planeSeatType = "Business";
                    } else if (planeSeatChoice.equals("economy")) {
                        badInput = false;
                        planeSeatType = "Economy";
                    } else {
                        badInput = true;
                        System.out.println("Please reenter which seat class you would like (First, Business, Economy): ");
                    }
                } while (badInput);

                System.out.println("Would you like food to be provided on your flight as well? ");

                do {
                    sc = new Scanner(System.in);
                    planeFoodChoice = sc.nextLine();
                    planeFoodChoice = planeFoodChoice.toLowerCase();
                    firstLetter = planeFoodChoice.substring(0, 1);

                    if (firstLetter.equals("y")) {
                        badInput = false;
                        planeFood = "Yes";
                    } else if (firstLetter.equals("n")) {
                        badInput = false;
                        planeFood = "No";
                    } else {
                        badInput = true;
                        System.out.println("Please reenter your answer (yes/no): ");
                    }
                } while (badInput);

                Airport plane = new Airport(planeSeatType, planeFood);

                sum += plane.getPrice();

                System.out.println(plane);


                try {

                    FileWriter fw = new FileWriter("MoneySpent.txt", true);

                    PrintWriter pw = new PrintWriter(fw);

                    pw.println("Total amount of money spent during trip: " + sum + "0");

                    pw.close();

                } catch (Exception e) {
                }

                System.out.println("Total amount of money spent during trip: " + sum + "0");

                System.exit(0);

            } else if (firstLetter.equals("n")) {
                badInput = false;
                System.out.println("\nAlright! Where would you like to go next? ");
            } else {
                badInput = true;
                System.out.println("Please say whether you want a plane ticket again (yes/no): ");
            }
        } while (badInput);
    }

    // Method containing all info about class Port
    public static void boat() {

        badInput = false;

        sc = new Scanner(System.in);

        System.out.println("\nYou arrive at the port of Smartopolis to the sounds of " +
                "seagulls, and the " + "marketplace by the ocean.");

        System.out.println("\nWould you like to buy a boat ticket and leave the city (yes/no)? ");

        do {
            boatChoice = sc.nextLine();
            boatChoice = boatChoice.toLowerCase();
            firstLetter = boatChoice.substring(0, 1);

            if (firstLetter.equals("y")) {

                System.out.println("Which section of the boat would you like to choose for your seat (inside/outside)? ");

                do {
                    sc = new Scanner(System.in);
                    boatSeatChoice = sc.nextLine();
                    boatSeatChoice = boatSeatChoice.toLowerCase();

                    if (boatSeatChoice.equals("inside")) {
                        badInput = false;
                        boatSeatType = "Inside";
                    } else if (boatSeatChoice.equals("outside")) {
                        badInput = false;
                        boatSeatType = "Outside";
                    } else {
                        badInput = true;
                        System.out.println("Please reenter which section of the boat you " +
                                "would like your seat" + " to be in (inside/outside): ");
                    }
                } while (badInput);

                System.out.println("Would you like a meal plan to be added to your ticket? ");

                do {
                    sc = new Scanner(System.in);
                    boatMealChoice = sc.nextLine();
                    boatMealChoice = boatMealChoice.toLowerCase();
                    firstLetter = boatMealChoice.substring(0, 1);

                    if (firstLetter.equals("y")) {
                        badInput = false;
                        boatMeal = "Yes";
                    } else if (firstLetter.equals("n")) {
                        badInput = false;
                        boatMeal = "No";
                    } else {
                        badInput = true;
                        System.out.println("Please reenter your answer (yes/no): ");
                    }
                } while (badInput);

                Port boat = new Port(boatSeatType, boatMeal);

                sum += boat.getPrice();

                System.out.println(boat);

                try {

                    FileWriter fw = new FileWriter("MoneySpent.txt", true);

                    PrintWriter pw = new PrintWriter(fw);

                    pw.println("Total amount of money spent during trip: " + sum + "0");

                    pw.close();

                } catch (Exception e) {
                }

                System.out.println("\nThank you for visiting Smartopolis!");

                System.out.println("Total amount of money spent during trip: " + sum + "0");

                System.exit(0);

            } else if (firstLetter.equals("n")) {

                badInput = false;
                System.out.println("\nAhoy Captain! Where would you like to go next?");

            } else {
                badInput = true;
                System.out.println("Please reenter whether you would like a boat ticket or "
                        + "not (yes/no): ");
            }
        } while (badInput);
    }

    // Method containing all info about class Store
    public static void mall() {

        badInput = false;

        sc = new Scanner(System.in);

        System.out.println("\n*****************************************************************************"
                + "*************************************************************************"
                + "\nYou arrive at the new and luxurious mall of Smartopolis. The state of the art"
                + " decorations and design impress you as you walk down the huge corridors."
                + "\n****************************************************************************************"
                + "**************************************************************");

        System.out.println("\nWhich type of store would you like to visit? ");

        System.out.println("\n1 - Clothing" + "\n2 - Footwear" + "\n3 - Tech" + "\n4 - Toy" + "\n");

        do {

            storeType = sc.nextLine();
            storeType = storeType.toLowerCase();

            if (storeType.equals("1")) {

                storeType = "Clothing";

                System.out.println("\nWhich clothing store would you like to go to? ");

                System.out.println("\n1 - Nike" + "\n2 - Gucci" + "\n3 - Calvin Klein" + "\n4 - Versace" + "\n");

                do {
                    sc = new Scanner(System.in);
                    clothingChoice = sc.nextLine();

                    if (clothingChoice.equals("1")) {
                        badInput = false;
                        clothingStore = "Nike";
                    } else if (clothingChoice.equals("2")) {
                        badInput = false;
                        clothingStore = "Gucci";
                    } else if (clothingChoice.equals("3")) {
                        badInput = false;
                        clothingStore = "Calvin Klein";
                    } else if (clothingChoice.equals("4")) {
                        badInput = false;
                        clothingStore = "Versace";
                    } else {
                        badInput = true;
                        System.out.println("Please reenter the number of the clothing store you would like to" +
                                " visit (1 - Nike, 2- Gucci, 3 - Calvin Klein, 4 - Versace): ");
                    }
                } while (badInput);

                Store clothes = new Store(storeType, clothingStore);

                sum += clothes.getPrice();

                System.out.println(clothes + "\n");

                System.out.println("Where would you like to go next? ");

            } else if (storeType.equals("2")) {

                storeType = "Footwear";

                System.out.println("\nWhich footwear store would you like to go to? ");

                System.out.println("\n1 - Footlocker" + "\n2 - Sport Check" + "\n3 - Louis Vitton" + "\n4 - MEC"
                        + "\n");

                do {
                    sc = new Scanner(System.in);
                    footChoice = sc.nextLine();
                    footChoice = footChoice.toLowerCase();

                    if (footChoice.equals("1")) {
                        badInput = false;
                        footStore = "Footlocker";
                    } else if (footChoice.equals("2")) {
                        badInput = false;
                        footStore = "Sport Check";
                    } else if (footChoice.equals("3")) {
                        badInput = false;
                        footStore = "Louis Vitton";
                    } else if (footChoice.equals("4")) {
                        badInput = false;
                        footStore = "MEC";
                    } else {
                        badInput = true;
                        System.out.println("Please reenter the name of the footwear store you would like to" +
                                " visit (Footlocker, Sport Check, Louis Vitton, MEC): ");
                    }
                } while (badInput);

                Store foot = new Store(storeType, footStore);

                sum += foot.getPrice();

                System.out.println(foot + "\n");

                System.out.println("Where would you like to go next? ");

            } else if (storeType.equals("3")) {

                storeType = "Tech";

                System.out.println("\nWhich tech store would you like to visit? ");

                System.out.println("\n1 - Best Buy" + "\n2 - The Source" + "\n3 - Canada Computers" +
                        "\n4 - Walmart" + "\n");

                do {
                    sc = new Scanner(System.in);
                    techChoice = sc.nextLine();
                    techChoice = techChoice.toLowerCase();

                    if (techChoice.equals("1")) {
                        badInput = false;
                        techStore = "Best Buy";
                    } else if (techChoice.equals("2")) {
                        badInput = false;
                        techStore = "The Source";
                    } else if (techChoice.equals("3")) {
                        badInput = false;
                        techStore = "Canada Computers";
                    } else if (techChoice.equals("4")) {
                        badInput = false;
                        techStore = "Walmart";
                    } else {
                        badInput = true;
                        System.out.println("Please reenter the name of the tech store you would like to" +
                                " visit (Best Buy, The Source, Canada Computers, Walmart): ");
                    }
                } while (badInput);

                Store tech = new Store(storeType, techStore);

                sum += tech.getPrice();

                System.out.println(tech + "\n");

                System.out.println("Where would you like to go next? ");

            } else if (storeType.equals("4")) {

                storeType = "Toy";

                System.out.println("\nWhich toy store would you like to visit? ");

                System.out.println("\n1 - Toys R Us" + "\n2 - Mastermind" + "\n");

                do {
                    sc = new Scanner(System.in);
                    toyChoice = sc.nextLine();
                    toyChoice = toyChoice.toLowerCase();

                    if (toyChoice.equals("1")) {
                        badInput = false;
                        toyStore = "Toys R Us";
                    } else if (toyChoice.equals("2")) {
                        badInput = false;
                        toyStore = "Mastermind";
                    } else {
                        badInput = true;
                        System.out.println("Please reenter the name of the toy store you would like to" +
                                " visit (Toys R Us, Mastermind): ");
                    }
                } while (badInput);

                Store toy = new Store(storeType, toyStore);

                sum += toy.getPrice();

                System.out.println(toy + "\n");

                System.out.println("Where would you like to go next? ");

            }
        } while (badInput);
    }

    // Method containing all info about class train
    public static void train() {
        System.out.println("\nYou arrive at the historical and beautiful train station of Smartopolis. " + "The sound "
                + "of the train’s steam and the large crowd boosts your excitement.");
        System.out.println("\nWould you like to buy a train ticket and leave the city (yes/no)? ");

        do {
            trainChoice = sc.nextLine();
            trainChoice = trainChoice.toLowerCase();
            firstLetter = trainChoice.substring(0, 1);

            if (firstLetter.equals("y")) {

                System.out.println("Which section would you like to ride in (Public, Private, VIP)? ");

                do {
                    sc = new Scanner(System.in);
                    trainSeatChoice = sc.nextLine();
                    trainSeatChoice = trainSeatChoice.toLowerCase();

                    if (trainSeatChoice.equals("public")) {
                        badInput = false;
                        trainSeatType = "Public";
                    } else if (trainSeatChoice.equals("private")) {
                        badInput = false;
                        trainSeatType = "Private";
                    } else if (trainSeatChoice.equals("vip")) {
                        badInput = false;
                        trainSeatType = "VIP";
                    } else {
                        badInput = true;
                        System.out.println("\nPlease reenter the name of the section that you would like to"
                                + " choose (Public, Private, VIP): ");
                    }
                } while (badInput);

                TrainStation train = new TrainStation(trainSeatType);

                sum += train.getPrice();

                System.out.println(train);

                try {

                    FileWriter fw = new FileWriter("MoneySpent.txt", true);

                    PrintWriter pw = new PrintWriter(fw);

                    pw.println("Total amount of money spent during trip: " + sum + "0");

                    pw.close();

                } catch (Exception e) {
                }

                System.out.println("\nThank you for visiting Smartopolis!");

                System.out.println("Total amount of money spent during trip: " + sum + "0");

                System.exit(0);

            } else if (firstLetter.equals("n")) {
                System.out.println("\nGreat! Where would you like to go next? ");
            }
        } while (badInput);
    }

    // Method containing all info about class Restaurant
    public static void restaurant() {
        badInput = false;

        System.out.println("\nYou arrive at the gem of Smartopolis, the world renowned restaurant El Smartopo." +
                " The countless pleasant aromas coming from the kitchen make you hungrier and hungrier with" +
                " each passing minute.");

        System.out.println("\nWhich cuisine would you like to taste?");

        System.out.println("\n1 - Japanese" + "\n2 - Chinese" + "\n3 - Vietnamese" + "\n4 - French" +
                "\n5 - Italian" + "\n6 - Mexican" + "\n");

        do {
            sc = new Scanner(System.in);
            cuisineChoice = sc.nextLine();

            if (cuisineChoice.equals("1")) {
                badInput = false;
                cuisine = "Japanese";
                System.out.println("\nWhich menu item would you like?");
                System.out.println("\n1 - Sushi" + "\n2 - Ramen" + "\n");

                do {
                    sc = new Scanner((System.in));
                    menuChoice = sc.nextLine();

                    if (menuChoice.equals("1")) {
                        badInput = false;
                        foodItem = "Sushi";
                    } else if (menuChoice.equals("2")) {
                        badInput = false;
                        foodItem = "Ramen";
                    } else {
                        badInput = true;
                        System.out.println("Please reenter which menu item you would like to choose: ");
                    }
                } while (badInput);

            } else if (cuisineChoice.equals("2")) {
                badInput = false;
                cuisine = "Chinese";
                System.out.println("\nWhich menu item would you like?");
                System.out.println("\n1 - Lo Mein" + "\n2 - Dumplings" + "\n");

                do {
                    sc = new Scanner((System.in));
                    menuChoice = sc.nextLine();

                    if (menuChoice.equals("1")) {
                        badInput = false;
                        foodItem = "Lo Mein";
                    } else if (menuChoice.equals("2")) {
                        badInput = false;
                        foodItem = "Dumplings";
                    } else {
                        badInput = true;
                        System.out.println("Please reenter which menu item you would like to choose: ");
                    }
                } while (badInput);

            } else if (cuisineChoice.equals("3")) {
                badInput = false;
                cuisine = "Vietnamese";
                System.out.println("\n1 - Pho" + "\n2 - Banh Xeo" + "\n");

                do {
                    sc = new Scanner((System.in));
                    menuChoice = sc.nextLine();

                    if (menuChoice.equals("1")) {
                        badInput = false;
                        foodItem = "Pho";
                    } else if (menuChoice.equals("2")) {
                        badInput = false;
                        foodItem = "Banh Xeo";
                    } else {
                        badInput = true;
                        System.out.println("Please reenter which menu item you would like to choose: ");
                    }
                } while (badInput);

            } else if (cuisineChoice.equals("4")) {
                badInput = false;
                cuisine = "French";
                System.out.println("\n1 - Boeuf Bourguignon" + "\n2 - Flamiche" + "\n");

                do {
                    sc = new Scanner((System.in));
                    menuChoice = sc.nextLine();

                    if (menuChoice.equals("1")) {
                        badInput = false;
                        foodItem = "Boeuf Bourguignon";
                    } else if (menuChoice.equals("2")) {
                        badInput = false;
                        foodItem = "Flamiche";
                    } else {
                        badInput = true;
                        System.out.println("Please reenter which menu item you would like to choose: ");
                    }
                } while (badInput);

            } else if (cuisineChoice.equals("5")) {
                badInput = false;
                cuisine = "Italian";
                System.out.println("\n1 - Lasagna" + "\n2 - Pizza" + "\n");

                do {
                    sc = new Scanner((System.in));
                    menuChoice = sc.nextLine();

                    if (menuChoice.equals("1")) {
                        badInput = false;
                        foodItem = "Lasagna";
                    } else if (menuChoice.equals("2")) {
                        badInput = false;
                        foodItem = "Pizza";
                    } else {
                        badInput = true;
                        System.out.println("Please reenter which menu item you would like to choose: ");
                    }
                } while (badInput);

            } else if (cuisineChoice.equals("6")) {
                badInput = false;
                cuisine = "Mexican";
                System.out.println("\n1 - Tacos" + "\n2 - Quesadilla" + "\n");

                do {
                    sc = new Scanner((System.in));
                    menuChoice = sc.nextLine();

                    if (menuChoice.equals("1")) {
                        badInput = false;
                        foodItem = "Tacos";
                    } else if (menuChoice.equals("2")) {
                        badInput = false;
                        foodItem = "Quesadilla";
                    } else {
                        badInput = true;
                        System.out.println("Please reenter which menu item you would like to choose: ");
                    }
                } while (badInput);

            } else {
                badInput = true;
                System.out.println("Please reenter the name of the cuisine you would like to" +
                        " taste (Japanese, Chinese, Vietnamese, French, Italian, Mexican): ");
            }

        } while (badInput);

        Restaurant food = new Restaurant(cuisine, foodItem);

        sum += food.getPrice();

        System.out.println(food);

        System.out.println("\nI hope you had an amazing meal! Where would you like to go next? ");

    }

    // Mentions all info about the option to exit the program
    public static void exit() {

        if (choice.equals("q")) {

            badInput = false;

            System.out.println("\nThanks for visiting Smartopolis!");

            try {

                FileWriter fw = new FileWriter("MoneySpent.txt", true);

                PrintWriter pw = new PrintWriter(fw);

                pw.println("Total amount of money spent during trip: " + sum + "0");

                pw.close();

            } catch (Exception e) {
            }

            System.out.println("\nTotal amount of money spent during trip: " + sum + "0");

            System.exit(0);
        }
    }

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        System.out.println("Would you like to start an adventure in the beautiful city of Smartopolis (yes/no)? ");

        do {
            userStart = sc.nextLine();
            userStart = userStart.toLowerCase();
            firstStartLetter = userStart.substring(0, 1);

            if (firstStartLetter.equals("y")) {
                badInput = false;
            } else if (firstStartLetter.equals("n")) {
                badInput = false;
                System.out.println("Thanks for coming!");
                System.exit(0);
            } else {
                badInput = true;
                System.out.println("Please reenter your answer (yes/no): ");
            }
        } while (badInput);

        System.out.println("\n***************************************************************************************"
                + "************************************************************" + "\nYou arrive at the historical"
                + "and beautiful train station of Smartopolis. The sound of the train’s steam and the large crowd "
                + "boosts your excitement." + "\nWhere would you like to start your adventure/tour?" + "\n*********"
                + "************************************************************************************************"
                + "******************************************");

        System.out.println("\n1 - Hotel" + "\n2 - Airport" + "\n3 - Port" + "\n4 - Mall" + "\n5 - Restaurant" +
                "\nq - Exit program" + "\n");

        do {
            choice = sc.nextLine();

            // Path taken by first choosing to exit the program
            if (choice.equals("q")) {

                badInput = false;

                exit();

                // Path taken by choosing to go the the hotel first
            } else if (choice.equals("1")) {

                badInput = false;

                hotel();

                System.out.println("\n1 - Train Station" + "\n2 - Port" + "\n3 - Mall" + "\n4 - Restaurant" + "\n5 -" +
                        " Airport" + "\nq - Exit Program" + "\n");

                do {

                    choice = sc.nextLine();

                    //Path taken by choosing to go to the Train Station after the hotel
                    if (choice.equals("1")) {

                        badInput = false;

                        train();

                        System.out.println("\n1 - Port" + "\n2 - Mall" + "\n3 - Restaurant" + "\n4 - Airport" + "\nq - Exit"
                                + " Program" + "\n");

                        do {
                            choice = sc.nextLine();

                            // Path taken by choosing to go the Port after going to the Train Station which was the second
                            // destination after the Hotel
                            if (choice.equals("1")) {

                                badInput = false;

                                boat();

                                System.out.println("\n1 - Mall" + "\n2 - Restaurant" + "\n3 - Airport" + "\nq - Exit Program" +
                                        "\n");

                                do {
                                    choice = sc.nextLine();

                                    // Path taken by choosing to go to the Mall after going to the Port which was the third
                                    // destination after the Train Station and Hotel
                                    if (choice.equals("1")) {

                                        badInput = false;
                                        mall();
                                        System.out.println("\n1 - Restaurant" + "\n2 - Airport" + "\nq - Exit Program" + "\n");

                                        do {
                                            choice = sc.nextLine();

                                            // Path taken by choosing to go to the Restaurant after going to the Mall which was the
                                            // fourth destination after the Port, Train Station, and Hotel
                                            if (choice.equals("1")) {

                                                restaurant();

                                                System.out.println("\n1 - Airport" + "\nq - Exit Program" + "\n");

                                                do {
                                                    choice = sc.nextLine();

                                                    // Path taken by choosing to go to the Airport after going to the Restaurant which
                                                    // was the fifth destination after the Mall, Port, Train Station, and Hotel
                                                    if (choice.equals("1")) {

                                                        plane();

                                                        System.out.println("\nq - Exit Program" + "\n");

                                                        do {
                                                            choice = sc.nextLine();

                                                            // Path taken by choosing to exit the program after going to the Airport
                                                            // which was the sixth destination after the Restaurant, Mall, Port,
                                                            // Train Station, and Hotel
                                                            if (choice.equals("q")) {

                                                                badInput = false;
                                                                exit();

                                                            } else {
                                                                badInput = true;
                                                                System.out.println("\nPlease reenter your answer: " + "\n");
                                                            }
                                                        } while (badInput);

                                                    } else if (choice.equals("q")) {

                                                        badInput = false;
                                                        exit();

                                                    } else {

                                                        badInput = true;
                                                        System.out.println("\nPlease reenter your answer: " + "\n");
                                                    }

                                                } while (badInput);

                                                // Path taken by choosing to go to the Airport after going to the Mall which was the
                                                // fourth destination after the Port, Train Station, and Hotel
                                            } else if (choice.equals("2")) {

                                                plane();
                                                System.out.println("\n1 - Restaurant" + "\nq - Exit Program" + "\n");

                                                do {
                                                    choice = sc.nextLine();

                                                    // Path taken by choosing to go to the Restaurant after going to the Airport
                                                    // which was the fifth destination after the Mall, Port, Train Station, and Hotel
                                                    if (choice.equals("1")) {

                                                        restaurant();
                                                        System.out.println("\nq - Exit Program" + "\n");

                                                        do {
                                                            choice = sc.nextLine();

                                                            // Path taken by choosing to exit the program after going to the
                                                            // Restaurant which was the sixth destination after the Airport, Mall,
                                                            // Port, Train Station, and Hotel
                                                            if (choice.equals("q")) {

                                                                badInput = false;
                                                                exit();

                                                            } else {

                                                                badInput = true;
                                                                System.out.println("Please reenter your answer: ");
                                                            }
                                                        } while (badInput);

                                                        // Path taken by choosing to exit the program after going to the Airport
                                                        // which was the fifth destination after the Mall, Port, Train Station, and Hotel
                                                    } else if (choice.equals("q")) {

                                                        badInput = false;
                                                        exit();

                                                    } else {

                                                        badInput = true;
                                                        System.out.println("Please reenter your answer: ");

                                                    }
                                                } while (badInput);

                                                // Path taken by choosing to exit the program after going to the Port which was the
                                                // third destination after the Train Station and Hotel
                                            } else if (choice.equals("q")) {

                                                badInput = false;
                                                exit();

                                            } else {

                                                badInput = true;
                                                System.out.println("Please reenter your answer: ");

                                            }

                                        } while (badInput);

                                        // Path taken by choosing to go to the Restaurant after going to the Port which was the
                                        // third destination after the Train Station and Hotel
                                    } else if (choice.equals("2")) {

                                        badInput = false;
                                        restaurant();
                                        System.out.println("\n1 - Mall" + "\n2 - Airport" + "\nq - Exit Program" + "\n");

                                        do {
                                            choice = sc.nextLine();

                                            // Path taken by choosing to go to the Mall after going to the Restaurant which was
                                            // the fourth destination after the Port, Train Station, and Hotel
                                            if (choice.equals("1")) {

                                                mall();
                                                System.out.println("\n1 - Airport" + "\nq - Exit Program" + "\n");

                                                do {
                                                    choice = sc.nextLine();

                                                    // Path taken by choosing to go to the Airport after going to the Mall which
                                                    // was the fifth destination after the Restaurant, Port, Train Station, and Hotel
                                                    if (choice.equals("1")) {

                                                        plane();
                                                        System.out.println("\nq - Exit Program" + "\n");

                                                        do {
                                                            choice = sc.nextLine();

                                                            // Path taken by choosing to exit the program after going to the
                                                            // Airport which was the sixth destination after the Mall, Restaurant,
                                                            // Port, Train Station, and Hotel
                                                            if (choice.equals("q")) {

                                                                badInput = false;
                                                                exit();

                                                            } else {

                                                                badInput = true;
                                                                System.out.println("Please reenter your answer: ");

                                                            }
                                                        } while (badInput);

                                                        // Path taken by choosing to exit the program after going to the Mall which
                                                        // was the fifth destination after the Restaurant, Port, Train Station, and Hotel
                                                    } else if (choice.equals("q")) {

                                                        badInput = false;
                                                        exit();

                                                    } else {

                                                        badInput = true;
                                                        System.out.println("Please reenter your answer: ");
                                                    }

                                                } while (badInput);

                                                // Path taken by choosing to go to the Airport after going to the Restaurant which
                                                // was the fourth destination after the Port, Train Station, and Hotel
                                            } else if (choice.equals("2")) {

                                                plane();
                                                System.out.println("\n1 - Mall" + "\nq - Exit Program" + "\n");

                                                do {
                                                    choice = sc.nextLine();

                                                    // Path taken by choosing to go to the Mall after going to the Airport which was
                                                    // the fifth destination after the Restaurant, Port, Train Station, and Hotel
                                                    if (choice.equals("1")) {

                                                        badInput = false;
                                                        mall();
                                                        System.out.println("\nq - Exit Program" + "\n");

                                                        do {
                                                            choice = sc.nextLine();

                                                            // Path taken by choosing to exit the program after going to the Mall
                                                            // which was the sixth destination after the Airport, Restaurant, Port,
                                                            // Train Station, and Hotel
                                                            if (choice.equals("q")) {

                                                                badInput = false;
                                                                exit();

                                                            } else {

                                                                badInput = true;
                                                                System.out.println("\nPlease reenter your answer: ");

                                                            }

                                                        } while (badInput);

                                                        // Path taken by choosing to exit the program after going to the Airport which
                                                        // was the fifth destination after the Restaurant, Port, Train Station, and Hotel
                                                    } else if (choice.equals("q")) {

                                                        badInput = false;
                                                        exit();

                                                    } else {

                                                        badInput = true;
                                                        System.out.println("Please reenter your answer: ");
                                                    }
                                                } while (badInput);

                                                // Path taken by choosing to exit the program after going to the Restaurant which was
                                                // the fourth destination after the Port, Train Station, and Hotel
                                            } else if (choice.equals("q")) {

                                                exit();

                                            }
                                        } while (badInput);

                                        // Path taken by choosing to go to the Airport after going to the Port which was the third
                                        // destination after the Train Station and Hotel
                                    } else if (choice.equals("3")) {

                                        badInput = false;
                                        plane();
                                        System.out.println("\n1 - Restaurant" + "\n2 - Mall" + "\nq - Exit Program" + "\n");
                                        choice = sc.nextLine();

                                        if (choice.equals("1")) {

                                            restaurant();
                                            System.out.println("\n1 - Mall" + "\nq - Exit Program" + "\n");
                                            choice = sc.nextLine();

                                            if (choice.equals("1")) {

                                                mall();
                                                System.out.println("\nq - Exit Program" + "\n");
                                                choice = sc.nextLine();

                                                do {
                                                    if (choice.equals("q")) {

                                                        exit();

                                                    } else {

                                                        badInput = true;
                                                        System.out.println("Please reenter your answer: ");
                                                    }
                                                } while (badInput);
                                            }

                                        } else if (choice.equals("2")) {

                                            mall();
                                            System.out.println("\n1 - Restaurant" + "\nq - Exit Program" + "\n");
                                            choice = sc.nextLine();

                                            if (choice.equals("1")) {

                                                restaurant();
                                                System.out.println("\nq - Exit Program" + "\n");
                                                choice = sc.nextLine();

                                                do {
                                                    if (choice.equals("q")) {

                                                        exit();

                                                    } else {

                                                        badInput = true;
                                                        System.out.println("Please reenter your answer: ");
                                                    }
                                                } while (badInput);
                                            }
                                        }

                                    } else if (choice.equals("q")) {

                                        badInput = false;
                                        exit();

                                    } else {

                                        badInput = true;
                                        System.out.println("Please reenter your answer: ");

                                    }
                                } while (badInput);

                                // Path taken by choosing to go the Mall after going to the Train Station which was the second destination
                                // after the hotel
                            } else if (choice.equals("2")) {

                                badInput = false;

                                mall();

                                System.out.println("\n1 - Train Station" + "\n2 - Airport" + "\n3 - Port" + "\n4 - Restaurant" +
                                        "\n");

                                // Path taken by choosing to go the Restaurant after going to the Train Station which was the second destination
                                // after the hotel
                            } else if (choice.equals("3")) {

                                badInput = false;

                                restaurant();

                                // Path taken by choosing to go the Airport after going to the Train Station which was the second destination
                                // after the hotel
                            } else if (choice.equals("4")) {

                                badInput = false;

                                plane();

                            } else if (choice.equals("q")) {

                                badInput = false;

                                exit();

                            } else {

                                badInput = true;

                                System.out.println("\nPlease reenter which destination you would like to go to or press q to finish" +
                                        " your tour: " + "\n");
                            }

                        } while (badInput);

                    //Path taken by choosing to go to the Port after the hotel
                    } else if (choice.equals("2")) {

                        badInput = false;

                        boat();

                        System.out.println("\n1 - Train Station" + "\n2 - Mall" + "\n3 - Restaurant" + "\n4 - Airport" +
                                "\nq - Exit Program" + "\n");

                        do {
                            choice = sc.nextLine();

                            // Path taken by choosing to go the Train Station after going to the Port which was the second destination
                            // after the Hotel
                            if (choice.equals("1")) {

                                badInput = false;
                                train();

                                System.out.println("\n1 - Mall" + "\n2 - Restaurant" + "\n3 - Airport" + "\nq - Exit Program" +
                                        "\n");

                                do {
                                    choice = sc.nextLine();

                                    // Path taken by choosing to go to the Mall after going to the Train Station which was the
                                    // third destination after the Port and Hotel
                                    if (choice.equals("1")) {

                                        badInput = false;
                                        mall();
                                        System.out.println("\n1 - Restaurant" + "\n2 - Airport" + "\nq - Exit Program" + "\n");

                                        do {
                                            choice = sc.nextLine();

                                            // Path taken by choosing to go to the Restaurant after going to the Mall which was the
                                            // fourth destination after the Train Station, Port, and Hotel
                                            if (choice.equals("1")) {

                                                badInput = false;
                                                restaurant();

                                                System.out.println("\n1 - Airport" + "\nq - Exit Program" + "\n");

                                                do {
                                                    choice = sc.nextLine();

                                                    // Path taken by choosing to go to the Airport after going to the Restaurant which
                                                    // was the fifth destination after the Mall, Train Station, Port, and Hotel
                                                    if (choice.equals("1")) {

                                                        plane();

                                                        System.out.println("\nq - Exit Program" + "\n");

                                                        do {
                                                            choice = sc.nextLine();

                                                            // Path taken by choosing to exit the program after going to the Airport
                                                            // which was the sixth destination after the Restaurant, Mall,
                                                            // Train Station, Port, and Hotel
                                                            if (choice.equals("q")) {

                                                                badInput = false;
                                                                exit();

                                                            } else {

                                                                badInput = true;
                                                                System.out.println("Please reenter your answer: ");

                                                            }
                                                        } while (badInput);

                                                    } else if (choice.equals("q")) {

                                                        badInput = false;
                                                        exit();

                                                    } else {

                                                        badInput = true;
                                                        System.out.println("Please reenter your answer: ");

                                                    }
                                                } while (badInput);

                                                // Path taken by choosing to go to the Airport after going to the Mall which was the
                                                // fourth destination after the Train Station, Port, and Hotel
                                            } else if (choice.equals("2")) {

                                                badInput = false;
                                                plane();
                                                System.out.println("\n1 - Restaurant" + "\nq - Exit Program" + "\n");

                                                do {
                                                    choice = sc.nextLine();

                                                    // Path taken by choosing to go to the Restaurant after going to the Airport
                                                    // which was the fifth destination after the Mall, Train Station, Port, and Hotel
                                                    if (choice.equals("1")) {

                                                        restaurant();
                                                        System.out.println("\nq - Exit Program" + "\n");

                                                        do {
                                                            choice = sc.nextLine();

                                                            // Path taken by choosing to exit the program after going to the Restaurant
                                                            // which was the sixth destination after the Airport, Mall,
                                                            // Train Station, Port, and Hotel
                                                            if (choice.equals("q")) {

                                                                badInput = false;
                                                                exit();

                                                            } else {

                                                                badInput = true;
                                                                System.out.println("Please reenter your answer: ");

                                                            }
                                                        } while (badInput);
                                                    }
                                                } while (badInput);

                                                // Path taken by choosing to exit the program after going to the Mall which was the
                                                // fourth destination after the Train Station, Port, and Hotel
                                            } else if (choice.equals("q")) {

                                                badInput = false;
                                                exit();

                                            } else {

                                                badInput = true;
                                                System.out.println("Please reenter your answer: ");

                                            }
                                        } while (badInput);

                                        // Path taken by choosing to go to the Restaurant after going to the Train Station which was
                                        // the third destination after the Port and Hotel
                                    } else if (choice.equals("2")) {

                                        badInput = false;
                                        restaurant();
                                        System.out.println("\n1 - Mall" + "\n2 - Airport" + "\nq - Exit Program" + "\n");

                                        do {
                                            choice = sc.nextLine();

                                            // Path taken by choosing to go to the Mall after going to the Restaurant which was the
                                            // fourth destination after the Train Station, Port, and Hotel
                                            if (choice.equals("1")) {

                                                badInput = false;
                                                mall();
                                                System.out.println("\n1 - Airport" + "\nq - Exit Program" + "\n");

                                                do {
                                                    choice = sc.nextLine();

                                                    // Path taken by choosing to go to the Airport after going to the Mall which was the
                                                    // fifth destination after the Restaurant, Train Station, Port, and Hotel
                                                    if (choice.equals("1")) {

                                                        plane();
                                                        System.out.println("\nq - Exit Program" + "\n");

                                                        do {
                                                            choice = sc.nextLine();

                                                            // Path taken by choosing to exit the program after going to the Airport
                                                            // which was the sixth destination after the Mall, Restaurant, Train Station,
                                                            // Port, and Hotel
                                                            if (choice.equals("q")) {

                                                                exit();

                                                            } else {

                                                                badInput = true;
                                                                System.out.println("Please reenter your answer: ");

                                                            }

                                                        } while (badInput);

                                                    } else if (choice.equals("q")) {

                                                        badInput = false;
                                                        exit();

                                                    } else {

                                                        badInput = true;
                                                        System.out.println("Please reenter your answer: ");

                                                    }

                                                } while (badInput);

                                                // Path taken by choosing to go to the Airport after going to the
                                                // Restaurant which was the fourth destination after the Train Station,
                                                // Port, and Hotel
                                            } else if (choice.equals("2")) {

                                                badInput = false;
                                                plane();
                                                System.out.println("\n1 - Mall" + "\nq - Exit Program" + "\n");

                                                do {
                                                    choice = sc.nextLine();

                                                    if (choice.equals("1")) {

                                                        badInput = false;
                                                        mall();
                                                        System.out.println("\nq - Exit Program" + "\n");
                                                        choice = sc.nextLine();

                                                        do {

                                                            if (choice.equals("q")) {

                                                                badInput = false;
                                                                exit();

                                                            } else {

                                                                badInput = true;
                                                                System.out.println("\nPlease reenter your answer: ");

                                                            }

                                                        } while (badInput);

                                                    } else if (choice.equals("q")) {

                                                        badInput = false;
                                                        exit();

                                                    } else {

                                                        badInput = true;
                                                        System.out.println("Please reenter your answer: ");

                                                    }
                                                } while (badInput);

                                            } else if (choice.equals("q")) {

                                                badInput = false;
                                                exit();

                                            } else {

                                                badInput = true;
                                                System.out.println("Please reenter your answer: ");

                                            }
                                        } while (badInput);

                                    } else if (choice.equals("3")) {

                                        badInput = false;
                                        plane();
                                        System.out.println("\n1 - Restaurant" + "\n2 - Mall" + "\nq - Exit Program" + "\n");

                                        do {
                                            choice = sc.nextLine();

                                            if (choice.equals("1")) {

                                                badInput = false;
                                                restaurant();
                                                System.out.println("\n1 - Mall" + "\nq - Exit Program" + "\n");

                                                do {
                                                    choice = sc.nextLine();

                                                    if (choice.equals("1")) {

                                                        badInput = false;
                                                        mall();
                                                        System.out.println("\nq - Exit Program" + "\n");

                                                        do {
                                                            choice = sc.nextLine();

                                                            if (choice.equals("q")) {

                                                                badInput = false;
                                                                exit();

                                                            } else {

                                                                badInput = true;
                                                                System.out.println("Please reenter your answer: ");

                                                            }
                                                        } while (badInput);

                                                    } else if (choice.equals("q")) {

                                                        badInput = false;
                                                        exit();

                                                    } else {

                                                        badInput = true;
                                                        System.out.println("Please reenter your answer: ");

                                                    }

                                                } while (badInput);

                                            } else if (choice.equals("2")) {

                                                badInput = false;
                                                mall();
                                                System.out.println("\n1 - Restaurant" + "\nq - Exit Program" + "\n");

                                                do {
                                                    choice = sc.nextLine();

                                                    if (choice.equals("1")) {

                                                        restaurant();
                                                        System.out.println("\nq - Exit Program" + "\n");

                                                        do {
                                                            choice = sc.nextLine();

                                                            if (choice.equals("q")) {

                                                                badInput = false;
                                                                exit();

                                                            } else {

                                                                badInput = true;
                                                                System.out.println("Please reenter your answer: ");
                                                            }
                                                        } while (badInput);

                                                    } else if (choice.equals("q")) {

                                                        badInput = false;
                                                        exit();

                                                    } else {

                                                        badInput = true;
                                                        System.out.println("Please reenter your answer: ");

                                                    }

                                                } while (badInput);

                                            } else if (choice.equals("q")) {

                                                badInput = false;
                                                exit();

                                            } else {

                                                badInput = true;
                                                System.out.println("Please reenter your answer: ");

                                            }
                                        } while (badInput);

                                    } else if (choice.equals("q")) {

                                        badInput = false;
                                        exit();

                                    } else {

                                        badInput = true;
                                        System.out.println("Please reenter your answer: ");

                                    }
                                } while (badInput);

                                // Path taken by choosing to go the Mall after going to the Train Station which was the
                                // second destination after the hotel
                            } else if (choice.equals("2")) {

                                badInput = false;
                                mall();

                                System.out.println("\n1 - Train Station" + "\n2 - Airport" + "\n3 - Port" + "\n4 - Restaurant" +
                                        "\n");

                                // Path taken by choosing to go the Restaurant after going to the Train Station which was the second destination
                                // after the hotel
                            } else if (choice.equals("3")) {

                                badInput = false;
                                restaurant();

                                // Path taken by choosing to go the Airport after going to the Train Station which was the second destination
                                // after the hotel
                            } else if (choice.equals("4")) {

                                badInput = false;
                                plane();

                            } else if (choice.equals("q")) {

                                badInput = false;
                                exit();

                            } else {

                                badInput = true;
                                System.out.println("\nPlease reenter which destination you would like to go to or press " +
                                        "q to finish your tour: " + "\n");

                            }
                        } while (badInput);

                    //Path taken by choosing to go to the Mall after the Hotel
                    } else if (choice.equals("3")) {

                        badInput = false;
                        mall();

                        System.out.println("\n1 - Train Station" + "\n2 - Airport" + "\n3 - Port" + "\n4 - Restaurant" +
                                "\nq - Exit Program" + "\n");

                        do {
                            choice = sc.nextLine();

                            // Path taken by choosing to go the Train Station after going to the Port which was the second destination
                            // after the Hotel
                            if (choice.equals("1")) {

                                badInput = false;
                                train();

                                System.out.println("\n1 - Mall" + "\n2 - Restaurant" + "\n3 - Airport" + "\nq - Exit Program" +
                                        "\n");

                                choice = sc.nextLine();

                                do {
                                    // Path taken by choosing to go to the Mall after going to the Train Station which was the
                                    // third destination after the Port and Hotel
                                    if (choice.equals("1")) {

                                        badInput = false;
                                        mall();
                                        System.out.println("\n1 - Restaurant" + "\n2 - Airport" + "\nq - Exit Program" + "\n");
                                        choice = sc.nextLine();

                                        // Path taken by choosing to go to the Restaurant after going to the Mall which was the
                                        // fourth destination after the Train Station, Port, and Hotel
                                        if (choice.equals("1")) {

                                            restaurant();

                                            System.out.println("\n1 - Airport" + "\nq - Exit Program" + "\n");

                                            choice = sc.nextLine();

                                            // Path taken by choosing to go to the Airport after going to the Restaurant which
                                            // was the fifth destination after the Mall, Train Station, Port, and Hotel
                                            if (choice.equals("1")) {

                                                plane();

                                                System.out.println("\nq - Exit Program" + "\n");

                                                do {
                                                    choice = sc.nextLine();

                                                    // Path taken by choosing to exit the program after going to the Airport
                                                    // which was the sixth destination after the Restaurant, Mall,
                                                    // Train Station, Port, and Hotel
                                                    if (choice.equals("q")) {

                                                        badInput = false;
                                                        exit();

                                                    } else {
                                                        badInput = true;
                                                        System.out.println("Please reenter your answer: ");
                                                    }
                                                } while (badInput);
                                            }

                                            // Path taken by choosing to go to the Airport after going to the Mall which was the
                                            // fourth destination after the Train Station, Port, and Hotel
                                        } else if (choice.equals("2")) {

                                            plane();
                                            System.out.println("\n1 - Restaurant" + "\nq - Exit Program" + "\n");

                                            do {
                                                choice = sc.nextLine();

                                                // Path taken by choosing to go to the Restaurant after going to the Airport
                                                // which was the fifth destination after the Mall, Train Station, Port, and Hotel
                                                if (choice.equals("1")) {

                                                    restaurant();
                                                    System.out.println("\nq - Exit Program" + "\n");

                                                    do {
                                                        choice = sc.nextLine();

                                                        // Path taken by choosing to exit the program after going to the Restaurant
                                                        // which was the sixth destination after the Airport, Mall,
                                                        // Train Station, Port, and Hotel
                                                        if (choice.equals("q")) {

                                                            badInput = false;
                                                            exit();

                                                        } else {

                                                            badInput = true;
                                                            System.out.println("Please reenter your answer: ");

                                                        }
                                                    } while (badInput);
                                                }
                                            } while (badInput);

                                            // Path taken by choosing to exit the program after going to the Mall which was the
                                            // fourth destination after the Train Station, Port, and Hotel
                                        } else if (choice.equals("q")) {

                                            exit();

                                        }

                                        // Path taken by choosing to go to the Restaurant after going to the Train Station which was
                                        // the third destination after the Port and Hotel
                                    } else if (choice.equals("2")) {

                                        badInput = false;
                                        restaurant();
                                        System.out.println("\n1 - Mall" + "\n2 - Airport" + "\nq - Exit Program" + "\n");
                                        choice = sc.nextLine();

                                        // Path taken by choosing to go to the Mall after going to the Restaurant which was the
                                        // fourth destination after the Train Station, Port, and Hotel
                                        if (choice.equals("1")) {

                                            mall();
                                            System.out.println("\n1 - Airport" + "\nq - Exit Program" + "\n");
                                            choice = sc.nextLine();

                                            // Path taken by choosing to go to the Airport after going to the Mall which was the
                                            // fifth destination after the Restaurant, Train Station, Port, and Hotel
                                            if (choice.equals("1")) {

                                                plane();
                                                System.out.println("\nq - Exit Program" + "\n");

                                                do {
                                                    choice = sc.nextLine();

                                                    // Path taken by choosing to exit the program after going to the Airport
                                                    // which was the sixth destination after the Mall, Restaurant, Train Station,
                                                    // Port, and Hotel
                                                    if (choice.equals("q")) {

                                                        exit();

                                                    } else {

                                                        badInput = true;
                                                        System.out.println("Please reenter your answer: ");

                                                    }
                                                } while (badInput);
                                            }

                                            // Path taken by choosing to go to the Airport after going to the Restaurant which was
                                            // the fourth destination after the Train Station, Port, and Hotel
                                        } else if (choice.equals("2")) {

                                            plane();
                                            System.out.println("\n1 - Mall" + "\nq - Exit Program" + "\n");
                                            choice = sc.nextLine();

                                            if (choice.equals("1")) {

                                                mall();
                                                System.out.println("\nq - Exit Program" + "\n");
                                                choice = sc.nextLine();

                                                do {

                                                    if (choice.equals("q")) {

                                                        badInput = false;
                                                        exit();

                                                    } else {

                                                        badInput = true;
                                                        System.out.println("\nPlease reenter your answer: ");

                                                    }

                                                } while (badInput);

                                            } else if (choice.equals("q")) {

                                                exit();

                                            }

                                        } else if (choice.equals("q")) {

                                            exit();

                                        }

                                    } else if (choice.equals("3")) {

                                        badInput = false;
                                        plane();
                                        System.out.println("\n1 - Restaurant" + "\n2 - Mall" + "\nq - Exit Program" + "\n");
                                        choice = sc.nextLine();

                                        if (choice.equals("1")) {

                                            restaurant();
                                            System.out.println("\n1 - Mall" + "\nq - Exit Program" + "\n");
                                            choice = sc.nextLine();

                                            if (choice.equals("1")) {

                                                mall();
                                                System.out.println("\nq - Exit Program" + "\n");
                                                choice = sc.nextLine();

                                                do {
                                                    if (choice.equals("q")) {

                                                        exit();

                                                    } else {

                                                        badInput = true;
                                                        System.out.println("Please reenter your answer: ");
                                                    }
                                                } while (badInput);
                                            }

                                        } else if (choice.equals("2")) {

                                            mall();
                                            System.out.println("\n1 - Restaurant" + "\nq - Exit Program" + "\n");
                                            choice = sc.nextLine();

                                            if (choice.equals("1")) {

                                                restaurant();
                                                System.out.println("\nq - Exit Program" + "\n");
                                                choice = sc.nextLine();

                                                do {
                                                    if (choice.equals("q")) {

                                                        exit();

                                                    } else {

                                                        badInput = true;
                                                        System.out.println("Please reenter your answer: ");
                                                    }
                                                } while (badInput);
                                            }
                                        }

                                    } else if (choice.equals("q")) {

                                        badInput = false;
                                        exit();

                                    } else {

                                        badInput = true;
                                        System.out.println("Please reenter your answer: ");

                                    }
                                } while (badInput);

                                // Path taken by choosing to go the Mall after going to the Train Station which was the second destination
                                // after the hotel
                            } else if (choice.equals("2")) {

                                badInput = false;
                                mall();

                                System.out.println("\n1 - Train Station" + "\n2 - Airport" + "\n3 - Port" + "\n4 - Restaurant" +
                                        "\n");

                                // Path taken by choosing to go the Restaurant after going to the Train Station which was the second destination
                                // after the hotel
                            } else if (choice.equals("3")) {

                                badInput = false;
                                restaurant();

                                // Path taken by choosing to go the Airport after going to the Train Station which was the second destination
                                // after the hotel
                            } else if (choice.equals("4")) {

                                badInput = false;
                                plane();

                            } else if (choice.equals("q")) {

                                badInput = false;
                                exit();

                            } else {

                                badInput = true;
                                System.out.println("\nPlease reenter which destination you would like to go to or press "
                                        + "q to finish your tour: " + "\n");

                            }
                        } while (badInput);

                    } else if (choice.equals("4")) {

                        badInput = false;
                        restaurant();

                        System.out.println("\n1 - Port" + "\n2 - Mall" + "\n3 - Airport" + "\n4 - Train Station" +
                                "\nq - Exit Program" + "\n");

                        do {
                            choice = sc.nextLine();

                            // Path taken by choosing to go the Port after going to the Train Station which was the second
                            // destination after the Hotel
                            if (choice.equals("1")) {

                                badInput = false;

                                boat();

                                System.out.println("\n1 - Mall" + "\n2 - Restaurant" + "\n3 - Airport" + "\nq - Exit Program" +
                                        "\n");

                                do {
                                    choice = sc.nextLine();

                                    // Path taken by choosing to go to the Mall after going to the Port which was the third
                                    // destination after the Train Station and Hotel
                                    if (choice.equals("1")) {

                                        badInput = false;
                                        mall();
                                        System.out.println("\n1 - Restaurant" + "\n2 - Airport" + "\nq - Exit Program" + "\n");

                                        do {
                                            choice = sc.nextLine();

                                            // Path taken by choosing to go to the Restaurant after going to the Mall which was the
                                            // fourth destination after the Port, Train Station, and Hotel
                                            if (choice.equals("1")) {

                                                restaurant();

                                                System.out.println("\n1 - Airport" + "\nq - Exit Program" + "\n");

                                                do {
                                                    choice = sc.nextLine();

                                                    // Path taken by choosing to go to the Airport after going to the Restaurant which
                                                    // was the fifth destination after the Mall, Port, Train Station, and Hotel
                                                    if (choice.equals("1")) {

                                                        plane();

                                                        System.out.println("\nq - Exit Program" + "\n");

                                                        do {
                                                            choice = sc.nextLine();

                                                            // Path taken by choosing to exit the program after going to the Airport
                                                            // which was the sixth destination after the Restaurant, Mall, Port,
                                                            // Train Station, and Hotel
                                                            if (choice.equals("q")) {

                                                                badInput = false;
                                                                exit();

                                                            } else {
                                                                badInput = true;
                                                                System.out.println("\nPlease reenter your answer: " + "\n");
                                                            }
                                                        } while (badInput);

                                                    } else if (choice.equals("q")) {

                                                        badInput = false;
                                                        exit();

                                                    } else {

                                                        badInput = true;
                                                        System.out.println("\nPlease reenter your answer: " + "\n");
                                                    }

                                                } while (badInput);

                                                // Path taken by choosing to go to the Airport after going to the Mall which was the
                                                // fourth destination after the Port, Train Station, and Hotel
                                            } else if (choice.equals("2")) {

                                                plane();
                                                System.out.println("\n1 - Restaurant" + "\nq - Exit Program" + "\n");

                                                do {
                                                    choice = sc.nextLine();

                                                    // Path taken by choosing to go to the Restaurant after going to the Airport
                                                    // which was the fifth destination after the Mall, Port, Train Station, and Hotel
                                                    if (choice.equals("1")) {

                                                        restaurant();
                                                        System.out.println("\nq - Exit Program" + "\n");

                                                        do {
                                                            choice = sc.nextLine();

                                                            // Path taken by choosing to exit the program after going to the
                                                            // Restaurant which was the sixth destination after the Airport, Mall,
                                                            // Port, Train Station, and Hotel
                                                            if (choice.equals("q")) {

                                                                badInput = false;
                                                                exit();

                                                            } else {

                                                                badInput = true;
                                                                System.out.println("Please reenter your answer: ");
                                                            }
                                                        } while (badInput);

                                                        // Path taken by choosing to exit the program after going to the Airport
                                                        // which was the fifth destination after the Mall, Port, Train Station, and Hotel
                                                    } else if (choice.equals("q")) {

                                                        badInput = false;
                                                        exit();

                                                    } else {

                                                        badInput = true;
                                                        System.out.println("Please reenter your answer: ");

                                                    }
                                                } while (badInput);

                                                // Path taken by choosing to exit the program after going to the Port which was the
                                                // third destination after the Train Station and Hotel
                                            } else if (choice.equals("q")) {

                                                badInput = false;
                                                exit();

                                            } else {

                                                badInput = true;
                                                System.out.println("Please reenter your answer: ");

                                            }

                                        } while (badInput);

                                    // Path taken by choosing to go to the Restaurant after going to the Port which was the
                                    // third destination after the Train Station and Hotel
                                    } else if (choice.equals("2")) {

                                        badInput = false;
                                        restaurant();
                                        System.out.println("\n1 - Mall" + "\n2 - Airport" + "\nq - Exit Program" + "\n");

                                        do {
                                            choice = sc.nextLine();

                                            // Path taken by choosing to go to the Mall after going to the Restaurant which was
                                            // the fourth destination after the Port, Train Station, and Hotel
                                            if (choice.equals("1")) {

                                                mall();
                                                System.out.println("\n1 - Airport" + "\nq - Exit Program" + "\n");

                                                do {
                                                    choice = sc.nextLine();

                                                    // Path taken by choosing to go to the Airport after going to the Mall which
                                                    // was the fifth destination after the Restaurant, Port, Train Station, and Hotel
                                                    if (choice.equals("1")) {

                                                        plane();
                                                        System.out.println("\nq - Exit Program" + "\n");

                                                        do {
                                                            choice = sc.nextLine();

                                                            // Path taken by choosing to exit the program after going to the
                                                            // Airport which was the sixth destination after the Mall, Restaurant,
                                                            // Port, Train Station, and Hotel
                                                            if (choice.equals("q")) {

                                                                badInput = false;
                                                                exit();

                                                            } else {

                                                                badInput = true;
                                                                System.out.println("Please reenter your answer: ");

                                                            }
                                                        } while (badInput);

                                                        // Path taken by choosing to exit the program after going to the Mall which
                                                        // was the fifth destination after the Restaurant, Port, Train Station, and Hotel
                                                    } else if (choice.equals("q")) {

                                                        badInput = false;
                                                        exit();

                                                    } else {

                                                        badInput = true;
                                                        System.out.println("Please reenter your answer: ");
                                                    }

                                                } while (badInput);

                                            // Path taken by choosing to go to the Airport after going to the Restaurant which
                                            // was the fourth destination after the Port, Train Station, and Hotel
                                            } else if (choice.equals("2")) {

                                                plane();
                                                System.out.println("\n1 - Mall" + "\nq - Exit Program" + "\n");

                                                do {
                                                    choice = sc.nextLine();

                                                    // Path taken by choosing to go to the Mall after going to the Airport which was
                                                    // the fifth destination after the Restaurant, Port, Train Station, and Hotel
                                                    if (choice.equals("1")) {

                                                        badInput = false;
                                                        mall();
                                                        System.out.println("\nq - Exit Program" + "\n");

                                                        do {
                                                            choice = sc.nextLine();

                                                            // Path taken by choosing to exit the program after going to the Mall
                                                            // which was the sixth destination after the Airport, Restaurant, Port,
                                                            // Train Station, and Hotel
                                                            if (choice.equals("q")) {

                                                                badInput = false;
                                                                exit();

                                                            } else {

                                                                badInput = true;
                                                                System.out.println("\nPlease reenter your answer: ");

                                                            }

                                                        } while (badInput);

                                                        // Path taken by choosing to exit the program after going to the Airport which
                                                        // was the fifth destination after the Restaurant, Port, Train Station, and Hotel
                                                    } else if (choice.equals("q")) {

                                                        badInput = false;
                                                        exit();

                                                    } else {

                                                        badInput = true;
                                                        System.out.println("Please reenter your answer: ");
                                                    }
                                                } while (badInput);

                                                // Path taken by choosing to exit the program after going to the Restaurant which was
                                                // the fourth destination after the Port, Train Station, and Hotel
                                            } else if (choice.equals("q")) {

                                                exit();

                                            }
                                        } while (badInput);

                                    // Path taken by choosing to go to the Airport after going to the Port which was the third
                                    // destination after the Train Station and Hotel
                                    } else if (choice.equals("3")) {

                                        badInput = false;
                                        plane();
                                        System.out.println("\n1 - Restaurant" + "\n2 - Mall" + "\nq - Exit Program" + "\n");
                                        choice = sc.nextLine();

                                        if (choice.equals("1")) {

                                            restaurant();
                                            System.out.println("\n1 - Mall" + "\nq - Exit Program" + "\n");
                                            choice = sc.nextLine();

                                            if (choice.equals("1")) {

                                                mall();
                                                System.out.println("\nq - Exit Program" + "\n");
                                                choice = sc.nextLine();

                                                do {
                                                    if (choice.equals("q")) {

                                                        exit();

                                                    } else {

                                                        badInput = true;
                                                        System.out.println("Please reenter your answer: ");
                                                    }
                                                } while (badInput);
                                            }

                                        } else if (choice.equals("2")) {

                                            mall();
                                            System.out.println("\n1 - Restaurant" + "\nq - Exit Program" + "\n");
                                            choice = sc.nextLine();

                                            if (choice.equals("1")) {

                                                restaurant();
                                                System.out.println("\nq - Exit Program" + "\n");
                                                choice = sc.nextLine();

                                                do {
                                                    if (choice.equals("q")) {

                                                        exit();

                                                    } else {

                                                        badInput = true;
                                                        System.out.println("Please reenter your answer: ");
                                                    }
                                                } while (badInput);
                                            }
                                        }

                                    } else if (choice.equals("q")) {

                                        badInput = false;
                                        exit();

                                    } else {

                                        badInput = true;
                                        System.out.println("Please reenter your answer: ");

                                    }
                                } while (badInput);

                            // Path taken by choosing to go the Mall after going to the Train Station which was the second destination
                            // after the hotel
                            } else if (choice.equals("2")) {

                                badInput = false;

                                mall();

                                System.out.println("\n1 - Train Station" + "\n2 - Airport" + "\n3 - Port" +
                                        "\n4 - Restaurant" + "\nq - Exit Program" + "\n");

                                do {
                                    choice = sc.nextLine();

                                    // Path taken by choosing to go to the Mall after going to the Port which was the third
                                    // destination after the Train Station and Hotel
                                    if (choice.equals("1")) {

                                        badInput = false;
                                        train();
                                        System.out.println("\n1 - Restaurant" + "\n2 - Airport" + "\nq - Exit Program" + "\n");

                                        do {
                                            choice = sc.nextLine();

                                            // Path taken by choosing to go to the Restaurant after going to the Mall which was the
                                            // fourth destination after the Port, Train Station, and Hotel
                                            if (choice.equals("1")) {

                                                restaurant();

                                                System.out.println("\n1 - Airport" + "\nq - Exit Program" + "\n");

                                                do {
                                                    choice = sc.nextLine();

                                                    // Path taken by choosing to go to the Airport after going to the Restaurant which
                                                    // was the fifth destination after the Mall, Port, Train Station, and Hotel
                                                    if (choice.equals("1")) {

                                                        plane();

                                                        System.out.println("\nq - Exit Program" + "\n");

                                                        do {
                                                            choice = sc.nextLine();

                                                            // Path taken by choosing to exit the program after going to the Airport
                                                            // which was the sixth destination after the Restaurant, Mall, Port,
                                                            // Train Station, and Hotel
                                                            if (choice.equals("q")) {

                                                                badInput = false;
                                                                exit();

                                                            } else {
                                                                badInput = true;
                                                                System.out.println("\nPlease reenter your answer: " + "\n");
                                                            }
                                                        } while (badInput);

                                                    } else if (choice.equals("q")) {

                                                        badInput = false;
                                                        exit();

                                                    } else {

                                                        badInput = true;
                                                        System.out.println("\nPlease reenter your answer: " + "\n");
                                                    }

                                                } while (badInput);

                                                // Path taken by choosing to go to the Airport after going to the Mall which was the
                                                // fourth destination after the Port, Train Station, and Hotel
                                            } else if (choice.equals("2")) {

                                                plane();
                                                System.out.println("\n1 - Restaurant" + "\nq - Exit Program" + "\n");

                                                do {
                                                    choice = sc.nextLine();

                                                    // Path taken by choosing to go to the Restaurant after going to the Airport
                                                    // which was the fifth destination after the Mall, Port, Train Station, and Hotel
                                                    if (choice.equals("1")) {

                                                        restaurant();
                                                        System.out.println("\nq - Exit Program" + "\n");

                                                        do {
                                                            choice = sc.nextLine();

                                                            // Path taken by choosing to exit the program after going to the
                                                            // Restaurant which was the sixth destination after the Airport, Mall,
                                                            // Port, Train Station, and Hotel
                                                            if (choice.equals("q")) {

                                                                badInput = false;
                                                                exit();

                                                            } else {

                                                                badInput = true;
                                                                System.out.println("Please reenter your answer: ");
                                                            }
                                                        } while (badInput);

                                                        // Path taken by choosing to exit the program after going to the Airport
                                                        // which was the fifth destination after the Mall, Port, Train Station, and Hotel
                                                    } else if (choice.equals("q")) {

                                                        badInput = false;
                                                        exit();

                                                    } else {

                                                        badInput = true;
                                                        System.out.println("Please reenter your answer: ");

                                                    }
                                                } while (badInput);

                                                // Path taken by choosing to exit the program after going to the Port which was the
                                                // third destination after the Train Station and Hotel
                                            } else if (choice.equals("q")) {

                                                badInput = false;
                                                exit();

                                            } else {

                                                badInput = true;
                                                System.out.println("Please reenter your answer: ");

                                            }

                                        } while (badInput);

                                    // Path taken by choosing to go to the Airport after going to the Port which was the
                                    // third destination after the Train Station and Hotel
                                    } else if (choice.equals("2")) {

                                        badInput = false;
                                        plane();
                                        System.out.println("\n1 - Mall" + "\n2 - Restaurant" + "\nq - Exit Program" + "\n");

                                        do {
                                            choice = sc.nextLine();

                                            // Path taken by choosing to go to the Mall after going to the Restaurant which was
                                            // the fourth destination after the Port, Train Station, and Hotel
                                            if (choice.equals("1")) {

                                                mall();
                                                System.out.println("\n1 - Restaurant" + "\nq - Exit Program" + "\n");

                                                do {
                                                    choice = sc.nextLine();

                                                    // Path taken by choosing to go to the Airport after going to the Mall which
                                                    // was the fifth destination after the Restaurant, Port, Train Station, and Hotel
                                                    if (choice.equals("1")) {

                                                        restaurant();
                                                        System.out.println("\nq - Exit Program" + "\n");

                                                        do {
                                                            choice = sc.nextLine();

                                                            // Path taken by choosing to exit the program after going to the
                                                            // Airport which was the sixth destination after the Mall, Restaurant,
                                                            // Port, Train Station, and Hotel
                                                            if (choice.equals("q")) {

                                                                badInput = false;
                                                                exit();

                                                            } else {

                                                                badInput = true;
                                                                System.out.println("Please reenter your answer: ");

                                                            }
                                                        } while (badInput);

                                                        // Path taken by choosing to exit the program after going to the Mall which
                                                        // was the fifth destination after the Restaurant, Port, Train Station, and Hotel
                                                    } else if (choice.equals("q")) {

                                                        badInput = false;
                                                        exit();

                                                    } else {

                                                        badInput = true;
                                                        System.out.println("Please reenter your answer: ");
                                                    }

                                                } while (badInput);

                                                // Path taken by choosing to go to the Airport after going to the Restaurant which
                                                // was the fourth destination after the Port, Train Station, and Hotel
                                            } else if (choice.equals("2")) {

                                                restaurant();
                                                System.out.println("\n1 - Mall" + "\nq - Exit Program" + "\n");

                                                do {
                                                    choice = sc.nextLine();

                                                    // Path taken by choosing to go to the Mall after going to the Airport which was
                                                    // the fifth destination after the Restaurant, Port, Train Station, and Hotel
                                                    if (choice.equals("1")) {

                                                        badInput = false;
                                                        mall();
                                                        System.out.println("\nq - Exit Program" + "\n");

                                                        do {
                                                            choice = sc.nextLine();

                                                            // Path taken by choosing to exit the program after going to the Mall
                                                            // which was the sixth destination after the Airport, Restaurant, Port,
                                                            // Train Station, and Hotel
                                                            if (choice.equals("q")) {

                                                                badInput = false;
                                                                exit();

                                                            } else {

                                                                badInput = true;
                                                                System.out.println("\nPlease reenter your answer: ");

                                                            }

                                                        } while (badInput);

                                                        // Path taken by choosing to exit the program after going to the Airport which
                                                        // was the fifth destination after the Restaurant, Port, Train Station, and Hotel
                                                    } else if (choice.equals("q")) {

                                                        badInput = false;
                                                        exit();

                                                    } else {

                                                        badInput = true;
                                                        System.out.println("Please reenter your answer: ");
                                                    }
                                                } while (badInput);

                                                // Path taken by choosing to exit the program after going to the Restaurant which was
                                                // the fourth destination after the Port, Train Station, and Hotel
                                            } else if (choice.equals("q")) {

                                                badInput = false;
                                                exit();

                                            } else {

                                                badInput = true;
                                                System.out.println("Please reenter your answer: ");
                                            }

                                        } while (badInput);

                                    // Path taken by choosing to go to the Port after going to the Port which was the third
                                    // destination after the Train Station and Hotel
                                    } else if (choice.equals("3")) {

                                        badInput = false;
                                        boat();
                                        System.out.println("\n1 - Restaurant" + "\n2 - Mall" + "\nq - Exit Program" + "\n");
                                        choice = sc.nextLine();

                                        if (choice.equals("1")) {

                                            restaurant();
                                            System.out.println("\n1 - Mall" + "\nq - Exit Program" + "\n");
                                            choice = sc.nextLine();

                                            if (choice.equals("1")) {

                                                mall();
                                                System.out.println("\nq - Exit Program" + "\n");
                                                choice = sc.nextLine();

                                                do {
                                                    if (choice.equals("q")) {

                                                        exit();

                                                    } else {

                                                        badInput = true;
                                                        System.out.println("Please reenter your answer: ");
                                                    }
                                                } while (badInput);
                                            }

                                        } else if (choice.equals("2")) {

                                            mall();
                                            System.out.println("\n1 - Restaurant" + "\nq - Exit Program" + "\n");
                                            choice = sc.nextLine();

                                            if (choice.equals("1")) {

                                                restaurant();
                                                System.out.println("\nq - Exit Program" + "\n");
                                                choice = sc.nextLine();

                                                do {
                                                    if (choice.equals("q")) {

                                                        exit();

                                                    } else {

                                                        badInput = true;
                                                        System.out.println("Please reenter your answer: ");
                                                    }
                                                } while (badInput);
                                            }
                                        }

                                    } else if (choice.equals("4")) {
                                        badInput = false;
                                        plane();
                                        System.out.println("\n1 - Mall" + "\n2 - Restaurant" + "\nq - Exit Program" + "\n");

                                        do {
                                            choice = sc.nextLine();

                                            // Path taken by choosing to go to the Mall after going to the Restaurant which was
                                            // the fourth destination after the Port, Train Station, and Hotel
                                            if (choice.equals("1")) {

                                                mall();
                                                System.out.println("\n1 - Restaurant" + "\nq - Exit Program" + "\n");

                                                do {
                                                    choice = sc.nextLine();

                                                    // Path taken by choosing to go to the Airport after going to the Mall which
                                                    // was the fifth destination after the Restaurant, Port, Train Station, and Hotel
                                                    if (choice.equals("1")) {

                                                        restaurant();
                                                        System.out.println("\nq - Exit Program" + "\n");

                                                        do {
                                                            choice = sc.nextLine();

                                                            // Path taken by choosing to exit the program after going to the
                                                            // Airport which was the sixth destination after the Mall, Restaurant,
                                                            // Port, Train Station, and Hotel
                                                            if (choice.equals("q")) {

                                                                badInput = false;
                                                                exit();

                                                            } else {

                                                                badInput = true;
                                                                System.out.println("Please reenter your answer: ");

                                                            }
                                                        } while (badInput);

                                                        // Path taken by choosing to exit the program after going to the Mall which
                                                        // was the fifth destination after the Restaurant, Port, Train Station, and Hotel
                                                    } else if (choice.equals("q")) {

                                                        badInput = false;
                                                        exit();

                                                    } else {

                                                        badInput = true;
                                                        System.out.println("Please reenter your answer: ");
                                                    }

                                                } while (badInput);

                                                // Path taken by choosing to go to the Airport after going to the Restaurant which
                                                // was the fourth destination after the Port, Train Station, and Hotel
                                            } else if (choice.equals("2")) {

                                                restaurant();
                                                System.out.println("\n1 - Mall" + "\nq - Exit Program" + "\n");

                                                do {
                                                    choice = sc.nextLine();

                                                    // Path taken by choosing to go to the Mall after going to the Airport which was
                                                    // the fifth destination after the Restaurant, Port, Train Station, and Hotel
                                                    if (choice.equals("1")) {

                                                        badInput = false;
                                                        mall();
                                                        System.out.println("\nq - Exit Program" + "\n");

                                                        do {
                                                            choice = sc.nextLine();

                                                            // Path taken by choosing to exit the program after going to the Mall
                                                            // which was the sixth destination after the Airport, Restaurant, Port,
                                                            // Train Station, and Hotel
                                                            if (choice.equals("q")) {

                                                                badInput = false;
                                                                exit();

                                                            } else {

                                                                badInput = true;
                                                                System.out.println("\nPlease reenter your answer: ");

                                                            }

                                                        } while (badInput);

                                                        // Path taken by choosing to exit the program after going to the Airport which
                                                        // was the fifth destination after the Restaurant, Port, Train Station, and Hotel
                                                    } else if (choice.equals("q")) {

                                                        badInput = false;
                                                        exit();

                                                    } else {

                                                        badInput = true;
                                                        System.out.println("Please reenter your answer: ");
                                                    }
                                                } while (badInput);

                                                // Path taken by choosing to exit the program after going to the Restaurant which was
                                                // the fourth destination after the Port, Train Station, and Hotel
                                            } else if (choice.equals("q")) {

                                                badInput = false;
                                                exit();

                                            } else {

                                                badInput = true;
                                                System.out.println("Please reenter your answer: ");
                                            }

                                        } while (badInput);
                                    }

                                    else if (choice.equals("q")) {

                                        badInput = false;
                                        exit();

                                    } else {

                                        badInput = true;
                                        System.out.println("Please reenter your answer: ");

                                    }
                                } while (badInput);

                                // Path taken by choosing to go the Restaurant after going to the Train Station which was the second destination
                                // after the hotel
                            } else if (choice.equals("3")) {

                                badInput = false;

                                plane();

                            } else if (choice.equals("4")) {

                                badInput = false;

                                train();

                            }

                            else if (choice.equals("q")) {

                                badInput = false;

                                exit();

                            } else {

                                badInput = true;

                                System.out.println("\nPlease reenter which destination you would like to go to or press q to finish" +
                                        " your tour: " + "\n");
                            }

                        } while (badInput);

                    } else if (choice.equals("5")) {

                        badInput = false;
                        plane();

                        System.out.println("\n1 - Train Station" + "\n2 - Port" + "\n3 - Mall" + "\n4 - Restaurant" +
                                "\nq - Exit Program" + "\n");

                    } else if (choice.equals("q")) {

                        badInput = false;
                        exit();

                    } else {

                        badInput = true;
                        System.out.println("\nPlease reenter which destination you would like to go to or press q to " +
                                "finish your tour: " + "\n");
                    }

                } while (badInput);

            } else if (choice.equals("2")) {

                badInput = false;

                plane();

                System.out.println("\n1 - Train Station" + "\n2 - Port" + "\n3 - Mall" + "\n4 - Restaurant" + "\n5 -" +
                        " Hotel" + "\nq - Exit Program" + "\n");

                do {

                    choice = sc.nextLine();

                    //Path taken by choosing to go to the Train Station after the hotel
                    if (choice.equals("1")) {

                        badInput = false;

                        train();

                        System.out.println("\n1 - Port" + "\n2 - Mall" + "\n3 - Restaurant" + "\n4 - Airport" + "\nq - Exit"
                                + " Program" + "\n");

                        do {
                            choice = sc.nextLine();

                            // Path taken by choosing to go the Port after going to the Train Station which was the second
                            // destination after the Hotel
                            if (choice.equals("1")) {

                                badInput = false;

                                boat();

                                System.out.println("\n1 - Mall" + "\n2 - Restaurant" + "\n3 - Airport" + "\nq - Exit Program" +
                                        "\n");

                                do {
                                    choice = sc.nextLine();

                                    // Path taken by choosing to go to the Mall after going to the Port which was the third
                                    // destination after the Train Station and Hotel
                                    if (choice.equals("1")) {

                                        badInput = false;
                                        mall();
                                        System.out.println("\n1 - Restaurant" + "\n2 - Airport" + "\nq - Exit Program" + "\n");

                                        do {
                                            choice = sc.nextLine();

                                            // Path taken by choosing to go to the Restaurant after going to the Mall which was the
                                            // fourth destination after the Port, Train Station, and Hotel
                                            if (choice.equals("1")) {

                                                restaurant();

                                                System.out.println("\n1 - Airport" + "\nq - Exit Program" + "\n");

                                                do {
                                                    choice = sc.nextLine();

                                                    // Path taken by choosing to go to the Airport after going to the Restaurant which
                                                    // was the fifth destination after the Mall, Port, Train Station, and Hotel
                                                    if (choice.equals("1")) {

                                                        plane();

                                                        System.out.println("\nq - Exit Program" + "\n");

                                                        do {
                                                            choice = sc.nextLine();

                                                            // Path taken by choosing to exit the program after going to the Airport
                                                            // which was the sixth destination after the Restaurant, Mall, Port,
                                                            // Train Station, and Hotel
                                                            if (choice.equals("q")) {

                                                                badInput = false;
                                                                exit();

                                                            } else {
                                                                badInput = true;
                                                                System.out.println("\nPlease reenter your answer: " + "\n");
                                                            }
                                                        } while (badInput);

                                                    } else if (choice.equals("q")) {

                                                        badInput = false;
                                                        exit();

                                                    } else {

                                                        badInput = true;
                                                        System.out.println("\nPlease reenter your answer: " + "\n");
                                                    }

                                                } while (badInput);

                                                // Path taken by choosing to go to the Airport after going to the Mall which was the
                                                // fourth destination after the Port, Train Station, and Hotel
                                            } else if (choice.equals("2")) {

                                                plane();
                                                System.out.println("\n1 - Restaurant" + "\nq - Exit Program" + "\n");

                                                do {
                                                    choice = sc.nextLine();

                                                    // Path taken by choosing to go to the Restaurant after going to the Airport
                                                    // which was the fifth destination after the Mall, Port, Train Station, and Hotel
                                                    if (choice.equals("1")) {

                                                        restaurant();
                                                        System.out.println("\nq - Exit Program" + "\n");

                                                        do {
                                                            choice = sc.nextLine();

                                                            // Path taken by choosing to exit the program after going to the
                                                            // Restaurant which was the sixth destination after the Airport, Mall,
                                                            // Port, Train Station, and Hotel
                                                            if (choice.equals("q")) {

                                                                badInput = false;
                                                                exit();

                                                            } else {

                                                                badInput = true;
                                                                System.out.println("Please reenter your answer: ");
                                                            }
                                                        } while (badInput);

                                                        // Path taken by choosing to exit the program after going to the Airport
                                                        // which was the fifth destination after the Mall, Port, Train Station, and Hotel
                                                    } else if (choice.equals("q")) {

                                                        badInput = false;
                                                        exit();

                                                    } else {

                                                        badInput = true;
                                                        System.out.println("Please reenter your answer: ");

                                                    }
                                                } while (badInput);

                                                // Path taken by choosing to exit the program after going to the Port which was the
                                                // third destination after the Train Station and Hotel
                                            } else if (choice.equals("q")) {

                                                badInput = false;
                                                exit();

                                            } else {

                                                badInput = true;
                                                System.out.println("Please reenter your answer: ");

                                            }

                                        } while (badInput);

                                        // Path taken by choosing to go to the Restaurant after going to the Port which was the
                                        // third destination after the Train Station and Hotel
                                    } else if (choice.equals("2")) {

                                        badInput = false;
                                        restaurant();
                                        System.out.println("\n1 - Mall" + "\n2 - Airport" + "\nq - Exit Program" + "\n");

                                        do {
                                            choice = sc.nextLine();

                                            // Path taken by choosing to go to the Mall after going to the Restaurant which was
                                            // the fourth destination after the Port, Train Station, and Hotel
                                            if (choice.equals("1")) {

                                                mall();
                                                System.out.println("\n1 - Airport" + "\nq - Exit Program" + "\n");

                                                do {
                                                    choice = sc.nextLine();

                                                    // Path taken by choosing to go to the Airport after going to the Mall which
                                                    // was the fifth destination after the Restaurant, Port, Train Station, and Hotel
                                                    if (choice.equals("1")) {

                                                        plane();
                                                        System.out.println("\nq - Exit Program" + "\n");

                                                        do {
                                                            choice = sc.nextLine();

                                                            // Path taken by choosing to exit the program after going to the
                                                            // Airport which was the sixth destination after the Mall, Restaurant,
                                                            // Port, Train Station, and Hotel
                                                            if (choice.equals("q")) {

                                                                badInput = false;
                                                                exit();

                                                            } else {

                                                                badInput = true;
                                                                System.out.println("Please reenter your answer: ");

                                                            }
                                                        } while (badInput);

                                                        // Path taken by choosing to exit the program after going to the Mall which
                                                        // was the fifth destination after the Restaurant, Port, Train Station, and Hotel
                                                    } else if (choice.equals("q")) {

                                                        badInput = false;
                                                        exit();

                                                    } else {

                                                        badInput = true;
                                                        System.out.println("Please reenter your answer: ");
                                                    }

                                                } while (badInput);

                                                // Path taken by choosing to go to the Airport after going to the Restaurant which
                                                // was the fourth destination after the Port, Train Station, and Hotel
                                            } else if (choice.equals("2")) {

                                                plane();
                                                System.out.println("\n1 - Mall" + "\nq - Exit Program" + "\n");

                                                do {
                                                    choice = sc.nextLine();

                                                    // Path taken by choosing to go to the Mall after going to the Airport which was
                                                    // the fifth destination after the Restaurant, Port, Train Station, and Hotel
                                                    if (choice.equals("1")) {

                                                        badInput = false;
                                                        mall();
                                                        System.out.println("\nq - Exit Program" + "\n");

                                                        do {
                                                            choice = sc.nextLine();

                                                            // Path taken by choosing to exit the program after going to the Mall
                                                            // which was the sixth destination after the Airport, Restaurant, Port,
                                                            // Train Station, and Hotel
                                                            if (choice.equals("q")) {

                                                                badInput = false;
                                                                exit();

                                                            } else {

                                                                badInput = true;
                                                                System.out.println("\nPlease reenter your answer: ");

                                                            }

                                                        } while (badInput);

                                                        // Path taken by choosing to exit the program after going to the Airport which
                                                        // was the fifth destination after the Restaurant, Port, Train Station, and Hotel
                                                    } else if (choice.equals("q")) {

                                                        badInput = false;
                                                        exit();

                                                    } else {

                                                        badInput = true;
                                                        System.out.println("Please reenter your answer: ");
                                                    }
                                                } while (badInput);

                                                // Path taken by choosing to exit the program after going to the Restaurant which was
                                                // the fourth destination after the Port, Train Station, and Hotel
                                            } else if (choice.equals("q")) {

                                                exit();

                                            }
                                        } while (badInput);

                                        // Path taken by choosing to go to the Airport after going to the Port which was the third
                                        // destination after the Train Station and Hotel
                                    } else if (choice.equals("3")) {

                                        badInput = false;
                                        plane();
                                        System.out.println("\n1 - Restaurant" + "\n2 - Mall" + "\nq - Exit Program" + "\n");
                                        choice = sc.nextLine();

                                        if (choice.equals("1")) {

                                            restaurant();
                                            System.out.println("\n1 - Mall" + "\nq - Exit Program" + "\n");
                                            choice = sc.nextLine();

                                            if (choice.equals("1")) {

                                                mall();
                                                System.out.println("\nq - Exit Program" + "\n");
                                                choice = sc.nextLine();

                                                do {
                                                    if (choice.equals("q")) {

                                                        exit();

                                                    } else {

                                                        badInput = true;
                                                        System.out.println("Please reenter your answer: ");
                                                    }
                                                } while (badInput);
                                            }

                                        } else if (choice.equals("2")) {

                                            mall();
                                            System.out.println("\n1 - Restaurant" + "\nq - Exit Program" + "\n");
                                            choice = sc.nextLine();

                                            if (choice.equals("1")) {

                                                restaurant();
                                                System.out.println("\nq - Exit Program" + "\n");
                                                choice = sc.nextLine();

                                                do {
                                                    if (choice.equals("q")) {

                                                        exit();

                                                    } else {

                                                        badInput = true;
                                                        System.out.println("Please reenter your answer: ");
                                                    }
                                                } while (badInput);
                                            }
                                        }

                                    } else if (choice.equals("q")) {

                                        badInput = false;
                                        exit();

                                    } else {

                                        badInput = true;
                                        System.out.println("Please reenter your answer: ");

                                    }
                                } while (badInput);

                                // Path taken by choosing to go the Mall after going to the Train Station which was the second destination
                                // after the hotel
                            } else if (choice.equals("2")) {

                                badInput = false;

                                mall();

                                System.out.println("\n1 - Train Station" + "\n2 - Airport" + "\n3 - Port" + "\n4 - Restaurant" +
                                        "\n");

                                // Path taken by choosing to go the Restaurant after going to the Train Station which was the second destination
                                // after the hotel
                            } else if (choice.equals("3")) {

                                badInput = false;

                                restaurant();

                                // Path taken by choosing to go the Airport after going to the Train Station which was the second destination
                                // after the hotel
                            } else if (choice.equals("4")) {

                                badInput = false;

                                plane();

                            } else if (choice.equals("q")) {

                                badInput = false;

                                exit();

                            } else {

                                badInput = true;

                                System.out.println("\nPlease reenter which destination you would like to go to or press q to finish" +
                                        " your tour: " + "\n");
                            }

                        } while (badInput);

                        //Path taken by choosing to go to the Port after the hotel
                    } else if (choice.equals("2")) {

                        badInput = false;

                        boat();

                        System.out.println("\n1 - Train Station" + "\n2 - Mall" + "\n3 - Restaurant" + "\n4 - Airport" +
                                "\nq - Exit Program" + "\n");

                        do {
                            choice = sc.nextLine();

                            // Path taken by choosing to go the Train Station after going to the Port which was the second destination
                            // after the Hotel
                            if (choice.equals("1")) {

                                badInput = false;
                                train();

                                System.out.println("\n1 - Mall" + "\n2 - Restaurant" + "\n3 - Airport" + "\nq - Exit Program" +
                                        "\n");

                                do {
                                    choice = sc.nextLine();

                                    // Path taken by choosing to go to the Mall after going to the Train Station which was the
                                    // third destination after the Port and Hotel
                                    if (choice.equals("1")) {

                                        badInput = false;
                                        mall();
                                        System.out.println("\n1 - Restaurant" + "\n2 - Airport" + "\nq - Exit Program" + "\n");

                                        do {
                                            choice = sc.nextLine();

                                            // Path taken by choosing to go to the Restaurant after going to the Mall which was the
                                            // fourth destination after the Train Station, Port, and Hotel
                                            if (choice.equals("1")) {

                                                badInput = false;
                                                restaurant();

                                                System.out.println("\n1 - Airport" + "\nq - Exit Program" + "\n");

                                                do {
                                                    choice = sc.nextLine();

                                                    // Path taken by choosing to go to the Airport after going to the Restaurant which
                                                    // was the fifth destination after the Mall, Train Station, Port, and Hotel
                                                    if (choice.equals("1")) {

                                                        plane();

                                                        System.out.println("\nq - Exit Program" + "\n");

                                                        do {
                                                            choice = sc.nextLine();

                                                            // Path taken by choosing to exit the program after going to the Airport
                                                            // which was the sixth destination after the Restaurant, Mall,
                                                            // Train Station, Port, and Hotel
                                                            if (choice.equals("q")) {

                                                                badInput = false;
                                                                exit();

                                                            } else {

                                                                badInput = true;
                                                                System.out.println("Please reenter your answer: ");

                                                            }
                                                        } while (badInput);

                                                    } else if (choice.equals("q")) {

                                                        badInput = false;
                                                        exit();

                                                    } else {

                                                        badInput = true;
                                                        System.out.println("Please reenter your answer: ");

                                                    }
                                                } while (badInput);

                                                // Path taken by choosing to go to the Airport after going to the Mall which was the
                                                // fourth destination after the Train Station, Port, and Hotel
                                            } else if (choice.equals("2")) {

                                                badInput = false;
                                                plane();
                                                System.out.println("\n1 - Restaurant" + "\nq - Exit Program" + "\n");

                                                do {
                                                    choice = sc.nextLine();

                                                    // Path taken by choosing to go to the Restaurant after going to the Airport
                                                    // which was the fifth destination after the Mall, Train Station, Port, and Hotel
                                                    if (choice.equals("1")) {

                                                        restaurant();
                                                        System.out.println("\nq - Exit Program" + "\n");

                                                        do {
                                                            choice = sc.nextLine();

                                                            // Path taken by choosing to exit the program after going to the Restaurant
                                                            // which was the sixth destination after the Airport, Mall,
                                                            // Train Station, Port, and Hotel
                                                            if (choice.equals("q")) {

                                                                badInput = false;
                                                                exit();

                                                            } else {

                                                                badInput = true;
                                                                System.out.println("Please reenter your answer: ");

                                                            }
                                                        } while (badInput);
                                                    }
                                                } while (badInput);

                                                // Path taken by choosing to exit the program after going to the Mall which was the
                                                // fourth destination after the Train Station, Port, and Hotel
                                            } else if (choice.equals("q")) {

                                                badInput = false;
                                                exit();

                                            } else {

                                                badInput = true;
                                                System.out.println("Please reenter your answer: ");

                                            }
                                        } while (badInput);

                                        // Path taken by choosing to go to the Restaurant after going to the Train Station which was
                                        // the third destination after the Port and Hotel
                                    } else if (choice.equals("2")) {

                                        badInput = false;
                                        restaurant();
                                        System.out.println("\n1 - Mall" + "\n2 - Airport" + "\nq - Exit Program" + "\n");

                                        do {
                                            choice = sc.nextLine();

                                            // Path taken by choosing to go to the Mall after going to the Restaurant which was the
                                            // fourth destination after the Train Station, Port, and Hotel
                                            if (choice.equals("1")) {

                                                badInput = false;
                                                mall();
                                                System.out.println("\n1 - Airport" + "\nq - Exit Program" + "\n");

                                                do {
                                                    choice = sc.nextLine();

                                                    // Path taken by choosing to go to the Airport after going to the Mall which was the
                                                    // fifth destination after the Restaurant, Train Station, Port, and Hotel
                                                    if (choice.equals("1")) {

                                                        plane();
                                                        System.out.println("\nq - Exit Program" + "\n");

                                                        do {
                                                            choice = sc.nextLine();

                                                            // Path taken by choosing to exit the program after going to the Airport
                                                            // which was the sixth destination after the Mall, Restaurant, Train Station,
                                                            // Port, and Hotel
                                                            if (choice.equals("q")) {

                                                                exit();

                                                            } else {

                                                                badInput = true;
                                                                System.out.println("Please reenter your answer: ");

                                                            }

                                                        } while (badInput);

                                                    } else if (choice.equals("q")) {

                                                        badInput = false;
                                                        exit();

                                                    } else {

                                                        badInput = true;
                                                        System.out.println("Please reenter your answer: ");

                                                    }

                                                } while (badInput);

                                                // Path taken by choosing to go to the Airport after going to the
                                                // Restaurant which was the fourth destination after the Train Station,
                                                // Port, and Hotel
                                            } else if (choice.equals("2")) {

                                                badInput = false;
                                                plane();
                                                System.out.println("\n1 - Mall" + "\nq - Exit Program" + "\n");

                                                do {
                                                    choice = sc.nextLine();

                                                    if (choice.equals("1")) {

                                                        badInput = false;
                                                        mall();
                                                        System.out.println("\nq - Exit Program" + "\n");
                                                        choice = sc.nextLine();

                                                        do {

                                                            if (choice.equals("q")) {

                                                                badInput = false;
                                                                exit();

                                                            } else {

                                                                badInput = true;
                                                                System.out.println("\nPlease reenter your answer: ");

                                                            }

                                                        } while (badInput);

                                                    } else if (choice.equals("q")) {

                                                        badInput = false;
                                                        exit();

                                                    } else {

                                                        badInput = true;
                                                        System.out.println("Please reenter your answer: ");

                                                    }
                                                } while (badInput);

                                            } else if (choice.equals("q")) {

                                                badInput = false;
                                                exit();

                                            } else {

                                                badInput = true;
                                                System.out.println("Please reenter your answer: ");

                                            }
                                        } while (badInput);

                                    } else if (choice.equals("3")) {

                                        badInput = false;
                                        plane();
                                        System.out.println("\n1 - Restaurant" + "\n2 - Mall" + "\nq - Exit Program" + "\n");

                                        do {
                                            choice = sc.nextLine();

                                            if (choice.equals("1")) {

                                                badInput = false;
                                                restaurant();
                                                System.out.println("\n1 - Mall" + "\nq - Exit Program" + "\n");

                                                do {
                                                    choice = sc.nextLine();

                                                    if (choice.equals("1")) {

                                                        badInput = false;
                                                        mall();
                                                        System.out.println("\nq - Exit Program" + "\n");

                                                        do {
                                                            choice = sc.nextLine();

                                                            if (choice.equals("q")) {

                                                                badInput = false;
                                                                exit();

                                                            } else {

                                                                badInput = true;
                                                                System.out.println("Please reenter your answer: ");

                                                            }
                                                        } while (badInput);

                                                    } else if (choice.equals("q")) {

                                                        badInput = false;
                                                        exit();

                                                    } else {

                                                        badInput = true;
                                                        System.out.println("Please reenter your answer: ");

                                                    }

                                                } while (badInput);

                                            } else if (choice.equals("2")) {

                                                badInput = false;
                                                mall();
                                                System.out.println("\n1 - Restaurant" + "\nq - Exit Program" + "\n");

                                                do {
                                                    choice = sc.nextLine();

                                                    if (choice.equals("1")) {

                                                        restaurant();
                                                        System.out.println("\nq - Exit Program" + "\n");

                                                        do {
                                                            choice = sc.nextLine();

                                                            if (choice.equals("q")) {

                                                                badInput = false;
                                                                exit();

                                                            } else {

                                                                badInput = true;
                                                                System.out.println("Please reenter your answer: ");
                                                            }
                                                        } while (badInput);

                                                    } else if (choice.equals("q")) {

                                                        badInput = false;
                                                        exit();

                                                    } else {

                                                        badInput = true;
                                                        System.out.println("Please reenter your answer: ");

                                                    }

                                                } while (badInput);

                                            } else if (choice.equals("q")) {

                                                badInput = false;
                                                exit();

                                            } else {

                                                badInput = true;
                                                System.out.println("Please reenter your answer: ");

                                            }
                                        } while (badInput);

                                    } else if (choice.equals("q")) {

                                        badInput = false;
                                        exit();

                                    } else {

                                        badInput = true;
                                        System.out.println("Please reenter your answer: ");

                                    }
                                } while (badInput);

                                // Path taken by choosing to go the Mall after going to the Train Station which was the
                                // second destination after the hotel
                            } else if (choice.equals("2")) {

                                badInput = false;
                                mall();

                                System.out.println("\n1 - Train Station" + "\n2 - Airport" + "\n3 - Port" + "\n4 - Restaurant" +
                                        "\n");

                                // Path taken by choosing to go the Restaurant after going to the Train Station which was the second destination
                                // after the hotel
                            } else if (choice.equals("3")) {

                                badInput = false;
                                restaurant();

                                // Path taken by choosing to go the Airport after going to the Train Station which was the second destination
                                // after the hotel
                            } else if (choice.equals("4")) {

                                badInput = false;
                                plane();

                            } else if (choice.equals("q")) {

                                badInput = false;
                                exit();

                            } else {

                                badInput = true;
                                System.out.println("\nPlease reenter which destination you would like to go to or press " +
                                        "q to finish your tour: " + "\n");

                            }
                        } while (badInput);

                        //Path taken by choosing to go to the Mall after the Hotel
                    } else if (choice.equals("3")) {

                        badInput = false;
                        mall();

                        System.out.println("\n1 - Train Station" + "\n2 - Airport" + "\n3 - Port" + "\n4 - Restaurant" +
                                "\nq - Exit Program" + "\n");

                        do {
                            choice = sc.nextLine();

                            // Path taken by choosing to go the Train Station after going to the Port which was the second destination
                            // after the Mall
                            if (choice.equals("1")) {

                                badInput = false;
                                train();

                                System.out.println("\n1 - Port" + "\n2 - Restaurant" + "\n3 - Airport" +
                                        "\nq - Exit Program" + "\n");

                                do {
                                    choice = sc.nextLine();

                                    // Path taken by choosing to go to the Mall after going to the Train Station which was the
                                    // third destination after the Port and Hotel
                                    if (choice.equals("1")) {

                                        badInput = false;
                                        boat();
                                        System.out.println("\n1 - Restaurant" + "\n2 - Airport" + "\nq - Exit Program" + "\n");
                                        choice = sc.nextLine();

                                        // Path taken by choosing to go to the Restaurant after going to the Mall which was the
                                        // fourth destination after the Train Station, Port, and Hotel
                                        if (choice.equals("1")) {

                                            restaurant();

                                            System.out.println("\n1 - Airport" + "\nq - Exit Program" + "\n");

                                            choice = sc.nextLine();

                                            // Path taken by choosing to go to the Airport after going to the Restaurant which
                                            // was the fifth destination after the Mall, Train Station, Port, and Hotel
                                            if (choice.equals("1")) {

                                                plane();

                                                System.out.println("\nq - Exit Program" + "\n");

                                                do {
                                                    choice = sc.nextLine();

                                                    // Path taken by choosing to exit the program after going to the Airport
                                                    // which was the sixth destination after the Restaurant, Mall,
                                                    // Train Station, Port, and Hotel
                                                    if (choice.equals("q")) {

                                                        badInput = false;
                                                        exit();

                                                    } else {
                                                        badInput = true;
                                                        System.out.println("Please reenter your answer: ");
                                                    }
                                                } while (badInput);
                                            }

                                            // Path taken by choosing to go to the Airport after going to the Mall which was the
                                            // fourth destination after the Train Station, Port, and Hotel
                                        } else if (choice.equals("2")) {

                                            plane();
                                            System.out.println("\n1 - Restaurant" + "\nq - Exit Program" + "\n");

                                            do {
                                                choice = sc.nextLine();

                                                // Path taken by choosing to go to the Restaurant after going to the Airport
                                                // which was the fifth destination after the Mall, Train Station, Port, and Hotel
                                                if (choice.equals("1")) {

                                                    restaurant();
                                                    System.out.println("\nq - Exit Program" + "\n");

                                                    do {
                                                        choice = sc.nextLine();

                                                        // Path taken by choosing to exit the program after going to the Restaurant
                                                        // which was the sixth destination after the Airport, Mall,
                                                        // Train Station, Port, and Hotel
                                                        if (choice.equals("q")) {

                                                            badInput = false;
                                                            exit();

                                                        } else {

                                                            badInput = true;
                                                            System.out.println("Please reenter your answer: ");

                                                        }
                                                    } while (badInput);
                                                }
                                            } while (badInput);

                                        // Path taken by choosing to exit the program after going to the Mall which was the
                                        // fourth destination after the Train Station, Port, and Hotel
                                        } else if (choice.equals("q")) {

                                            exit();

                                        }

                                    // Path taken by choosing to go to the Restaurant after going to the Train Station which was
                                    // the third destination after the Port and Hotel
                                    } else if (choice.equals("2")) {

                                        badInput = false;
                                        restaurant();
                                        System.out.println("\n1 - Mall" + "\n2 - Airport" + "\nq - Exit Program" + "\n");
                                        choice = sc.nextLine();

                                        // Path taken by choosing to go to the Mall after going to the Restaurant which was the
                                        // fourth destination after the Train Station, Port, and Hotel
                                        if (choice.equals("1")) {

                                            mall();
                                            System.out.println("\n1 - Airport" + "\nq - Exit Program" + "\n");
                                            choice = sc.nextLine();

                                            // Path taken by choosing to go to the Airport after going to the Mall which was the
                                            // fifth destination after the Restaurant, Train Station, Port, and Hotel
                                            if (choice.equals("1")) {

                                                plane();
                                                System.out.println("\nq - Exit Program" + "\n");

                                                do {
                                                    choice = sc.nextLine();

                                                    // Path taken by choosing to exit the program after going to the Airport
                                                    // which was the sixth destination after the Mall, Restaurant, Train Station,
                                                    // Port, and Hotel
                                                    if (choice.equals("q")) {

                                                        exit();

                                                    } else {

                                                        badInput = true;
                                                        System.out.println("Please reenter your answer: ");

                                                    }
                                                } while (badInput);
                                            }

                                            // Path taken by choosing to go to the Airport after going to the Restaurant which was
                                            // the fourth destination after the Train Station, Port, and Hotel
                                        } else if (choice.equals("2")) {

                                            plane();
                                            System.out.println("\n1 - Mall" + "\nq - Exit Program" + "\n");
                                            choice = sc.nextLine();

                                            if (choice.equals("1")) {

                                                mall();
                                                System.out.println("\nq - Exit Program" + "\n");
                                                choice = sc.nextLine();

                                                do {

                                                    if (choice.equals("q")) {

                                                        badInput = false;
                                                        exit();

                                                    } else {

                                                        badInput = true;
                                                        System.out.println("\nPlease reenter your answer: ");

                                                    }

                                                } while (badInput);

                                            } else if (choice.equals("q")) {

                                                exit();

                                            }

                                        } else if (choice.equals("q")) {

                                            exit();

                                        }

                                    } else if (choice.equals("3")) {

                                        badInput = false;
                                        plane();
                                        System.out.println("\n1 - Restaurant" + "\n2 - Mall" + "\nq - Exit Program" + "\n");
                                        choice = sc.nextLine();

                                        if (choice.equals("1")) {

                                            restaurant();
                                            System.out.println("\n1 - Mall" + "\nq - Exit Program" + "\n");
                                            choice = sc.nextLine();

                                            if (choice.equals("1")) {

                                                mall();
                                                System.out.println("\nq - Exit Program" + "\n");
                                                choice = sc.nextLine();

                                                do {
                                                    if (choice.equals("q")) {

                                                        exit();

                                                    } else {

                                                        badInput = true;
                                                        System.out.println("Please reenter your answer: ");
                                                    }
                                                } while (badInput);
                                            }

                                        } else if (choice.equals("2")) {

                                            mall();
                                            System.out.println("\n1 - Restaurant" + "\nq - Exit Program" + "\n");
                                            choice = sc.nextLine();

                                            if (choice.equals("1")) {

                                                restaurant();
                                                System.out.println("\nq - Exit Program" + "\n");
                                                choice = sc.nextLine();

                                                do {
                                                    if (choice.equals("q")) {

                                                        exit();

                                                    } else {

                                                        badInput = true;
                                                        System.out.println("Please reenter your answer: ");
                                                    }
                                                } while (badInput);
                                            }
                                        }

                                    } else if (choice.equals("q")) {

                                        badInput = false;
                                        exit();

                                    } else {

                                        badInput = true;
                                        System.out.println("Please reenter your answer: ");

                                    }
                                } while (badInput);

                                // Path taken by choosing to go the Mall after going to the Train Station which was the second destination
                                // after the hotel
                            } else if (choice.equals("2")) {

                                badInput = false;
                                plane();

                                System.out.println("\n1 - Train Station" + "\n2 - Airport" + "\n3 - Port" + "\n4 - Restaurant" +
                                        "\n");

                                // Path taken by choosing to go the Restaurant after going to the Train Station which was the second destination
                                // after the hotel
                            } else if (choice.equals("3")) {

                                badInput = false;
                                boat();

                                // Path taken by choosing to go the Airport after going to the Train Station which was the second destination
                                // after the hotel
                            } else if (choice.equals("4")) {

                                badInput = false;
                                restaurant();

                            } else if (choice.equals("q")) {

                                badInput = false;
                                exit();

                            } else {

                                badInput = true;
                                System.out.println("\nPlease reenter which destination you would like to go to or press "
                                        + "q to finish your tour: " + "\n");

                            }
                        } while (badInput);

                    } else if (choice.equals("4")) {

                        badInput = false;
                        restaurant();

                        System.out.println("\n1 - Port" + "\n2 - Mall" + "\n3 - Airport" + "\n4 - Train Station" +
                                "\nq - Exit Program" + "\n");

                        do {
                            choice = sc.nextLine();

                            // Path taken by choosing to go the Port after going to the Train Station which was the second
                            // destination after the Hotel
                            if (choice.equals("1")) {

                                badInput = false;

                                boat();

                                System.out.println("\n1 - Mall" + "\n2 - Restaurant" + "\n3 - Airport" + "\nq - Exit Program" +
                                        "\n");

                                do {
                                    choice = sc.nextLine();

                                    // Path taken by choosing to go to the Mall after going to the Port which was the third
                                    // destination after the Train Station and Hotel
                                    if (choice.equals("1")) {

                                        badInput = false;
                                        mall();
                                        System.out.println("\n1 - Restaurant" + "\n2 - Airport" + "\nq - Exit Program" + "\n");

                                        do {
                                            choice = sc.nextLine();

                                            // Path taken by choosing to go to the Restaurant after going to the Mall which was the
                                            // fourth destination after the Port, Train Station, and Hotel
                                            if (choice.equals("1")) {

                                                restaurant();

                                                System.out.println("\n1 - Airport" + "\nq - Exit Program" + "\n");

                                                do {
                                                    choice = sc.nextLine();

                                                    // Path taken by choosing to go to the Airport after going to the Restaurant which
                                                    // was the fifth destination after the Mall, Port, Train Station, and Hotel
                                                    if (choice.equals("1")) {

                                                        plane();

                                                        System.out.println("\nq - Exit Program" + "\n");

                                                        do {
                                                            choice = sc.nextLine();

                                                            // Path taken by choosing to exit the program after going to the Airport
                                                            // which was the sixth destination after the Restaurant, Mall, Port,
                                                            // Train Station, and Hotel
                                                            if (choice.equals("q")) {

                                                                badInput = false;
                                                                exit();

                                                            } else {
                                                                badInput = true;
                                                                System.out.println("\nPlease reenter your answer: " + "\n");
                                                            }
                                                        } while (badInput);

                                                    } else if (choice.equals("q")) {

                                                        badInput = false;
                                                        exit();

                                                    } else {

                                                        badInput = true;
                                                        System.out.println("\nPlease reenter your answer: " + "\n");
                                                    }

                                                } while (badInput);

                                                // Path taken by choosing to go to the Airport after going to the Mall which was the
                                                // fourth destination after the Port, Train Station, and Hotel
                                            } else if (choice.equals("2")) {

                                                plane();
                                                System.out.println("\n1 - Restaurant" + "\nq - Exit Program" + "\n");

                                                do {
                                                    choice = sc.nextLine();

                                                    // Path taken by choosing to go to the Restaurant after going to the Airport
                                                    // which was the fifth destination after the Mall, Port, Train Station, and Hotel
                                                    if (choice.equals("1")) {

                                                        restaurant();
                                                        System.out.println("\nq - Exit Program" + "\n");

                                                        do {
                                                            choice = sc.nextLine();

                                                            // Path taken by choosing to exit the program after going to the
                                                            // Restaurant which was the sixth destination after the Airport, Mall,
                                                            // Port, Train Station, and Hotel
                                                            if (choice.equals("q")) {

                                                                badInput = false;
                                                                exit();

                                                            } else {

                                                                badInput = true;
                                                                System.out.println("Please reenter your answer: ");
                                                            }
                                                        } while (badInput);

                                                        // Path taken by choosing to exit the program after going to the Airport
                                                        // which was the fifth destination after the Mall, Port, Train Station, and Hotel
                                                    } else if (choice.equals("q")) {

                                                        badInput = false;
                                                        exit();

                                                    } else {

                                                        badInput = true;
                                                        System.out.println("Please reenter your answer: ");

                                                    }
                                                } while (badInput);

                                                // Path taken by choosing to exit the program after going to the Port which was the
                                                // third destination after the Train Station and Hotel
                                            } else if (choice.equals("q")) {

                                                badInput = false;
                                                exit();

                                            } else {

                                                badInput = true;
                                                System.out.println("Please reenter your answer: ");

                                            }

                                        } while (badInput);

                                        // Path taken by choosing to go to the Restaurant after going to the Port which was the
                                        // third destination after the Train Station and Hotel
                                    } else if (choice.equals("2")) {

                                        badInput = false;
                                        restaurant();
                                        System.out.println("\n1 - Mall" + "\n2 - Airport" + "\nq - Exit Program" + "\n");

                                        do {
                                            choice = sc.nextLine();

                                            // Path taken by choosing to go to the Mall after going to the Restaurant which was
                                            // the fourth destination after the Port, Train Station, and Hotel
                                            if (choice.equals("1")) {

                                                mall();
                                                System.out.println("\n1 - Airport" + "\nq - Exit Program" + "\n");

                                                do {
                                                    choice = sc.nextLine();

                                                    // Path taken by choosing to go to the Airport after going to the Mall which
                                                    // was the fifth destination after the Restaurant, Port, Train Station, and Hotel
                                                    if (choice.equals("1")) {

                                                        plane();
                                                        System.out.println("\nq - Exit Program" + "\n");

                                                        do {
                                                            choice = sc.nextLine();

                                                            // Path taken by choosing to exit the program after going to the
                                                            // Airport which was the sixth destination after the Mall, Restaurant,
                                                            // Port, Train Station, and Hotel
                                                            if (choice.equals("q")) {

                                                                badInput = false;
                                                                exit();

                                                            } else {

                                                                badInput = true;
                                                                System.out.println("Please reenter your answer: ");

                                                            }
                                                        } while (badInput);

                                                        // Path taken by choosing to exit the program after going to the Mall which
                                                        // was the fifth destination after the Restaurant, Port, Train Station, and Hotel
                                                    } else if (choice.equals("q")) {

                                                        badInput = false;
                                                        exit();

                                                    } else {

                                                        badInput = true;
                                                        System.out.println("Please reenter your answer: ");
                                                    }

                                                } while (badInput);

                                                // Path taken by choosing to go to the Airport after going to the Restaurant which
                                                // was the fourth destination after the Port, Train Station, and Hotel
                                            } else if (choice.equals("2")) {

                                                plane();
                                                System.out.println("\n1 - Mall" + "\nq - Exit Program" + "\n");

                                                do {
                                                    choice = sc.nextLine();

                                                    // Path taken by choosing to go to the Mall after going to the Airport which was
                                                    // the fifth destination after the Restaurant, Port, Train Station, and Hotel
                                                    if (choice.equals("1")) {

                                                        badInput = false;
                                                        mall();
                                                        System.out.println("\nq - Exit Program" + "\n");

                                                        do {
                                                            choice = sc.nextLine();

                                                            // Path taken by choosing to exit the program after going to the Mall
                                                            // which was the sixth destination after the Airport, Restaurant, Port,
                                                            // Train Station, and Hotel
                                                            if (choice.equals("q")) {

                                                                badInput = false;
                                                                exit();

                                                            } else {

                                                                badInput = true;
                                                                System.out.println("\nPlease reenter your answer: ");

                                                            }

                                                        } while (badInput);

                                                        // Path taken by choosing to exit the program after going to the Airport which
                                                        // was the fifth destination after the Restaurant, Port, Train Station, and Hotel
                                                    } else if (choice.equals("q")) {

                                                        badInput = false;
                                                        exit();

                                                    } else {

                                                        badInput = true;
                                                        System.out.println("Please reenter your answer: ");
                                                    }
                                                } while (badInput);

                                                // Path taken by choosing to exit the program after going to the Restaurant which was
                                                // the fourth destination after the Port, Train Station, and Hotel
                                            } else if (choice.equals("q")) {

                                                exit();

                                            }
                                        } while (badInput);

                                        // Path taken by choosing to go to the Airport after going to the Port which was the third
                                        // destination after the Train Station and Hotel
                                    } else if (choice.equals("3")) {

                                        badInput = false;
                                        plane();
                                        System.out.println("\n1 - Restaurant" + "\n2 - Mall" + "\nq - Exit Program" + "\n");
                                        choice = sc.nextLine();

                                        if (choice.equals("1")) {

                                            restaurant();
                                            System.out.println("\n1 - Mall" + "\nq - Exit Program" + "\n");
                                            choice = sc.nextLine();

                                            if (choice.equals("1")) {

                                                mall();
                                                System.out.println("\nq - Exit Program" + "\n");
                                                choice = sc.nextLine();

                                                do {
                                                    if (choice.equals("q")) {

                                                        exit();

                                                    } else {

                                                        badInput = true;
                                                        System.out.println("Please reenter your answer: ");
                                                    }
                                                } while (badInput);
                                            }

                                        } else if (choice.equals("2")) {

                                            mall();
                                            System.out.println("\n1 - Restaurant" + "\nq - Exit Program" + "\n");
                                            choice = sc.nextLine();

                                            if (choice.equals("1")) {

                                                restaurant();
                                                System.out.println("\nq - Exit Program" + "\n");
                                                choice = sc.nextLine();

                                                do {
                                                    if (choice.equals("q")) {

                                                        exit();

                                                    } else {

                                                        badInput = true;
                                                        System.out.println("Please reenter your answer: ");
                                                    }
                                                } while (badInput);
                                            }
                                        }

                                    } else if (choice.equals("q")) {

                                        badInput = false;
                                        exit();

                                    } else {

                                        badInput = true;
                                        System.out.println("Please reenter your answer: ");

                                    }
                                } while (badInput);

                                // Path taken by choosing to go the Mall after going to the Train Station which was the second destination
                                // after the hotel
                            } else if (choice.equals("2")) {

                                badInput = false;

                                mall();

                                System.out.println("\n1 - Train Station" + "\n2 - Airport" + "\n3 - Port" + "\n4 - Restaurant" +
                                        "\n");

                                // Path taken by choosing to go the Restaurant after going to the Train Station which was the second destination
                                // after the hotel
                            } else if (choice.equals("3")) {

                                badInput = false;

                                plane();

                            } else if (choice.equals("4")) {

                                badInput = false;

                                train();

                            }

                            else if (choice.equals("q")) {

                                badInput = false;

                                exit();

                            } else {

                                badInput = true;

                                System.out.println("\nPlease reenter which destination you would like to go to or press q to finish" +
                                        " your tour: " + "\n");
                            }

                        } while (badInput);

                    } else if (choice.equals("5")) {

                        badInput = false;
                        plane();

                        System.out.println("\n1 - Train Station" + "\n2 - Port" + "\n3 - Mall" + "\n4 - Restaurant" +
                                "\nq - Exit Program" + "\n");

                    } else if (choice.equals("q")) {

                        badInput = false;
                        exit();

                    } else {

                        badInput = true;
                        System.out.println("\nPlease reenter which destination you would like to go to or press q to " +
                                "finish your tour: " + "\n");
                    }

                } while (badInput);

            } else if (choice.equals("3")) {

                badInput = false;

                boat();

                System.out.println("\n1 - Train Station" + "\n2 - Airport" + "\n3 - Port" + "\n4 - Restaurant" +
                        "\n5 - Hotel" + "\nq - Exit Program" + "\n");

            } else if (choice.equals("4")) {

                badInput = false;

                mall();

                System.out.println("\n1 - Train Station" + "\n2 - Airport" + "\n3 - Port" + "\n4 - Restaurant" +
                        "\n5 - Hotel" + "\nq - Exit Program" + "\n");

            } else if (choice.equals("5")) {

                badInput = false;

                restaurant();

                do {
                    choice = sc.nextLine();

                    if (choice.equals("1")) {

                        train();

                        System.out.println("\n1 - Port" + "\n2 - Mall" + "\n3 - Airport" + "\n4 - Hotel" + "\nq - Exit" +
                                " Program" + "\n");

                        choice = sc.nextLine();

                        if (choice.equals("1")) {

                            boat();

                            System.out.println("\n1 - Mall" + "\n2 - Airport" + "\n3 - Hotel" + "\nq - Exit Program" + "\n");

                            do {
                                choice = sc.nextLine();

                                if (choice.equals("1")) {

                                    badInput = false;
                                    mall();

                                } else if (choice.equals("2")) {

                                    badInput = false;
                                    plane();

                                } else if (choice.equals("3")) {

                                    badInput = false;
                                    hotel();

                                } else if (choice.equals("q")) {

                                    badInput = false;
                                    exit();

                                } else {

                                    badInput = true;
                                    System.out.println("\nPlease reenter which destination you would like to go to or press " +
                                            "q to finish your tour: ");
                                }

                            } while (badInput);

                        } else if (choice.equals("2")) {

                            badInput = false;
                            mall();

                        } else if (choice.equals("3")) {

                            badInput = false;
                            plane();

                        } else if (choice.equals("4")) {

                            badInput = false;
                            hotel();

                        } else if (choice.equals("q")) {

                            badInput = false;
                            exit();

                        } else {

                            badInput = true;
                            System.out.println("Please reenter your answer: ");

                        }
                    }
                } while (badInput);

            } else {

                badInput = true;
                System.out.println("\nPlease reenter which destination you would like to go to or press q to finish" +
                        " your tour: " + "\n");
            }
        } while (badInput);
    }
}