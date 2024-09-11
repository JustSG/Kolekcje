public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        //losowanie liczb do tablicy 6 elementowej
        /*
        tablica musi mieć zdefiniowany rozmiar,
        którego potem nie można zmieniać.
        W Javie tablica może zachowywać typy proste i złożone.
         */
        int [] tablicaliczbLosowych = new int[6];
        for (int i = 0; i < tablicaliczbLosowych.length; i++) {
            tablicaliczbLosowych[i] = (int) (Math.random()*100+1); // od 1 do 100
        }
        //wypisywanie tablicy na ekranie
        System.out.println("Wylosowana tablica: ");
        for (int element :tablicaliczbLosowych) {
            //(typ nazwa:nazwa kolekcji)
            System.out.println(element + ", ");
        }
    }


    /*
    1. git init
    2. git config user.name
    3. git config user.email
    4. git add.
    5. git commit -m "nazwa"
    6. git remote add origin https://github.com/JustSG/Kolekcje.git - to tylko raz
       git remote set url origin https://github.com/JustSG/Kolekcje.git - żeby zmienić
    7. git push -u origin master - tylko raz
    8. git push
     */
}