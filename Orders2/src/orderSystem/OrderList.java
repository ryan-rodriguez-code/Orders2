package orderSystem;
import java.util.ArrayList;

public class OrderList {
    private ArrayList<Order> orderList;
    private ArrayList<String> productList;
    private ArrayList<Double> priceList;

    public OrderList(){
        this.productList = new ArrayList<String>();
        this.productList.add("Snickerdoodle Cookies");
        this.productList.add("Chocolate Chip Cookies");
        this.productList.add("Oatmeal Cookies");
        this.productList.add("Gingersnap Cookies");
        this.productList.add("Shortbread Cookies");
        this.productList.add("Peanut Butter Cookies");
        this.productList.add("Sugar Cookies");
        this.productList.add("Biscotti Cookies");
        this.productList.add("Butter Cookies");
        this.productList.add("Spritz Cookies");
        this.productList.add("Drop Cookies");
        this.productList.add("Thumbprint Cookies");
        this.productList.add("Pinwheel Cookies");
        this.productList.add("Wafer Cookies");
        this.productList.add("Macaron Cookies");
        this.productList.add("Fortune Cookies");
        this.productList.add("Crinkle Cookies");
        this.productList.add("Icebox Cookies");
        this.productList.add("Gingerbread Cookies");
        this.productList.add("Lebkuchen Cookies");
        this.productList.add("Macadamia Nut Cookies");

        this.priceList = new ArrayList<Double>();
        this.priceList.add(new Double(1.50));
        this.priceList.add(new Double(1.00));
        this.priceList.add(new Double(0.82));
        this.priceList.add(new Double(2.00));
        this.priceList.add(new Double(1.85));
        this.priceList.add(new Double(2.10));
        this.priceList.add(new Double(1.99));
        this.priceList.add(new Double(1.34));
        this.priceList.add(new Double(2.30));
        this.priceList.add(new Double(0.99));
        this.priceList.add(new Double(1.79));
        this.priceList.add(new Double(0.92));
        this.priceList.add(new Double(0.88));
        this.priceList.add(new Double(1.29));
        this.priceList.add(new Double(2.50));
        this.priceList.add(new Double(0.30));
        this.priceList.add(new Double(0.76));
        this.priceList.add(new Double(2.26));
        this.priceList.add(new Double(0.66));
        this.priceList.add(new Double(2.10));
        this.priceList.add(new Double(1.33));

        this.orderList = new ArrayList<Order>();
    }

