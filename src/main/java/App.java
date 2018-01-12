import java.lang.reflect.Array;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import models.Grocery;
import spark.ModelAndView;
import spark.Request;
import spark.Response;
import spark.template.handlebars.HandlebarsTemplateEngine;
import static spark.Spark.*;

public class App {
    public static void main(String[] args) {
        staticFileLocation("/public");

        get("/", (req, res) -> {
            Map<String, Object> model = new HashMap<>();
            ArrayList<Grocery> groceries = Grocery.getAll();
            model.put("groceries", groceries);
            return new ModelAndView(model, "index.hbs");
        }, new HandlebarsTemplateEngine());

        post("/groceries/new", (request, response) -> { //URL to make new post on POST route
            Map<String, Object> model = new HashMap<>();

            String item = request.queryParams("item");
            Integer quantity = Integer.parseInt(request.queryParams("quantity"));
            Float price = Float.parseFloat(request.queryParams("price"));
            Grocery newGroceryItem = new Grocery(item, quantity, price);
            model.put("GroceryItem", newGroceryItem);
            return new ModelAndView(model, "success.hbs");
        }, new HandlebarsTemplateEngine());



//        get("/groceries/new", (req, res) -> {
//            Map<String, Object> model = new HashMap<>();
//            return new ModelAndView(model, "newpost-form.hbs");
//        }, new HandlebarsTemplateEngine());








    }
}
