import java.util.UUID;

public class Food extends Nutriment {
    public Food(UUID id, String company, String name, Double weight, Double kcal, Double proteins, Double carbohydrates,
                Double fats, Double fiber) {
        super(id, company, name, weight,kcal,proteins,carbohydrates,fats,fiber);
    }
}
