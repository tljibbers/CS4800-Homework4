public class macroBuilder {

    public static void main(String[] args)
    {
        createMacronutrientPlan("carbs", "protein", "fats");

    }

    public static void createMacronutrientPlan(String type, String type2, String type3)
    {
        macronutrientFactory cFactory = factoryCreator.createFactory(type);
        macronutrientFactory pFactory = factoryCreator.createFactory(type2);
        macronutrientFactory fFactory = factoryCreator.createFactory(type3);
        customer[] James = {cFactory.createNutrient(), pFactory.createNutrient(), fFactory.createNutrient()};
        customer[] Cole = {cFactory.createNutrient(), pFactory.createNutrient(), fFactory.createNutrient()};
        customer[] Sally = {cFactory.createNutrient(), pFactory.createNutrient(), fFactory.createNutrient()};
        customer[] Taylor = {cFactory.createNutrient(), pFactory.createNutrient(), fFactory.createNutrient()};
        customer[] Jason = {cFactory.createNutrient(), pFactory.createNutrient(), fFactory.createNutrient()};
        customer[] Ely = {cFactory.createNutrient(), pFactory.createNutrient(), fFactory.createNutrient()};

        for(int i = 0; i < James.length; i++)
        {
            System.out.println(James[i].createDietPlan("James", "No Restriction"));
            
        }
        for(int i = 0; i < Cole.length; i++)
        {
            System.out.println(Cole[i].createDietPlan("Cole", "Paleo"));
        }
        for(int i = 0; i < Sally.length; i++)
        {
            System.out.println(Sally[i].createDietPlan("Sally", "Vegan"));
        }
        for(int i = 0; i < Taylor.length; i++)
        {
            System.out.println(Taylor[i].createDietPlan("Taylor", "Nut Allergy"));
        }
        for(int i = 0; i < Jason.length; i++)
        {
            System.out.println(Jason[i].createDietPlan("Jason", "No Restriction"));
        }
        for(int i = 0; i < Ely.length; i++)
        {
            System.out.println(Ely[i].createDietPlan("Ely", "Paleo"));
        }
        
    }
    
}
