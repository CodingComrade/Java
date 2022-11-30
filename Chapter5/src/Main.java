import java.util.Scanner;
import java.util.ArrayList;
//public class Main {
//    public static void main(String[] args) {
//    /*
//    Write a method named showChar. The method should accept two arguments: a
//    reference to
//a String object and an integer. The integer argument is a character position within the
//String, with the first character being at position 0. When the method executes, it should
//display the character at that character position. Here is an example of a call to the method:
//  */
//        showChar("New York", 2);
//    }
//
//        public static void showChar(String thing, int number){
//        System.out.println(thing.charAt(number));
//        }
//
//    /*
//    Write a program that asks the user to enter an item’s wholesale cost and
//    its markup percentage. It should then display the item’s retail price.
//    For example:
//•	 If an item’s wholesale cost is 5.00 and its markup percentage is 100 percent, then the
//item’s retail price is 10.00.
//•	 If an item’s wholesale cost is 5.00 and its markup percentage is 50 percent, then the
//item’s retail price is 7.50.
//The program should have a method named calculateRetail that receives the wholesale
//cost and the markup percentage as arguments, and returns the retail price of the item.
//     */
//
//
//    }
//public class Main {
//    public static void main(String[] args) {
//        Scanner wholesale = new Scanner(System.in);
//        int cost = wholesale.nextInt();
//        double percent = wholesale.nextDouble();
//        calculateRetail(cost, percent);
//    }
//        public static void calculateRetail(int cost, double percent) {
//             double additionalCost = cost * percent;
//             double totalCost = cost + additionalCost;
//             System.out.println(totalCost);
//        }
//    }

/*
A painting company has determined that for every 115 square feet of wall
space, one gallon
of paint and eight hours of labor will be required. The company charges $18.00 per hour
for labor. Write a program that allows the user to enter the number of rooms to be painted
and the price of the paint per gallon. It should also ask for the square feet of wall space in
each room. The program should have methods that return the following data:
•	 The number of gallons of paint required
•	 The hours of labor required
•	 The cost of the paint
•	 The labor charges
•	 The total cost of the paint job
Then it should display the data on the screen.
 */
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int rooms = input.nextInt();
//        int priceOfPaint = input.nextInt();
//        int squareFeet = input.nextInt();
//        double gallons = 0;
//        double laborPer115 = 14.375;
//        int laborPerHour = 18;
//        numberOfGallons(gallons, squareFeet);
//        hoursOfLabor(squareFeet, laborPer115);
//        costOfPaint(priceOfPaint);
//        laborCost(laborPerHour, squareFeet, laborPer115);
//        totalCostOfJob(laborPerHour, squareFeet, laborPer115, priceOfPaint);
//    }
//
//    public static void numberOfGallons(double gallons, int squareFeet) {
//        gallons = squareFeet / 115;
//        System.out.println("Number of gallons: " + gallons);
//    }
//
//    public static void hoursOfLabor(int squareFeet, double laborPer115) {
//        System.out.println("Total hours of labor: " + squareFeet / laborPer115);
//    }
//
//    public static void costOfPaint(int priceOfPaint) {
//        System.out.println("COst of paint: " + priceOfPaint);
//    }
//
//    public static void laborCost(int laborPerHour, int squareFeet, double laborPer115) {
//        System.out.println("Total labor cost: " + laborPerHour * (squareFeet / laborPer115));
//    }
//
//    public static void totalCostOfJob(int laborPerHour, int squareFeet, double laborPer115, int priceOfPaint) {
//        System.out.println("Total cost of job: " + priceOfPaint + laborPerHour * (squareFeet / laborPer115));
//    }
//
//}