    public void ordersUpdated(){
        while(true){
            String msg;
            while(true){
                msg = JOP.in("Wellcome to order system control. What action do you want to do? \nPress 1 for order changes, 2 to sort and display orders, 3 to change product and price information, 4 to quit");
                if(msg != null && (msg.equals("1") || msg.equals("2") || msg.equals("3") || msg.equals("4"))){
                    break;
                }
            }

            if(msg.equals("4")){
                break;
            }
            else if(msg.equals("3")){
                String s;
                while(true){
                    s = JOP.in("What change do you want? \nPress 1 to add a new product with price, 2 to change a price, 3 to delete a product with price");
                    if(s != null && (s.equals("1") || s.equals("2") || s.equals("3"))){
                        break;
                    }
                }

                if(s.equals("3")){
                    String ss;
                    while(true){
                        ss = JOP.in("What is the product name?\n" + this.products());
                        if(ss != null && this.instanceOfProduct(ss)){
                            break;
                        }
                    }
                    this.deleteProductAndPrice(ss);
                }
                else if(s.equals("2")){
                    String ss;
                    while(true){
                        ss = JOP.in("What product do you want to change the price of?\n" + this.products());
                        if(ss != null && this.instanceOfProduct(ss)){
                            break;
                        }
                    }
                    this.changePrice(ss);
                }
                else if(s.equals("1")){
                    this.addNewProductWithPrice();
                }
            }
            else if(msg.equals("2")){
                String s;
                while(true){
                    s = JOP.in("What sorting option do you want? \nPress 1 to display all active orders, 2 to display all orders by buyer, 3 to display all orders by product");
                    if(s != null && (s.equals("1") || s.equals("2") || s.equals("3"))){
                        break;
                    }
                }

                if(s.equals("3")){
                    String ss;
                    while(true){
                        ss = JOP.in("What is the product?\n" + this.products());
                        if(ss != null && this.instanceOfProduct(ss)){
                            break;
                        }
                    }
                    this.allOrdersByProduct(ss);
                }
                else if(s.equals("2")){
                    String ss;
                    while(true){
                        ss = JOP.in("Who is the buyer?\n" + this.buyers());
                        if(ss != null && this.instanceOfBuyer(ss)){
                            break;
                        }
                    }
                    this.allOrdersByBuyer(ss);
                }
                else if(s.equals("1")){
                    this.displayAllOrders();
                }
            }
            else if(msg.equals("1")){
                String s;
                while(true){
                    s = JOP.in("What order change do you want? \nPress 1 to add order, 2 to delete order by ID, 3 to delete all orders by buyer, 4 to delete all orders by product, 5 to delete all orders by product and buyer");
                    if(s != null && (s.equals("1") || s.equals("2") || s.equals("3") || s.equals("4") || s.equals("5"))){
                        break;
                    }
                }

                if(s.equals("5")){
                    String ss1;
                    while(true){
                        ss1 = JOP.in("What is the product?\n" + this.products());
                        if(ss1 != null && this.instanceOfProduct(ss1)){
                            break;
                        }
                    }
                    String ss2;
                    while(true){
                        ss2 = JOP.in("Who is the buyer?\n" + this.buyers());
                        if(ss2 != null && this.instanceOfBuyer(ss2)){
                            break;
                        }
                    }
                    this.deleteAllOrdersByProductAndBuyer(ss1, ss2);
                }
                else if(s.equals("4")){
                    String ss;
                    while(true){
                        ss = JOP.in("What is the product?\n" + this.products());
                        if(ss != null && this.instanceOfProduct(ss)){
                            break;
                        }
                    }
                    this.deleteAllOrdersByProduct(ss);
                }
                else if(s.equals("3")){
                    String ss;
                    while(true){
                        ss = JOP.in("Who is the buyer?\n" + this.buyers());
                        if(ss != null && this.instanceOfBuyer(ss)){
                            break;
                        }
                    }
                    this.deleteAllOrdersByBuyer(ss);
                }
                else if(s.equals("2")){
                    double ss = Double.parseDouble(JOP.in("What is the order ID?"));
                    this.deleteOrder(ss);
                }
                else if(s.equals("1")){
                    String ss1;
                    while(true){
                        ss1 = JOP.in("What is the product?\n" + this.products());
                        if(ss1 != null && this.instanceOfProduct(ss1)){
                            break;
                        }
                    }
                    double ss2 = this.priceList.get(this.indexOfProduct(ss1));
                    String ss3 = JOP.in("Who is the buyer?");
                    int ss4 = Integer.parseInt(JOP.in("What is the quantity?"));
                    this.addOrder(ss1, ss2, ss3, ss4);
                }
            }
        }
    }

    private void allOrdersByProduct(String s){
        String ss = "";
        for(int i = 0; i < this.orderList.size(); i++){
            if(this.orderList.get(i).getProduct().equals(s)){
                ss += "Product: " + this.orderList.get(i).getProduct() + " Price: " + this.orderList.get(i).getPrice() + " Buyer: " + this.orderList.get(i).getBuyer() + " Quantity: " + this.orderList.get(i).getQuantity() + " ID: " + this.orderList.get(i).getOrderID() + "\n";
            }
        }
        JOP.msg(ss);
    }

    private void allOrdersByBuyer(String s){
        String ss = "";
        for(int i = 0; i < this.orderList.size(); i++){
            if(this.orderList.get(i).getBuyer().equals(s)){
                ss += "Product: " + this.orderList.get(i).getProduct() + " Price: " + this.orderList.get(i).getPrice() + " Buyer: " + this.orderList.get(i).getBuyer() + " Quantity: " + this.orderList.get(i).getQuantity() + " ID: " + this.orderList.get(i).getOrderID() + "\n";
            }
        }
        JOP.msg(ss);
    }

