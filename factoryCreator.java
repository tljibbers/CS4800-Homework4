public class factoryCreator {

    public static macronutrientFactory createFactory(String type)
    {
        if(type.equalsIgnoreCase("carbs"))
        {
            return new carbFactory();
        }
        else if(type.equalsIgnoreCase("protein"))
        {
            return new proteinFactory();
        }
        else if(type.equalsIgnoreCase("fats"))
        {
            return new fatsFactory();
        }
        else
        {
            return null;
        }
    }
    
}
