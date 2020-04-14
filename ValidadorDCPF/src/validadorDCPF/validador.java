/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validadorDCPF;

import java.util.Scanner;

/**
 *
 * @author Nls
 */
public class validador {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String cpf;

        System.out.println("***** Validação de CPF *****");
        System.out.print("Digite seu cpf:");
        cpf = scan.next();

        if(cpf.length() == 11){
            switch (cpf) {
                case "11111111111":
                case "22222222222":
                case "33333333333":
                case "44444444444":
                case "55555555555":
                case "66666666666":
                case "77777777777":
                case "88888888888":
                case "99999999999":
                    System.out.println("CPF invalido");
                    break;
                default:
                    Long cpfNumeros = Long.parseLong(cpf);
                    separarCaracter(cpfNumeros);
            }
        }else{
            System.out.println("CPF Invalido");
        }
            

    }

    public static void separarCaracter(long cpfNumeros) {

        int dezPri = (int) (cpfNumeros % 10);
        cpfNumeros = cpfNumeros / 10;
        int dez = (int) (cpfNumeros % 10);
        cpfNumeros = cpfNumeros / 10;
        int non = (int) (cpfNumeros % 10);
        cpfNumeros = cpfNumeros / 10;
        int oit = (int) (cpfNumeros % 10);
        cpfNumeros = cpfNumeros / 10;
        int set = (int) (cpfNumeros % 10);
        cpfNumeros = cpfNumeros / 10;
        int sex = (int) (cpfNumeros % 10);
        cpfNumeros = cpfNumeros / 10;
        int qui = (int) (cpfNumeros % 10);
        cpfNumeros = cpfNumeros / 10;
        int qua = (int) (cpfNumeros % 10);
        cpfNumeros = cpfNumeros / 10;
        int ter = (int) (cpfNumeros % 10);
        cpfNumeros = cpfNumeros / 10;
        int seg = (int) (cpfNumeros % 10);
        cpfNumeros = cpfNumeros / 10;
        int pri = (int) (cpfNumeros % 10);

        //Passo 3
        int restoMult = multiplicarDigitosPassoUmEDois(pri, seg, ter, qua, qui, sex, set, oit, non) % 11; //Passo 1 e Passo 2
        restoMult = 11 - restoMult; //Passo 4

        //Passo5
        if (verificar(restoMult, dez)) {
            //Passo 8
            int resultPassoSeis = multiplicarDigitosPassoSeisESete(pri, seg, ter, qua, qui, sex, set, oit, non, dez) % 11;  //Passo 6  e Passo 7
            resultPassoSeis = 11 - resultPassoSeis;//Passo9
            //Passo 10
            if (verificar(resultPassoSeis, dezPri)) {
                System.out.println("CPF è válido");

            } else {
                System.out.println("CPF é inválido");
            }
        } else {
            System.out.println("CPF é inválido");
        }
    }

    public static int multiplicarDigitosPassoUmEDois(int pri, int seg, int ter, int qua, int qui, int sex, int set, int oit, int non) {
        return ((pri * 10) + (seg * 9) + (ter * 8) + (qua * 7) + (qui * 6) + (sex * 5) + (set * 4) + (oit * 3) + (non * 2));
    }

    public static int multiplicarDigitosPassoSeisESete(int pri, int seg, int ter, int qua, int qui, int sex, int set, int oit, int non, int dez) {
        return ((pri * 11) + (seg * 10) + (ter * 9) + (qua * 8) + (qui * 7) + (sex * 6) + (set * 5) + (oit * 4) + (non * 3) + (dez * 2));
    }

    public static boolean verificar(int resultSubtracao, int dez) {
        if (resultSubtracao < 10) {
            if (resultSubtracao == dez) {
                return true;
            }
            if (resultSubtracao == 0) {
                return true;
            }
        }
        return false;
    }

}
