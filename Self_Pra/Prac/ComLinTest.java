public class ComLinTest {
    public static void main(String[] args) {
        int count, i = 0;
        String argument;
        count = args.length;
        System.out.println("Number of arguments = " + count);
        while (i < count) {
            argument = args[i];
            i = i + 1;
            System.out.println(i + ":" + "java is " + argument + "!");
        }
    }
}
