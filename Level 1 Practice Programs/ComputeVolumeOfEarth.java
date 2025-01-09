// Create ComputeVolumeOfEarth class to calculate the volume of earth

public class ComputeVolumeOfEarth {
    public static void main(String[] agrs){
    
    // Create the variable radius that indicates the radius of earth (in kilometer).
    float radius = 6378f;

    // Create the volumeInKm to compute the volume of earth in km^3 using formula (4/3) * pi * r^3.
    // taking pi = 22/7
    // r = radius of earth
    float volumeInKm = (4f/3f) * (22f/7f) * (float)Math.pow(radius,3);

    // Create the volumeInMiles and convert the cubic kilometers to cubic miles
    float volumeInMiles =  volumeInKm / (float)Math.pow(1.6,3);

    //Print the volumeInKm and volumeInMiles
    System.out.println(" The volume of earth in cubic kilometers is "+volumeInKm+" and cubic miles is "+volumeInMiles);


    }
}




