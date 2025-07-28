public class Earth {
    public static void main(String[] args) {
        double r=6378.0;
        double rMiles=r*0.621371;

        double vol=(4.0/3.0)*Math.PI*Math.pow(r,3);
        double volMiles=(4.0/3.0)*Math.PI*Math.pow(rMiles,3);
        
        System.out.println(" The volume of earth in cubic kilometers is "+vol+" and cubic miles is "+volMiles);
    }
    
}
