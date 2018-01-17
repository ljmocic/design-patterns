package behavioral.visitor;

public class BAR implements Element {
    public void   accept( Visitor v ) {
        v.visit( this );
    }

    public String getBAR() {
        return "BAR";
    }
}
