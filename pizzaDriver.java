

public class pizzaDriver {

    public static void main(String[] args)
    {
        Pizza pizzaHutThree = Pizza.pBuilder().setBacon("Bacon").setBeef("Beef").setChicken("Chicken").eat();
        Pizza pizzaHutSix = Pizza.pBuilder().setChicken("Chicken").setExtraCheese("Extra Cheese").setHam("Ham").setHamPineapple("Ham and Pineapple").setMushrooms("Mushrooms").setOnions("Onions").eat();
        Pizza pizzaHutNine = Pizza.pBuilder().setBacon("Bacon").setBeef("Beef").setChicken("Chicken").setExtraCheese("Extra Cheese").setHam("Ham").setHamPineapple("Ham and Pineapple").setMushrooms("Mushrooms").setOlives("Olives").setOnions("Onions").eat();
        
        Pizza pizzaHutLarge = Pizza.pBuilder().setSize("Large").setPizzaChain("Pizza Hut").setBacon("Bacon").setSausage("Sausage").setSpicyPork("Spicy Pork").eat();
        Pizza pizzaHutSmall = Pizza.pBuilder().setSize("Small").setBeef("Beef").setPizzaChain("Pizza Hut").setChicken("Chicken").eat();

        Pizza littleCaesarsMedium = Pizza.pBuilder().setSize("Medium").setPizzaChain("Little Caesars").setBacon("Bacon").setMushrooms("Mushrooms").setHam("Ham").setOlives("Olives").setExtraCheese("Extra Cheese").setBeef("Beef").setPeppers("Peppers").setOnions("Onions").eat();
        Pizza littleCaesarsSmall = Pizza.pBuilder().setSize("Small").setPizzaChain("Little Caesars").setBacon("Bacon").setChicken("Chicken").setHamPineapple("Ham and Pineapple").setOlives("Olives").setMushrooms("Mushrooms").setOnions("Onions").eat();

        Pizza dominoesSmall = Pizza.pBuilder().setSize("Small").setPizzaChain("Dominoes").setBacon("Bacon").eat();
        Pizza dominoesLarge = Pizza.pBuilder().setSize("Large").setPizzaChain("Dominoes").setExtraCheese("Extra Cheese").setHam("Ham").setOlives("Olives").eat();

        System.out.println(pizzaHutThree);
        System.out.println(pizzaHutSix);
        System.out.println(pizzaHutNine);
        System.out.println(pizzaHutLarge);
        System.out.println(pizzaHutSmall);
        System.out.println(littleCaesarsMedium);
        System.out.println(littleCaesarsSmall);
        System.out.println(dominoesSmall);
        System.out.println(dominoesLarge);
          
    }


}
