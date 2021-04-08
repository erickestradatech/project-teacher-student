package paquete;

import java.util.*;
import javax.swing.JTextArea;

public class Docente {

    private int codigo; // Se autogenera desde 100
    private String nombre_doc;
    private int tipo_curso; // 1=Oracle(S/.200), 2=Programacion Web(S/.220), 3=Móviles(S/.250)
    private int cant_dis; // Cantidad disponible que se va actualizar cada vez que se registrar un Alumno con el Docente
    private List<Alumno> lista;

    static int cuenta = 100;

    public Docente(String nombre_doc, int tipo_curso, int cant_dis) {

        this.codigo = cuenta++;
        this.nombre_doc = nombre_doc;
        this.tipo_curso = tipo_curso;
        this.cant_dis = cant_dis;
        this.lista = new ArrayList();
    }

    // Adicionar alumnos
    public void Adi_Alumno(Alumno a) {

        lista.add(a);
    }

    public String tipoCurso() {

        String v[] = {"", "Oracle", "Programación Web", "Móviles"};
        return v[tipo_curso];
    }

    // Tipo de curso seleccionado en un combo
    public double costoCurso() {

        double v[] = {0, 200, 220, 250};
        return v[tipo_curso];
    }

    public void muestra(JTextArea at) {

        at.setText("Nombre Docente: " + nombre_doc + "\tCosto: " + costoCurso() + "\tCurso: " + tipoCurso() + "\tDisponible: " + cant_dis);
        at.append("\n");
        at.append("\n# Matricula\tNombre\tDescuento\tPago");

        double pg;
        double pago_t = 0;

        for (Alumno a : lista) {

            pg = costoCurso() - a.descuento() * costoCurso();

            pago_t += pg;

            at.append("\n" + a.getNroMatric() + "\t" + a.getNombre_alu() + "\t" + a.descuento() * 100 + "%" + "\t" + pg);
        }

        at.append("\n==========================");
        at.append("\nPAGO TOTAL: " + pago_t);
    }

    public Alumno buscaAlumno(int cod) {

        for (Alumno x : lista) {

            if (x.getNroMatric() == cod) {

                return x;
            }
        }

        return null;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre_doc() {
        return nombre_doc;
    }

    public void setNombre_doc(String nombre_doc) {
        this.nombre_doc = nombre_doc;
    }

    public int getTipo_curso() {
        return tipo_curso;
    }

    public void setTipo_curso(int tipo_curso) {
        this.tipo_curso = tipo_curso;
    }

    public int getCant_dis() {
        return cant_dis;
    }

    public void setCant_dis(int cant_dis) {
        this.cant_dis = cant_dis;
    }

    public List<Alumno> getLista() {
        return lista;
    }

    public void setLista(List<Alumno> lista) {
        this.lista = lista;
    }

}
