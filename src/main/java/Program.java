public class Program {
    private static final int MIN_PRICE = 100;
    private final int price;
    private final int discount;
//    public Program(int price, int discount) {
//        this.price = price;
//        this.discount = discount;
//    }

    public Program(int price, int discount) {
        this.price = price;
        this.discount = discount;
    }

    public int getFinalPrice(){
        if (discount <= 0 || discount > 50) {
            return  price;
        }
        return price - price * discount/100;
    }
    public int getPrice(){
        if(price < MIN_PRICE ){
            return MIN_PRICE;
        }
        return price;
    }
}

