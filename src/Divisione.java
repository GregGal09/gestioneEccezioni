import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b;
        Scanner t = new Scanner(System.in);
        System.out.println("inserisci un numero: ");
        try {
            b = t.nextInt();
            int c = a / b;
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.err.println("divisione per zero: " + e.getMessage());
            e.printStackTrace();
        } catch (InputMismatchException ie) {
            System.err.println("devi inserire un NUMERO!!!!!");
        }
        BufferedReader tastiera = new BufferedReader(new InputStreamReader(System.in));
        String parola;
        try {
            parola = tastiera.readLine();
        } catch (IOException e) {
            System.err.println("errore nella lettura da tastiera");
        }
        File file = new File("libri.txt");
        String riga;

        InputStream is = null;
        BufferedReader br = null;
        try {
            is = new FileInputStream(file);
            br = new BufferedReader(new InputStreamReader(is));
            riga = br.readLine();
            System.out.println(riga);

        } catch (FileNotFoundException e) {

            System.err.println("file non trovato");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        finally {
            try {
                br.close();
            } catch (IOException e) {
                System.err.println("errore nello stream")
            }
            if (is != null);
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

//scrittura file
        File f = new File("prova.txt");
        BufferedWriter bw=null;
        try {
            bw = new BufferedWriter(new FileWriter(f));
            bw.write("ciao");
            bw.flush();
        } catch (IOException e) {
            System.err.println("errore apertura file in output");
        } finally {
            try {
                if (is != null);
                bw.close();
            } catch (IOException e) {
                System.err.println("errore chiusura file in output");
            }
        }
    }
}