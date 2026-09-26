import com.uped.proyecto.modelo.DocenteInvestigador;
import com.uped.proyecto.modelo.Empleado;
import com.uped.proyecto.modelo.Gerente;
import com.uped.proyecto.modelo.Persona;

public class Main {
    public static void main(String[] args) {
        // Prueba de Gerente (Ejemplo guiado - Sección 7)
        Gerente g = new Gerente("Marta Díaz", "05123456-7", 1200.0, 5);
        System.out.println(g);
        System.out.println("Beneficio: " + g.calcularBeneficioAnual());

        // Prueba de DocenteInvestigador (Ejercicio práctico 8.2)
        DocenteInvestigador di = new DocenteInvestigador(
                "Dr. Iván Reyes", "07321456-9", "Ingeniería de Software", 8, 4);
        System.out.println(di);
        System.out.println("Beneficio: " + di.calcularBeneficioAnual());

        // Demostración de Downcasting seguro con instanceof (Sección 5.7)
        Persona[] personal = {
                new Empleado("Luis Pérez", "06223456-1", 850.0),
                new Gerente("Marta Díaz", "05123456-7", 1200.0, 5)
        };

        for (Persona p : personal) {
            if (p instanceof Gerente) {
                Gerente mgr = (Gerente) p;
                System.out.println("Equipo a cargo: " + mgr.getTamanoEquipo() + " personas");
            }
        }
    }
}
