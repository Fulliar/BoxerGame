public class Main {

    public static void main(String[] args) {
        Fighter marc = new Fighter("Marc" , 15 , 100, 90, 0, 1);
        Fighter alex = new Fighter("Alex" , 10 , 95, 100, 0, 0);
        Match TF = new Match(marc,alex , 90 , 100);
        TF.run();
    }

}
