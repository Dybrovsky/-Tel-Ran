public class MainFirstProject {

    public static void main(String[] args) {

        System.out.println("Hi");
        System.out.print("Hi");
        System.out.printf("Hi");

        int a = 5, b = 6, c = 0;
        c = a + b;
        System.out.println("Value = " + a);
        System.out.printf("Value = %d\n", a);

        System.out.printf("%d + %d = %d\n", a, b, c);
        System.out.println(a + " + " + b + " = " + c);
        System.out.println(a + " + " + b + " = " + (a + b));

        int[] ar = new int[5]; // Java
        int arr[] = { 3, 7, 9, 2, 4 }; // C
        System.out.println(arr[2]);
        // System.out.println(arr[10]);
        System.out.println(arr.length);
        char ar1[];
        double ar2[]; // float

        printArray(arr);

        printArray(ar);
        fillArray(ar);
        printArray(ar);
    }

    static void printArray(int[] ar) {

        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + " ");
        }
        System.out.println();
    }

    static void fillArray(int[] ar) {

        for (int i = 0; i < ar.length; i++) {
            // 0.0 1.0
            ar[i] = (int) (Math.random() * 10);
        }
    }

}

/*
 * Stack Heap
 * reference address
 * int ar[] <--------------------------- {3,7,1,9,0} 4bytes*5 = 20bytes
 * 
 * char ar1[] <--------------------------- {35,'7','b','E',110} 2byte*5 =
 * 10bytes
 * 
 * double ar2[] <------------------------- {4.7,7.2,8.1,9.8,1.2} = 8bytes*5 =
 * 40bytes
 * 
 * OS 32bit / 64bit
 * 32 / 8 = 4 bytes
 * 64 / 8 = 8 bytes
 * 
 * address
 * [1 byte][][][][][][][][]
 * 1 2 3 4 ...... 1024 * 1024 = 1 000 000 * 1024 =
 * 4Gb - 1024Mb - 1024Kb - 1024b
 * 
 * [XXXXXXX] [0000001]...[9999999]
 * [XXXXXXXX XXXXXXXX XXXXXXXX XXXXXXXX] - 4Gb ~ 32bit
 * 64bit - 16Hexabyte - 16MTb - Tb->1024Gb
 * 
 * char [0 ... 127] -> 128 - 127 = 0
 * 
 */