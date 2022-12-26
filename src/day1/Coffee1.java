package day1;

public class Coffee1 {

    private final String name;

    private final int price;

    public Coffee1(String name, int price){

        this.name = name;

        this.price = price;

    }

    public String getName(){
        return name;
    }

    public int getPrice(){
        return price;
    }

    @Override

    public String toString() {

        return "Coffee{"+

                "name='"+name+'\''+

                ", price=" + price+

                '}';

    }

}
