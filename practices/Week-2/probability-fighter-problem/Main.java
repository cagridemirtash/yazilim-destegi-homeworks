public class Main {
    public static void main(String[] args) {
        Ring r;
        Fighter marc = new Fighter("Marc" , 15 , 100, 90, 0);
        Fighter alex = new Fighter("Alex" , 10 , 95, 100, 0);

        System.out.println(IsBig());
        if(IsBig()) {
            r = new Ring(marc,alex , 90 , 100);
        } else {
            r = new Ring(alex,marc , 90 , 100);
        }
        r.run();
    }
    //Return true or false for select fighter.
    //IsBig return %50 false, %50 true.
    static boolean IsBig() {
        return Math.random() < 0.5 ? true: false;
    }
}
