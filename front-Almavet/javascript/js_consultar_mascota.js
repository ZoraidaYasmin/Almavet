function eliminarFila(elemento) {
    var fila = elemento.parentNode.parentNode;
    fila.parentNode.removeChild(fila);
  }

  // Obtén el botón de buscar
var botonBuscar = document.getElementById("boton-buscar");

function mostrarTabla() {
    var tabla = document.getElementById("miTabla");
    tabla.style.display = "table";
  }