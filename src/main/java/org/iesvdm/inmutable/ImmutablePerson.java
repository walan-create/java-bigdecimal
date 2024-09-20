package org.iesvdm.inmutable;


/**Objeto inmutables:

 String

 Wrappers de tipos primitivos:
 Integer
 Long
 Float
 Double
 Byte
 Short
 Character
 Boolean

 Numeros de precision arbitraria:
 BigDecimal
 BigInteger

 Enum (una vez establecido un valor enum en una variable no se puede cambiar)

    enum Color { RED, GREEN, BLUE }
    Color color = Color.RED; // Una vez asignado un enum, no puede cambiarse

 java.time:
 LocalDate
 LocalTime
 LocalDateTime

 Collections.unmodifiableXXX() - Conversiones de colecciones a no modificables
 Una lista no modificable es una vista de lista que no admite ninguna
 operación de modificación, como agregar, eliminar o actualizar sus elementos.
 Si intenta modificar la lista, se generará una UnsupportedOperationException.

    List<String> list = new ArrayList<>();
    list.add("Hello");
    List<String> immutableList = Collections.unmodifiableList(list);

 Optional
 */

//La clase es final, no puede heredarse.
public final class ImmutablePerson {

    //Todos los atributos son finales una vez seteados por constructor
    //no pueden cambiar
    //Todos los atributos son privados solo pueden accederse a traves de
    //metodos (getters)
    private final String name;
    private final int age;

    //El constructor es el responsable de establecer los valores
    //de los atributos
    public ImmutablePerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //Se tienen metodos (getters) para acceder a los atributos
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}