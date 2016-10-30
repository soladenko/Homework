package Module9.questoin.HWModule9;

import Module4Homework.Currency;
import Module6.UserUtils;
import Module7.Order;
import Module7.User;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

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

        List<Order> listoforder = new ArrayList<>();
        listoforder.add(order1);
        listoforder.add(order2);
        listoforder.add(order3);
        listoforder.add(order4);
        listoforder.add(order5);
        listoforder.add(order6);
        listoforder.add(order7);
        listoforder.add(order8);
        listoforder.add(order9);
        listoforder.add(order10);

        System.out.println(listoforder);


       Comparator<Order> c1 = new Comparator<Order>() {
            @Override
            public int compare(Order o1, Order o2) {
               return o2.getPrice() - o1.getPrice();

                Comparator<Order>price=(o1,o2)->o2.getPrice()-o1.getPrice();


            }
        };


       /* Comparator<Order> c2 = new Comparator<Order>() {
            @Override
            public int compare(Order o1, Order o2) {
                if (o1.getPrice() == o2.getPrice()) {

                }
                return 0;
            }

            ;


            Comparator<Order> c3 = new Comparator<Order>() {
                @Override
                public int compare(Order o1, Order o2) {
                    if (o1.getItemName() == o2.getItemName()) {
                    }
                    return 0;

                    listoforder.sort(c1);
                }

            };*/


        }

    }



