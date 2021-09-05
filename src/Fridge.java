import java.util.List;

public class Fridge {
    private List<Nutriment> nutriments;

    public Fridge(List<Nutriment> nutriments) {
        this.nutriments = nutriments;
    }

    public List<Nutriment> getNutriments() {
        return nutriments;
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
    public void remove(Nutriment n){
        for (int i = 0; i < nutriments.size(); i++) {
            if(nutriments.contains(n)){
                remove(n);
            }

        }
    }
    public void remove(Nutriment n,Double weight){
        for (int i = 0; i < nutriments.size(); i++) {
            if(nutriments.contains(n)){
               Double decreasedWeight = nutriments.get(i).getWeight() - n.getWeight();
               nutriments.get(i).setWeight(decreasedWeight);
            }

        }
    }

}