    private void displayAllOrders(){
        String s = "";
        for(int i = 0; i < this.orderList.size(); i++){
            s += "Product: " + this.orderList.get(i).getProduct() + " Price: " + this.orderList.get(i).getPrice() + " Buyer: " + this.orderList.get(i).getBuyer() + " Quantity: " + this.orderList.get(i).getQuantity() + " ID: " + this.orderList.get(i).getOrderID() + "\n";
        }
        JOP.msg(s);
    }

    private void deleteAllOrdersByProductAndBuyer(String s1, String s2){
        for(int i = this.orderList.size() - 1; i >= 0; i--){
            if(this.orderList.get(i).getProduct().equals(s1) && this.orderList.get(i).getBuyer().equals(s2)){
                this.orderList.remove(i);
            }
        }
    }

    private void deleteAllOrdersByProduct(String s){
        for(int i = this.orderList.size() - 1; i >= 0; i--){
            if(this.orderList.get(i).getProduct().equals(s)){
                this.orderList.remove(i);
            }
        }
    }

    private void deleteAllOrdersByBuyer(String s){
        for(int i = this.orderList.size() - 1; i >= 0; i--){
            if(this.orderList.get(i).getBuyer().equals(s)){
                this.orderList.remove(i);
            }
        }
    }

    private void deleteOrder(double s){
        for(int i = this.orderList.size() - 1; i >= 0; i--){
            if(this.orderList.get(i).getOrderID() == s){
                this.orderList.remove(i);
            }
        }
    }

    private void addOrder(String product, double price, String buyer, int quantity){
        this.orderList.add(new Order(product, price, buyer, quantity));
    }

    private boolean instanceOfProduct(String s){
        for(int i = 0; i < this.productList.size(); i++){
            if(this.productList.get(i).equals(s)){
                return true;
            }
        }
        return false;
    }

    private boolean instanceOfBuyer(String s){
        for(int i = 0; i < this.orderList.size(); i++){
            if(this.orderList.get(i).getBuyer().equals(s)){
                return true;
            }
        }
        return false;
    }

    private int indexOfProduct(String s){
        int j = -1;
        for(int i = 0; i < this.productList.size(); i++){
            if(this.productList.get(i).equals(s)){
                j = i;
            }
        }
        return j;
    }

    private String products(){
        String s = "";
        for(int i = 0; i < this.productList.size(); i++){
            s += this.productList.get(i) + ", ";
            if(i % 5 == 0 && i != 0){
                s += "\n";
            }
        }
        return s;
    }

    private String buyers(){
        String s = "";
        ArrayList<String> buyerArrL = new ArrayList<String>();
        for(int i = 0; i < this.orderList.size(); i++){
            if(this.isUniqueBuyer(buyerArrL, this.orderList.get(i).getBuyer())){
                s += this.orderList.get(i).getBuyer() + ", ";
            }
            if(i % 5 == 0 && i != 0){
                s += "\n";
            }
            buyerArrL.add(this.orderList.get(i).getBuyer());
        }
        return s;
    }

    private boolean isUniqueBuyer(ArrayList<String> buyerL, String s){
        for(int i = 0; i < buyerL.size(); i++){
            if(buyerL.get(i).equals(s)){
                return false;
            }
        }
        return true;
    }

    private void deleteProductAndPrice(String s){
        for(int i = this.productList.size() - 1; i >= 0; i--){
            if(this.productList.get(i).equals(s)){
                this.productList.remove(i);
                this.priceList.remove(i);
            }
        }
    }

    private void changePrice(String s){
        double newPrice = Double.parseDouble(JOP.in("What is the new price?"));
        for(int i = this.productList.size() - 1; i >= 0; i--){
            if(this.productList.get(i).equals(s)){
                this.priceList.set(i, new Double(newPrice));
            }
        }
    }

    private void addNewProductWithPrice(){
        String product = JOP.in("What is the new product?");
        double price = Double.parseDouble(JOP.in("What is the price for the new product?"));
        this.productList.add(product);
        this.priceList.add(price);
    }
}
