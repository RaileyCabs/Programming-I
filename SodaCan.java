
public class SodaCan {
    
    private double diameter;
    private double height;
    
    /** Creates a soda can.
     * @param h the height of the soda can (in inches)
     * @param d the diameter of the soda can (in inches)
     */
    public SodaCan(double h, double d)
    {
        height = h;
        diameter = d;
    }
    
    /** Finds and returns the volume of the soda can.
     * 
     */
    public double getVolume()
    {
        double radius = diameter / 2.0;
        return Math.PI * radius * radius * height; 
    }
    
    /** Finds and returns the surface area of the soda can.
     * 
     */
    public double getSurfaceArea()
    {
         double radius = diameter / 2.0;
         return (2 * Math.PI * radius * radius) + (2 * Math.PI * radius * height);
    }
}