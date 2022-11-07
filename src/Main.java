import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] array = new String[] {"Рустам", "Рустам", "Владимир", "Владимир", "Кирилл", "Андрей", "Кирилл"};
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            String arg = array[i];
            if  (array[i] != null) {
                for (int j = i+1; j < array.length; j++) {
                    if (arg.equals(array[j])) {
                        array[j] = null;
                    }
                }
            }
        }

        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            if (array[i]  == null) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[j] != null) {
                        array[i] = array[j];
                        array[j] = null;
                        break;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }

}
