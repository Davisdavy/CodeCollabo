import static spark.Spark.*;

import org.sql2o.Sql2o;

public class App {
    String connectionString = "jdbc:postgresql://localhost:5432/org";
    Sql2o sql2o = new Sql2o(connectionString, "davis", "vegas2017");

    public static void main(String[] args) {
        staticFileLocation("/public");




    }
}
