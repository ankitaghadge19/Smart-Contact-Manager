let currentTheme = getTheme();
console.log(currentTheme);

document.addEventListener('DOMContentLoaded', () => {
    changeTheme();
})

function changeTheme() {
  changePageTheme(currentTheme, currentTheme);

  const ThemeChangeBtn = document.querySelector("#theme_change_btn");

  ThemeChangeBtn.addEventListener("click", () => {
    // console.log("Change Theme Button Clicked!");
    let oldTheme = currentTheme;
    if (currentTheme === "dark") {
      currentTheme = "light";
    } else {
      currentTheme = "dark";
    }
    changePageTheme(currentTheme, oldTheme);
  });
}

function setTheme(theme) {
  localStorage.setItem("theme", theme);
}

function getTheme() {
  let theme = localStorage.getItem("theme");
  return theme ? theme : "light";
}

function changePageTheme(newTheme, oldTheme) {
  setTheme(newTheme);

  document.querySelector("html").classList.remove(oldTheme);
  document.querySelector("html").classList.add(newTheme);

  document
    .querySelector("#theme_change_btn")
    .querySelector("span").textContent =
    newTheme === "light" ? "Dark" : "Light";
}
