
public class SelectionSortTest {

    public static void main(String[] args) {
        Integer[] integers = {25, 15, 45, 5, 40, 50, 10, 20, 35, 30};
        ArrayUtility.display(integers);
        SelectionSort.sort(integers);
        ArrayUtility.display(integers);

        String[] strings = {"def", "efg", "bcd", "abc", "fgh", "cde", null};
//        String[] strings = {"def", "efg", "bcd", "abc", "fgh", "cde", "ijk"};
        ArrayUtility.display(strings);
        SelectionSort.sort(strings);
        ArrayUtility.display(strings);
    }
}
