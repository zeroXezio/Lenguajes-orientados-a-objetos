package pms.lychi;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Producto> productos = new ArrayList<>();

        // Productos frescos
        ProductoFresco fresco1 = new ProductoFresco(LocalDate.of(2026, 11, 5), "FR-001", LocalDate.of(2026, 10, 22), "Mexico", "Manzana");
        ProductoFresco fresco2 = new ProductoFresco("FR-002", LocalDate.of(2026, 11, 1), "Chile");

        // Productos refrigerados
        ProductoRefrigerado refrigerado1 = new ProductoRefrigerado(4.0, "COFEPRIS-1001");
        refrigerado1.setNumeroLote("RF-001");
        refrigerado1.setFechaCaducidad(LocalDate.of(2026, 11, 20));
        refrigerado1.setFechaEnvasado(LocalDate.of(2026, 10, 15));
        refrigerado1.setPaisOrigen("Mexico");

        ProductoRefrigerado refrigerado2 = new ProductoRefrigerado(2.5, "FDA-2002");
        refrigerado2.setNumeroLote("RF-002");
        refrigerado2.setFechaCaducidad(LocalDate.of(2026, 12, 1));
        refrigerado2.setFechaEnvasado(LocalDate.of(2026, 10, 18));
        refrigerado2.setPaisOrigen("Estados Unidos");

        ProductoRefrigerado refrigerado3 = new ProductoRefrigerado(5.0, "SENASA-3003");
        refrigerado3.setNumeroLote("RF-003");
        refrigerado3.setFechaCaducidad(LocalDate.of(2026, 11, 28));
        refrigerado3.setFechaEnvasado(LocalDate.of(2026, 10, 20));
        refrigerado3.setPaisOrigen("Argentina");

        // Congelados por aire
        CongeladoPorAire aire1 = new CongeladoPorAire(78.0, 20.9, 0.04, 1.0);
        aire1.setNumeroLote("CA-001");
        aire1.setFechaCaducidad(LocalDate.of(2027, 4, 10));
        aire1.setFechaEnvasado(LocalDate.of(2026, 10, 10));
        aire1.setPaisOrigen("Mexico");
        aire1.setTemperatura(-18.0);

        CongeladoPorAire aire2 = new CongeladoPorAire(75.0, 20.0, 0.5, 4.5);
        aire2.setNumeroLote("CA-002");
        aire2.setFechaCaducidad(LocalDate.of(2027, 5, 15));
        aire2.setFechaEnvasado(LocalDate.of(2026, 10, 12));
        aire2.setPaisOrigen("Espana");
        aire2.setTemperatura(-20.0);

        // Congelados por agua
        CongeladoPorAgua agua1 = new CongeladoPorAgua(35.0);
        agua1.setNumeroLote("CW-001");
        agua1.setFechaCaducidad(LocalDate.of(2027, 3, 1));
        agua1.setFechaEnvasado(LocalDate.of(2026, 10, 8));
        agua1.setPaisOrigen("Noruega");
        agua1.setTemperatura(-22.0);

        CongeladoPorAgua agua2 = new CongeladoPorAgua(28.5);
        agua2.setNumeroLote("CW-002");
        agua2.setFechaCaducidad(LocalDate.of(2027, 2, 20));
        agua2.setFechaEnvasado(LocalDate.of(2026, 10, 9));
        agua2.setPaisOrigen("Peru");
        agua2.setTemperatura(-19.0);

        // Congelado por nitrogeno
        CongeladoPorNitrogeno nitrogeno1 = new CongeladoPorNitrogeno("Inmersion criogenica", 90.0);
        nitrogeno1.setNumeroLote("CN-001");
        nitrogeno1.setFechaCaducidad(LocalDate.of(2027, 6, 30));
        nitrogeno1.setFechaEnvasado(LocalDate.of(2026, 10, 14));
        nitrogeno1.setPaisOrigen("Japon");
        nitrogeno1.setTemperatura(-196.0);

        productos.add(fresco1);
        productos.add(fresco2);
        productos.add(refrigerado1);
        productos.add(refrigerado2);
        productos.add(refrigerado3);
        productos.add(aire1);
        productos.add(aire2);
        productos.add(agua1);
        productos.add(agua2);
        productos.add(nitrogeno1);

        mostrarProductos(productos);

        fresco1.setPaisOrigen("Canada");
        refrigerado1.setCodigoSupervision("COFEPRIS-9999");
        aire1.setPorcentajeOxigeno(21.0);
        agua2.setSalinidad(30.0);

        refrigerado2.actualizarTemperatura(3.0);
        refrigerado3.actualizarTemperatura(44.6, "fahrenheit");
        agua1.actualizarTemperatura(250.0, "kelvin");
        aire2.actualizarTemperatura(10.0, "rankine");
        nitrogeno1.setTiempoExposicion(120.0);
        nitrogeno1.setTiempoExposicion(3.0, "minutos");

        mostrarProductos(productos);
    }

    private static void mostrarProductos(ArrayList<Producto> productos) {
        for (int i = 0; i < productos.size(); i++) {
            Producto p = productos.get(i);
            System.out.println("\n--- Producto " + (i + 1) + " (" + p.getClass().getSimpleName() + ") ---" + p.mostrarInformacion());
        }
    }
}
