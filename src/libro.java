public class libro {
    private String nombre;
    private String autor;
    private Publicacion publicacion;

    public libro(){}

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }
    public String getAutor(){
        return this.autor;
    }

    public void setPublicacion(Publicacion publicacion){
        this.publicacion = publicacion;
    }
    public Publicacion getPublicacion(){
        return this.publicacion;
    }

}
