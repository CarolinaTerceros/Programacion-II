
import math

class AlgebraVectorial:

    def __init__(self, x=0, y=0):
        self.__x = x
        self.__y = y

    def __str__(self):
        return "<{0}, {1}>".format(self.__x, self.__y)

    def magnitud(self):
        return math.sqrt(self.__x**2 + self.__y**2)

    
    def producto_punto(self, v):
        return self.__x * v.__x + self.__y * v.__y

    
    def __add__(self, v):
        return AlgebraVectorial(self.__x + v.__x, self.__y + v.__y)


    def __sub__(self, v):
        return AlgebraVectorial(self.__x - v.__x, self.__y - v.__y)

    
    def producto_cruz(self, v):
        return self.__x * v.__y - self.__y * v.__x

    def perpendicular_punto(self, v):
        return self.producto_punto(v) == 0

    
    def perpendicular_suma_resta(self, v):
        return (self + v).magnitud() == (self - v).magnitud()

    
    def perpendicular_pitagoras(self, v):
        izquierda = (self + v).magnitud()**2
        derecha = self.magnitud()**2 + v.magnitud()**2
        return izquierda == derecha

   
    def paralela_cruz(self, v):
        return self.producto_cruz(v) == 0

    
    def paralela_escalar(self, v):
        if v.__x == 0 and v.__y == 0:
            return False
        if v.__x != 0:
            r = self.__x / v.__x
            return self.__y == r * v.__y
        return False

   
    def proyeccion_de_a_sobre_b(self, b):
        escalar = self.producto_punto(b) / (b.magnitud()**2)
        return AlgebraVectorial(escalar * b.__x, escalar * b.__y)

    
    def componente_de_a_en_b(self, b):
        return self.producto_punto(b) / b.magnitud()


"""
Programa de prueba
"""

a = AlgebraVectorial(2, 4)
b = AlgebraVectorial(1, 2)

print("Vector a =", a)
print("Vector b =", b)

print("\nPerpendicularidad")
print("a · b = 0 :", a.perpendicular_punto(b))
print("|a + b| = |a - b| :", a.perpendicular_suma_resta(b))
print("|a + b|² = |a|² + |b|² :", a.perpendicular_pitagoras(b))

print("\nParalelismo")
print("a × b = 0 :", a.paralela_cruz(b))
print("a = r b :", a.paralela_escalar(b))

print("\nProyección de a sobre b")
proj = a.proyeccion_de_a_sobre_b(b)
print("Proy_b(a) =", proj)

print("\nComponente de a en la dirección de b")
comp = a.componente_de_a_en_b(b)
print("Comp_b(a) =", comp)
