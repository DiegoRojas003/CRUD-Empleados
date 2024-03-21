
package empleados;


public class EMPLEADOS {
    private String Cedula;
    private String Nombre;
    private String Apellido;
    private String Genero;
    private String FechaNac;
    private String FechaIng;
    private int Salario;
    private String Foto;

    public EMPLEADOS(String Cedula, String Nombre, String Apellido, String Genero, String FechaNac, String FechaIng, int Salario, String Foto) {
        this.Cedula = Cedula;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Genero = Genero;
        this.FechaNac = FechaNac;
        this.FechaIng = FechaIng;
        this.Salario = Salario;
        this.Foto = Foto;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public String getFechaNac() {
        return FechaNac;
    }

    public void setFechaNac(String FechaNac) {
        this.FechaNac = FechaNac;
    }

    public String getFechaIng() {
        return FechaIng;
    }

    public void setFechaIng(String FechaIng) {
        this.FechaIng = FechaIng;
    }

    public int getSalario() {
        return Salario;
    }

    public void setSalario(int Salario) {
        this.Salario = Salario;
    }

    public String getFoto() {
        return Foto;
    }

    public void setFoto(String Foto) {
        this.Foto = Foto;
    }
    
   

}