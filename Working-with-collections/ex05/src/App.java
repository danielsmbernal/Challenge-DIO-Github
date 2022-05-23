import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.Comparator;

import entities.FavoriteLanguages;

public class App {
    public static void main(String[] args) {

        Set <FavoriteLanguages> languagesByOrder = new LinkedHashSet<>() {{
            add(new FavoriteLanguages("java", 1991, "intelliJ"));
            add(new FavoriteLanguages("python", 1989, "PyCharm"));
            add(new FavoriteLanguages("javaScript", 1991, "VScode"));
        }};

        System.out.println("Order by insertion");
        System.out.print(languagesByOrder.toString().replace("[", " ").replace("]", " "));
        System.out.println();

        System.out.println("\nNatural order");
        Set <FavoriteLanguages> languagesByNatural = new TreeSet<>(languagesByOrder);
        System.out.print(languagesByNatural.toString().replace("[", " ").replace("]", " "));
        System.out.println();

        System.out.println("\nOrder by IDE");
        Set <FavoriteLanguages> languagesByIde = new TreeSet<>(new CompareByIde());
        languagesByIde.addAll(languagesByOrder);
        System.out.print(languagesByIde.toString().replace("[", " ").replace("]", " "));
        System.out.println();

        System.out.println("\nOrder by year of creation or name");
        Set <FavoriteLanguages> languagesByYearOfCreationName = new TreeSet<>(new CompareByYearName());
        languagesByYearOfCreationName.addAll(languagesByOrder);
        System.out.print(languagesByYearOfCreationName.toString().replace("[", " ").replace("]", " "));
        System.out.println();
        
        System.out.println("\nOrder by name, year of creation or IDE");
        Set <FavoriteLanguages> languagesByNameYearOfCreationIde = new TreeSet<>(new CompareByNameYearIde());
        languagesByNameYearOfCreationIde.addAll(languagesByOrder);
        System.out.println(languagesByNameYearOfCreationIde.toString().replace("[", " ").replace("]", " "));
 
    }
}
    
class CompareByIde implements Comparator <FavoriteLanguages> {   
    
    @Override
    public int compare(FavoriteLanguages language1, FavoriteLanguages language2) {
        return (language1.getIde().toUpperCase()).compareToIgnoreCase(language2.getIde().toUpperCase());
    }
} 

class CompareByYearName implements Comparator <FavoriteLanguages> {

    @Override
    public int compare(FavoriteLanguages language1, FavoriteLanguages language2) {

        int yearOfCreation = Integer.compare(language1.getYearOfCreation(), language2.getYearOfCreation());
        if (yearOfCreation != 0) return yearOfCreation;

        return (language1.getName().toUpperCase()).compareToIgnoreCase(language2.getName().toUpperCase());
    }
}

class CompareByNameYearIde implements Comparator <FavoriteLanguages> {

    @Override
    public int compare(FavoriteLanguages language1, FavoriteLanguages language2) {

        int name = (language1.getName().toUpperCase()).compareToIgnoreCase(language2.getName().toUpperCase());
        if (name != 0) return name;

        int yearOfCreation = Integer.compare(language1.getYearOfCreation(), language2.getYearOfCreation());
        if (yearOfCreation != 0) return yearOfCreation;

        return (language1.getIde().toUpperCase()).compareTo(language2.getIde().toUpperCase());
    }
}

