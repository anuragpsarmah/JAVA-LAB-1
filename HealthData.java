public class HealthData {
    public String name;
    private double height;
    private double weight;
    public double BMI;

    public void Height_Weight_Initialization(double height, double weight){
        this.height = height;
        this.weight = weight;
    }

    public void Height_Weight_Initialization(double height, String weight){
        this.height = height;
        this.weight = 0.00;
    }

    public void Height_Weight_Initialization(String height, double weight){
        this.height = 0.00;
        this.weight = weight;
    }

    public void Height_Weight_Display(){
        System.out.println(String.format("The height: %.2f", this.height));
        System.out.println(String.format("The weight: %.2f", this.weight));
        System.out.println("");
    }

    protected void BMI_Calculator(){
        BMI = weight / (height * height);
    }

    public void displayInfo(){
        BMI_Calculator();
        System.out.println(String.format("%s has a Body-Mass-Index value of: %.2f", name, BMI));
        System.out.println("");
    }

    HealthData(){
        System.out.println("Object was created using default constructor. All data members initialised to default values.");
    }

    HealthData(String name, double height, double weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        BMI_Calculator();
        displayInfo();
    }

    HealthData(String name) {
        this.name = name;
        BMI_Calculator();
        System.out.println(String.format("%s has an undefined BMI. Please reinitialize height and weight values!", this.name));
        System.out.println("");
    }


}
