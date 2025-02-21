const bar = document.querySelector('.bar');
const hiddenMenu = document.querySelector('.hidden');
const closeMenu = document.querySelector('.close');

bar.addEventListener('click', () => {
  hiddenMenu.style.display = 'flex';
});

closeMenu.addEventListener('click', () => {
  hiddenMenu.style.display = 'none';
});
