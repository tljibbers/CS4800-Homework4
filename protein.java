import java.util.ArrayList;
import java.util.Random;

public class protein extends customer{

    public String createDietPlan(String name, String dietPlan)
    {
        Random rand = new Random();
        int rand_int = rand.nextInt(4);
        ArrayList<String> proteinList = new ArrayList<String>();
        proteinList.add("Fish");
        proteinList.add("Chicken");
        proteinList.add("Beef");
        proteinList.add("Tofu");

        if(dietPlan.equalsIgnoreCase("No Restriction"))
        {
            return name + ":" + " " + proteinList.get(rand_int);
        }
        if(dietPlan.equalsIgnoreCase("Paleo"))
        {
            while(rand_int == 3)
            {
                rand_int = rand.nextInt(4);
            }
            return name + ":" + " " + proteinList.get(rand_int);
        }
        if(dietPlan.equalsIgnoreCase("Vegan"))
        {
            while((rand_int == 0 ) || (rand_int == 1))
            {
                rand_int = rand.nextInt(4);
            }
            return name + ":" + " " + proteinList.get(rand_int);
        }
        if(dietPlan.equalsIgnoreCase("Nut Allergy"))
        {
            return name + ":" + " " + proteinList.get(rand_int);
        }
        else
        {
            return null;
        }

    }

}
