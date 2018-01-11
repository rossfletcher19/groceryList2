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

        get("/groceries/new", (req, res) -> {
            Map<String, Object> model = new HashMap<>();
            return new ModelAndView(model, "newpost-form.hbs");
        }, new HandlebarsTemplateEngine());



        get("/", (req, res) -> {
            Map<String, Object> model = new HashMap<>();
            ArrayList<Grocery> groceries = Grocery.getAll();
            model.put("groceries", groceries);

            return new ModelAndView(model, "index.hbs");
        }, new HandlebarsTemplateEngine());

        post("/groceries/new",  (req, res)  -> {
            Map<String, Object> model = new HashMap<>();

            String item = req.queryParams("item");
            int quantity = Integer.parseInt(req.queryParams("quantity"));
            Float price = Float.parseFloat(req.queryParams("price"));


            Grocery newGrocery = new Grocery(item, quantity, price);
            model.put("post", newGrocery);
            model.put("item", newGrocery);
            model.put("quantity", newGrocery);
            model.put("price", newGrocery);
            return new ModelAndView(model, "success.hbs");
        }, new HandlebarsTemplateEngine());

    }
}
