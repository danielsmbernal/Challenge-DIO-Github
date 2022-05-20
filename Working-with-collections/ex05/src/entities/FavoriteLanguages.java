package entities;

public class FavoriteLanguages implements Comparable <FavoriteLanguages>  {

    private String name;
    private Integer yearOfCreation;
    private String ide;

    public FavoriteLanguages(String name, Integer yearOfCreation, String ide) {
        this.name = name;
        this.yearOfCreation = yearOfCreation;
        this.ide = ide;
    }

    public String getName() {
        return name;
    }
   
    public Integer getYearOfCreation() {
        return yearOfCreation;
    }

    public String getIde() {
        return ide;
    }

    @Override
    public String toString() {
        return "\nNAME: " + name 
                + ", YEAR OF CREATION: " + yearOfCreation
                + ", IDE: "
                + ide;
    }

    public int compareTo(FavoriteLanguages languages) {
        return this.getName().compareToIgnoreCase(languages.getName());
    }   
}






    

