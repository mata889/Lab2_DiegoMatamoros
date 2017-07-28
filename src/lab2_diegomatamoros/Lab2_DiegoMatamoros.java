package lab2_diegomatamoros;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import static lab2_diegomatamoros.Lab2_DiegoMatamoros.Usuario1;

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
    static ArrayList<Usuario> Usuario1 = new ArrayList();

    public static void main(String[] args) {
        System.out.println("-------MiniRed------");
        Usuario u = new Usuario();
        do {

            menu = JOptionPane.showInputDialog("1.Crear usuario\n 2.Modificar datos \n 3.Eliminar Usuario \n 4.Un Login \n5.Lista de usuarios\n 0. SALIR");
            switch (menu) {
                case "1":
                    Nombre = JOptionPane.showInputDialog("Introduzca su nombre");
                    Edad = JOptionPane.showInputDialog("Escriba Edad");
                    Lugar = JOptionPane.showInputDialog("Ingresar Lugar");
                    User = JOptionPane.showInputDialog("Introduzca user");
                    pass = JOptionPane.showInputDialog("SU passwoord");
                    JOptionPane.showMessageDialog(null, "Ha creado un usuario nuevo");
                    Usuario1.add(new Usuario(Nombre, Edad, Lugar, User, pass));
                    Usuario.add(new Usuario(Nombre, Edad, Lugar, User, pass));
                    String s = "";
                    int cont = 0;
                    /*for (Object us : Usuario) {
                        
                        if (us instanceof Usuario) {
                            s+= ""+u.getNombre().indexOf(cont)+"\n";
                        }
                        cont++;
                    }*/
                    //JOptionPane.showMessageDialog(null, s);
                    break;
                case "2":
                    int modi = 0;
                    JOptionPane.showMessageDialog(null, "Ha entrado al menu de modificacion");
                    modi = Integer.parseInt(JOptionPane.showInputDialog("Introduzca usuario a modificar(su posicion)"));
                    Nombre = JOptionPane.showInputDialog("Introduzca su nombre");
                    Edad = JOptionPane.showInputDialog("Escriba Edad");
                    Lugar = JOptionPane.showInputDialog("Ingresar Lugar");
                    User = JOptionPane.showInputDialog("Introduzca user");
                    pass = JOptionPane.showInputDialog("SU passwoord");
                    Usuario1.get(modi).setNombre(Nombre);
                    Usuario1.get(modi).setEdad(Edad);
                    Usuario1.get(modi).setLugar(Lugar);
                    Usuario1.get(modi).setUser(User);
                    Usuario1.get(modi).setPass(pass);
                    break;
                case "3":
                    int posicion = 0;
                    posicion = Integer.parseInt(JOptionPane.showInputDialog("Introduzca usuario a borrar(su posicion)"));
                    Usuario.remove(posicion);
                    Usuario1.remove(posicion);
                    String e = "";
                    for (Object object : Usuario1) {
                        if (object instanceof Usuario) {
                            e += "" + Usuario1.indexOf(object) + "-" + object + "\n";
                        }
                    }
                    JOptionPane.showMessageDialog(null, e);
                    break;
                case "4":
                    String nombre,
                     password;
                    nombre = JOptionPane.showInputDialog("Introduzca su nombre");
                    password = JOptionPane.showInputDialog("Introduzca su contraseña");
                    for (int i = 0; i < Usuario1.size(); i++) {
                        if (Usuario1.get(i).getNombre().contains(nombre) && Usuario1.get(i).getPass().contains(password)) {
                            JOptionPane.showMessageDialog(null, "Bienvenido"+nombre+":)");
                        } else {
                            System.out.println("HA INTRODUCIDO UN NOMBRE O UN PASSWORD EQUIVOCADO");
                            break;
                        }
                    }
                    break;
                case "5":
                    JOptionPane.showMessageDialog(null, "Listado");
                    String r = "";
                    for (Object object : Usuario1) {
                        if (object instanceof Usuario) {
                            r += "" + Usuario1.indexOf(object) + "-" + object + "\n";
                        }
                    }
                    JOptionPane.showMessageDialog(null, r);
                    break;

            }

        } while (!"0".equals(menu));

    }

}
