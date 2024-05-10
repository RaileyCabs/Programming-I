
public class IceCreamCone {
    
    private double height;
    private double radius;
    
    /** Creates an ice cream cone.
     * @param h the height of the cone in inches
     * @param r the radius of the cone in inches
     */
    public IceCreamCone(double h, double r)
    {
        height = h;
        radius = r;
    }
    
    /** Finds and returns the surface area of the cone.
     *  Does not include the "top" face, since there is
     *  an opening there for the ice cream.
     * 
     */
    public double getSurfaceArea()
    {
        return Math.PI * radius * Math.sqrt(Math.pow(radius, 2) + Math.pow(height, 2));
    }
    
    /** Finds and returns the volume of the cone..
     * 
     */
    public double getVolume()
    {
        return Math.PI*Math.pow(radius, 2)*(height/3);
    }
    
}