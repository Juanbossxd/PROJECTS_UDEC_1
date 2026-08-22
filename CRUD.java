import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int opcion = 0;
        int empleado = 0;

        String nombre1 = "";
        String nombre2 = "";
        String nombre3 = "";

        int edad1 = 0;
        int edad2 = 0;
        int edad3 = 0;

        int tiempo1 = 0;
        int tiempo2 = 0;
        int tiempo3 = 0;

        double salario1 = 0;
        double salario2 = 0;
        double salario3 = 0;

        boolean existe1 = false;
        boolean existe2 = false;
        boolean existe3 = false;

        while (opcion != 5) {
            System.out.println("===== CRUD DE EMPLEADOS =====");
            System.out.println("1. Crear empleado");
            System.out.println("2. Mostrar empleados");
            System.out.println("3. Actualizar empleado");
            System.out.println("4. Eliminar empleado");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = teclado.nextInt();
            if (opcion == 1) {
                System.out.println("¿Que empleado desea registrar?");
                System.out.println("1. Empleado 1");
                System.out.println("2. Empleado 2");
                System.out.println("3. Empleado 3");
                System.out.print("Seleccione: ");
                empleado = teclado.nextInt();
                if (empleado == 1) {
                    if (existe1 == false) {
                        System.out.print("Nombre: ");
                        nombre1 = teclado.next();
                        System.out.print("Edad: ");
                        edad1 = teclado.nextInt();
                        System.out.print("Años en la empresa: ");
                        tiempo1 = teclado.nextInt();
                        System.out.print("Salario: ");
                        salario1 = teclado.nextDouble();
                        existe1 = true;
                        if (tiempo1 >= 2 && salario1 >= 1500000) {
                            System.out.println("Prestamo APROBADO.");
                        } else {
                            System.out.println("Prestamo NO APROBADO.");
                        }
                    } else {
                        System.out.println("El empleado 1 ya existe.");
                    }
                } else if (empleado == 2) {
                    if (existe2 == false) {
                        System.out.print("Nombre: ");
                        nombre2 = teclado.next();
                        System.out.print("Edad: ");
                        edad2 = teclado.nextInt();
                        System.out.print("Años en la empresa: ");
                        tiempo2 = teclado.nextInt();
                        System.out.print("Salario: ");
                        salario2 = teclado.nextDouble();
                        existe2 = true;
                        if (tiempo2 >= 2 && salario2 >= 1500000) {
                            System.out.println("Prestamo APROBADO.");
                        } else {
                            System.out.println("Prestamo NO APROBADO.");
                        }
                    } else {
                        System.out.println("El empleado 2 ya existe.");
                    }
                } else if (empleado == 3) {
                    if (existe3 == false) {
                        System.out.print("Nombre: ");
                        nombre3 = teclado.next();
                        System.out.print("Edad: ");
                        edad3 = teclado.nextInt();
                        System.out.print("Años en la empresa: ");
                        tiempo3 = teclado.nextInt();
                        System.out.print("Salario: ");
                        salario3 = teclado.nextDouble();
                        existe3 = true;
                        if (tiempo3 >= 2 && salario3 >= 1500000) {
                            System.out.println("Prestamo APROBADO.");
                        } else {
                            System.out.println("Prestamo NO APROBADO.");
                        }
                    } else {
                        System.out.println("El empleado 3 ya existe.");
                    }
                } else {
                    System.out.println("Empleado no valido.");
                }
            } else if (opcion == 2) {
                if (existe1 == true) {
                    System.out.println("===== EMPLEADO 1 =====");
                    System.out.println("Nombre: " + nombre1);
                    System.out.println("Edad: " + edad1);
                    System.out.println("Años en la empresa: " + tiempo1);
                    System.out.println("Salario: " + salario1);
                    if (tiempo1 >= 2 && salario1 >= 1500000) {
                        System.out.println("Prestamo: APROBADO");
                    } else {
                        System.out.println("Prestamo: NO APROBADO");
                    }
                }
                if (existe2 == true) {
                    System.out.println("===== EMPLEADO 2 =====");
                    System.out.println("Nombre: " + nombre2);
                    System.out.println("Edad: " + edad2);
                    System.out.println("Años en la empresa: " + tiempo2);
                    System.out.println("Salario: " + salario2);
                    if (tiempo2 >= 2 && salario2 >= 1500000) {
                        System.out.println("Prestamo: APROBADO");
                    } else {
                        System.out.println("Prestamo: NO APROBADO");
                    }
                }
                if (existe3 == true) {
                    System.out.println("===== EMPLEADO 3 =====");
                    System.out.println("Nombre: " + nombre3);
                    System.out.println("Edad: " + edad3);
                    System.out.println("Años en la empresa: " + tiempo3);
                    System.out.println("Salario: " + salario3);
                    if (tiempo3 >= 2 && salario3 >= 1500000) {
                        System.out.println("Prestamo: APROBADO");
                    } else {
                        System.out.println("Prestamo: NO APROBADO");
                    }
                }
                if (existe1 == false && existe2 == false && existe3 == false) {
                    System.out.println("No hay empleados registrados.");
                }
            } else if (opcion == 3) {
                System.out.println("¿Que empleado desea actualizar?");
                System.out.println("1. Empleado 1");
                System.out.println("2. Empleado 2");
                System.out.println("3. Empleado 3");
                System.out.print("Seleccione: ");
                empleado = teclado.nextInt();
                if (empleado == 1 && existe1 == true) {
                    System.out.print("Nuevo nombre: ");
                    nombre1 = teclado.next();
                    System.out.print("Nueva edad: ");
                    edad1 = teclado.nextInt();
                    System.out.print("Nuevos años en la empresa: ");
                    tiempo1 = teclado.nextInt();
                    System.out.print("Nuevo salario: ");
                    salario1 = teclado.nextDouble();
                    System.out.println("Empleado actualizado.");
                } else if (empleado == 2 && existe2 == true) {
                    System.out.print("Nuevo nombre: ");
                    nombre2 = teclado.next();
                    System.out.print("Nueva edad: ");
                    edad2 = teclado.nextInt();
                    System.out.print("Nuevos años en la empresa: ");
                    tiempo2 = teclado.nextInt();
                    System.out.print("Nuevo salario: ");
                    salario2 = teclado.nextDouble();
                    System.out.println("Empleado actualizado.");
                } else if (empleado == 3 && existe3 == true) {
                    System.out.print("Nuevo nombre: ");
                    nombre3 = teclado.next();
                    System.out.print("Nueva edad: ");
                    edad3 = teclado.nextInt();
                    System.out.print("Nuevos años en la empresa: ");
                    tiempo3 = teclado.nextInt();
                    System.out.print("Nuevo salario: ");
                    salario3 = teclado.nextDouble();
                    System.out.println("Empleado actualizado.");
                } else {
                    System.out.println("El empleado no existe.");
                }
            } else if (opcion == 4) {
                System.out.println("¿Que empleado desea eliminar?");
                System.out.println("1. Empleado 1");
                System.out.println("2. Empleado 2");
                System.out.println("3. Empleado 3");
                System.out.print("Seleccione: ");
                empleado = teclado.nextInt();
                if (empleado == 1 && existe1 == true) {
                    nombre1 = "";
                    edad1 = 0;
                    tiempo1 = 0;
                    salario1 = 0;
                    existe1 = false;
                    System.out.println("Empleado eliminado.");
                } else if (empleado == 2 && existe2 == true) {
                    nombre2 = "";
                    edad2 = 0;
                    tiempo2 = 0;
                    salario2 = 0;
                    existe2 = false;
                    System.out.println("Empleado eliminado.");
                } else if (empleado == 3 && existe3 == true) {
                    nombre3 = "";
                    edad3 = 0;
                    tiempo3 = 0;
                    salario3 = 0;
                    existe3 = false;
                    System.out.println("Empleado eliminado.");
                } else {
                    System.out.println("El empleado no existe.");
                }
            } else if (opcion == 5) {
                System.out.println("Programa terminado.");
            } else {
                System.out.println("Opcion no valida.");
            }
        }
    }
}