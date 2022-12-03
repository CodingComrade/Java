public class Main {
    public static void main(String[] args) {
        /* 1: Write a program that declares the following:
        a string variable named name
        an int variable named age
        a double variable named annualPay
        Store your name, age, and desired annual income as literals.
         */
        String name = "Chris";
        int age = 30;
        double annualPay = 87000;
        System.out.println("My name is " + name + ", my age is " + age + " and I hope to earn $" + annualPay + " per year.");

        /*2: Write a program that has the following String variables: firstName, middleName, and lastName.
        The program should also have the following char variables: firstInitial, middleInitial, lastInitial.
        The program should display those items to the screen.
         */
        String firstName = "Chris";
        String middleName = "Anthony";
        String lastName = "Small";
        char firstInitial = 'C';
        char middleInitial = 'A';
        char lastInitial = 'S';
        System.out.println(firstName);
        System.out.println(middleName);
        System.out.println(lastName);
        System.out.println(firstInitial);
        System.out.println(middleInitial);
        System.out.println(lastInitial);

        /*3: Write a program that displays the following information, each on a separate line:
        Your name
        Your address, with city, state, and ZIP
        Your telephone number
        Your college major
        Only use a single println statement in your program.
         */

        String name = "Chris";
        String address = "685 Aircleta dr unit 1, Wickenburg, AZ, 85390";
        String phoneNumber = "6023190724";
        String major = "Psychology";
        System.out.println(name + "\n" + address + "\n" + phoneNumber + "\n" + major);

        /* 4: Write a program that displays the following pattern:
         *
         ***
         *****
         *******
         *****
         ***
         *
         */
        String thing = "*";
        System.out.println("   " + thing.repeat(1) + "\n" + "  " + thing.repeat(3) +
                "\n" + " " + thing.repeat(5) + "\n" + thing.repeat(7) + "\n" + " "
                + thing.repeat(5) + "\n" + "  " + thing.repeat(3) + "\n" + "   " + thing.repeat(1));

        /*5: East Coast sales division of a company generates 62% of total sales. If company generates 4.6 million,
        determine how much came from east coast sales division
         */
        double eastPercent = .62;
        int totalProfit = 4600000;
        double moneyEastGenerated = totalProfit * eastPercent;
        System.out.println(moneyEastGenerated);

        /* 6: One acre of land is 43,560 square feet. Write a program that calculates number of acres in 389,767 square feet.

         */
        int acre = 43560;
        int land = 389767;
        int totalAcres = land / acre;
        System.out.println(totalAcres);

        /* 7: Write a program that asks the user to enter amount of a purchase. Program then computes the state and county
        sales tax. Sales tax is 4 percent, county tax is 2 percent. Program should display purchase amount, county sales tax
        , state sales tax, total sales tax and total of sale.
         */
        Scanner purchase = new Scanner(System.in);
        float cost = purchase.nextFloat();
        purchase.close();
        //System.out.println(purchase);
        double salesTax = .04;
        double countyTax = .02;
        double totalTax = cost * (salesTax + countyTax);
        double totalCost = cost + totalTax;
        System.out.println("Purchase is: " + purchase + ". Sales Tax is " + salesTax + ". County Tax is " + countyTax +
                ". Total Tax is " + totalTax + ". Total cost is " + totalCost);

        /* 8: A bag of cookies holds 40 cookies. 10 servings per bag, so 4 servings. Each serving is 300 calories. Write
        a program that lets a user type in how many cookies they ate and returns the amount of calories. 1 cookie is 30
        calories.
         */

        Scanner cookiesEaten = new Scanner(System.in);
        float cookies = cookiesEaten.nextFloat();
        float totalCalories = 30 * cookies;
        System.out.println(cookies + "cookies were eaten, totalling at " + totalCalories + "calories");

        /* 9: A car's MPG can be calculated by Miles driven/gallons of gas used. Write a program that asks the user for
        the number of miles driven and the gallons of gas used.
         */

        Scanner milesDriven = new Scanner(System.in);
        Scanner gallonsOfGasUsed = new Scanner(System.in);
        int miles = milesDriven.nextInt();
        int gas = gallonsOfGasUsed.nextInt();
        int mpg = miles / gas;
        System.out.println("Your total MPG is " + mpg);

        /* 10: write a program that asks the user to enter three test scores. Program should display each score and
        give the average.
         */

        Scanner firstScore = new Scanner(System.in);
        Scanner secondScore = new Scanner(System.in);
        Scanner thirdScore = new Scanner(System.in);
        int score1 = firstScore.nextInt();
        int score2 = secondScore.nextInt();
        int score3 = thirdScore.nextInt();
        int average = (score1 + score2 + score3 ) / 3;
        System.out.println("Score 1 is: " + score1 + " Score 2 is: " + score2 + " Score 3 is: " + score3 + "Your average" +
                "is " + average);

        /* 11: An electronics company sells circuit boards at 40 percent profit. Write a program that asks the user for
        retail price if one board, calculate the profit for the company and display the result.
         */
        Scanner board = new Scanner(System.in);
        int costOfBoard = board.nextInt();
        double companyProfit = .40;
        double totalProfit = costOfBoard * companyProfit;
        double totalCost = costOfBoard + totalProfit;
        System.out.println("Total cost is: " + totalCost);

        /* 12: Write a program that asks the user to enter the name of their favorite city. Use a String variable to
        store the input. The program should display the following:
        The number of characters in the city name
        The name of the city in all caps
        The name of the city in low caps
        The first character in the name of the city
         */

        Scanner city = new Scanner(System.in);
        String cityName = city.nextLine();
        int totalChar = cityName.length();
        String YELLING = cityName.toUpperCase();
        String whisper = cityName.toLowerCase();
        char firstInitial = cityName.charAt(0);
        System.out.println("The city is: " + cityName + "Number of characters is: " + YELLING + whisper + firstInitial);

        /* 13: write a program that computes the tax and tip on a restaurant bill. Program should ask the user to enter
        the charge for the meal. Tax should be 6.75 percent of meal charge. Tip should be 20 percent of total bill AFTER
        tax. Display the meal charge, tax amount, tip amount and total bill
         */

        Scanner chargeForMeal = new Scanner(System.in);
        int charge = chargeForMeal.nextInt();
        double tax = charge * .0675;
        double subTotal = charge + tax;
        double tip = subTotal * .2;
        double totalCost = subTotal + tip;
        System.out.println("Initial charge is: " + charge + "Tax is: " + tax + "subtotal is: " + subTotal +
                "tip is: " + tip + "total cost is: " + totalCost);

        /* 14: Write a program that asks the user for the number of males and number of females registered in a class.
        Program should display the percentage of males and females in class.
         */

        Scanner males = new Scanner(System.in);
        Scanner females = new Scanner(System.in);
        int numberOfMales = males.nextInt();
        int numberOfFemales = females.nextInt();
        int numOfStudents = numberOfFemales + numberOfMales;
        float percentOfMales = (float)numberOfMales / numOfStudents;
        float percentOfFemales = (float)numberOfFemales / numOfStudents;
        System.out.println("Percent of males is: " + percentOfMales + "Percent of females: " + percentOfFemales);

        /* 15: Someone bought 600 shares of stock at 21.77 per share. She must pay stock broker a 2 percent commission
        for transaction. Write a program that displays:
        amount paid for stock without commission
        amount of commission
        total amount paid
         */
        double subtotal = 600 * 21.77;
        double commission = subtotal * .02;
        double totalCost = subtotal + commission;
        System.out.println(totalCost);

        /* 16: soft drink company surveyed 12467 of their customers and 14% purchase one or more drinks per week. Of the
        14%, 64% prefer citrus flavored drinks. Write a program that displays the following:
        number of customers who buy one or more drinks
        number of customers that prefer citrus drinks
         */
        double frequentBuyers = 12467 * .14;
        double citrusLovers = frequentBuyers * .64;
        System.out.println(frequentBuyers);
        System.out.println(citrusLovers);

        /* 17: cookie recipe calls for the following ingredients:
        1.5 cups of sugar
        1 cup butter
        2.75 cups of flour
        recipe produces 48 cookies with this amount of ingredients. Write a program that asks the user how many cookies
        they want to make and then display the number of cups of each ingredient that's needed.
         */
        Scanner howManyCookies = new Scanner(System.in);
        int numOfCookies = howManyCookies.nextInt();
        double butterPerCookie = Math.round(numOfCookies * .02083);
        double sugar = butterPerCookie * 1.5;
        double flour = butterPerCookie * 2.75;
        System.out.println("You need " + sugar + " cups of sugar, " + butterPerCookie + " cups of butter, and "
                + flour + " cups of flour");

        /* 18: Write a program that plays  a word game with the user. THe program should ask the user to enter the
        following:
        Name
        age
        name of a city
        name of a college
        a profession
        type of animal
        pet's name
        Display the following story
        There once was a person named NAME who lived in CITY. At the age of AGE, NAME went to college at COLLEGE. NAME
        graduated and went to work as a PROFESSION. Then, NAME adopted an ANIMAL named PET NAME. THey both lived
        happily ever after
         */
        System.out.println("What is your name? ");
        Scanner question1 = new Scanner(System.in);
        System.out.println("What is your age? ");
        Scanner question2 = new Scanner(System.in);
        System.out.println("Please name a city ");
        Scanner question3 = new Scanner(System.in);
        System.out.println("Please name a college ");
        Scanner question4 = new Scanner(System.in);
        System.out.println("Please name a profession ");
        Scanner question5 = new Scanner(System.in);
        System.out.println("Name an animal ");
        Scanner question6 = new Scanner(System.in);
        System.out.println("List a pet name ");
        Scanner question7 = new Scanner(System.in);
        String name = question1.nextLine();
        int age = question2.nextInt();
        String city = question3.nextLine();
        String college = question4.nextLine();
        String profession = question5.nextLine();
        String animal = question6.nextLine();
        String petName = question7.nextLine();
        System.out.println("There once was a person named" + name +  "who lived in " + city + ". At the age of " + age +
                "," + name + " went to college at " + college + "." + name +
                "graduated and went to work as a " + profession + ". Then, " + name + " adopted an " + animal + " named " +
                petName + ". THey both lived happily ever after");

        /* 19: Joe purchased stock in Acme. He bought 1000 shares at 32.87. Commission is 2%. Joe later sold the shares at
        33.92. He paid another 2% commission. Write a program that displays:
        amount of money Joe paid for stock.
        amount of commission
        Amount sold
        amount of commission he paid when he sold
        Display total profit.
         */

        int initialCost = 32870;
        double commission = initialCost * .02;
        double totalCost = initialCost + commission;
        int initialSold = 33920;
        double commission2 = initialSold * .02;
        double totalSold = initialSold - commission2;
        double profit = totalSold - totalCost;
        System.out.println("Total cost of shares: " + totalCost);
        System.out.println("Commission was: " + commission);
        System.out.println("Total sale of shares: " + initialSold);
        System.out.println("Second commission was: " + commission2);
        System.out.println("Congratulations, you made: " + profit + "dollars!");
    }
}