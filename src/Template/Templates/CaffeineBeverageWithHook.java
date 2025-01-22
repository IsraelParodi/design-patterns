package Template.Templates;

public abstract class CaffeineBeverageWithHook {
    public final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) {
            addCondiments();
        }
    }

    protected abstract void brew();
    protected abstract void addCondiments();

    void boilWater() {
        System.out.println("Boiling Water");
    }

    void pourInCup() {
        System.out.println("Pouring in Cup");
    }

    boolean customerWantsCondiments() {
        return true;
    }
}
