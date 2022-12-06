# Costa Maria Eugenia
# Ejercicio de POO con Python para la asistencia de noviembre

class Persona:
  def __init__(self, nombre, edad):
    self._nombre = nombre
    self._edad = edad
  # getters
  @property
  def nombre(self):
    return self._nombre  
  @property
  def edad(self):
    return self._edad
  # setters
  def nombre(self, nombre):
    self._nombre = nombre
  def edad(self, edad):
    self._edad = edad

class Empleado(Persona): # extiende de la clase Persona
  def __init__ (self, nombre, edad, sueldo):
    super().__init__(nombre, edad)
    self._sueldo = sueldo
  # getter
  @property
  def sueldo(self):
    return self._sueldo
  # setter
  def sueldo(self, sueldo):
    self._sueldo = sueldo

# Instancio un objeto empleado
empleado1 = Empleado("Ana", 40, 110000)  
print(empleado1) 
print(f"nombre: {empleado1._nombre}")  
print(f"edad: {empleado1._edad}")
print(f"sueldo: {empleado1._sueldo}")
