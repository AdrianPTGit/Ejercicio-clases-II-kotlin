package Enunciadoo2

/*
* Enunciado 2: (Utilización de clases anidadas y clase internas)
*
* Modela el sistema de una biblioteca utilizando clases anidadas.
*
*   -- Una biblioteca es un conjunto (lista) de libros.
*
*   -- La biblioteca creada deberá tener un nombre. Los libros pertenecen a la biblioteca y de ellos se quiere guardar
*      el autor y el isbn (clase anidada). Esta clase deberá tener un método que devuelva la siguiente
*      información: “<Titulo del libro> escrito por autor <autor>”.
*
Existe también una clase interna Estadísticas que realiza las siguiente acciones:
*
* Devuelve el número total de libros  de la biblioteca
* Devuelve un conjunto con los autores sin que se repita ninguno.
* Hay que tener en cuenta que un autor puede escribir varios libros y esta información puede estar repetida.
* En la biblioteca se podrán añadir más libros , buscar por un autor determinado y obtener las estadísticas
* anteriormente mencionadas

*Finalmente crea una función principal en la que crees la biblioteca,
* añadas tres libros (con título y autor), muestres todas las posibles estadísticas y busques por un autor determinado.
*/
fun main(){
    val miBiblioteca = Biblioteca("Biblioteca Central")

    // Añadir libros
    miBiblioteca.agregarLibro("Cien años de soledad", "Gabriel García Márquez", "978-3-16-148410-0")
    miBiblioteca.agregarLibro("1984", "George Orwell", "978-0-452-28423-4")
    miBiblioteca.agregarLibro("El amor en los tiempos del cólera", "Gabriel García Márquez", "978-3-16-148410-1")

    // Mostrar libros
    miBiblioteca.mostrarLibros()

    // Buscar libros por autor
    val librosGabo = miBiblioteca.buscarPorAutor("Gabriel García Márquez")
    println("\nLibros de Gabriel García Márquez:")
    librosGabo.forEach { println(it.obtenetInformacionLibro()) }

    // Obtener estadísticas
    val stats = miBiblioteca.Estadisticas()
    println("\nTotal de libros: ${stats.totalLibros()}")
    println("Autores únicos: ${stats.autoresUnicos()}")

}