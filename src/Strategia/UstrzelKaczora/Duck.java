package Strategia.UstrzelKaczora;

/**
 * Created by RENT on 2017-08-28.
 */
public abstract class Duck  {
    protected ILatanie latanie; //protected
    protected IKwakanie kwakanie; // protected



    public void setLatanie(ILatanie latanie) {
        this.latanie = latanie;
    }

    public IKwakanie getKwakanie() {
        return kwakanie;
    }

    public void setKwakanie(IKwakanie kwakanie) {
        this.kwakanie = kwakanie;
    }


    public void Swim(){
        System.out.println("shram shram");
    }
    public void showDuck(){
        System.out.println("Duck number one in");
    }
    public void wykonajLatanie(){
        latanie.lec();
    }
    public void wykonajKwakanie(){
        kwakanie.kwacz();
    }

}
