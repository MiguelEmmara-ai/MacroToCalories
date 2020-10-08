package Miguel.Corporation;

public class Macros {
    private float proteins;
    private float fats;
    private float carbs;

    public Macros(float proteins, float fats, float carbs) {
        setProteins(proteins);
        setFats(fats);
        setCarbs(carbs);
    }

    private float getProteins() {
        return proteins;
    }

    private void setProteins(float proteins) {
        this.proteins = proteins;
    }

    private float getFats() {
        return fats;
    }

    private void setFats(float fats) {
        this.fats = fats;
    }

    private float getCarbs() {
        return carbs;
    }

    private void setCarbs(float carbs) {
        this.carbs = carbs;
    }

    public float getTotalCalories() {
        return totalCalories();
    }

    private float totalCalories() {
        float tempProteinsCal = getProteins() * 4;
        float tempFatsCal = getFats() * 9;
        float tempCarbsCal = getCarbs() * 4;

        return tempProteinsCal + tempFatsCal + tempCarbsCal;
    }
}
