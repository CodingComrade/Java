public class Main {
    public static void main(String[] args) {
      /*
      1. Roman Numerals
Write a program that prompts the user to enter a number within the range of 1 through 10.
The program should display the Roman numeral version of that number. If the number is
outside the range of 1 through 10, the program should display an error message.
       */
        Scanner prompt = new Scanner(System.in);
        int number = prompt.nextInt();
        prompt.close();

        switch (number) {
            case 1: System.out.println("I"); break;
            case 2: System.out.println("II"); break;
            case 3: System.out.println("III"); break;
            case 4: System.out.println("IV"); break;
            case 5: System.out.println("V"); break;
            case 6: System.out.println("VI"); break;
            case 7: System.out.println("VII"); break;
            case 8: System.out.println("VIII"); break;
            case 9: System.out.println("IX"); break;
            case 10: System.out.println("X"); break;
            default: System.out.println("Out of range");
        }

        /*
        2. Magic Dates
The date June 10, 1960, is special because when we write it in the following
format, the month times the day equals the year:
6/10/60
Write a program that asks the user to enter a month (in numeric form), a day,
 and a two digit year.
The program should then determine whether the month times the day is equal
to the year. If so, it should display a message saying the date is magic.
Otherwise, it should display a message saying the date is not magic
         */

        Scanner monthPrompt = new Scanner(System.in);
        Scanner dayPrompt = new Scanner(System.in);
        Scanner yearPrompt = new Scanner(System.in);

        int month = monthPrompt.nextInt();
        int day = monthPrompt.nextInt();
        int year = monthPrompt.nextInt();

        if (month + day == year) {
            System.out.println("Date is magic");
        } else {
            System.out.println("Date is not magic");
        }

        /*
        3. Body Mass Index
Write a program that calculates and displays a person’s body mass index (BMI).
The BMI is often used to determine whether a person with a sedentary lifestyle
is overweight or underweight for his or her height. A person’s BMI is
calculated with the following formula:
BMI 5 Weight 3 703 / Height2
where weight is measured in pounds and height is measured in inches. The program should
display a message indicating whether the person has optimal weight, is underweight, or is
overweight. A sedentary person’s weight is considered optimal if his or her BMI is between
18.5 and 25. If the BMI is less than 18.5, the person is considered underweight. If the BMI
value is greater than 25, the person is considered overweight.
         */

        Scanner prompt1 = new Scanner(System.in);
        Scanner prompt2 = new Scanner(System.in);

        int height = prompt1.nextInt();
        int weight = prompt2.nextInt();
        int BMI = weight * 703/(height * height);
        System.out.println(BMI);

        /*
        5. Mass and Weight
Scientists measure an object’s mass in kilograms and its weight in Newtons. If you know the
amount of mass that an object has, you can calculate its weight, in Newtons, with the following formula:
Weight = Mass * 9.8
Write a program that asks the user to enter an object’s mass, and then calculate its weight.
If the object weighs more than 1,000 Newtons, display a message indicating that it is too
heavy. If the object weighs less than 10 Newtons, display a message indicating that the
object is too light.
         */
        Scanner prompt1 = new Scanner(System.in);
        int mass = prompt1.nextInt();

        int weight = mass * 9.8;
        if (weight > 1000) {
            System.out.println("It's too heavy");
        } else if (weight < 10) {
            System.out.println("IT's too light");
        }

        /*
        6. Time Calculator
Write a program that asks the user to enter a number of seconds.
•	 There are 60 seconds in a minute. If the number of seconds entered by the user is
greater than or equal to 60, the program should display the number of minutes in that
many seconds.

There are 3,600 seconds in an hour. If the number of seconds entered by the user is
greater than or equal to 3,600, the program should display the number of hours in
that many seconds.

 There are 86,400 seconds in a day. If the number of seconds entered by the user is
greater than or equal to 86,400, the program should display the number of days in
that many seconds.
         */
        Scanner prompt = new Scanner(System.in);
        int prompt = nextInt();
        double total;

        if (prompt >= 60 && prompt < 3600) {
            total = Math.floor(prompt / 60);
        }

    }
}