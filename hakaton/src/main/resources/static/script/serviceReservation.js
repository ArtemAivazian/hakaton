document.getElementById("reservationForm").addEventListener("submit", function (event) {
    event.preventDefault();

    const date = document.getElementById("date").value;
    const time = document.getElementById("time").value;
    const comment = document.getElementById("comment").value;
    const email = document.getElementById("email").value;
    const car_number = document.getElementById("car_number").value;
    const vin = document.getElementById("vin").value;
    const name = document.getElementById("service_name").value;

    const data = {
    "date": date,
    "time": time,
    "comment": comment,
    "email": email,
    "car_num": car_number,
    "vin": vin,
    "service_name": name
    };
    // adding item reservation to itemReservations table
    fetch("http://localhost:8080/service/add", {
        method: "POST",
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify(data)
    })
            .then(response => {
                if (response.status === 200) {
                    alert("Reservation submitted successfully!");
                    window.location.href = "http://localhost:8080/displayServiceStorage";
                } else {
                    alert("Error submitting reservation.");
                }
            })
            .catch(error => {
                console.error("Error:", error);
                alert("Error submitting reservation.");
            });

    // deleting from items table item by id
    const serviceId = document.getElementById("serviceId").value;
    fetch(`http://localhost:8080/deleteService/${serviceId}`, {
        method: "DELETE"
    })
            .catch(error => {
                console.error("Error:", error);
                alert("Error deleting service.");
            });
});