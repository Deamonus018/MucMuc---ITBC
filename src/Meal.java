import java.util.List;
import java.util.Objects;
import java.util.UUID;

public class Meal implements Energy {

    public UUID id;
    public List<Nutriment> nutriments;
    public String name;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public List<Nutriment> getNutriments() {
        return nutriments;
    }

    public void setNutriments(List<Nutriment> nutriments) {
        this.nutriments = nutriments;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Meal(UUID id, List<Nutriment> nutriments, String name) {
        id = UUID.randomUUID();
        this.nutriments = nutriments;
        this.name= name;
    }

    public void add(Nutriment n) {

        for (int i = 0; i < nutriments.size(); i++) {
            if (!nutriments.contains(n))
                add(n);
            else if (nutriments.contains(n)) {
                double increasedWeight = nutriments.get(i).getWeight() + n.getWeight();
                nutriments.get(i).setWeight(increasedWeight);
            }
        }
    }

        public void remove (Nutriment n){
            for (int i = 0; i < nutriments.size(); i++) {
                if (nutriments.get(i).getName().equals(n.getName())) {
                    nutriments.remove(n);
                }

            }

        }
        public void remove (Nutriment n, Double weight){
            for (int i = 0; i < nutriments.size(); i++) {
                if (nutriments.contains(n)) {
                    weight -= weight;
                }

            }
        }

        public Double getKcal () {
            Double sum = 0.0;
            for (Nutriment n : nutriments) {
                sum += n.getKcal();
            }
            return sum;
        }
        public Double totalNutrients () {
            Double proteins = 0.0;
            Double carbohydrates = 0.0;
            Double fats = 0.0;
            Double fiber = 0.0;
            for (Nutriment n : nutriments) {
                proteins += n.getProteins();
                carbohydrates += n.getCarbohydrates();
                fats += n.getFats();
                fiber += n.getFiber();
            }
            return proteins + carbohydrates + fats + fiber;
        }

        @Override
        public boolean equals (Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Meal meal = (Meal) o;
            return Objects.equals(id, meal.id);
        }

    }
