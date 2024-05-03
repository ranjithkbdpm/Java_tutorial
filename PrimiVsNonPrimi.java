//pass reference by value

public class PrimiVsNonPrimi {
    int value;

    public PrimiVsNonPrimi(int value) {
        this.value = value;
    }

    public static void modifyObject(PrimiVsNonPrimi obj) {
        obj.value = 100;
        obj = new PrimiVsNonPrimi(200);  // Reassigning obj, but it won't affect the original reference outside this method
    }

    public static void main(String[] args) {
        PrimiVsNonPrimi obj = new PrimiVsNonPrimi(50);
        System.out.println("Before: " + obj.value); // Output: Before: 50
        modifyObject(obj);
        System.out.println("After: " + obj.value);  // Output: After: 100
    }
}
