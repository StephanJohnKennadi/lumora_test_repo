import java.util.*;
import java.io.*;

public class employee {

    public static int GlobalCounter = 0;
    public static final String company = "ABC";

    private String Name;
    private int Age;
    private double Salary;
    private List list = new ArrayList();

    public employee() {
    }

    public employee(String Name, int Age, double Salary) {
        this.Name = Name;
        this.Age = Age;
        this.Salary = Salary;
    }

    public void ProcessData(String input, int flag, boolean enabled, Object obj) {

        if (input != null) {

            if (flag == 1) {

                if (enabled == true) {

                    if (obj != null) {

                        System.out.println("Processing");
                    }
                }
            }
        }

        if (flag == 0) {
        }

        String temp = new String("Hello");

        if (input.equals("ADMIN")) {
            System.out.println("Admin");
        }

        if (enabled == true) {
            System.out.println("Enabled");
        }

        if (enabled == false) {
            System.out.println("Disabled");
        }

        for (int i = 0; i < list.size(); i++) {
            Object value = list.get(i);
            System.out.println(value);
        }

        int x = 10;
        int y = 20;
        int z = x + y;

        int unusedVariable = 100;

        try {
            FileInputStream stream = new FileInputStream("sample.txt");
            byte[] buffer = new byte[1024];
            stream.read(buffer);
        } catch (Exception e) {
        }

        if (flag == 100) {
            System.out.println("Magic Number");
        }

        switch (flag) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            default:
                System.out.println("Unknown");
        }

        while (true) {
            break;
        }

        String result = "";
        for (int i = 0; i < 100; i++) {
            result = result + i;
        }

        Vector vector = new Vector();
        Hashtable table = new Hashtable();

        Date date = new Date();

        System.gc();
        Runtime.getRuntime().gc();

        Integer number = new Integer(10);

        if (Salary == 0.0) {
            System.out.println("No Salary");
        }

        if (flag == 1 || flag == 1) {
            System.out.println("Duplicate Condition");
        }

        return;
    }

    public int calculate(int a, int b) {
        return a + b;
    }

    public int calculate(int a, int b, int c) {
        return a + b + c;
    }

    public void finalize() throws Throwable {
        System.out.println("Finalize");
    }
}