package creational.objectpool;

public class MainObjectPool {

    public static void main(String[] args) {
        // For real usage, please import real driver and replace "org.hsqldb.jdbcDriver"
        /*
        JDBCConnectionPool pool = new JDBCConnectionPool(
                "org.hsqldb.jdbcDriver", "jdbc:hsqldb://localhost/mydb",
                "sa", "secret");

        Connection con = pool.checkOut();
        pool.checkIn(con);
        */
        System.out.println("Please import real driver for demo!");
    }

}
