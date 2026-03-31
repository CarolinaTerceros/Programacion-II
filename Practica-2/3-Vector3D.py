
import math

class Vector3D:
    def __init__(self, a1=0, a2=0, a3=0):
        self.__a1 = a1
        self.__a2 = a2
        self.__a3 = a3

    def get_a1(self):
        return self.__a1

    def get_a2(self):
        return self.__a2

    def get_a3(self):
        return self.__a3

    # a) Suma de vectores
    def __add__(self, otro):
        return Vector3D(
            self.__a1 + otro.__a1,
            self.__a2 + otro.__a2,
            self.__a3 + otro.__a3
        )

    # b) Multiplicación por escalar
    def __mul__(self, r):
        return Vector3D(
            r * self.__a1,
            r * self.__a2,
            r * self.__a3
        )

    #  r * a
    def __rmul__(self, r):
        return self.__mul__(r)

    # c) Longitud del vector
    def magnitud(self):
        return math.sqrt(self.__a1**2 + self.__a2**2 + self.__a3**2)

    # d) Vector normal
    def normal(self):
        mag = self.magnitud()
        if mag == 0:
            return Vector3D(0,0,0)
        return Vector3D(
            self.__a1 / mag,
            self.__a2 / mag,
            self.__a3 / mag
        )

    # e) Producto escalar
    def producto_punto(self, otro):
        return (
            self.__a1 * otro.__a1 +
            self.__a2 * otro.__a2 +
            self.__a3 * otro.__a3
        )

    # f) Producto vectorial 
    def __xor__(self, otro):
        return Vector3D(
            self.__a2 * otro.__a3 - self.__a3 * otro.__a2,
            self.__a3 * otro.__a1 - self.__a1 * otro.__a3,
            self.__a1 * otro.__a2 - self.__a2 * otro.__a1
        )

    # Proyección de a sobre b
    def proyeccion_sobre(self, otro):
        escalar = self.producto_punto(otro) / (otro.magnitud()**2)
        return escalar * otro

    # Componente de a en dirección de b
    def componente_en(self, otro):
        return self.producto_punto(otro) / otro.magnitud()

    def __str__(self):
        return "({0}, {1}, {2})".format(self.__a1, self.__a2, self.__a3)


"""
Programa de prueba
"""

a = Vector3D(1, 2, 3)
b = Vector3D(4, 5, 6)

print("Vector a:", a)
print("Vector b:", b)

# a)
c = a + b
print("\na + b =", c)

# b)
d = 2 * a
print("2 * a =", d)

# c)
print("|a| =", a.magnitud())

# d)
print("Vector normal de a:", a.normal())

# e)
print("a · b =", a.producto_punto(b))

# f) 
print("a x b =", a ^ b)

# Proyección
proy = a.proyeccion_sobre(b)
print("Proyección de a sobre b:", proy)

# Componente
comp = a.componente_en(b)
print("Componente de a en b:", comp)
