public class string_sort {
    public static void main(String[] args) {
        String s = "The quick brown fox jumps over the lazy little dog";
        int length = s.length();
        String arr[] = s.split(" ");
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j].length() > arr[j + 1].length()) {
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
                for (int i1 = 0; i < arr.length - 1; i++) {
                    for (int j2 = 0; j < arr.length - 1; j++) {
                        if (arr[j].length() == arr[j + 1].length() && arr[i].compareTo(arr[j + 1]) > 0) {
                            String temp = arr[j];
                            arr[j] = arr[j + 1];
                            arr[j + 1] = temp;
                        }
                    }
                }
            }
        }
        for (String temp : arr) {
            System.out.println(temp);
        }
    }
}

