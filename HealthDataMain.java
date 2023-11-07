public class HealthDataMain {
    public static void main(String[] args) {

        //default constructor initialisation
        HealthData user1 = new HealthData();
        user1.name = "Anurag";
        user1.Height_Weight_Initialization(1.82, 70.00);
        user1.displayInfo();

        //single parameterised constructor initialisation
        HealthData user2 = new HealthData("Ashwin");

        //triple parameterised constructor initialisation
        HealthData user3 = new HealthData("Sangeeta", 1.55, 55);


        //method overloading

        user1.Height_Weight_Initialization(1.75, 72.00);
        user1.Height_Weight_Display();

        user2.Height_Weight_Initialization(1.54, null);
        user2.Height_Weight_Display();

        user3.Height_Weight_Initialization(null, 65.00);
        user3.Height_Weight_Display(); 

    }
}
