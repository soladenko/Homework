package Module7;


import Module4Homework.Currency;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Main_3 {
    public static void main(String[] args) {
        User user1 = new User(11111, "Sergey1", "Oladenko", "Kiev", 1000);
        User user2 = new User(22222, "Sergey2", "Oladenkov", "Kiev", 1000);
        User user3 = new User(33333, "Sergey3", "Oladenkovich", "Kiev", 1000);
        User user4 = new User(44444, "Sergey4", "Oladenchuk", "Kiev", 1000);
        User user5 = new User(55555, "Sergey5", "Olad", "Kiev", 1000);
        User user6 = new User(66666, "Serge6", "Oladenkovovich", "Kiev", 1000);
        User user7 = new User(77777, "Sergey7", "Oladen", "Kiev", 1000);
        User user8 = new User(88888, "Sergey8", "Oladenov", "Kiev", 1000);
        User user9 = new User(99999, "Sergey9", "Oladenovich", "Kiev", 1000);
        User user10 = new User(10000, "Sergey10", "Oladovich", "Kiev", 1000);

        Order order1 = new Order(22222, 200, Currency.USD, "itemName1", "shop1", user1);
        Order order2 = new Order(33333, 200, Currency.USD, "itemName1", "shop1", user1);
        Order order3 = new Order(44444, 200, Currency.USD, "itemName1", "shop1", user1);
        Order order4 = new Order(55555, 200, Currency.USD, "itemName1", "shop1", user1);
        Order order5 = new Order(66666, 200, Currency.USD, "itemName1", "shop1", user1);
        Order order6 = new Order(77777, 200, Currency.USD, "itemName1", "shop1", user1);
        Order order7 = new Order(88888, 200, Currency.USD, "itemName1", "shop1", user1);
        Order order8 = new Order(99999, 200, Currency.USD, "itemName1", "shop1", user1);
        Order order9 = new Order(10000, 200, Currency.USD, "itemName1", "shop1", user1);
        Order order10 = new Order(11111, 200, Currency.USD, "itemName1", "shop1", user1);

        Set<Order> setList = new TreeSet<>((o1, o2) -> o1.getPrice() - o2.getPrice());

        setList.add(order1);
        setList.add(order2);
        setList.add(order3);
        setList.add(order4);
        setList.add(order5);
        setList.add(order6);
        setList.add(order7);
        setList.add(order8);
        setList.add(order9);
        setList.add(order10);

        int k = 0;
        for (Order list : setList) {
            if (list.getUser().getCity().contains("Petrov")) {
                k++;
            }
        }
        if (k > 1)
            System.out.println();
        if (k == 1)
            System.out.println();
        if (k < 1)
            System.out.println();


        Set<Order> OrderWithMaxPrice = new TreeSet<>((o1, o2) -> o1.getPrice() - o2.getPrice());
        System.out.println(OrderWithMaxPrice);

        Iterator<Order> iterator = setList.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getCurrency() == Currency.USD) {
                iterator.remove();
            }
        }
        System.out.println(setList);
    }
    private static Order MaxPrice(Set<Order> d) {
        Order[] ord = new Order[1];
        int n = 0;
        for (Order order : d) {
            if (order.getPrice()>n){
            n = order.getPrice();
            ord[0] = order;
        }

    }
    Order order  = ord[0];
        return order;
    }
}

