package edu.iu.habahram.pizzashop.model;

public class NewYorkPizzaIngredientFactory implements PizzaIngredientFactory
{

    public Dough createDough() {
        return new ThickCrustDough();
    }

    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    public Powder createPower() {
        return new Garlic();
    }


    public Cheese[] createCheese() {
        Cheese cheese[] = {
                new ReggianoCheese()
        };
        return cheese;
    }

    public Veggies[] createVeggies() {
        Veggies veggies[] = { new Mushrooms(),
                new Onions(),
                new RedPeppers() };
        return veggies;
    }

    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    public Clams createClam() {
        return new FrozenClams();
    }
}