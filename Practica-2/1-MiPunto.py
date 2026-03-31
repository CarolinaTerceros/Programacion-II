
import math

class MiPunto:
    def __init__(self, x=0, y=0):
        
        self.__x = x
        self.__y = y

    def get_x(self):
        return self.__x

    def get_y(self):
        return self.__y

    
    def distancia(self, otro):
        dx = self.__x - otro.__x
        dy = self.__y - otro.__y
        return math.sqrt(dx**2 + dy**2)

    
    def distancia_xy(self, x, y):
        dx = self.__x - x
        dy = self.__y - y
        return math.sqrt(dx**2 + dy**2)

    def __str__(self):
        return "({0}, {1})".format(self.__x, self.__y)


"""
Programa de prueba
"""

p1 = MiPunto()          
p2 = MiPunto(10, 30.5)  

print("Punto 1:", p1)
print("Punto 2:", p2)

d = p1.distancia(p2)
print("Distancia entre p1 y p2:", d)
