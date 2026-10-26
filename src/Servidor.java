public class Servidor {
    private int id;
    private String nombre;
    private String direccionIP;
    private boolean activo;

    // Contadores compartidos por toda la clase
    private static int totalServidores = 0;
    private static int servidoresActivos = 0;

    public Servidor(String nombre, String direccionIP) {
        totalServidores++;
        this.id = totalServidores;
        this.nombre = nombre;
        this.direccionIP = direccionIP;
        this.activo = false;
        // No se incrementa servidoresActivos: el servidor comienza apagado
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccionIP() {
        return direccionIP;
    }

    public boolean isActivo() {
        return activo;
    }

    // Setters (el id y el estado se manejan sin setters directos)
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccionIP(String direccionIP) {
        this.direccionIP = direccionIP;
    }

    // Desafío: solo cuenta si el servidor estaba apagado
    public void activar() {
        if (!activo) {
            activo = true;
            servidoresActivos++;
        }
    }

    // Desafío: solo descuenta si el servidor estaba activo
    public void desactivar() {
        if (activo) {
            activo = false;
            servidoresActivos--;
        }
    }

    public void mostrarInformacion() {
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("IP: " + direccionIP);
        System.out.println("Activo: " + activo);
    }

    public static int getTotalServidores() {
        return totalServidores;
    }

    public static int getServidoresActivos() {
        return servidoresActivos;
    }
}

