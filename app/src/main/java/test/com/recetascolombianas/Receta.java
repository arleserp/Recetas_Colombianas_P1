package test.com.recetascolombianas;

/**
 * Created by INVESTIGADOR on 28/03/2016.
 */
public class Receta {
    private String name;
    private String description;

    public static final Receta[] recetas = {
            new Receta("Salpicón Colombiano",
                        "1 porción de piña\n" +
                        "1 porción de mango\n" +
                        "1 porción de patilla\n" +
                        "1 porción de bananos\n" +
                        "1 porción de mandarinas\n" +
                        "1 porción de melón\n" +
                        "1 porción de uvas\n" +
                        "1 litro de Gaseosa Colombiana"),
            new Receta("Patacon Pisao",
                    "2 plátanos verdes\n" +
                            "1kg de costilla de cerdo\n" +
                            "1 cebolla\n" +
                            "1 zanahoria\n" +
                            "4 dientes de ajo\n" +
                            "1kg de tomate\n" +
                            "2 pimientos rojos\n" +
                            "1 cebolla tierna\n"+
                            "1 ramo de cilantro"),
            new Receta("Arroz con Leche",
                    "Arroz, 215 gramos\n" +
                            "Leche, litro y medio\n" +
                            "Azúcar, 215 gramos\n" +
                            "Una rama de canela\n" +
                            "La piel de un limón\n" +
                            "Mantequilla, 75 gramos\n" +
                            "Sal, un poquito\n"),
            new Receta("Consomé de Pollo",
                    "1 Libra de Pollo\n" +
                            "1/2 Libra de Cebolla\n" +
                            "6 Dientes de Ajo\n" +
                            "3 Cucharadas de postre de Aceite\n" +
                            "1 Unidad de Ajoporro\n" +
                            "1 Unidad de Zanahoria\n" +
                            "3 Litros de Agua\n" +
                            "1 Cucharadita de Pimienta negra molida\n" +
                            "1 Pizca de Sal\n" +
                            "1 Rama de Celeri\n" +
                            "3 Unidades de Ajíes dulces\n" +
                            "1 Unidad de Cebollín\n")
    };

    public Receta(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getDescription(){
        return description;
    }

    public String getName(){
        return name;
    }

    public String toString(){
        return this.name;
    }
}

