package school.sptech;

import java.util.ArrayList;
import java.util.List;

public class Imagem {
    private List<Figura> figuras;

    public Imagem() {
        this.figuras = new ArrayList<>();
    }

    public void adicionar(Figura figura) {
        this.figuras.add(figura);
    }

    public Double calcularSomaDasAreas(){
        Double soma = 0.0;
        for (Figura figura : this.figuras) {
            soma += figura.calcularArea();
        }
        return soma;
    }

    public List<Figura> buscarPorAreaMaiorQue20() {
        List<Figura> areasMaior20 = new ArrayList<>();
        for (Figura figura : this.figuras) {
            if (figura.calcularArea() > 20) {
                areasMaior20.add(figura);
            }
        }
        return areasMaior20;
    }

    public List<Figura> buscarQuadrados() {
        List<Figura> quadrados = new ArrayList<>();
        for (Figura figura : this.figuras) {
            if (figura instanceof Quadrado) {
                quadrados.add(figura);
            }
        }
        return quadrados;
    }
}
