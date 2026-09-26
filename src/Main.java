import com.uped.proyecto.modelo.Cliente;
import com.uped.proyecto.modelo.Docente;
import com.uped.proyecto.modelo.Empleado;
import com.uped.proyecto.modelo.Estudiante;
import com.uped.proyecto.modelo.Persona;
import com.uped.proyecto.modelo.Proveedor;
import com.uped.proyecto.modelo.Voluntario;

public class Main {
    public static void main(String[] args) {
        Persona[] personas = {
                new Cliente("Ana", "0451...", "7777-1", 4000.0),
                new Empleado("Luis", "0622...", 850.0),
                new Estudiante("Kevin", "0399...", "UPED-045", "Ing. Sistemas", 9.1),
                new Docente("María", "0598...", "Software", 8)
        };

        for (Persona p : personas) {
            System.out.println(p.presentarse() + " -> $" + p.calcularBeneficioAnual());
        }

        Voluntario v = new Voluntario("Sara Gómez", "07456123-2", 120.0);
        System.out.println(v);
        System.out.println("Beneficio: " + v.calcularBeneficioAnual());

        Proveedor prov = new Proveedor("Comercial Ríos", "06554321-8", 8000.0);
        System.out.println(prov);
        System.out.println("Beneficio: " + prov.calcularBeneficioAnual());
    }
}