package exercise1;

public class BlogPost extends Article {
    String venue;
    Integer numImpressions;
    public BlogPost(String title, String[] authors, Integer publishYear, Integer numCitations, String venue, Integer numImpressions){
        super(title, authors, publishYear, numCitations);
        this.venue = venue;
        this.numImpressions = numImpressions;
    }
    

    public double calculateImpact(){

        double base = super.calculateBaseImpact();
        double bonusImpact = this.numImpressions / 2;
        return base + bonusImpact;
    }
}
