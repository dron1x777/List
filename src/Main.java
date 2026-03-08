import Exceptions.MovieNotFound;
import Model.Movie;
import Model.enums.Genre;
import Service.Impl.MovieServiceImpl;

import java.util.Scanner;

import static java.lang.System.exit;

public class Main {
    public static void main(String[] args) {
        MovieServiceImpl movieService = new MovieServiceImpl();
        Scanner sc = new Scanner(System.in);
        int choose2 = 0;
        Genre genre = null;
        String producerFullName = "";
        String movieName = "";
        int year = 0;
        String role = "";
        String actorName = "";
        long pharmacyId = 0;
        while (true) {
            menu();
            System.out.print("enter your choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter movie full name or part name: ");
                    movieName = sc.nextLine();
                    try {
                        movieService.findMovieByFullNameOrPartName(movieName);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    try {
                        movieService.getAllMovies();
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 3:
                    System.out.println("enter actor name: ");
                    actorName = sc.nextLine();
                    try{
                        movieService.findMovieByActorName(actorName);
                    }  catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    System.out.println("enter year: ");
                    year = sc.nextInt();
                    try {
                        movieService.findMovieByYear(year);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 5:
                    System.out.println("enter producer full name: ");
                    producerFullName = sc.nextLine();
                    try {
                        movieService.findMovieByProducer(producerFullName);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 6:
                    System.out.println("Enter movie type (1. ACTION,\n" +
                            "    2. ADVENTURE,\n" +
                            "    3. COMEDY,\n" +
                            "    4. DRAMA,\n" +
                            "    5. FANTASY,\n" +
                            "    6. HORROR,\n" +
                            "    7. MUSICALS,\n" +
                            "    8. MYSTERY,\n" +
                            "    9. ROMANCE,\n" +
                            "    10. SCIENCE,\n" +
                            "    11. FICTION,\n" +
                            "    12. SPORTS,\n" +
                            "    13. THRILLER,\n" +
                            "    14. WESTERN): ");
                    choose2 = sc.nextInt();
                    if (choose2 == 1) {
                        genre = Genre.ACTION;
                    } else if (choose2 == 2) {
                        genre = Genre.ADVENTURE;
                    } else if (choose2 == 3) {
                        genre = Genre.COMEDY;
                    } else if (choose2 == 4) {
                        genre = Genre.DRAMA;
                    } else if (choose2 == 5) {
                        genre = Genre.FANTASY;
                    } else if (choose2 == 6) {
                        genre = Genre.HORROR;
                    } else if (choose2 == 7) {
                        genre = Genre.MUSICALS;
                    }  else if (choose2 == 8) {
                        genre = Genre.MYSTERY;
                    }  else if (choose2 == 9) {
                        genre = Genre.ROMANCE;
                    }  else if (choose2 == 10) {
                        genre = Genre.SCIENCE;
                    }   else if (choose2 == 11) {
                        genre = Genre.FICTION;
                    }   else if (choose2 == 12) {
                        genre = Genre.SPORTS;
                    }    else if (choose2 == 13) {
                        genre = Genre.THRILLER;
                    } else if (choose2 == 14) {
                        genre = Genre.WESTERN;
                    } else {
                        System.out.println("Wrong account type");
                        break;
                    }
                    try {
                        movieService.findMovieByGenre(genre);
                    }  catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 7:
                    System.out.println("Enter role: ");
                    role = sc.nextLine();
                    try {
                        movieService.findMovieByRole(role);
                    }  catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 8:
                    System.exit(0);
                    default:
                        System.out.println("Invalid choice");
                        break;
            }
        }
    }
    public static void menu() {
        System.out.println("""
                Welcome to the Pharmacy Management System!
                1. find movie by full or part name
                2. get all movies
                3. get movie by actor name
                4. find movie by year
                5. find movie by producer
                6. find movie by genre
                7. find movie by role
                8. exit
                """);
    }
}
