public class Main {
    public static void main(String[] args){
        Details movieDetails = new Details("Konstruktor", 20, 2012, "Name Surname");
        System.out.println("Title: "+movieDetails.title);
        System.out.println("lenght in minutes: "+movieDetails.lenght);
        System.out.println("Year of release: "+movieDetails.releaseYear);
        System.out.println("Director: "+movieDetails.director);

    }

}
