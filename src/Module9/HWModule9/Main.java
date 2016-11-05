package Module9.HWModule9;


import Module4Homework.Currency;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    static List<Order> list=new ArrayList<Order>();
    static Set<Order>users=new TreeSet<Order>(list);

    static {
        list.add(new Order(22222, 100, Currency.USD, "itemName1", "shop1", new User(11111, "Sergey1", "LastName1", "City1", 1000)));
        list.add(new Order(33333, 200, Currency.EUR, "itemName2", "shop2", new User(22222, "Sergey2", "LastName2", "City2", 2000)));
        list.add(new Order(44444, 300, Currency.USD, "itemName3", "shop3", new User(33333, "Sergey3", "LastName3", "City3", 3000)));
        list.add(new Order(55555, 400, Currency.USD, "itemName4", "shop4", new User(44444, "Sergey4", "LastName4", "City4", 4000)));
        list.add(new Order(66666, 500, Currency.USD, "itemName5", "shop5", new User(55555, "Sergey5", "LastName5", "City5", 6000)));
        list.add(new Order(77777, 700, Currency.USD, "itemName6", "shop6", new User(66666, "Sergey6", "LastName6", "City6", 5000)));
        list.add(new Order(88888, 800, Currency.USD, "itemName7", "shop7", new User(77777, "Sergey7", "LastName7", "City7", 8000)));
        list.add(new Order(99999, 900, Currency.EUR, "itemName8", "shop8", new User(88888, "Sergey8", "LastName8", "City8", 7000)));
        list.add(new Order(11111, 600, Currency.EUR, "itemName9", "shop9", new User(99999, "Sergey9", "LastName9", "City9", 9000)));
        list.add(new Order(00001, 111, Currency.USD, "itemName10", "shop10", new User(00001, "Sergey10", "LastName10", "City10", 1000)));




        users.add(new Order(22222, 100, Currency.USD, "itemName1", "shop1", new User(11111, "Sergey1", "LastName1", "City1", 1000)));
        users.add(new Order(33333, 200, Currency.USD, "itemName2", "shop2", new User(22222, "Sergey2", "LastName2", "City2", 2000)));
        users.add(new Order(44444, 300, Currency.EUR, "itemName3", "shop3", new User(33333, "Sergey3", "LastName3", "City3", 3000)));
        users.add(new Order(55555, 400, Currency.USD, "itemName4", "shop4", new User(44444, "Sergey4", "LastName4", "City4", 4000)));
        users.add(new Order(66666, 500, Currency.USD, "itemName5", "shop5", new User(55555, "Sergey5", "LastName5", "City5", 5000)));
        users.add(new Order(77777, 600, Currency.USD, "itemName6", "shop6", new User(66666, "Sergey6", "LastName6", "City6", 6000)));
        users.add(new Order(88888, 700, Currency.USD, "itemName7", "shop7", new User(77777, "Sergey7", "LastName7", "City7", 7000)));
        users.add(new Order(99999, 800, Currency.USD, "itemName8", "shop8", new User(88888, "Sergey8", "LastName8", "City8", 8000)));
        users.add(new Order(11111, 900, Currency.USD, "itemName9", "shop9", new User(99999, "Sergey9", "LastName9", "City9", 9000)));
        users.add(new Order(10000, 101, Currency.EUR, "itemName10", "shop10", new User(00001, "Sergey10", "LastName10", "City10", 1001)));

    }
    public static void main(String[] args) {

        list.forEach(System.out::println);

        System.out.println(1);
        sortListDecrease(list).forEach(System.out::println);

        System.out.println(2);
        sortListIncrese(list).forEach(System.out::println);

        System.out.println(3);
        sortListItem(list).forEach(System.out::println);

        System.out.println(4);
        deleteListDuplicate(list).forEach(System.out::println);

        System.out.println(5);
        deletePrice(list).forEach(System.out::println);

        System.out.println(6);
        orderByCurrency(list).get(Currency.USD).forEach(System.out::println);
        System.out.println(6);
        orderByCurrency(list).get(Currency.EUR).forEach(System.out::println);

        System.out.println(7);
        Map<String,List<Order>>orderByCities=orderByCities(list);
        Set<String>cities=orderByCities.keySet();
        for (String city:cities){
            orderByCities.get(cities).forEach(System.out::println);
        }

        System.out.println(8);
        checkSetPetrov(users).forEach(System.out::println);

        System.out.println(9);
        deleteUSD(users).forEach(System.out::println);

    }


    // sort list by Order price in decrease order
    private static List<Order> sortListDecrease(List<Order> list) {
        return list.stream().sorted((o1, o2) -> o2.getPrice() - o1.getPrice())
                .collect(Collectors.toList());
    }

    //sort list by Order price in increase order AND User city
    private static List<Order> sortListIncrese(List<Order> list) {
        return list.stream().sorted((o1, o2) -> o1.getPrice() != o2.getPrice() ? o1.getPrice() - o2.getPrice() : o1.getUser().getCity().compareTo(o2.getUser().getCity()))
                .collect(Collectors.toList());
    }

    //sort list by Order itemName AND ShopIdentificator AND User city
    private static List<Order> sortListItem(List<Order> list) {
        return list.stream()
                .sorted((o1, o2) -> o1.getItemName().compareTo(o2.getItemName()) == 0 && o1.getShopIdentificator().compareTo(o2.getShopIdentificator()) == 0 ?
                        o1.getUser().getCity().compareTo(o2.getUser().getCity()) :
                        o1.getItemName().compareTo(o2.getItemName()) == 0 ?
                                o1.getShopIdentificator().compareTo(o2.getShopIdentificator()) :
                                o1.getItemName().compareTo(o2.getItemName()))
                .collect(Collectors.toList());

    }
     //delete duplicates from the list
          private static List<Order>deleteListDuplicate(List<Order>list){
             return list.stream().distinct().collect(Collectors.toList());

    }
    //delete items where price less than 1500
    private static List<Order>deletePrice(List<Order>list){
        return list.stream().filter(order -> order.getPrice()<1500).collect(Collectors.toList());
    }
    // separate list for two list - orders in USD and UAH
    private static Map<Currency, List<Order>> orderByCurrency(List<Order>list){
        Map<Currency,List<Order>>result;
        result=list.stream().collect(Collectors.groupingBy(Order::getCurrency));
        return result;
    }
    //separate list for as many lists as many unique cities are in User
    private static Map<String,List<Order>>orderByCities(List<Order>list){
        Map<String,List<Order>>result;
        result=list.stream().collect(Collectors.groupingBy(o -> o.getUser().getCity()));
        return result;
    }
    //check if set contain Order where User’s lastName is - “Petrov”
    private static Set<Order>checkSetPetrov(Set<Order>set){
        return set.stream().filter(order -> order.getUser().getLastName().equals("Petrov")).collect(Collectors.toSet());
    }
    //delete orders where currency is USD
    private static Set<Order>deleteUSD(Set<Order>set){
        return set.stream().filter(order -> order.getCurrency()!=Currency.USD).collect(Collectors.toSet());
    }
}









