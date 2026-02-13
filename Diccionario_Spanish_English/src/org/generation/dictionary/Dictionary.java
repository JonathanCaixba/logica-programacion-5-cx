package org.generation.dictionary;

import java.util.*;

public class Dictionary {

    public static void main(String[] args) {
        // 1. Creamos el diccionario con HashMap
        HashMap<String, String> diccionario = new HashMap<>();

        // Declaramos las 20 palabras (Español y su valor en inglés)
        diccionario.put("perro", "dog");
        diccionario.put("gato", "cat");
        diccionario.put("casa", "house");
        diccionario.put("libro", "book");
        diccionario.put("escuela", "school");
        diccionario.put("agua", "water");
        diccionario.put("sol", "sun");
        diccionario.put("luna", "moon");
        diccionario.put("manzana", "apple");
        diccionario.put("carro", "car");
        diccionario.put("mesa", "table");
        diccionario.put("silla", "chair");
        diccionario.put("ventana", "window");
        diccionario.put("puerta", "door");
        diccionario.put("ciudad", "city");
        diccionario.put("comida", "food");
        diccionario.put("reloj", "watch");
        diccionario.put("computadora", "computer");
        diccionario.put("teclado", "keyboard");
        diccionario.put("cielo", "sky");

        // 2. Se pasan las llaves (español) a una lista para poder mezclarlas
        List<String> listaPalabras = new ArrayList<>(diccionario.keySet());
        Collections.shuffle(listaPalabras);

        // 3. Pedimos al usuario con Scanner
        Scanner scanner = new Scanner(System.in);
        int correctas = 0;
        int incorrectas = 0;

        System.out.println("\n¡Bienvenido al mini reto de inglés!");
        System.out.println("-------------------------------------");
        System.out.println("Traduce las siguientes 5 palabras:\n");

        // 4. Preguntamos al usuario solo 5 palabras usando un ciclo for
        for (int i = 0; i < 5; i++) {
            String palabraEspañol = listaPalabras.get(i);
            String respuestaCorrecta = diccionario.get(palabraEspañol);

            System.out.print((i + 1) + ". ¿Cómo se dice '" + palabraEspañol + "' en inglés?: ");
            String respuestaUsuario = scanner.nextLine();

            // Comprobar con if si es correcta (ignorando mayúsculas/minúsculas) con el EqualsIgnoreCase
            if (respuestaUsuario.equalsIgnoreCase(respuestaCorrecta)) {
                System.out.println("   ¡Muy bien! ✅");
                correctas++;
            } else {
                System.out.println("   Error, la respuesta era: " + respuestaCorrecta + " ❌");
                incorrectas++;
            }
        }

        // 5. Mostramos los resultados al Usuario
        System.out.println("\n--- RESULTADOS ---");
        System.out.println("Aciertos: " + correctas);
        System.out.println("Errores: " + incorrectas);

        scanner.close();
    }
}
