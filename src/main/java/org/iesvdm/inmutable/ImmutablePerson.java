package org.iesvdm.inmutable;

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