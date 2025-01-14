public class Main {
    public static void main(String[] args) {
        Pair<Integer, String> pair1 = new Pair<>(1, "One");
        System.out.println(pair1);

        Pair<String, Double> pair2 = new Pair<>("PI", 3.14159);
        System.out.println(pair2);

        pair1.setKey(2);
        pair1.setValue("Two");
        System.out.println(pair1);
    }
}
