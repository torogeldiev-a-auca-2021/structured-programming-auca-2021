
public class Problem10 {
    public static void main(String[] args) {
        int pop = 312032486;
        int sec = 365 * 24 * 60 * 60;
        double def = sec / 45.0 + sec / 7.0 - sec / 13.0;
        double one  = def * 1 + pop;
        double two = def * 2 + pop;
        double three = def * 3 + pop;
        double four = def * 4 + pop;
        double five = def * 5 + pop;
        System.out.printf("population of 1st year = %.0f\n",one);
        System.out.printf("population of 2st year = %.0f\n",two);
        System.out.printf("population of 3st year = %.0f\n",three);
        System.out.printf("population of 4st year = %.0f\n",four);
        System.out.printf("population of 5st year = %.0f\n",five);


    }

}
