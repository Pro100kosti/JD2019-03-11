package by.it.bolotko.jd01_15;

import java.io.*;

public class TaskA {
    private static String getFileName(Class<?> cl, String name) {
        String src = System.getProperty("user.dir") + File.separator + "src" + File.separator;
        String strPackage = cl.getPackage().getName();
        String relPath = strPackage.replace(".", File.separator);
        return src + relPath + File.separator + name;
    }

    public static void main(String[] args) {
        int[][] array=create(6,4,15);
        String filename=getFileName(TaskA.class, "matrix.txt");

        try (PrintWriter out=new PrintWriter(new FileWriter(filename))) {
            for (int[] row : array) {
                for (int element : row) {
                    System.out.printf("%3d ", element);
                }
                System.out.println();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        try (BufferedReader in=new BufferedReader(new FileReader(filename))){
            String line;
            while ((line=in.readLine())!=null){
                System.out.println(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static int[][] create(int rows, int cols, int max) {
        int [][]result=new int[rows][cols];
        boolean maxOk;
        boolean minOk;
        do {
            maxOk=false;
            minOk=false;
            for (int i = 0; i < result.length; i++) {
                for (int j = 0; j < result[i].length; j++) {
                    result[i][j]=(int) (Math.random()*31)-15;
                    if (result[i][j] == max) maxOk=true;
                    if (result[i][j] == -max) minOk=true;
                }
            }
        } while (!(maxOk && minOk));
        return result;

    }
}
