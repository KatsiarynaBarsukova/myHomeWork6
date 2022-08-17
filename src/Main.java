public class Main {
    public static void main(String[] args) {

        Figure[] figure = new Figure[5];
        figure[0] = new Triangle();
        figure[1] = new Rectangle();
        figure[2] = new Circle();
        figure[3] = new Triangle();
        figure[4] = new Circle();

        double sum = 0;
        for (int i = 0; i < figure.length; i++) {
            sum+=figure[i].getPerimetr(4,3);
        }

        System.out.println(sum);
   }
 }
