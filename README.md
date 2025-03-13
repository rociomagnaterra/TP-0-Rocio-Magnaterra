TP 0 Objetos anémicos - Rocio Magnaterra

3- Explicación 
Implementación Anémica:
En la implementación anemica, la clase TiempoAnemico solo se encarga de almacenar la fecha y hora 
mientras que el formateo se realiza fuera de la clase, en el Main. 
No aplica el principo de encapsulamiento, ya qu la clase no maneja sus propios comportamientos.

Implementación NO Anémica:
En la implementación no anémica, el formateo de la fecha está encapsulado dentro de la clase TiempoNoAnemico. 
La clase maneja datos como sus comportamientos, lo que es mas adecuado desde el diseño orientado a objetos.
No se usa DateTimeFormatter en el Main porque ya se utiliza en la clase TiempoNoAnemico.

Conclusión, podriamos decir que es más adecuado hacer uso de objetos no anémicos que contienen tanto datos como comportamientos dentro de si mismos. 
Respetando los principios de la POO y reforzando el encapsulamiento.