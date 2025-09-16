package exercise1;

public class Journal extends Article{
    String publisher;
    String[] editors;
    public Journal(String title, String[] authors, Integer publishYear, Integer numCitations, String publisher, String[] editors){
        super(title, authors, publishYear, numCitations);
        this.publisher = publisher;
        this.editors = editors;
    }

    public double calculateImpact(){
        return super.calculateBaseImpact() * 2;
    }
}
