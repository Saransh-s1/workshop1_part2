package exercise1;

public class Publications{
    public String title;
    public String[] authors;
    public Integer publishYear;
    public Integer numCitations;
    public Publications(String title, String[] authors, Integer publishYear, Integer numCitations){
        this.title = title;
        this.authors = authors;
        this.publishYear = publishYear;
        this.numCitations = numCitations;
    }

    public double calculateBaseImpact(){
        Integer currentYear = 2019;
        Integer age = currentYear - this.publishYear;
        if (age.equals(0)){
            age = 1;
        }

        

        double impact =  (double)this.numCitations / age;
        return impact;
    }

    public double estimateImpact(){
        int age = 2019 - this.publishYear;
        if (age < 3){
            return this.calculateBaseImpact() + 100;
        }else if ((age > 40) && (age < 250)){
            return this.calculateBaseImpact() - 250;
        }else{
            // Instructions say to assume exception has already been implemented,
            // so I used IllegalArgumentException as a replacement
            throw new IllegalArgumentException("Age out of range");
        }
    }


}