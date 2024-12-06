package Activity34;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;

public class libraryRead {
    public static void main(String[] args) {
        try {
// creates a Gson object
            Gson gson = new Gson();
// reading the json file with BufferedReader class object
            BufferedReader reader = new BufferedReader(new
                    FileReader("checkout.json"));
// get the type of List<Car>
            Type checkoutListType = new TypeToken<List<Checkout>>(){}.getType();
// converts json to Java object --> a List of Cars
            List<Car> carList = gson.fromJson(reader, checkoutListType);
            System.out.println("****** Car Details ******");
// Enhanced for loop through the list of cars and print details
            for(Car car : carList) {
                System.out.printf("Car make %s\nmodel: %s\nyear: %d\n",car.getMake(),car.getModel(),car.getYear());
                System.out.println();
            }
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
