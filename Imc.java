import java.util.Scanner;
class Imc {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println ("Insira sua altura em metros: ");
        double altura = ler.nextDouble();
        System.out.println("Insira seu peso em quilogramas: ");
        double peso = ler.nextDouble();
        double imc = peso / (altura * altura);
        if (imc <= 24.99 && imc >= 18.5){
            System.out.println("Peso normal. IMC: "+imc);
        }
        else{
            if (imc <= 18.99 && imc >= 17){
                System.out.println("Abaixo do peso. IMC: "+imc);
            }
            else{
                if (imc < 17) {
                    System.out.println("Muito abaixo do peso. IMC: "+imc);                  
                }
                else{
                    if (imc >= 25 && imc <= 29.99) {
                        System.out.println("Acima do peso. IMC: "+imc);
                    }
                    else{
                        if (imc >= 30 && imc < 34.99) {
                            System.out.println("Obesidade I. IMC: "+imc);
                        }
                        else{
                            if (imc >= 35 && imc <= 39.9) {
                                System.out.println("Obesidade II. IMC: "+imc);
                            }
                            else{
                                System.out.println("Obesidade III. IMC: "+imc);
                            }
                        }
                    }
                }
            }
        }
        ler.close();
    }
}