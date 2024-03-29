package relokacjawzgledempopytu;

import sklep.Polka;

import java.io.Serializable;
import java.util.Map;

public class Relokuj implements Serializable {

    static void relokuj(Polka[][] tablicaPolek, Map<Polka, Integer> wynikSprzedazyProduktu, int maxPopyt, int minPopyt) {
        for(int i=0;i< tablicaPolek.length;i++){
            for(int j=0;j<tablicaPolek[i].length;j++){
                for(Map.Entry<Polka, Integer> entry : wynikSprzedazyProduktu.entrySet()){
                    Polka klucz = entry.getKey();
                    int wartosc = entry.getValue();
                    if(tablicaPolek[i][j].equals(klucz)){
                        if(wartosc == 1){
                            Polka pom = tablicaPolek[maxPopyt][j];
                            tablicaPolek[maxPopyt][j] = tablicaPolek[i][j];
                            tablicaPolek[i][j] = pom;
                        }
                        else if(wartosc == 3){
                            Polka pom = tablicaPolek[minPopyt][j];
                            tablicaPolek[minPopyt][j] = tablicaPolek[i][j];
                            tablicaPolek[i][j] = pom;
                        }
                    }
                }
            }
        }
    }
}