/*
5. Falling Distance
When an object is falling because of gravity, the following formula can be used to determine
the distance the object falls in a specific time period:
d = 1/2gt2
The variables in the formula are as follows: d is the distance in meters, g is 9.8, and t is the
amount of time, in seconds, that the object has been falling.
Write a method named fallingDistance that accepts an object’s falling time (in seconds) as
an argument. The method should return the distance, in meters, that the object has fallen
during that time interval. Demonstrate the method by calling it in a loop that passes the
values 1 through 10 as arguments, and displays the return value.
 */

//public class Main{
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        double distanceInMeters = 0;
//        double g = 9.8;
//        int t = input.nextInt();
//        input.close();
//        fallingDistance(distanceInMeters, g, t);
//    }
//    public static void fallingDistance(double distanceInMeters, double g, int t) {
//        distanceInMeters = ((.5) * g * (Math.pow(t, 2)));
//        System.out.println(distanceInMeters);
//    }
//}

/*
6. Celsius Temperature Table
The formula for converting a temperature from Fahrenheit to Celsius is
C = 5/9 (F - 32)
where F is the Fahrenheit temperature and C is the Celsius temperature. Write a method
named celsius that accepts a Fahrenheit temperature as an argument. The method
should return the temperature, converted to Celsius. Demonstrate the method by calling
it in a loop that displays a table of the Fahrenheit temperatures 0 through 20 and their
Celsius equivalents.
 */
//public class Main {
//    public static void main(String[] args) {
//        int temp = 0;
//        celsius(temp);
//    }
//    public static void celsius(int temp) {
//        for (int i = 0; i <= 20; i++) {
//            temp = i;
//            double celsius = (5.0/9.0) * (temp - 32);
//            System.out.println(temp + " degrees fareinheit is " + celsius + " degrees celsius");
//        }
//    }
//}

/*
7. Test Average and Grade
Write a program that asks the user to enter five test scores. The program should display
a letter grade for each score and the average test score. Write the following methods in
the program:
•	 calcAverage—This method should accept five test scores as arguments and return the
average of the scores.
•	 determineGrade—This method should accept a test score as an argument and return a
letter grade for the score, based on the following grading scale:
 */

//public class Main{
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int firstScore = input.nextInt();
//        int secondScore = input.nextInt();
//        int thirdScore = input.nextInt();
//        int fourthScore = input.nextInt();
//        int fifthScore = input.nextInt();
//        input.close();
//        int[] scores = {firstScore, secondScore, thirdScore, fourthScore,
//                fifthScore};
//        calcAverage(scores);
//        int finalScore = calcAverage(scores);
//        determineGrade(finalScore);
//    }
//    public static int calcAverage(int[] scores) {
//        int sum = 0;
//        for (int i = 0; i < scores.length; i++) {
//            sum += scores[i];
//        }
//        return sum /= scores.length;
//    }
//
//    public static void determineGrade(int finalScore) {
//        if (finalScore <= 100 && finalScore >= 90) {
//            System.out.println('A');
//        } else if (finalScore <= 89 && finalScore >= 80) {
//            System.out.println('B');
//        } else if (finalScore <= 79 && finalScore >= 70) {
//            System.out.println('C');
//        } else if (finalScore <= 69 && finalScore >= 60) {
//            System.out.println('D');
//        } else {
//            System.out.println('F');
//        }
//    }
//
//
//
//}
/*
8. Conversion Program
Write a program that asks the user to enter a distance in meters. The program will then present the following menu of selections:
1. Convert to kilometers
2. Convert to inches
3. Convert to feet
4. Quit the program
The program will convert the distance to kilometers, inches, or feet, depending on the user’s
selection
 */

