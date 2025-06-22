package bankdet;

public class bankacc {
    public static void main(String[] args) {
        bankdet.details d1 = new details("efsf",213);
        d1.depositmoney(100);
        System.out.println(d1.withdrawmoney(50));
    }
}
