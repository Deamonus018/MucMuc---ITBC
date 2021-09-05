import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Meals extends Meal {
    private List<Meal> meals;

    public Meals(UUID id, List<Nutriment> nutriments, String name) {
        super(id, nutriments, name);
    }

    public List<Meal> getMeals() {
        return meals;
    }

    public void setMeals(List<Meal> meals) {
        this.meals = meals;
    }

    public void add(Meal m) {
        for (int i = 0; i < meals.size(); i++) {
            if (!meals.contains(m)) {
                add(m);
            }
        }
    }
    public void remove(Meal m){
        for (int i = 0; i < meals.size(); i++) {
            if (meals.contains(m)){
                remove(m);
            }
        }
    }
    public List<Meal> search(String s){
        ArrayList<Meal> searched = new ArrayList<>();
        for (int i = 0; i < meals.size(); i++) {
            if (meals.contains(s)){
            searched.add(meals.get(i));
            }
        }
        return searched;
    }

    public List<Meal> search(List<Nutriment> nutriments){
        ArrayList<Meal> searched = new ArrayList<>();
        for (int i = 0; i < meals.size() ; i++) {
            if (meals.get(i).getNutriments().equals(nutriments))
                searched.add(meals.get(i));
        }
        return searched;
    }

    public List<Meal> search(Double kcal){
        ArrayList<Meal> searched = new ArrayList<>();
        for (int i = 0; i < meals.size(); i++) {
            if (meals.get(i).getKcal() < kcal){
                searched.add(meals.get(i));
            }
        }return searched;
    }

    @Override
    public String toString() {
        return "[" + this.id +"] | Name: " + this.name;
    }
}
