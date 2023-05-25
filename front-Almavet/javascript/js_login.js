document.getElementById("loginForm").addEventListener("submit", function(event) {
    event.preventDefault(); // Evita que el formulario se envíe automáticamente
  
    // Obtiene los valores de usuario y contraseña ingresados
    var username = document.getElementById("username").value;
    var password = document.getElementById("password").value;
  
    // Realiza la validación
    if (username === "usuario" && password === "contraseña") {
        redireccionarHomePrincipal()
    } else {
        showMessage("Credenciales inválidas. Inténtalo de nuevo.", "error");
    }
  });
  

  function redireccionarHomePrincipal() {
    // Cambia "url_destino" por la URL a la que deseas redireccionar
    window.location.href = "HomePrincipal.html";
  }

  function showMessage(message, messageType) {
    var messageContainer = document.getElementById("messageContainer");
    messageContainer.innerHTML = '<div class="message ' + messageType + '">' + message + '</div>';
  
    var timeout = 3000;
    setTimeout(function() {
      messageContainer.innerHTML = ''; // Elimina el mensaje después del tiempo especificado
    }, timeout);
}