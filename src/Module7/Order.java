package Module7;


import Module4Homework.Currency;

public class Order {
    private long ID;
    private int price;

    private String itemName;
    private String shopIdentificator;
    private User user;
    private Currency currency;
    public Order(long ID, int price, Currency currency, String itemName, String shopIdentificator, User user) {
        this.ID = ID;
        this.price = price;
        this.currency = currency;
        this.itemName = itemName;
        this.shopIdentificator = shopIdentificator;
        this.user = user;

    }

    public Order(int ID, int price, Currency currency, String milk, String shopIdentificator, User user) {
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Order order = (Order) obj;

        if (ID != order.ID) return false;
        if (price != order.price) return false;
        if (currency != order.currency) return false;
        if (itemName != order.itemName) return false;
        if (shopIdentificator != order.shopIdentificator) return false;
        return user!=null;

    }

    @Override
    public String toString() {
        return "Order{" +
                "ID=" + ID +
                ", price=" + price +
                ", currency=" + currency +
                ", itemName='" + itemName + '\'' +
                ", shopIdentificator='" + shopIdentificator + '\'' +
                ", user=" + user +
                '}';
    }

    @Override
    public int hashCode() {
        int result = (int) (ID ^ (ID >>> 32));
        result = 31 * result + price;
        result = 31 * result + (currency !=null? currency.hashCode():0);
        result = 31 * result + (itemName !=null? itemName.hashCode():0);
        result = 31 * result + (shopIdentificator !=null? shopIdentificator.hashCode():0);
        result = 31 * result + (user != null? user.hashCode():0);
        return result;

    }

    public long getId() {
        return ID;
    }

    public void setId(long ID) {
        this.ID = ID;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getShopIdentificator() {
        return shopIdentificator;
    }

    public void setShopIdentificator(String shopIdentificator) {
        this.shopIdentificator = shopIdentificator;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
