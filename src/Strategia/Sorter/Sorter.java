package Strategia.Sorter;

/**
 * Created by RENT on 2017-08-28.
 */
public final class Sorter {
    private ISort _sortowanie;

    public Sorter(ISort sortowanie){
        setSortowanie(sortowanie);
    }
    public void setSortowanie(ISort sortowanie){
        _sortowanie = sortowanie;
    }
    public int[] doSorting(int[] toSort){
        return _sortowanie.sort(toSort);
    }


}
