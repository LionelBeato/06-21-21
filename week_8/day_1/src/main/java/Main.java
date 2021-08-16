import aggregation.Address;
import aggregation.Programmer;
import composition.NetflixMovie;
import composition.NetflixMovieLibrary;
import homework.Book;
import vehicle.*;
// recall that you can import statically
import static vehicle.VehicleClassification.USED;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello world!");

        MyImplementation implementation = new MyImplementation();
        implementation.sayHello();
        implementation.sayGoodbye();

        System.out.println(implementation);

        Guitar guitar = new Guitar("guitar", "string");
        Instrument otherGuitar = new Guitar("guitar", "string");


        guitar.createSound();
        guitar.strum();

//        otherGuitar.createSound();
//        otherGuitar.strum();

        Address address = new Address(35, "Springfield", "???");
        Programmer programmer = new Programmer("Jimbo", address);

        NetflixMovie movie = new NetflixMovie("Titanic", "James Cameron");

        NetflixMovieLibrary netflix = new NetflixMovieLibrary(List.of(movie));
        netflix.getMovies()
                .forEach(mv -> System.out.println(mv));

        EnumTest enumTest = new EnumTest(Day.SATURDAY);
        enumTest.weekendOrWeekday();

        LightTruck lightTruck = new LightTruck(true);

        if (lightTruck.is4wd) {
            int gears = lightTruck.transferCase.getNumGears();
            System.out.println(gears);
        }

        // with static imports, we don't need to refer to
        // the full enum class name
        lightTruck.setVehicleClassification(USED);

        Department financeDepartment = DepartmentFactory.createDepartment(DepartmentEnum.FINANCE);
        System.out.println(financeDepartment);

        List<Book> bookList = List.of(
                new Book("book-1"),
                new Book("book-2"),
                new Book("book-3"),
                new Book("book-4"),
                new Book("book-5"),
                new Book("book-6")
        );

//        System.out.println(bookList);
        bookList.forEach(book -> System.out.println(book.getTitle()));


    }

}
