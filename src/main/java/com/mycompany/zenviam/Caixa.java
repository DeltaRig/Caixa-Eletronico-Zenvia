package com.mycompany.zenviam;

/**
 *
 * @author Daniela Pereira Rigoli
 */
public class Caixa {
    int nota100, nota50, nota20, nota10, restante;

    public int[] sacar(int valor){
        nota100 = valor / 100;
        restante = valor % 100; //guardo resto da divisao inteira para calcular notas de 50
        
        nota50 = restante/50;
        restante = restante%50;

        nota20 = restante/20;
        restante =restante%20;

        nota10 = restante/10;
        
        int[] qntNotas = new int[]{nota100, nota50, nota20, nota10};
        
        return qntNotas;
    }
}