//public class Main{
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Please enter a positive number: ");
//        int meters = input.nextInt();
//        if (meters < 0) {
//            System.out.println("invalid number, please enter positive number");
//        }
//        menu();
//        int choice = input.nextInt();
//        if (choice == 1) {
//            showKilometers(meters);
//        } else if (choice == 2) {
//            showInches(meters);
//        } else if (choice == 3) {
//            showFeet(meters);
//        } else if (choice == 4) {
//            System.exit(0);
//        }
//    }
//
//    public static void showKilometers(int meters) {
//        if (meters > 0) {
//            double kilometers = meters * 0.001;
//            System.out.println(kilometers);
//        }
//
//    }
//
//    public static void showInches(int meters) {
//        if (meters > 0) {
//            double inches = meters * 39.37;
//            System.out.println(inches);
//        }
//
//    }
//    public static void showFeet(int meters) {
//        if (meters > 0) {
//            double feet = meters * 3.281;
//            System.out.println(feet);
//        }
//
//    }
//
//    public static void menu() {
//        System.out.println("Choose an option" + "\n" + "1. Convert to " +
//                "Kilometers" + "\n" + "2. Convert to inches" + "\n" + "3. " +
//                "Convert to feet" + "\n" + "4. quit the program");
//    }
//}

/*
9. Distance Traveled Modification
The distance a vehicle travels can be calculated as follows:
Distance = Speed * Time
Write a method named distance that accepts a vehicle’s speed and time as arguments, and
returns the distance the vehicle has traveled. Modify the “Distance Traveled” program you
wrote in Chapter 4 (Programming Challenge 2) to use the method.
 */

//public class Main{
//    public static void main(String[] args) {
//    Scanner input = new Scanner(System.in);
//    int time = input.nextInt();
//    int speed = input.nextInt();
//    input.close();
//    distance(time, speed);
//    }
//    public static void distance(int time, int speed) {
//        System.out.println("Total distance is: " + (time * speed));
//    }
//}

/*
10. Stock Profit
The profit from the sale of a stock can be calculated as follows:
Profit = ((NS * SP) - SC) - ((NS * PP) + PC)
where NS is the number of shares, PP is the purchase price per share, PC is the purchase
commission paid, SP is the sale price per share, and SC is the sale commission paid. If the
calculation yields a positive value, then the sale of the stock resulted in a
 profit. If the calculation yields a negative number, then the sale resulted
 in a loss.

Write a method that accepts as arguments the number of shares, the purchase price per
share, the purchase commission paid, the sale price per share, and the sale commission
paid. The method should return the profit (or loss) from the sale of stock. Demonstrate the
method in a program that asks the user to enter the necessary data and displays the amount
of the profit or loss.
 */
//public class Main{
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter the number of shares you bought: ");
//        int NS = input.nextInt();
//        System.out.println("Enter how much you paid per share: ");
//        int PP = input.nextInt();
//        System.out.println("enter how much commission you paid: ");
//        double PC = input.nextDouble();
//        System.out.println("Enter how much you sold per share: ");
//        int SP = input.nextInt();
//        System.out.println("Enter how much commission you paid upon sale: ");
//        double SC = input.nextDouble();
//        profit(NS, PP, PC, SC, SP);
//    }
//    public static void profit(int NS, int PP, double PC, double SC, int SP) {
//        double profit = ((NS * SP) - SC) - ((NS * PP) + PC);
//        System.out.println("You made " + profit);
//    }
//}

/*
11. Multiple Stock Sales
Use the method that you wrote for Programming Challenge 10 (Stock Profit) in a program
that calculates the total profit or loss from the sale of multiple stocks. The program should
ask the user for the number of stock sales, and the necessary data for each stock sale. It
should accumulate the profit or loss for each stock sale and then display the total.
 */

/*
12. Kinetic Energy
In physics, an object that is in motion is said to have kinetic energy. The following formula
can be used to determine a moving object’s kinetic energy:
KE = ½ (1/2) * m * (v **2)
The variables in the formula are as follows: KE is the kinetic energy, m is the object’s mass
in kilograms, and v is the object’s velocity, in meters per second.

Write a method named kineticEnergy that accepts an object’s mass (in kilograms) and
velocity (in meters per second) as arguments. The method should return the amount of
kinetic energy that the object has. Demonstrate the method by calling it in a program that
asks the user to enter values for mass and velocity.
 */
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int mass = input.nextInt();
//        int velocity = input.nextInt();
//        calculateMass(mass, velocity);
//    }
//
//    public static void calculateMass(int mass, int velocity) {
//        double kineticEnergy = (1.0/2.0) * mass * (Math.pow(velocity, 2));
//        System.out.println(kineticEnergy);
//    }
//}

