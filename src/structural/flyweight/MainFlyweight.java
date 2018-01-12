package structural.flyweight;

public class MainFlyweight {

    public static void main(String[] args) {
        final int rows = 5, cols = 5;
        Factory f = new Factory(rows);
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++)
                f.getFlyweight(i).report(j);
            System.out.println();
        }
    }
}
