package paquete;

import java.util.*;

public class Arreglo_Docente {

    private List<Docente> lista = new ArrayList();

    public void Adi_Docente(Docente d) {

        lista.add(d);
    }

    public Alumno busca(int cod) {

        for (Docente x : lista) {

            Alumno a = x.buscaAlumno(cod);

            if (a != null) {

                return a;
            }
        }

        return null;
    }

    public Docente buscaDocente(String nom) {

        for (Docente x : lista) {

            if (x.getNombre_doc().equals(nom)) {

                return x;
            }
        }

        return null;
    }

    // Listar los Docentes que dictaran dicho curso
    public Docente listarDocente(int t_cur) {

        for (Docente x : lista) {

            if (x.getTipo_curso() == t_cur) {

                return x;
            }
        }

        return null;
    }

    public List<Docente> getLista() {

        return lista;
    }

    public void setLista(List<Docente> lista) {

        this.lista = lista;
    }
}
