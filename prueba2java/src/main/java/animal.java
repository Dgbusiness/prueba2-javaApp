/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dprog
 */
public class animal {
    //Clase animal con sobrecarga de constructores.

    String tipo;
    int patas;
    boolean herbivoro;
    
    animal() {
        tipo = "Ciervo";
        patas = 4;
        herbivoro = true;
    }
    
    animal(String type, int cantP, boolean isHerb) {
        tipo = type;
        patas = cantP;
        herbivoro = isHerb;
    }
}
