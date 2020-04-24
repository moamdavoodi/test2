public class SubClass extends SupperClass{
    public SubClass(String name, int nom) {
        super(name, nom);
    }
    private int money;

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
