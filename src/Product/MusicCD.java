package Product;

/**
 * Created by RENT on 2017-08-23.
 */
public class MusicCD implements IProduct {
    protected int _price;
    protected String _name;
    protected String _title;
    protected String _perfmer;


    @Override
    public int getPrice() {
        return _price;
    }
    @Override
    public void setPrice(int price) {
        _price = price;
    }
    @Override
    public String getProductName(String name) {
            return _name;
    }

    @Override
    public String getProductName() {
        return null;
    }
    public void setProductName(String name){
        _name = name;
    }
    public String getTitle(){
        return _title;
    }
    public void setTitle(String title){
        _title = title;
    }
    public String getPerformer(){
        return _perfmer;
    }
    public void setPerformer(String performer){
        _perfmer = performer;
    }



}
