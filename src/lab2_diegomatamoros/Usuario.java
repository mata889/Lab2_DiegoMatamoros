package lab2_diegomatamoros;

import java.util.ArrayList;

public class Usuario {

    public String Nombre;
    public String Edad;
    public String Lugar;
    public String User;
    public String Pass;

    ArrayList Listadeamigos = new ArrayList();
    ArrayList ListaDeMen = new ArrayList();
    ArrayList ListaDeSoli = new ArrayList();
    ArrayList Buzon = new ArrayList();

    public Usuario() {
    }

    public Usuario(String Nombre,String Edad,String Lugar,String User,String Pass) {
        this.Nombre = Nombre;
        this.Edad=Edad;
        this.Lugar=Lugar;
        this.User=User;
        this.Pass=Pass;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getEdad() {
        return Edad;
    }

    public void setEdad(String Edad) {
        this.Edad = Edad;
    }

    public String getLugar() {
        return Lugar;
    }

    public void setLugar(String Lugar) {
        this.Lugar = Lugar;
    }

    public String getUser() {
        return User;
    }

    public void setUser(String User) {
        this.User = User;
    }

    public String getPass() {
        return Pass;
    }

    public void setPass(String Pass) {
        this.Pass = Pass;
    }

    public ArrayList getListadeamigos() {
        return Listadeamigos;
    }

    public void setListadeamigos(ArrayList Listadeamigos) {
        this.Listadeamigos = Listadeamigos;
    }

    public ArrayList getListaDeMen() {
        return ListaDeMen;
    }

    public void setListaDeMen(ArrayList ListaDeMen) {
        this.ListaDeMen = ListaDeMen;
    }

    public ArrayList getListaDeSoli() {
        return ListaDeSoli;
    }

    public void setListaDeSoli(ArrayList ListaDeSoli) {
        this.ListaDeSoli = ListaDeSoli;
    }

    public ArrayList getBuzon() {
        return Buzon;
    }

    public void setBuzon(ArrayList Buzon) {
        this.Buzon = Buzon;
    }

    @Override
    public String toString() {
        return Nombre;
    }
   

}
