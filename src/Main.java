import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Cars> carsArrayList = new ArrayList<>();

        carsArrayList.add(new Porche("911"));
        carsArrayList.add(new Mercedes("class A"));
        carsArrayList.add(new Toyota("Corolla"));
        carsArrayList.add(new Ford("Mustang"));

        for (Cars cars : carsArrayList) {
            cars.description();
        }
    }
}