/*
13. isPrime Method
A prime number is a number that is evenly divisible only by itself and 1. For example, the
number 5 is prime because it can be evenly divided only by 1 and 5. The number 6, however,
is not prime because it can be divided evenly by 1, 2, 3, and 6.
Write a method named isPrime, which takes an integer as an argument and returns true if
the argument is a prime number, or false otherwise. Demonstrate the method in a complete
program
 */

//public class Main{
//    public static void main(String[] args) {
//        int num = 29;
//        boolean flag = false;
//        for (int i = 2; i <= num / 2; i++) {
//            if (num % i == 0) {
//                flag = true;
//                break;
//            }
//        }
//        if (!flag) {
//            System.out.println("PRIME");
//        } else {
//            System.out.println("NO PRIME");
//        }
//    }
//}

/*
15. Even/Odd Counter
You can use the following logic to determine whether a number is even or odd:
if ((number % 2) == 0)
{
 // The number is even.
}
else
{
 // The number is odd.
}
Write a program with a method named isEven that accepts an int argument. The method
should return true if the argument is even, or false otherwise. The program’s main method
should use a loop to generate 100 random integers. It should use the isEven method to
determine whether each random number is even, or odd. When the loop is finished, the
program should display the number of even numbers that were generated, and the number
of odd numbers.
 */

//public class Main{
//    public static void main(String[] args) {
//      ArrayList<Integer> numbers = new ArrayList<Integer>();
//        randomNumbers(numbers);
//        isEven(numbers);
//    }
//    public static void randomNumbers(ArrayList<Integer> numbers) {
//        for (int i = 0; i < 100; i++) {
//            numbers.add((int)(Math.random() * 100));
//            //System.out.println(numbers.get(i));
//        }
//    }
//
//    public static void isEven(ArrayList<Integer> numbers) {
//        int oddCount = 0;
//        int evenCount = 0;
//        for (int i = 0; i < numbers.size(); i++) {
//            if (numbers.get(i) % 2 == 0) {
//                evenCount++;
//            } else {
//                oddCount++;
//            }
//        }
//        System.out.println("The number of odd numbers is: " + oddCount);
//        System.out.println("The number of even numbers is: " + evenCount);
//    }
//
//}

/*
16. Present Value
Suppose you want to deposit a certain amount of money into a savings account, and then
leave it alone to draw interest for the next 10 years. At the end of 10 years, you would like
to have $10,000 in the account. How much do you need to deposit today to make that
happen? You can use the following formula, which is known as the present value formula,
to find out:
P 5 F
(1 1 r)
n
Programming Challenges 317
The terms in the formula are as follows:
•	 P is the present value, or the amount that you need to deposit today.
•	 F is the future value that you want in the account. (In this case, F is $10,000.)
•	 r is the annual interest rate.
•	 n is the number of years that you plan to let the money sit in the account.
Write a method named presentValue that performs this calculation. The method should
accept the future value, annual interest rate, and number of years as arguments. It should
return the present value, which is the amount that you need to deposit today. Demonstrate
the method in a program that lets the user experiment with different values for the formula’s terms
 */

//public class Main{
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("How much do you want to have? ");
//        int futureValue = input.nextInt();
//        System.out.println("What is your interest rate? ");
//        double interestRate = input.nextDouble();
//        System.out.println("How many years are you going to leave it there? ");
//        int years = input.nextInt();
//        presentValue(futureValue, interestRate, years);
//    }
//    public static void presentValue(int futureValue, double interestRate,
//                                    int years) {
//        double presentValue = futureValue / Math.pow((1 + interestRate), years);
//        System.out.println("YOu need to deposit: " + presentValue);
//    }
//
//}

