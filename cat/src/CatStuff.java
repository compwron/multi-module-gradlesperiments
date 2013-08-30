public class CatStuff {
    public DapStuff dap;

    public CatStuff(){
        System.out.println("Cat depends on Dap");
        this.dap = new DapStuff();
    }
}
