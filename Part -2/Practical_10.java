public class Practical_10 {
    public static void main(String[] args) {
        String st = "mahek";
        char[] arr = new char[6];

        StringBuffer sc = new StringBuffer(st);
        System.out.println(st.length());
        System.out.println(st.toLowerCase());
        System.out.println(st.toUpperCase());

        for (int i = 0; i < 5; i++) {
            arr[i] = sc.charAt(i);
        }

        for (int i = 0; i < 5; i++) {

            for (int j = 0; j < 5 - i; j++) {

                if (arr[j] > arr[j + 1])
                {
                    char temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
            for (int i = 0; i < 6; i++) {
               if(arr[i]!='\0') {
                    System.out.println(arr[i]);
                }
        }
    }

    }

