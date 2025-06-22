public class studentex {

    String name;
    int age;

    public studentex(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "studentex{" +
                "name=" + name +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        studentex s1 = new studentex("sanskar" , 14 );
        System.out.println(s1);

    }
}
