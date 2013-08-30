public class AbeStuff {
    protected final CatStuff cat;
    protected final BarStuff bar;

    public AbeStuff(){
        System.out.println("Abe depends on Cat (which depends on Dap) and also depends on Bar (which depends on nothing)");
        this.cat = new CatStuff();
        this.bar = new BarStuff();
    }
}
