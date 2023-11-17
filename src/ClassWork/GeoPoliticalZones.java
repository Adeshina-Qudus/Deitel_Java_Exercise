package ClassWork;

import java.util.Arrays;

public enum GeoPoliticalZones{
    SOUTH_SOUTH("Akwa-Ibom, Bayelsa, Cross-River, Delta ,Edo,Rivers"),
    NORTH_EAST("Adamawa, Bauchi, Borno, Gombe, Taraba, Yobe"),
    NORTH_CENTRAL(" Benue, Kogi, Kwara, Nasarawa, Niger,Plateau"),
    SOUTH_WEST("Ekiti, Lagos, Ogun, Ondo, Osun, Oyo"),
    NORTH_WEST("Kaduna, Kano, Katsina, Kebbi, Jigawa, Sokoto, Zamfara ");

    private final String []states;
    GeoPoliticalZones(String ... states) {
        this.states = states;
    }
    public String[] getStates(){
        return states;
    }
    public static void getAllStates(){
        System.out.println(Arrays.toString(GeoPoliticalZones.values()));
    }
    public static Object geoPoliticalResult(String input) {
        for (GeoPoliticalZones outter : GeoPoliticalZones.values()){
            for(String count : outter.getStates()){
                if (count.equals(input)){
                    return outter;
                }
            }
        }
        return false;
    }


}
