import java.util.ArrayList;
import java.util.List;

public class AddressBook {
    private List<BuddyInfo> buddies;

    public AddressBook() {
        buddies = new ArrayList<>();
    }

    public static void main(String[] args) {
        System.out.println("Address Book");
    }

    public void addBuddy(BuddyInfo buddy) {
        buddies.add(buddy);
    }

    public BuddyInfo removeBuddy (String name) {
        for (BuddyInfo i : buddies) {
            if (i.getName().equals(name)) {
                buddies.remove(i);
                return i;
            }
        }
        return null;
    }
}
