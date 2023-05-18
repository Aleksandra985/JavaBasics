public class ExceptionTesting {
//        static String[] names = {"Dragana", "Nebojsa", "Nina"} ;

    public static void main(String[] args) {
        for(int i = 0; i < 4;  i++) {
//                System.out.println(names[i]);
//            }
//            createNewFile()
            int c = 30/0;

        }
    }

//        public static void createNewFile() {
//            //napravi novi fajl
//            try {
//                Object pathname;
//                File file = new File(pathname."mojFolder/nepostojeciFajl.txt");
//                file.createNewFile();
//            } catch (IOException ex | IllegalArgumentException |
//        ArrayIndexOutOfBoundsException ) {
//                System.out.println("Exception is handled");
//                ex.printStackTrace();
//            }

    public static void divisionZero() {
        try {
            int c = 30/0;
        } catch (Exception e) {
//                    e.printStackTrace();
        } finally {
            System.out.println("Division is fun");

        }

    }
}
