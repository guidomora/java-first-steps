## Que es un objeto?

Cualquier objeto de la vida real que va a tener:

- Datos
- Funciones --> Metodos

Cada objeto es unico e irrepetible. Comparten metodos y atributos

**Una clase es el molde de un objeto**

**Clase** Perro

_Atributos_:

- nombre,
- raza,
- color,4

_Metodos_:

- dormir()
- comer()

## Encapsulamiento

Poner en una misma capsula (clase) los datos y operaciones posibles sobre ese dato

**Ocultamiento** : Mecanismo controlado para acceder a los atributos de las clases **getters y setters**

## Polimorfismo

Capacidad que puede tener un metodo de una clase de actuar de distinta forma en funcion de los parametros que recibe

- Ejemplo: el metodo speak() en la clase animal
  - perro ---> Woof
  - gato ---> Meow
  - vaca ---> Moo

## Herencia

Hay un padre y los hijos heredan ciertas caracteristicas

## Repaso UML

_Lenguaje unificado de modelado_

2 grandes ramas:

**Diagramas de estructura:**

- diagrama de clases
- diagrama de objetos (revisa el diagrama de clases)
- diagrama de componentes
- diagrama de estructura compuesta
- diagrama de paquetes

**Diagramas de comportamiento**

- diagrama de actividad (paso a paso del proceso)
- diagrama de casos de uso (como un actor interactua con el sistema para completar un proceso)
- diagrama de maquina de estado (describir el comportamiento de un objeto segun eventos externos o internos)
- diagrama de interaccion
  - diagrama de secuencia
  - diagrama global de interaccion
  - diagrama de comunicacion
  - diagrama de tiempos

## Relaciones entre objetos

**1 Cardinalidad**

cuantos objetos existen de cada lado de la relacion.
A y B

- uno a uno
- uno a muchos, o muchos a uno
- muchos a muchos

**2 Direccionalidad**
- Relacion unidireccional:
    - para cada objeto de un lado de la relacion corresponden uno mas objetos del otro lado de la relacion
    - Ejemplo: biblioteca, cada usuario puede tener 0 o muchos libros
- Relacion bidireccional:
    - para cada objeto de un lado de la relacion le corresponden muchos objetos del otro lado, y viceversa
    - Ejemplo: una empresa necesita saber 2 tipos de info.
        - que proyectos tiene un programador. 
        - que programador esta asignado en cada proyecto

**3 Ordindalidad:**

*Agregacion:* un objeto (contenedor) usa a otro objeto (contenido) para realizar alguna funcionalidad

*Composicion:* un objeto (compuesto) es dueño de otro objeto (componente) y el componente no tiene razon de existir sin el compuesto

## Sobre carga de metodos

**2 metodos**

- implementando 2 o mas metodos que tienen el mismo nombre, pero toman un numero diferente de argumentos.
Aca el metodo funciona segun la cantidad de argumetos. Ej si se dan 2 argumentos, ejecuta el metodo que recibe 2 argumentos, si recibe 3 ejectua el metodo que recibe 3



- implementando 2 o mas metodos que tienen el mismo nombre, pero toman argumentos de diferentes tipos
Aca se ejecuta segun el tipo, si coincide con el tipo del argumento que recibe el metodo, se ejecuta el metodo que corresponde

## Casteo o promocion de tipos

Es la conversion de un tipo de dato a otro.
En un metodo podes recibir argumentos de distintos tipos pero podes convertirlos al tipo que quieras

```
    public float toFloat(int a, int b){
        return a + b;
    }
```

## Sobreescritura (@Override)

siempre hay que usar el extends, asi se hereda el metodo 

```
// Clase Padre
class Animal {
    public void sonido() {
        System.out.println("El animal hace un sonido");
    }
}

// Clase Hija
class Perro extends Animal {
    @Override
    public void sonido() {
        System.out.println("El perro ladra");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal miPerro = new Perro();
        miPerro.sonido();  // Llama al método sobrescrito en la clase Perro
    }
}
```