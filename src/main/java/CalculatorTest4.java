public class CalculatorTest4 {
    public static void main(String[] args) {
        //Instantiate a Calculator2 object
        Calculator4 calc = new Calculator4();

        calc.originalPrice = 10;
        System.out.println("Person1 Total: $"+calc.findTotal());
//1
        calc.originalPrice = 12;
        System.out.println("Person2 Total: $"+calc.findTotal());
//2
        calc.originalPrice = 9;
        System.out.println("Person3 Total: $"+calc.findTotal());
//3
        calc.originalPrice = 8;
        System.out.println("Person4 Total: $"+calc.findTotal());
//4   
        calc.originalPrice = 7;
        System.out.println("Person5 Total: $"+calc.findTotal());
//5
        calc.originalPrice = 15;
        System.out.println("Alex Total: $"+ "0");
//6
        calc.originalPrice = 11;
        System.out.println("Person7 Total: $"+calc.findTotal());
//7
        calc.originalPrice = 30;
        calc.name = "person8";
        System.out.println("Person8 Total: $"+ "0"); //calc.findTotal());
//8
        //Access the Calculator2 object's fields and methods
        //to find the total for each member of the birthday party


        /*This is what everyone owes before tax and tip:
        Person 1: $10
        Person 2: $12
        Person 3: $9
        Person 4: $8
        Person 5: $7
        Person 6: $15 (Alex)
        Person 7: $11
        Person 8: $30
        */

    }
}
