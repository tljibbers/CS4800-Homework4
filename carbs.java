import java.util.ArrayList;
import java.util.Random;

public class carbs extends customer{

    public String createDietPlan(String name, String dietPlan)
    {
        Random rand = new Random();
        int rand_int = rand.nextInt(4);
        ArrayList<String> carblist = new ArrayList<String>();
        carblist.add("Cheese");
        carblist.add("Bread");
        carblist.add("Lentils");
        carblist.add("Pistachio");

        if(dietPlan.equalsIgnoreCase("No Restriction"))
        {
            return name + ":" + " " + carblist.get(rand_int);
        }
        if(dietPlan.equalsIgnoreCase("Paleo"))
        {
            while(rand_int != 3)
            {
                rand_int = rand.nextInt(4);
            }
            return name + ":" + " " + carblist.get(rand_int);
        }
        if(dietPlan.equalsIgnoreCase("Vegan"))
        {
            while(rand_int == 0)
            {
                rand_int = rand.nextInt(4);
            }
            return name + ":" + " " + carblist.get(rand_int);
        }
        if(dietPlan.equalsIgnoreCase("Nut Allergy"))
        {
            while (rand_int == 3) 
            {
                rand_int = rand.nextInt(4);
            }
            return name + ":" + " " + carblist.get(rand_int);
        }
        else
        {
            return null;
        }


    }
}
