package lab2_diegomatamoros;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Lab2_DiegoMatamoros {

    static String Nombre;
    static String Edad;
    static String Lugar;
    static String User;
    static String lista;
    static String pass;
    static String listaS;
    static String listaM;
    static String buzon;
    static String menu;
    static ArrayList Usuario = new ArrayList();

    public static void main(String[] args) {
        System.out.println("-------MiniRed------");
        Usuario u = new Usuario();
        do {

            menu = JOptionPane.showInputDialog("1.Crear usuario\n 2.Modificar datos \n 3.Eliminar Usuario \n 4.Un Login \n 0. SALIR");
            switch (menu) {
                case "1":
                    Nombre = JOptionPane.showInputDialog("Introduzca su nombre");
                    Edad = JOptionPane.showInputDialog("Escriba Edad");
                    Lugar = JOptionPane.showInputDialog("Ingresar Lugar");
                    User = JOptionPane.showInputDialog("Introduzca user");
                    pass = JOptionPane.showInputDialog("SU passwoord");
                    JOptionPane.showMessageDialog(null, "Ha creado un usuario nuevo");
                    Usuario.add(new Usuario(Nombre, Edad, Lugar, User, pass));
                    String s = "";
                    int cont=0;
                    for (Object us : Usuario) {
                        
                        if (us instanceof Usuario) {
                            s+= ""+u.getNombre().indexOf(cont)+"\n";
                        }
                        cont++;
                    }
                    JOptionPane.showMessageDialog(null, s);
                    break;
                case "2":
                    JOptionPane.showMessageDialog(null, "Ha entrado al menu de modificacion");

                    break;
                case "3":
                    break;
                case "4":
                    break;
            }
        } while (!"0".equals(menu));

    }

}
