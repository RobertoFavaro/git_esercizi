package ereditarieta2;
/*Scrivere un programma che contenga una classe chiamata Forma ed un metodo chiamato calcolaArea() che stampi l'area della forma.
        Crea poi una sottoclasse chiamata Rettangolo che fa override del metodo calcolaArea() per calcolare l'area del rettangolo.*/
public class Main {
    public static void main(String[] args) {
        Forma forma = new Forma();
        Rettangolo rettangolo = new Rettangolo();


        System.out.println(forma.calcoloArea(2,8));
        System.out.println(rettangolo.calcoloArea(3,6));
    }
}
