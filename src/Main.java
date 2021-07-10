public class Main {

public static void main(String[] args) {
        // write your code here
        String nombre = "Santiago Lopez";
        double[] calis = {90, 85, 79, 95, 82};
        double total = 0;
        String letra = "";
        for(int i=0; i<calis.length; i++){
            total = total + calis[i];

        }
        double promedio = total / calis.length;

        System.out.println("Nombre del alumno es: "+nombre);
        for(int i=0; i<calis.length; i++){
            System.out.println("Calificacion "+(i+1)+": "+calis[i]);

        }
        System.out.println("Calificacion promedio es: "+promedio);

          if(promedio >=91) {
             letra="A";
          } else if(promedio>=81) {
              letra="B";
           } else if(promedio>=71) {
              letra="C";
          } else if(promedio>=61) {
              letra="D";
          } else if(promedio>=51) {
              letra="E";
          } else letra ="F";

        System.out.println("Calificacion: "+letra);

}
}

