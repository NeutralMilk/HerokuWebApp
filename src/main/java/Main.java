import static spark.Spark.*;
import static spark.Spark.get;

public class Main {

  public static void main(String[] args) {

    port(Integer.valueOf(System.getenv("PORT")));
    staticFileLocation("/public");

    get("/hello_world", (req, res) -> 
	{
      return "Hello World!";
    });
	
  }
}
