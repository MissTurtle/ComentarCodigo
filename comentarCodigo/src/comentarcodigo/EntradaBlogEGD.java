/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comentarcodigo;

/**
 * Clase para manejar las entradas de un blog.
 * La clase se creó el 15/02/2023 por Elena García Díaz.
 * Esta es la versión 3.0
 */
public class EntradaBlogEGD {
    /**
     * separador es el carácter que separa ENTRADA DE del nombre del autor
     */

    public static char separador=':';
    private int id;
    private String texto;
    private String autor;

    /**
     * Constructor de la clase
     * Recibe el:
     * @param id número de entrada
     * @param autor nombre del autor de la entrada
     * @param texto texto que contiene la entrada
     * Si el número de entrada es negativo, lanza una excepción
     */

    public EntradaBlogEGD(int id, String autor, String texto)throws IllegalArgumentException{
        if(id<=0) throw new IllegalArgumentException("El id no puede ser negativo");
        this.id=id;
        this.autor=autor;
        this.texto=texto;
    }
    @Override
    public String toString(){
        String cad="";
        cad+="\nENTRADA DE"+separador+autor;
        cad+="\n "+texto;
        return cad;
    }

    /**
     * @return Devuelve el número de la entrada
     */
    public int getId(){
        return this.id;
    }

    /**
     * @return Devuelve el texto completo de la entrada
     */
    public String getTexto(){
        return this.texto;
    }

    /**
     * @return Devuelve el nombre del autor de la entrada en mayúsculas
     */
    public String getAutor(){
        return this.autor.toUpperCase();
    }

    /**
     * @return Devuelve el nombre del autor.Ya no se usa. Mejor ver getAutor
     */
    public String devuelveAutor(){
        return this.autor;
    }

    /**
     * @param args No tiene porqué tener argumentos.
     */
    public static void main(String[] args) {

        EntradaBlogEGD e1=new EntradaBlogEGD (3,"Elena","Últimas noticias, está disponible BixBy 3.0");
        System.out.println(e1);
    }
}
