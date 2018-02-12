public class FastBacMain {
    //this is a version of the fast growing bacteria with nutrients simulations, which include the more realistic
    //growth curves
    public static void main(String[] args){
        double specific_alpha = Math.log(11.5)/500.;
        BioSystem.spatialAndNutrientDistributions(0.05);
    }
}