/*
17. Rock, Paper, Scissors Game
Write a program that lets the user play the game of Rock, Paper, Scissors against the computer. The program should work as follows.
1. When the program begins, a random number in the range of 1 through 3 is generated. If
the number is 1, then the computer has chosen rock. If the number is 2, then
the computer has chosen paper. If the number is 3, then the computer has chosen scissors. (Don’t
display the computer’s choice yet.)
2. The user enters his or her choice of “rock”, “paper”, or “scissors” at the keyboard. (You
can use a menu if you prefer.)
3. The computer’s choice is displayed.
4. A winner is selected according to the following rules:
•	 If one player chooses rock and the other player chooses scissors, then rock wins. (The
rock smashes the scissors.)
•	 If one player chooses scissors and the other player chooses paper, then scissors wins.
(Scissors cuts paper.)
•	 If one player chooses paper and the other player chooses rock, then paper wins. (Paper
wraps rock.)
•	 If both players make the same choice, the game must be played again to determine
the winner.
Be sure to divide the program into methods that perform each major task.
 */

//public class Main {
//    public static void main(String[] args) {
//        int min = 1;
//        int computerChoice = (int) ((Math.random() * 3) + min);
//        Scanner input = new Scanner(System.in);
//        System.out.println("Choose your weapon");
//        menu();
//        int playerChoice = input.nextInt();
//        whoWon(computerChoice, playerChoice);
//    }
//
//    public static void menu() {
//        System.out.println("Choose an option: 1. Rock, 2. Paper, 3. Scissors");
//    }
//
//    public static void whoWon(int computerChoice, int playerChoice) {
//        if (computerChoice == playerChoice) {
//            System.out.println("It's a draw");
//        } else if (computerChoice == 1 && playerChoice == 3 ||
//                computerChoice == 2 && playerChoice == 1 ||
//                computerChoice == 3 && playerChoice == 2) {
//            System.out.println("Computer won");
//        } else {
//            System.out.println("Player won");
//        }
//    }
//}
/*
18. ESP Game
Write a program that tests your ESP (extrasensory perception). The program
should randomly select the name of a color from the following list of words:
Red, Green, Blue, Orange, Yellow
To select a word, the program can generate a random number. For example, if the number
is 0, the selected word is Red; if the number is 1, the selected word is Green; and so forth.
Next, the program should ask the user to enter the color that the computer has selected.
After the user has entered his or her guess, the program should display the name of the randomly selected color. The program should repeat this 10 times and then display the number
of times the user correctly guessed the selected color. Be sure to modularize the program
into methods that perform each major task.
 */

//public class Main{
//    public static void main(String[] args) {
//        String[] colors = {"Red", "Green", "Blue", "Orange", "Yellow"};
//        random(colors);
//        String correctColor = random(colors);
//        guess(colors);
//        String playerGuess = guess(colors);
//        correct(correctColor, playerGuess, colors);
//    }
//    public static String random(String[] colors) {
//        int random = ((int)(Math.random() * 5));
//        return colors[random];
//    }
//
//    public static String guess(String[] colors) {
//        System.out.println("Please pick a color: 0. Red, 1. Green, 2. Blue, 3" +
//                ". Orange, 4. Yellow");
//        Scanner input = new Scanner(System.in);
//        int number = input.nextInt();
//         String userGuess = colors[number];
//         return userGuess;
//    }
//
//    public static void correct(String correctColor, String playerGuess,
//                               String[] colors) {
//        int count = 0;
//        for (int i = 0; i < 10; i++) {
//            if (correctColor.equals(playerGuess)) {
//                count++;
//            }
//            random(colors);
//        }
//        System.out.println(count);
//    }
//}
