import java.lang.reflect.Array;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import models.Grocery;
import spark.ModelAndView;
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

        post("/post/new",  (req, response)  -> {
            Map<String, Object> model = new HashMap<>();

            String item = req.queryParams("item");
            int quantity = Integer.parseInt(req.queryParams("quantity"));
            Float price = Float.parseFloat(req.queryParams("price"));

//            Grocery newGrocery = new Grocery(item, quantity, price);
            return new ModelAndView(model, "success.hbs");
        }, new HandlebarsTemplateEngine());

    }
}
