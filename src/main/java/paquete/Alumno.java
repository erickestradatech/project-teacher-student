package paquete;

public class Alumno {

    private int nroMatric; // Se autogenera desde 10
    private String nombre_alu;
    private int tipo_desc;// 1= 0.25, 2=0.5, 3=0.0
    private Docente doc;

    static int cuenta = 10;

    public Alumno(String nombre_alu, int tipo_desc, Docente doc) {
        this.nroMatric = cuenta++;
        this.nombre_alu = nombre_alu;
        this.tipo_desc = tipo_desc;
        this.doc = doc;
        doc.Adi_Alumno(this);
        doc.setCant_dis(doc.getCant_dis() - 1);
    }

    // Tipo de descuento seleccionado en un combo
    public double descuento() {

        double v[] = {0, 0.25, 0.5, 0};
        return v[tipo_desc];
    }

    // El pago que realizara cada alumno
    public double pago() {

        return doc.costoCurso() - doc.costoCurso() * descuento();
    }

    public int getNroMatric() {
        return nroMatric;
    }

    public void setNroMatric(int nroMatric) {
        this.nroMatric = nroMatric;
    }

    public String getNombre_alu() {
        return nombre_alu;
    }

    public void setNombre_alu(String nombre_alu) {
        this.nombre_alu = nombre_alu;
    }

    public int getTipo_desc() {
        return tipo_desc;
    }

    public void setTipo_desc(int tipo_desc) {
        this.tipo_desc = tipo_desc;
    }

    public Docente getDoc() {
        return doc;
    }

    public void setDoc(Docente doc) {
        this.doc = doc;
    }

}
