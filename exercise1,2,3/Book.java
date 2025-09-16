package exercise1;

public class Book extends Publications{
    String publishingCompany;
    Integer numPages;
    public Book(String title, String[] authors, Integer publishYear, Integer numCitations, String publishingCompany, Integer numPages){
        super(title, authors, publishYear, numCitations);
        this.publishingCompany = publishingCompany;
        this.numPages = numPages;
    }

    public double calculateImpact(){
        return super.calculateBaseImpact() * 4;
    }
    
}
