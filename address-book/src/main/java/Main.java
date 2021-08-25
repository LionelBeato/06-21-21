import java.util.List;

public class Main {

    public static void main(String[] args) {

        var data = List.of (
                new Entry("Tim", "Tom"),
                new Entry("Bim", "Bom"),
                new Entry("Jim", "Jom")
                );

        final AddressBook addressBook = new AddressBook(data);
        addressBook.addEntry()
                .removeEntry(entry -> entry.getFirstName().equals("Bim"))
                .findEntries(entry -> entry.getFirstName().equals("Jim"))
                .printEntries();
    }
}
