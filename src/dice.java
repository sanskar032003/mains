public class dice {
    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
            int num = (int)Math.round(Math.random() * 6);
            System.out.println(num);
        }

    }
}
