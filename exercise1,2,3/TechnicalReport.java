package exercise1;

public class TechnicalReport extends Article {
    String venue;
    Integer numImpressions;
    public TechnicalReport(String title, String[] authors, Integer publishYear, Integer numCitations, String venue, Integer numImpressions){
        super(title, authors, publishYear, numCitations);
        this.venue = venue;
        this.numImpressions = numImpressions;
    }

    public double calculateImpact(){
        return super.calculateBaseImpact() + this.numImpressions;
    }
}
