/**
 * 
 */
 
 const labels = document.querySelectorAll('.form-control label')
var email = document.getElementById("email")
var password = document.getElementById("password")
console.log(email)
console.log(password)
labels.forEach(label => {
    label.innerHTML = label.innerText
    .split('')
    .map((letter, idx) => `<span style="transition-delay:${idx * 50}ms">${letter}</span>`)
    .join('')
})