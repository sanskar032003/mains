public class cartostring {
    int cardoors;

    int cartyres;

    String carname;

    String carinfo;

    public cartostring(int cardoors, int cartyres, String carname, String carinfo) {
        this.cardoors = cardoors;
        this.cartyres = cartyres;
        this.carname = carname;
        this.carinfo = carinfo;
    }

    @Override
    public String toString() {
        return "cartostring{" +
                "cardoors=" + cardoors +
                ", cartyres=" + cartyres +
                ", carname='" + carname + '\'' +
                ", carinfo='" + carinfo + '\'' +
                '}';
    }

    public static void main(String[] args) {
        cartostring c1 = new cartostring(4,4,"swift","ptanii");
        System.out.println(c1);
    }
}
