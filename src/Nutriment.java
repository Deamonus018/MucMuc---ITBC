import java.util.UUID;

public class Nutriment extends Grocery {


    public Double getWeight() {
        return weight;
    }

    private Double weight;
    private Double kcal;
    private Double proteins;
    private Double carbohydrates;
    private Double fats;
    private Double fiber;

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public void setKcal(Double kcal) {
        this.kcal = kcal;
    }

    public void setProteins(Double proteins) {
        this.proteins = proteins;
    }

    public void setCarbohydrates(Double carbohydrates) {
        this.carbohydrates = carbohydrates;
    }

    public void setFats(Double fats) {
        this.fats = fats;
    }

    public void setFiber(Double fiber) {
        this.fiber = fiber;
    }

    public Nutriment(UUID id, String company, String name, Double weight, Double kcal, Double proteins, Double carbohydrates,
                     Double fats, Double fiber) {
        super(company, name, id);
        this.weight = weight;
        this.kcal = kcal;
        this.proteins = proteins;
        this.carbohydrates = carbohydrates;
        this.fats = fats;
        this.fiber = fiber;
    }

    public Nutriment update(UUID id, String company, String name, Double weight, Double kcal, Double proteins, Double carbohydrates,
                            Double fats, Double fiber) {
        setWeight(weight);
        setKcal(kcal);
        setProteins(proteins);
        setCarbohydrates(carbohydrates);
        setFats(fats);
        setFiber(fiber);
        return new Nutriment(id, company, name, weight, kcal, proteins, carbohydrates,
                fats, fiber);
    }

    public Double getProteins() {
        return proteins;
    }

    public Double getCarbohydrates() {
        return carbohydrates;
    }

    public Double getFats() {
        return fats;
    }

    public Double getFiber() {
        return fiber;
    }

    @Override
    public Double getKcal() {
        return kcal;
    }
}
