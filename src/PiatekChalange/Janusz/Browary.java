package PiatekChalange.Janusz;

public class Browary {
    public void wezPiwo(){ System.out.println("weź Piwo"); }
    public void otworzPiwo(){ System.out.println("otwiera piwo"); }
    public void wezSzesciopak(){ for (int i = 0; i < 6 ; i++)wezPiwo(); }
    public void wyrzucPuszke(){ System.out.println("wyrzuc puszke"); }
    public void wypijPiwo(){ System.out.println("Wypija piwo"); wyrzucPuszke();}
}
