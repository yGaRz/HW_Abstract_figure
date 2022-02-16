package Figure_package;

import java.util.Comparator;

class  ComparatorBySquare implements Comparator<Figure> {
    @Override
    public int compare(Figure o1, Figure o2) {
        if((o1 instanceof Squabble) &&(o2 instanceof Squabble)) {
            double s1 = ((Squabble) o1).getSquare();
            double s2 = ((Squabble) o2).getSquare();
            if(s1>s2)
                return 1;
            else
                return -1;
        }
        else{
            if(o1 instanceof Squabble)
                return 1;
            if(o2 instanceof Squabble)
                return -1;
            return 0;
        }
    }
}
