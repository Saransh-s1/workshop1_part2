package exercise1;

public class Article extends Publications{
    

    public Article(String title, String[] authors, Integer publishYear, Integer numCitations){
        super(title, authors, publishYear, numCitations);
    }

    public double calculateBaseImpact(){
        if (this.numCitations < 10){
            throw new IllegalArgumentException("Number of citations must be at least 10");
        } else {
            return this.numCitations / 5.0;
        }
    }

}
