package Enunciadoo2

/**
 *  -- Una biblioteca es un conjunto (lista) de libros.
 *
 *  -- La biblioteca creada deberá tener un nombre. Los libros pertenecen a la biblioteca y de ellos se quiere guardar
 *     el autor y el isbn (clase anidada). Esta clase deberá tener un método que devuelva la siguiente
 *      información: “<Titulo del libro> escrito por autor <autor>”.
 *
 */
class Biblioteca (val nombre : String){

    val libros = mutableListOf<Libro>()

    inner class Libro(val titulo : String, val autor : String, val isbn : String){
        fun obtenetInformacionLibro(): String {
            return "$titulo escrito por $autor"
        }
    }

    // Método para añadir un libro a la biblioteca
    fun agregarLibro(titulo: String, autor: String, isbn: String) {
        val libro = Libro(titulo, autor, isbn)
        libros.add(libro)
    }

    // Método para mostrar todos los libros
    fun mostrarLibros() {
        println("Biblioteca: $nombre")
        for (libro in libros) {
            println(libro.obtenetInformacionLibro())
        }
    }

    // Clase interna Estadisticas

    inner class Estadisticas {
        // Número total de libros
        fun totalLibros(): Int {
            return libros.size
        }

        // Conjunto de autores sin repetición
        fun autoresUnicos(): Set<String> {
            return libros.map { it.autor }.toSet()
        }
    }

    // Método para buscar libros por autor
    fun buscarPorAutor(autorBuscado: String): List<Libro> {
        return libros.filter { it.autor.equals(autorBuscado, ignoreCase = true) }
    }



}