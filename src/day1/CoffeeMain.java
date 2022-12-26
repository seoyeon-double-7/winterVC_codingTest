package day1;

import java.util.Arrays;
import java.util.Comparator;

public class CoffeeMain {

    public static void main(String[] args) {

        Coffee1[] coffees = new Coffee1[] {

                new Coffee1("Americano", 3500),

                new Coffee1("Green tea Latte", 5500),

                new Coffee1("Vanila Latte", 4500),

                new Coffee1("Espresso", 3000)

        };

        Arrays.sort(coffees, new Comparator<Coffee1>() {
            @Override
            public int compare(Coffee1 c1, Coffee1 c2) {
                return Integer.compare((c1.getPrice()), c2.getPrice());
            }
        });

        for(Coffee1 coffee: coffees) {

            System.out.println(coffee.toString());

        }

    }

}
