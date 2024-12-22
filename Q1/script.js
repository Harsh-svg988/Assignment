document.getElementById('userForm').addEventListener('submit', function(event) {
    event.preventDefault(); // Prevent form submission

    // Reset validation classes
    const form = event.target;
    const inputs = form.querySelectorAll('input');
    inputs.forEach(input => input.classList.remove('is-invalid'));

    let isValid = true;

    // Validate username
    const username = document.getElementById('username');
    if (!username.value.trim()) {
        isValid = false;
        username.classList.add('is-invalid');
    }

    // Validate email
    const email = document.getElementById('email');
    const emailRegex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
    if (!emailRegex.test(email.value.trim())) {
        isValid = false;
        email.classList.add('is-invalid');
    }

    // Validate password
    const password = document.getElementById('password');
    if (password.value.trim().length < 6) {
        isValid = false;
        password.classList.add('is-invalid');
    }

    if (isValid) {
        alert('Registration successful!');
        form.reset();
    }
});
