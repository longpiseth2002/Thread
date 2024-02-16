public class ThreadExample {
    private static void printWithDelay(String str, int delay) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i));
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        String string1 = "Welcome to CTAS !";
        String string2 = "Don't give up this opportunity , do your best first .";
        String string3 = "Downloading";
        String star = "*".repeat(string2.length());
        String s = "-".repeat(string2.length());
        String point = ".".repeat(string3.length());
        int delay = 200;

        printWithDelay(string1, delay);
        System.out.println();
        printWithDelay(star,delay);
        System.out.println();
        printWithDelay(string2, delay);
        System.out.println();
        printWithDelay(s,delay);
        System.out.println();
        System.out.print(string3);
        printWithDelay(point, delay);
        System.out.println(" completed 100% .");
    }


}
