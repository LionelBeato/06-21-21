import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AddressBook {

    private final List<Entry> entries;

    // return new instance
    public AddressBook addEntry(Entry... args) {
        List<Entry> list = new ArrayList<>(entries);
        list.addAll(List.of(args));
        return new AddressBook(list);
    }

    // return new instance
    public AddressBook removeEntry(Predicate<Entry> predicate) {
        List<Entry> list = new ArrayList<>(entries);
        list.removeIf(predicate);
        return new AddressBook(list);
    }

    // message to user
    public void printEntries() {
        entries.forEach(System.out::println);
    }

    // return list of results
    public AddressBook findEntries (Predicate<Entry> predicate) {
       return new AddressBook(
               entries.stream()
               .filter(predicate)
               .collect(Collectors.toList())
       );
    }

    // returns list
    public List<Entry> getEntries() {
        return entries;
    }

//    public void setEntries(List<Entry> entries) {
//        this.entries = entries;
//    }

    public AddressBook(List<Entry> entries) {
        this.entries = entries;
    }

    public AddressBook() {
        this.entries = Collections.emptyList();
    }
}
