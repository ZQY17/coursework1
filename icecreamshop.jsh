

        System.out.print("Would you like (v)anilla, (c)hocolate or (s)trawberry? ");

        switch (choice) {
            case "v":
                pricePerScoop = vanillaPrice;
                break;
            case "c":
                pricePerScoop = chocolatePrice;
                break;
            case "s":
                pricePerScoop = strawberryPrice;
                break;
            default:
                System.out.println("We don't have that flavour.");
                return 0;
    }


        System.out.print("How many scoops would you like? ");

        try {
            scoops = Integer.parseInt(scanner.nextLine().trim());
    } catch (NumberFormatException e) {
            System.out.println("Please enter a valid number of scoops.");
            return 0;
    }


        if (scoops < 1) {
            System.out.println("We don't sell just a cone.");
            return 0;
    } else if (scoops > 3) {
            System.out.println("That's too many scoops to fit in a cone.");
            return 0;
    }


        System.out.printf("That will be %.2f please.%n", totalCostInPounds);
 String studentNumber = "32804109";

        int vanillaPrice = Integer.parseInt(studentNumber.substring(6, 8));

        int chocolatePrice = Integer.parseInt(studentNumber.substring(4, 6));

        int strawberryPrice = Integer.parseInt(studentNumber.substring(2, 4));


        
        int conePrice = 100;


        Scanner scanner = new Scanner(System.in);


        System.out.print("Would you like (v)anilla, (c)hocolate or (s)trawberry? ");

        String choice = scanner.nextLine().trim().toLowerCase();


        int pricePerScoop = 0;

        switch (choice) {
            case "v":
                pricePerScoop = vanillaPrice;
                break;
            case "c":
                pricePerScoop = chocolatePrice;
                break;
            case "s":
                pricePerScoop = strawberryPrice;
                break;
            default:
                System.out.println("We don't have that flavour.");
                return 0;
    }


        System.out.print("How many scoops would you like? ");

        int scoops;

        try {
            scoops = Integer.parseInt(scanner.nextLine().trim());
    } catch (NumberFormatException e) {
            System.out.println("Please enter a valid number of scoops.");
            return 0;
    }


        if (scoops < 1) {
            System.out.println("We don't sell just a cone.");
            return 0;
    } else if (scoops > 3) {
            System.out.println("That's too many scoops to fit in a cone.");
            return 0;
    }


        int totalCostInPence = conePrice + (pricePerScoop * scoops);

        double totalCostInPounds = totalCostInPence / 100.0;


        System.out.printf("That will be %.2f please.%n", totalCostInPounds);