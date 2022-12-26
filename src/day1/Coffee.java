package day1;

//Comparable 연습 예제

public class Coffee implements Comparable {

    private final String name;

    private final int price;

    public Coffee(String name, int price){

        this.name = name;

        this.price = price;

    }

    public Integer getPriceAsInteger(){

        return this.price;

    }

    @Override

    public boolean equals(Object obj) {

        return ((Coffee) obj).getPriceAsInteger().equals(getPriceAsInteger());

    }

//가격 비교

    @Override

    public int compareTo(Object o) {

        Coffee e = (Coffee) o;

        return getPriceAsInteger().compareTo(e.getPriceAsInteger());

// 길이가 같으면 0, 주어진 객체의 값보다 작으면 -1, 주어진 객체값이 크면 1로 바뀜

    }

    @Override

    public String toString() {

        return "Coffee{"+

                "name='"+name+'\''+

                ", price=" + price+

                '}';

    }

}