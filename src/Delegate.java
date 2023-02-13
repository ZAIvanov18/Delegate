public class Delegate {
    private String name;
    private int id;
    private String town;
    private String expenses;

    public Delegate(String name, int id, String town, String expenses) {
        this.name = name;
        this.id = id;
        this.town = town;
        this.expenses = expenses;
    }

    public Delegate(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getExpenses() {
        return expenses;
    }

    public void setExpenses(String expenses) {
        this.expenses = expenses;
    }

    @Override
    public String toString() {
        return "Delegate{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", town='" + town + '\'' +
                ", expenses='" + expenses + '\'' +
                '}';
    }
}
