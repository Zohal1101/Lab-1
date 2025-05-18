public class Multiples {
    public static void main(String[] args) {
        int multiples_3and5 = 0;
        int i = 1;
        while (i < 1000) {
            multiples_3and5 += doMultiples(i);
            i += 1;
        }
        System.out.println(multiples_3and5);
    }

    public static int doMultiples(int i) {
        boolean divisibleBy3 = i % 3 == 0;
        boolean divisibleBy5 = i % 5 == 0;

        if (divisibleBy3 || divisibleBy5) {
            return 1;
        }
        return 0;
    }

}

