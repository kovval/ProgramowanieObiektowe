package Product;

/**
 * Created by RENT on 2017-08-23.
 */
public class HarryPotter implements IProduct {
    @Override
    public int getPrice() {
        return 50;
    }

    @Override
    public String getProductName(String name) {
        return "ToBeStoneOrNotToBe";
    }

    @Override
    public String getProductName() {
        return "ToBeStoneOrNot";
    }

    @Override
    public void setPrice(int price) {

    }
}
