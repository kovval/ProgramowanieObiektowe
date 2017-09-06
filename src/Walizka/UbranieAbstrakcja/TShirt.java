package Walizka.UbranieAbstrakcja;

import WzorceZadania.ZAD1.Strategia.ICiagLiczb;

/**
 * Created by RENT on 2017-09-06.
 */
public class TShirt extends Cloth implements ICanByFolded {
    @Override
    public String getDescription() {
        return "biały tshirt";
    }

    @Override
    public String getName() {
        return "kulka";
    }

    @Override
    public String getsize() {
        return "S";
    }
}
