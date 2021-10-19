public class OrderThreeNumbers {
    /*public static void main(String[] args) {
    }*/

    public static String orderNumbers(int first,int second, int third) {
        int aux = 0;
        if (second > third) {
            aux = second;
            second = third;
            third = aux;
        }

        if (first > second) {
            aux = first;
            first = second;
            second = aux;
        }

        if (second > third) {
            aux = third;
            third = second;
            second = aux;
        }


        return String.format("%d,%d,%d", first, second, third);
    }
}
