
//File Name EmployeeManager.java
import java.io.*;
import java.util.*;

public class EmployeeManager {
    public static void main(String[] args) {
        // Check arguments
        if(args == null || args.length !=1){
            System.out.println("Error: Please provide exactly one argument.");
            return ;
        }
        if (args[0].equals("l")) {
            System.out.println("Loading data ...");
            try {
                BufferedReader read = new BufferedReader(
                        new InputStreamReader(
                                new FileInputStream("employees.txt")));
                String line = read.readLine();
                String employees[] = line.split(",");
                for (String emp : employees) {
                    System.out.println(emp);
                }
            } catch (Exception e) {
            }
            System.out.println("Data Loaded.");
        } else if (args[0].equals("s")) {
            System.out.println("Loading data ...");
            try {
                BufferedReader read = new BufferedReader(
                        new InputStreamReader(
                                new FileInputStream("employees.txt")));
                String line = read.readLine();
                System.out.println(line);
                String employees[] = line.split(",");
                Random rand = new Random();
                int idx = rand.nextInt(employees.length);
                System.out.println(e[idx]);
            } catch (Exception employees) {
            }
            System.out.println("Data Loaded.");
        } else if (args[0].contains("+")) {
            System.out.println("Loading data ...");
            try {
                BufferedWriter write = new BufferedWriter(
                        new FileWriter("employees.txt", true));
                String n = args[0].substring(1);
                w.write(", " + n);
                w.close();
            } catch (Exception employees) {
            }
            System.out.println("Data Loaded.");
        } else if (args[0].contains("?")) {
            System.out.println("Loading data ...");
            try {
                BufferedReader read = new BufferedReader(
                        new InputStreamReader(
                                new FileInputStream("employees.txt")));
                String line = read.readLine();
                String employees[] = line.split(",");
                boolean found = false;
                String s = args[0].substring(1);
                for (int i = 0; i < e.length && !found; i++) {
                    if (employees[i].equals(s)) {
                        System.out.println("Employee found!");
                        found = true;
                    }
                }
            } catch (Exception employees) {
            }
            System.out.println("Data Loaded.");
        } else if (args[0].contains("c")) {
            System.out.println("Loading data ...");
            try {
                BufferedReader read = new BufferedReader(
                        new InputStreamReader(
                                new FileInputStream("employees.txt")));
                String line = read.readLine();
                char[] chars = line.toCharArray();
                boolean inWord = false;
                int count = 0;
                for (char c : chars) {
                    if (c == ' ') {
                        if (!inWord) {
                            count++;
                            inWord = true;
                        } else {
                            inWord = false;
                        }
                    }
                }
                System.out.println(count + " word(s) found " + chars.length);
            } catch (Exception employees) {
            }
            System.out.println("Data Loaded.");
        } else if (args[0].contains("u")) {
            System.out.println("Loading data ...");
            try {
                BufferedReader read = new BufferedReader(
                        new InputStreamReader(
                                new FileInputStream("employees.txt")));
                String line = read.readLine();
                String employees[] = line.split(",");
                String n = args[0].substring(1);
                for (int i = 0; i < employees.length; i++) {
                    if (employees[i].equals(n)) {
                        employees[i] = "Updated";
                    }
                }
                BufferedWriter write = new BufferedWriter(
                        new FileWriter("employees.txt"));
                write.write(String.join(",", employees));
                write.close();
            } catch (Exception employees) {
            }
            System.out.println("Data Updated.");
        } else if (args[0].contains("d")) {
            System.out.println("Loading data ...");
            try {
                BufferedReader read = new BufferedReader(
                        new InputStreamReader(
                                new FileInputStream("employees.txt")));
                String line = read.readLine();
                String employees[] = line.split(",");
                String n = args[0].substring(1);
                List<String> list = new ArrayList<>(Arrays.asList(e));
                list.remove(n);
                BufferedWriter write = new BufferedWriter(
                        new FileWriter("employees.txt"));
                write.write(String.join(",", list));
                write.close();
            } catch (Exception e) {
            }
            System.out.println("Data Deleted.");
        }
    }
    private static String readEmployeeFile(){
        BufferedReader read =new new BufferedReader(new InputStreamReader(
          new FileInputStream("employees.txt")));
          return read.readLine;
    }

    private static void writeEmployeeFile(String content) throws Exception{
        BufferedWriter write=new BufferedWriter(new FileWritter("employees.txt"));
        write.write(content);
        write.close();
    }
}
