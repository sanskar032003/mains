public class arrayto {
    public static void main(String[] args) {
        String[] arr = new String[] {
                "this" , "is" , "me"
        };
        StringBuilder s1 = new StringBuilder();
        for (String str : arr) {
            s1.append(str).append(" ");
        }
        System.out.println(s1);
    }
}
