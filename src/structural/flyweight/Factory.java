package structural.flyweight;

public class Factory {

    private Gazillion[] pool;

    public Factory(int maxRows) {
        this.pool = new Gazillion[maxRows];
    }

    public Gazillion getFlyweight(int row) {
        if(pool[row] == null ) {
            pool[row] = new Gazillion(row);
        }
        return pool[row];
    }

}
