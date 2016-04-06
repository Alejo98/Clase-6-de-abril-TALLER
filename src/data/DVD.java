/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author Usuario14
 */
public class DVD extends Soporte{
    private int duracion; 
    private Autor[]actores;

    public DVD(int duracion, Autor[] actores, String titulo, Autor autor) {
        super(titulo);
        super.setAutor(autor);//*accediendo al metodo setAutor del padre*/
        /** si fuera super.x para llamar atributos publicos*/
        this.duracion = duracion;
        this.actores = actores;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public Autor[] getActores() {
        return actores;
    }

    public void setActores(Autor[] actores) {
        this.actores = actores;
    }

    @Override
    public String toString() {/**Sobreescribo el metodo toString del padre*/
        return "DVD{" +super.toString()+ "duracion=" + duracion + ", actores=" + actores[0].toString() + actores[1].toString()+'}';
    }
    
   
}
