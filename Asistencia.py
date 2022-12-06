

# Brian Ahumada

# Ejercicio 12: Agenda telefonica

# Hacer un programa que simule una agenda de contactos.
# Crear un diccionario donde la clave sea el nombre del contacto y el valor sea el numero de telefono.
# El programa debe tener un menu con las siguientes opciones:
# 1. Agregar contacto
# 2. Eliminar contacto
# 3. Mostrar todos los contactos
# 4. Salir

# Creamos un diccionario vacio
agenda = {}


# Creamos una funcion para agregar un contacto
def agregar_contacto(agenda):
    nombre = input("Ingrese el nombre del contacto: ")
    numero = input("Ingrese el numero de telefono: ")
    agenda[nombre] = numero
    print("Contacto agregado")
    return agenda


# borrar contactos
def eliminar_contacto(agenda):
    nombre = input("Ingrese el nombre del contacto: ")
    del agenda[nombre]
    print("Contacto eliminado")
    return agenda


# Mostrar contactos
def mostrar_contactos(agenda):
    for nombre, numero in agenda.items():
        print(f"{nombre}: {numero}")


# impreción
def mostrar_menu():

    print("1. Agregar contacto")
    print("2. Eliminar contacto")
    print("3. Mostrar todos los contactos")
    print("4. Salir")


# Creamos una funcion para ejecutar el menu
def ejecutar_menu(agenda):
    while True:
        mostrar_menu()
        opcion = int(input("Ingrese una opcion: "))
        if opcion == 1:  # Evaluamos la opcion
            agenda = agregar_contacto(agenda)
        elif opcion == 2:
            agenda = eliminar_contacto(agenda)
        elif opcion == 3:
            mostrar_contactos(agenda)
        elif opcion == 4:
            break
        else:
            print("Opcion invalida")



ejecutar_menu(agenda)
