package PersonCompare;


public class PersonCompare implements Comparable<PersonCompare> {

   private int edad;
   private String nombre;

   public PersonCompare(int edad, String nombre){
        this.edad = edad;
        this.nombre = nombre;
   }

//    @Override
//    public int compareTo(PersonCompare other){
//     // return this.nombre.compareTo(other.nombre);
//     return Integer.compare(this.edad, other.edad);
//    }

   @Override
   public int compareTo(PersonCompare other){
    return this.nombre.compareTo(other.nombre);
   }
}