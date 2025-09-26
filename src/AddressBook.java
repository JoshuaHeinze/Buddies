import java.util.ArrayList;
import java.util.List;

public class AddressBook {
    private List<BuddyInfo> buddies;

    public AddressBook() {
        buddies = new ArrayList<>();
    }

    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();
        BuddyInfo buddy1 = new BuddyInfo("Joe", "55 Joe Street", "1111111111");
        addressBook.addBuddy(buddy1);
        addressBook.removeBuddy(buddy1); //test 2
        addressBook.branchTest();
    }

    public void addBuddy(BuddyInfo buddy) {
        buddies.add(buddy);
    }

    public void removeBuddy (BuddyInfo buddy) {
        buddies.remove(buddy);
    }

    public void branchTest() {
        System.out.println("This is a branch");
    }
}

