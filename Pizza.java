public class Pizza{
    private String size;
    private String pizzaChain;
    private String pepperoni;
    private String sausage;
    private String mushrooms;
    private String bacon;
    private String onions;
    private String extraCheese;
    private String peppers;
    private String chicken;
    private String olives;
    private String spinach;
    private String tomatoBasil;
    private String beef;
    private String ham;
    private String pesto;
    private String spicyPork;
    private String hamPineapple;

    public Pizza(String size, String pizzaChain, String pepperoni, String sausage, String mushrooms, String bacon, String onions, String extraCheese, String peppers, String chicken, String olives,
    String spinach, String tomatoBasil, String beef, String ham, String pesto, String spicyPork, String hamPineapple)
    {
        this.size = size;
        this.pizzaChain = pizzaChain;
        this.pepperoni = pepperoni;
        this.sausage = sausage;
        this.mushrooms = mushrooms;
        this.bacon = bacon;
        this.onions = onions;
        this.extraCheese = extraCheese;
        this.peppers = peppers;
        this.chicken = chicken;
        this.olives = olives;
        this.spinach = spinach;
        this.tomatoBasil = tomatoBasil;
        this.beef = beef;
        this.ham = ham;
        this.pesto = pesto;
        this.spicyPork = spicyPork;
        this.hamPineapple = hamPineapple;
    }

    public static pizzaBuilder pBuilder()
    {
        return new pizzaBuilder();
    }

    public static class pizzaBuilder {
        private String size;
        private String pizzaChain;
        private String pepperoni;
        private String sausage;
        private String mushrooms;
        private String bacon;
        private String onions;
        private String extraCheese;
        private String peppers;
        private String chicken;
        private String olives;
        private String spinach;
        private String tomatoBasil;
        private String beef;
        private String ham;
        private String pesto;
        private String spicyPork;
        private String hamPineapple;

        public pizzaBuilder setSize(String size)
        {
            this.size = size;
            return this;
        }

        public pizzaBuilder setPizzaChain(String pizzaChain)
        {
            this.pizzaChain = pizzaChain;
            return this;
        }

        public pizzaBuilder setPepperoni(String pepperoni)
        {
            this.pepperoni = pepperoni;
            return this;
        }

        public pizzaBuilder setSausage(String sausage)
        {
            this.sausage = sausage;
            return this;
        }

        public pizzaBuilder setMushrooms(String mushrooms)
        {
            this.mushrooms = mushrooms;
            return this;
        }

        public pizzaBuilder setBacon(String bacon)
        {
            this.bacon = bacon;
            return this;
        }

        public pizzaBuilder setOnions(String onions)
        {
            this.onions = onions;
            return this;
        }

        public pizzaBuilder setExtraCheese(String extraCheese)
        {
            this.extraCheese = extraCheese;
            return this;
        }

        public pizzaBuilder setPeppers(String peppers)
        {
            this.peppers = peppers;
            return this;
        }

        public pizzaBuilder setChicken(String chicken)
        {
            this.chicken = chicken;
            return this;
        }

        public pizzaBuilder setOlives(String olives)
        {
            this.olives = olives;
            return this;
        }

        public pizzaBuilder setSpinach(String spinach)
        {
            this.spinach = spinach;
            return this;
        }

        public pizzaBuilder setTomatoBasil(String tomatoBasil)
        {
            this.tomatoBasil = tomatoBasil;
            return this;
        }

        public pizzaBuilder setBeef(String beef)
        {
            this.beef = beef;
            return this;
        }

        public pizzaBuilder setHam(String ham)
        {
            this.ham = ham;
            return this;
        }

        public pizzaBuilder setPesto(String pesto)
        {
            this.pesto = pesto;
            return this;
        }

        public pizzaBuilder setSpicyPork(String spicyPork)
        {
            this.spicyPork = spicyPork;
            return this;
        }

        public pizzaBuilder setHamPineapple(String hamPineapple)
        {
            this.hamPineapple = hamPineapple;
            return this;
        }

        public Pizza eat()
        {
            return new Pizza(size, pizzaChain, pepperoni, sausage, mushrooms, bacon, onions, extraCheese, peppers, chicken, olives, spinach, tomatoBasil, beef, ham, pesto, spicyPork, hamPineapple);
        }



    }

}