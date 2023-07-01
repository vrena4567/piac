import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Food> foodList = new ArrayList<>();
        List<String> listOfPiac = FileReader.fileReader("src/piac.txt");
        for (var line : listOfPiac) {
            String[] lineAsArray = line.split(";");
            String name = lineAsArray[0];

            String[] wordAsArray = lineAsArray[1].split(" ");
            String quantity = "";
            for (var word: wordAsArray) {
                String number = wordAsArray[0];
                String unity = wordAsArray[1];
                quantity = number +" " + unity;
            }
            int price = Integer.parseInt(lineAsArray[2]);
            String hasRegulation = lineAsArray[3];
            Taste tase = (lineAsArray[4].equals("sós")) ? Taste.SOS : Taste.EDES;
            Food food = new Food(name, quantity, price, hasRegulation, tase);
            foodList.add(food);
        }
        for (var lines : foodList) {
            System.out.println(lines);
        }
    }
}