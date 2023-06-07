// Obtén los elementos del slide
const slider = document.querySelector('.slider');
const slides = slider.querySelectorAll('.slide');

let currentSlide = 0;

// Función para mostrar el siguiente slide
function showSlide() {
  slides[currentSlide].classList.remove('active');
  currentSlide = (currentSlide + 1) % slides.length;
  slides[currentSlide].classList.add('active');
}

// Mostrar el primer slide
slides[currentSlide].classList.add('active');

// Configurar el intervalo de tiempo para cambiar de slide (3 segundos en este caso)
setInterval(showSlide, 3000);