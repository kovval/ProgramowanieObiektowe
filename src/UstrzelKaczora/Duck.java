package UstrzelKaczora;

/**
 * Created by RENT on 2017-08-28.
 */
public abstract class Duck  {
    protected ILatanie latanie; //protected
    protected IKwakanie kwakanie; // protected

    public ILatanie getLatanie() {
        return latanie;
    }

    public void setLatanie(ILatanie latanie) {
        this.latanie = latanie;
    }

    public IKwakanie getKwakanie() {
        return kwakanie;
    }

    public void setKwakanie(IKwakanie kwakanie) {
        this.kwakanie = kwakanie;
    }


//    public void Kwacz(){
//        System.out.println("Quo Quo");
//    }
    public void Swim(){
        System.out.println("shram shram");
    }
    public void showDuck(){
        System.out.println("Duck numvber one in");
    }
    public void wykonajLatanie(){
        latanie.lec();
    }
    public void wykonajKwakanie(){
        kwakanie.kwacz();
    }
//    public void lec(){
//        System.out.println("I m flying like a duck in key, static....");
//    }
}
