import java.util.ArrayList;
import java.util.Random;

public class fats extends customer{

    public String createDietPlan(String name, String dietPlan)
    {
        Random rand = new Random();
        int rand_int = rand.nextInt(4);
        ArrayList<String> fatsList = new ArrayList<String>();
        fatsList.add("Avocado");
        fatsList.add("Sour Cream");
        fatsList.add("Tuna");
        fatsList.add("Peanuts");

        if(dietPlan.equalsIgnoreCase("No Restriction"))
        {
            return name + ":" + " " + fatsList.get(rand_int);
        }
        if(dietPlan.equalsIgnoreCase("Paleo"))
        {
            while(rand_int == 1)
            {
                rand_int = rand.nextInt(4);
            }
            return name + ":" + " " + fatsList.get(rand_int);
        }
        if(dietPlan.equalsIgnoreCase("Vegan"))
        {
            while((rand_int == 1 ) || (rand_int == 2))
            {
                rand_int = rand.nextInt(4);
            }
            return name + ":" + " " + fatsList.get(rand_int);
        }
        if(dietPlan.equalsIgnoreCase("Nut Allergy"))
        {
            while (rand_int == 3) 
             {
                rand_int = rand.nextInt(4);
            }
            return name + ":" + " " + fatsList.get(rand_int);
        }
        else
        {
            return null;
        }

    }
    
}
