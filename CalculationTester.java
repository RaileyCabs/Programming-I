public class CalculationTester 
{
    public static void main(String[] args)
    {
        IceCreamCone ICC_example = new IceCreamCone(10.5, 6.3);
        
        double ICC_surfaceArea = ICC_example.getSurfaceArea();
        double ICC_volume = ICC_example.getVolume();
        
        System.out.println("The surface area of the ice cream cone is: " + formatNumber(ICC_surfaceArea));
        System.out.println("The volume of the ice cream cone is: " + formatNumber(ICC_volume));
        
        SodaCan SC_example = new SodaCan(10.1, 15.2);
        
        double SC_surfaceArea = SC_example.getSurfaceArea();
        double SC_volume = SC_example.getVolume();
        
        System.out.println("The surface area of the soda can is: " + formatNumber(SC_surfaceArea));
        System.out.println("The volume of the soda can is: " + formatNumber(SC_volume));
        
    }
    
    private static String formatNumber(double number)
    {
        return String.format("%.3f", number);
    }
}